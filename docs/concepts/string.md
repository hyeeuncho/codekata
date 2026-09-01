# 문자열

문자열은 직접 수정할 수 없으므로 새 문자열을 만들거나 `StringBuilder`를 사용한다.

필요한 import:

```java
import java.util.Arrays;
```

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

## 문자열 변환

숫자를 문자열로 바꾸기:

```java
String s = String.valueOf(n);
```

문자열을 숫자로 바꾸기:

```java
int n = Integer.parseInt(s);
long value = Long.parseLong(s);
```

문자열을 문자 배열로 바꾸기:

```java
char[] chars = s.toCharArray();
```

문자 배열을 문자열로 바꾸기:

```java
String result = new String(chars);
```

문자열을 한 글자씩 문자열 배열로 바꾸기:

```java
String[] arr = s.split("");
```

문자열을 특정 기준으로 나누기:

```java
String[] words = s.split(" ");
String[] parts = s.split(",");
```

문자열 배열을 하나의 문자열로 합치기:

```java
String result = String.join("", arr);
String csv = String.join(",", arr);
```

숫자 문자열을 숫자 배열로 바꾸기:

```java
int[] numbers = Arrays.stream(s.split(""))
        .mapToInt(Integer::parseInt)
        .toArray();
```

숫자를 자릿수 배열로 바꾸기:

```java
int[] digits = String.valueOf(n).chars()
        .map(c -> c - '0')
        .toArray();
```

주의할 점:

- `"123".split("")`은 `["1", "2", "3"]`이 된다.
- `s.charAt(i)`는 `char`를 반환한다.
- 숫자 문자 `'7'`을 숫자 `7`로 바꾸려면 `'7' - '0'`을 쓴다.

## 숫자 문자 확인

```java
for (int i = 0; i < s.length(); i++) {
    if (!Character.isDigit(s.charAt(i))) {
        return false;
    }
}
return true;
```

정규식으로도 확인할 수 있다.

```java
String regex = "^(\\d{4}|\\d{6})$";
return s.matches(regex);
```

## 정규식 기초

정규식은 문자열이 특정 규칙과 맞는지 검사할 때 사용한다. Java 문자열 안에서 정규식을 쓸 때는 `\`를 한 번 더 써야 하므로 숫자를 뜻하는 `\d`는 `"\\d"`로 작성한다.

자주 쓰는 문법:

| 문법 | 의미 |
|------|------|
| `^` | 문자열 시작 |
| `$` | 문자열 끝 |
| `\\d` | 숫자 한 글자 |
| `{4}` | 정확히 4번 반복 |
| `{4,6}` | 4번 이상 6번 이하 반복 |
| `|` | 또는 |
| `()` | 조건 묶기 |
| `[a-z]` | 소문자 알파벳 한 글자 |
| `[0-9]` | 숫자 한 글자 |

예시:

```java
s.matches("\\d+");      // 숫자로만 이루어진 문자열
s.matches("^[a-z]+$");  // 소문자로만 이루어진 문자열
s.matches("^.{3}$");    // 길이가 정확히 3인 문자열
```

`matches`는 문자열 전체가 정규식과 맞아야 `true`를 반환한다. 그래도 시작과 끝을 명확히 보여주고 싶으면 `^`, `$`를 같이 쓰는 편이 좋다.

3번 문제인 문자열 다루기 기본은 아래 조건을 검사한다.

- 길이가 4 또는 6이다.
- 모든 문자가 숫자다.

그래서 이 정규식으로 표현할 수 있다.

```java
"^(\\d{4}|\\d{6})$"
```

뜻:

- `^`: 문자열 시작
- `\\d{4}`: 숫자 4개
- `|`: 또는
- `\\d{6}`: 숫자 6개
- `$`: 문자열 끝

## 문자열 비교

문자열 내용 비교는 `==`가 아니라 `.equals()`를 쓴다.

```java
if (name.equals("Kim")) {
    return true;
}
```
