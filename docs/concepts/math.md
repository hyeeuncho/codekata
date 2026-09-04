# 숫자와 수학

합, 나머지, 자릿수, 약수, 최대공약수 문제에서 자주 쓰는 기본 패턴이다.

필요한 import:

```java
import java.util.ArrayList;
import java.util.List;
```

## 자릿수 처리

```java
int sum = 0;
while (n > 0) {
    sum += n % 10;
    n /= 10;
}
```

자릿수를 배열로 만들어야 하면 문자열로 바꾸는 방식이 간단하다.

```java
int[] digits = String.valueOf(n).chars()
        .map(c -> c - '0')
        .toArray();
```

뒤집힌 자릿수 배열이 필요하면 나머지를 직접 담아도 된다.

```java
List<Integer> list = new ArrayList<>();
while (n > 0) {
    list.add((int) (n % 10));
    n /= 10;
}
```

## 범위 합

두 정수의 순서가 보장되지 않으면 `Math.min`, `Math.max`로 먼저 정리한다.

```java
int start = Math.min(a, b);
int end = Math.max(a, b);

long answer = 0;
for (int i = start; i <= end; i++) {
    answer += i;
}
```

합이 커질 수 있으면 `int` 대신 `long`을 쓴다.

## 올림 나눗셈

나눗셈 결과가 소수점이면 올려야 하는 경우가 있다. 예를 들어 작업량이 70이고 하루에 30씩 처리하면 `70 / 30 = 2.333...`이므로 3일이 필요하다.

`Math.ceil`을 쓰는 방식:

```java
int day = (int) Math.ceil(remain / (double) speed);
```

주의할 점은 `(double)`을 꼭 넣어야 한다는 것이다.

```java
Math.ceil(70 / 30);          // 70 / 30이 먼저 2가 되므로 결과도 2.0
Math.ceil(70 / (double) 30); // 2.333...을 올려서 3.0
```

정수 계산으로 처리하는 방식:

```java
int day = (remain + speed - 1) / speed;
```

기능개발 문제 예시:

```java
int remain = 100 - progresses[i];
int day = (remain + speeds[i] - 1) / speeds[i];
```

예:

```text
remain = 70
speed = 30

(70 + 30 - 1) / 30
= 99 / 30
= 3
```

딱 나누어떨어지는 경우에는 값이 늘어나지 않는다.

```text
remain = 60
speed = 30

(60 + 30 - 1) / 30
= 89 / 30
= 2
```

코딩테스트에서는 정수 공식이 더 자주 쓰인다.

- `double` 형변환 실수를 줄일 수 있다.
- 소수점 오차를 신경 쓰지 않아도 된다.
- 작업 일수, 페이지 수, 묶음 수 계산에 자주 사용한다.

## 약수

```java
int count = 0;
for (int i = 1; i <= n; i++) {
    if (n % i == 0) {
        count++;
    }
}
```

완전제곱수는 약수 개수가 홀수다.

```java
if (Math.sqrt(n) % 1 == 0) {
    // 약수 개수 홀수
}
```

## 최대공약수

```java
int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
```

최소공배수:

```java
long lcm = (long) a * b / gcd(a, b);
```
