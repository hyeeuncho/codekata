# 숫자와 수학

합, 나머지, 자릿수, 약수, 최대공약수 문제에서 자주 쓰는 기본 패턴이다.

## 자릿수 처리

```java
int sum = 0;
while (n > 0) {
    sum += n % 10;
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
