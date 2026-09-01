# 스택과 큐

스택은 마지막에 넣은 값을 먼저 꺼내고, 큐는 먼저 넣은 값을 먼저 꺼낸다.

## 스택

직전 값과 비교하거나 괄호를 짝지어야 하면 스택을 생각한다.

```java
Stack<Integer> stack = new Stack<>();
for (int value : arr) {
    if (stack.isEmpty() || stack.peek() != value) {
        stack.push(value);
    }
}
```

문자 스택:

```java
Stack<Character> stack = new Stack<>();
for (char c : s.toCharArray()) {
    stack.push(c);
}
```

## 큐

순서대로 처리해야 하면 큐를 생각한다.

```java
Queue<Integer> queue = new LinkedList<>();
queue.offer(value);
int first = queue.poll();
```

비어 있는지 확인:

```java
if (queue.isEmpty()) {
    return answer;
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
