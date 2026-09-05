# 해시

해시는 값을 빠르게 찾기 위한 자료구조다. Java에서는 주로 `HashSet`과 `HashMap`을 쓴다.

필요한 import:

```java
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
```

## 언제 해시를 쓰나

문제에서 아래 신호가 보이면 해시를 떠올린다.

- 중복을 제거해야 한다.
- 어떤 값이 이미 있는지 빠르게 확인해야 한다.
- 이름, 종류, 번호 같은 값을 기준으로 개수를 세야 한다.
- A 목록과 B 목록을 비교해야 한다.
- 문자열 접두어, 포함 여부를 빠르게 검사해야 한다.

## HashSet

`HashSet`은 중복 없는 값들의 모음이다.

```java
Set<String> set = new HashSet<>();
set.add("119");
set.add("123");
```

포함 여부 확인:

```java
if (set.contains("119")) {
    return true;
}
```

중복 제거:

```java
Set<Integer> set = new HashSet<>();
for (int number : numbers) {
    set.add(number);
}
```

자주 쓰는 메서드:

| 메서드 | 의미 |
|------|------|
| `add(value)` | 값 추가 |
| `contains(value)` | 값 존재 여부 확인 |
| `remove(value)` | 값 제거 |
| `size()` | 값 개수 |
| `isEmpty()` | 비었는지 확인 |

## HashMap

`HashMap`은 key와 value를 묶어서 저장한다.

```java
Map<String, Integer> map = new HashMap<>();
map.put("headgear", 2);
```

값 꺼내기:

```java
int count = map.get("headgear");
```

없는 key를 꺼내면 `null`이 나오므로 `getOrDefault`를 자주 쓴다.

```java
int count = map.getOrDefault("headgear", 0);
```

개수 세기:

```java
Map<String, Integer> countMap = new HashMap<>();

for (String name : names) {
    countMap.put(name, countMap.getOrDefault(name, 0) + 1);
}
```

자주 쓰는 메서드:

| 메서드 | 의미 |
|------|------|
| `put(key, value)` | 값 저장 |
| `get(key)` | 값 조회 |
| `getOrDefault(key, defaultValue)` | 값이 없으면 기본값 반환 |
| `containsKey(key)` | key 존재 여부 확인 |
| `remove(key)` | key 제거 |
| `keySet()` | key 목록 |
| `values()` | value 목록 |

## 패턴 1: 빈도 세기

같은 값이 몇 번 나오는지 세는 패턴이다.

```java
Map<String, Integer> map = new HashMap<>();

for (String value : values) {
    map.put(value, map.getOrDefault(value, 0) + 1);
}
```

예:

```text
["headgear", "eyewear", "headgear"]
```

결과:

```text
headgear -> 2
eyewear -> 1
```

## 패턴 2: 두 배열 비교

한 배열에서 값을 추가하고, 다른 배열에서 값을 빼는 방식이다.

```java
Map<String, Integer> map = new HashMap<>();

for (String value : participant) {
    map.put(value, map.getOrDefault(value, 0) + 1);
}

for (String value : completion) {
    map.put(value, map.get(value) - 1);
}

for (String key : map.keySet()) {
    if (map.get(key) > 0) {
        return key;
    }
}
```

`완주하지 못한 선수` 같은 문제에서 자주 쓴다.

## 패턴 3: 접두어 검사

`전화번호 목록`처럼 어떤 문자열이 다른 문자열의 접두어인지 확인해야 할 때 쓴다.

```java
Set<String> set = new HashSet<>();

for (String phone : phoneBook) {
    set.add(phone);
}

for (String phone : phoneBook) {
    for (int i = 1; i < phone.length(); i++) {
        String prefix = phone.substring(0, i);
        if (set.contains(prefix)) {
            return false;
        }
    }
}

return true;
```

예:

```text
phone = "1195524421"
prefix = "1", "11", "119", ...
```

`"119"`가 set에 있으면 접두어가 존재하므로 `false`다.

정렬로도 풀 수 있다.

```java
Arrays.sort(phoneBook);

for (int i = 0; i < phoneBook.length - 1; i++) {
    if (phoneBook[i + 1].startsWith(phoneBook[i])) {
        return false;
    }
}

return true;
```

정렬하면 접두어 관계가 있는 문자열끼리 이웃하게 되므로 바로 다음 값만 확인하면 된다.

## 패턴 4: 종류별 조합

`의상`처럼 종류별 개수를 세고 조합 수를 구하는 문제에서 쓴다.

```java
Map<String, Integer> map = new HashMap<>();

for (String[] cloth : clothes) {
    String type = cloth[1];
    map.put(type, map.getOrDefault(type, 0) + 1);
}

int answer = 1;
for (int count : map.values()) {
    answer *= count + 1;
}

return answer - 1;
```

`count + 1`을 곱하는 이유는 그 종류의 옷을 입지 않는 경우도 있기 때문이다.

예:

```text
headgear 2개 -> 안 입음 포함 3가지
eyewear 1개  -> 안 입음 포함 2가지

3 * 2 = 6
아무것도 안 입는 경우 1개 제외
정답 = 5
```

## HashSet과 HashMap 선택

| 상황 | 선택 |
|------|------|
| 존재 여부만 필요 | HashSet |
| 중복 제거 | HashSet |
| 개수를 세야 함 | HashMap |
| key와 값을 연결해야 함 | HashMap |
| 종류별 개수 계산 | HashMap |

## 주의할 점

- `HashSet`, `HashMap`은 기본적으로 순서를 보장하지 않는다.
- 정렬된 순서가 필요하면 `Arrays.sort`, `Collections.sort` 등을 따로 사용한다.
- `map.get(key)`는 key가 없으면 `null`이 나올 수 있다.
- 개수 세기는 `getOrDefault`를 쓰면 안전하다.
- 접두어 문제는 `contains`가 아니라 `startsWith`가 필요한 경우가 많다.
