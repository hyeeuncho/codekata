# 정렬

정렬은 배열이나 문자열을 원하는 순서로 바꿔야 할 때 사용한다.

## 배열 정렬

```java
Arrays.sort(arr);
```

## 문자 정렬

```java
char[] chars = s.toCharArray();
Arrays.sort(chars);
```

문자열 내림차순:

```java
StringBuilder sb = new StringBuilder(new String(chars));
return sb.reverse().toString();
```

## 객체 배열 정렬

문자열 배열처럼 기준이 필요한 경우 comparator를 쓴다.

```java
Arrays.sort(strings, (a, b) -> a.compareTo(b));
```

두 번째 기준이 필요할 때:

```java
Arrays.sort(strings, (a, b) -> {
    if (a.charAt(n) == b.charAt(n)) {
        return a.compareTo(b);
    }
    return a.charAt(n) - b.charAt(n);
});
```
