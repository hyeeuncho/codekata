# 문자열

문자열은 직접 수정할 수 없으므로 새 문자열을 만들거나 `StringBuilder`를 사용한다.

## 순회

```java
for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
}
```

## StringBuilder

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < s.length(); i++) {
    sb.append(s.charAt(i));
}
return sb.toString();
```

## 대소문자

```java
String lower = s.toLowerCase();
String upper = s.toUpperCase();
```

문자 하나만 바꿀 때:

```java
Character.toUpperCase(c);
Character.toLowerCase(c);
```

## 문자열 자르기

`substring(start, end)`에서 `end`는 포함되지 않는다.

```java
s.substring(0, 3);
```

가운데 글자:

```java
int mid = s.length() / 2;
if (s.length() % 2 == 0) {
    return s.substring(mid - 1, mid + 1);
}
return s.substring(mid, mid + 1);
```

## 숫자 문자 확인

```java
for (int i = 0; i < s.length(); i++) {
    if (!Character.isDigit(s.charAt(i))) {
        return false;
    }
}
return true;
```

## 문자열 비교

문자열 내용 비교는 `==`가 아니라 `.equals()`를 쓴다.

```java
if (name.equals("Kim")) {
    return true;
}
```
