# 스택과 큐

스택은 마지막에 넣은 값을 먼저 꺼내고, 큐는 먼저 넣은 값을 먼저 꺼낸다.

필요한 import:

```java
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
```

## 스택

직전 값과 비교하거나 괄호를 짝지어야 하면 스택을 생각한다.

스택은 LIFO 구조다.

```text
Last In First Out
마지막에 들어간 값이 먼저 나온다.
```

자주 나오는 문제 신호:

- 괄호가 올바른지 확인한다.
- 바로 이전 값과 비교한다.
- 최근에 넣은 값을 다시 빼야 한다.
- 값이 들어왔다가 조건에 따라 사라진다.
- 뒤에서부터 처리하는 느낌이 있다.

Java에서는 `Stack`보다 `ArrayDeque`를 더 많이 쓴다.

```java
ArrayDeque<Integer> stack = new ArrayDeque<>();
for (int value : arr) {
    if (stack.isEmpty() || stack.peek() != value) {
        stack.push(value);
    }
}
```

스택처럼 쓸 때는 `ArrayDeque` 타입으로 잡는다.

```java
ArrayDeque<Integer> stack = new ArrayDeque<>();
stack.push(1);
stack.pop();
stack.peek();
```

주요 메서드:

| 메서드 | 의미 |
|------|------|
| `push(value)` | 위에 넣기 |
| `pop()` | 위에서 꺼내기 |
| `peek()` | 위 값 확인만 하기 |
| `isEmpty()` | 비었는지 확인 |
| `size()` | 개수 확인 |

문자 스택:

```java
ArrayDeque<Character> stack = new ArrayDeque<>();
for (char c : s.toCharArray()) {
    stack.push(c);
}
```

올바른 괄호 기본 패턴:

```java
ArrayDeque<Character> stack = new ArrayDeque<>();

for (char c : s.toCharArray()) {
    if (c == '(') {
        stack.push(c);
    } else {
        if (stack.isEmpty()) {
            return false;
        }
        stack.pop();
    }
}

return stack.isEmpty();
```

닫는 괄호가 나왔을 때 스택이 비어 있으면 짝이 없으므로 실패다. 끝까지 처리한 뒤 스택이 비어 있어야 모든 괄호가 맞게 닫힌 것이다.

## 큐

순서대로 처리해야 하면 큐를 생각한다.

큐는 FIFO 구조다.

```text
First In First Out
먼저 들어간 값이 먼저 나온다.
```

자주 나오는 문제 신호:

- 순서대로 작업을 처리한다.
- 먼저 들어온 요청이 먼저 나간다.
- 대기열, 프린터, 배포, 트럭, 프로세스가 나온다.
- 현재 값을 처리하고 뒤에 다시 넣을 수 있다.

```java
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(value);
int first = queue.poll();
```

큐 함수 중심으로 쓸 때는 타입을 `Queue`로 잡는 게 좋다.

```java
Queue<Integer> queue = new ArrayDeque<>();
queue.offer(1);
queue.poll();
queue.peek();
```

`ArrayDeque` 타입으로 잡아도 큐 메서드를 사용할 수는 있다.

```java
ArrayDeque<Integer> queue = new ArrayDeque<>();
queue.offer(1);
queue.poll();
```

다만 `Queue<Integer> queue = new ArrayDeque<>();`로 쓰면 이 변수를 큐로 사용한다는 의도가 더 명확하다.

주요 메서드:

| 메서드 | 의미 |
|------|------|
| `offer(value)` | 뒤에 넣기 |
| `poll()` | 앞에서 꺼내기 |
| `peek()` | 앞 값 확인만 하기 |
| `isEmpty()` | 비었는지 확인 |
| `size()` | 개수 확인 |

비어 있는지 확인:

```java
if (queue.isEmpty()) {
    return answer;
}
```

큐 처리 기본 패턴:

```java
Queue<Integer> queue = new ArrayDeque<>();

for (int value : values) {
    queue.offer(value);
}

while (!queue.isEmpty()) {
    int current = queue.poll();
    // current 처리
}
```

## 우선순위 큐

항상 가장 작은 값이나 큰 값을 먼저 꺼내야 하면 `PriorityQueue`를 쓴다.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(value);
int min = pq.poll();
```

큰 값 우선:

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
```

주요 메서드는 큐와 비슷하다.

```java
pq.offer(value);
int top = pq.poll();
int next = pq.peek();
```

## Stack, Queue 선택 기준

| 상황 | 선택 |
|------|------|
| 바로 직전 값과 비교 | 스택 |
| 괄호 짝 검사 | 스택 |
| 중복된 연속 값 제거 | 스택 |
| 들어온 순서대로 처리 | 큐 |
| 대기열 처리 | 큐 |
| 가장 작은 값 또는 큰 값부터 처리 | 우선순위 큐 |

## 주의할 점

- `ArrayDeque`는 구현체이고, 스택/큐는 사용하는 방식이다.
- 큐로 쓸 때는 `Queue<Integer> queue = new ArrayDeque<>();` 형태가 의도를 드러내기 좋다.
- 스택으로 쓸 때는 `ArrayDeque<Integer> stack = new ArrayDeque<>();` 형태가 편하다.
- `pop()`, `poll()`은 값을 꺼낸다.
- `peek()`은 값만 확인하고 제거하지 않는다.
- 비어 있을 때 `pop()`을 하면 예외가 날 수 있다.
- `poll()`은 비어 있으면 `null`을 반환한다.
- 알고리즘에서는 `Stack` 클래스보다 `ArrayDeque`를 스택처럼 쓰는 편이 낫다.
