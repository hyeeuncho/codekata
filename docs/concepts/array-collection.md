# 배열과 컬렉션

배열은 길이가 고정되어 있고, 컬렉션은 원소를 추가하거나 제거하기 쉽다.

필요한 import:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
```

## 배열

```java
int[] answer = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    answer[i] = arr[i];
}
```

배열 비교 테스트에서는 `assertArrayEquals`를 쓴다.

```java
assertArrayEquals(new int[]{1, 2, 3}, result);
```

## 배열 변환

`int[]`를 `Integer[]`로 바꾸기:

```java
Integer[] boxed = Arrays.stream(arr)
        .boxed()
        .toArray(Integer[]::new);
```

`Integer[]`를 `int[]`로 바꾸기:

```java
int[] unboxed = Arrays.stream(boxed)
        .mapToInt(Integer::intValue)
        .toArray();
```

`String[]`를 `int[]`로 바꾸기:

```java
int[] numbers = Arrays.stream(arr)
        .mapToInt(Integer::parseInt)
        .toArray();
```

`int[]`를 문자열로 확인하기:

```java
String text = Arrays.toString(arr);
```

`int[]`를 정렬 후 배열로 유지하기:

```java
Arrays.sort(arr);
```

`int[]`를 정렬 후 리스트처럼 처리하기:

```java
List<Integer> list = Arrays.stream(arr)
        .boxed()
        .toList();
```

## ArrayList

결과 개수를 처음에 알 수 없으면 `ArrayList`를 쓴다.

```java
List<Integer> list = new ArrayList<>();
list.add(value);
```

`ArrayList<Integer>`를 `int[]`로 변환:

```java
int[] answer = list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
```

`ArrayList<String>`을 `String[]`로 변환:

```java
String[] answer = list.toArray(new String[0]);
```

배열을 리스트로 변환:

```java
List<String> list = Arrays.asList(arr);
```

주의할 점:

- `Arrays.asList(arr)`로 만든 리스트는 크기 변경이 불편하다.
- `add`, `remove`가 필요하면 새 `ArrayList`로 감싼다.

```java
List<String> list = new ArrayList<>(Arrays.asList(arr));
```

## HashSet

중복 제거가 필요하면 `HashSet`을 쓴다.

```java
Set<Integer> set = new HashSet<>();
set.add(value);
```

포함 여부 확인:

```java
if (set.contains(value)) {
    return true;
}
```

## HashMap

개수를 세거나 이름과 값을 연결할 때 쓴다.

```java
Map<String, Integer> map = new HashMap<>();
map.put(name, map.getOrDefault(name, 0) + 1);
```

값 꺼내기:

```java
int count = map.getOrDefault(name, 0);
```
