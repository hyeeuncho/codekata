# 배열과 컬렉션

배열은 길이가 고정되어 있고, 컬렉션은 원소를 추가하거나 제거하기 쉽다.

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

## ArrayList

결과 개수를 처음에 알 수 없으면 `ArrayList`를 쓴다.

```java
List<Integer> list = new ArrayList<>();
list.add(value);
```

배열로 변환:

```java
int[] answer = list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
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
