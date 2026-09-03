# 스트림

스트림은 배열이나 리스트의 값을 흐름처럼 처리하는 문법이다. 코드를 짧게 만들 수 있지만, 처음에는 `for`문으로 풀 수 있는지 먼저 생각하고 스트림은 변환, 필터링, 정렬에 쓰는 정도로 익히면 된다.

필요한 import:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
```

## int[]에서 시작하기

```java
int[] result = Arrays.stream(arr)
        .filter(n -> n % 2 == 0)
        .sorted()
        .toArray();
```

뜻:

- `Arrays.stream(arr)`: `int[]`를 스트림으로 바꾼다.
- `filter(...)`: 조건에 맞는 값만 남긴다.
- `sorted()`: 오름차순 정렬한다.
- `toArray()`: 다시 `int[]`로 바꾼다.

## String[]을 int[]로 바꾸기

```java
String[] arr = {"1", "2", "3"};

int[] numbers = Arrays.stream(arr)
        .mapToInt(Integer::parseInt)
        .toArray();
```

`Integer.parseInt`는 `String`을 `int`로 바꾼다.

```text
String -> int
```

## List<Integer>를 int[]로 바꾸기

```java
List<Integer> list = List.of(1, 2, 3);

int[] numbers = list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
```

`Integer::intValue`는 `Integer` 객체를 `int`로 바꾼다.

```text
Integer -> int
```

주의할 점:

```java
list.stream()
        .mapToInt(list::get)
        .toArray();
```

이 코드는 리스트의 값을 인덱스로 사용해서 `list.get(value)`를 호출한다. 값이 인덱스 범위를 넘으면 `IndexOutOfBoundsException`이 난다.

## 자주 쓰는 메서드

### filter

조건에 맞는 값만 남긴다.

```java
int[] even = Arrays.stream(arr)
        .filter(n -> n % 2 == 0)
        .toArray();
```

### map

값을 다른 값으로 바꾼다.

```java
List<String> names = List.of("kim", "lee");

List<String> upperNames = names.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
```

### mapToInt

객체 스트림을 `int` 스트림으로 바꾼다.

```java
int[] lengths = names.stream()
        .mapToInt(String::length)
        .toArray();
```

### sorted

정렬한다.

```java
int[] sorted = Arrays.stream(arr)
        .sorted()
        .toArray();
```

문자열 리스트 정렬:

```java
List<String> sorted = names.stream()
        .sorted()
        .collect(Collectors.toList());
```

### sum

합계를 구한다.

```java
int sum = Arrays.stream(arr)
        .sum();
```

### count

개수를 센다. 반환 타입은 `long`이다.

```java
long count = Arrays.stream(arr)
        .filter(n -> n > 0)
        .count();
```

## 배열과 리스트 변환

`int[]`를 `List<Integer>`로 바꾸기:

```java
List<Integer> list = Arrays.stream(arr)
        .boxed()
        .collect(Collectors.toList());
```

`List<Integer>`를 `int[]`로 바꾸기:

```java
int[] arr = list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
```

`String[]`를 `List<String>`로 바꾸기:

```java
List<String> list = Arrays.stream(arr)
        .collect(Collectors.toList());
```

## 문제 풀이 예시

나누어 떨어지는 숫자 배열:

```java
public int[] solution(int[] arr, int divisor) {
    int[] answer = Arrays.stream(arr)
            .filter(n -> n % divisor == 0)
            .sorted()
            .toArray();

    return answer.length > 0 ? answer : new int[]{-1};
}
```

없는 숫자 더하기:

```java
public int solution(int[] numbers) {
    int sum = Arrays.stream(numbers).sum();
    return 45 - sum;
}
```

## for문과 스트림 선택 기준

| 상황 | 추천 |
|------|------|
| 인덱스가 중요하다 | for문 |
| 중간에 `break`가 필요하다 | for문 |
| 단순 필터링/정렬/합계 | 스트림 |
| 디버깅을 많이 해야 한다 | for문 |
| 코드가 스트림 때문에 더 어려워진다 | for문 |
