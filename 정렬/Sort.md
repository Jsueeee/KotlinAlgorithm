#### [K번째 수](https://github.com/Jsueeee/KotlinAlgorithm/blob/master/%EC%A0%95%EB%A0%AC/sort_1.kt)
[프로그래머스](https://programmers.co.kr/learn/courses/30/lessons/42748)
##### slice
```Kotlin
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }.toIntArray()
    }
```
- map()은 forEach()와 유사하지만, forEach()와 달리 반환값이 있다는 점이 다르다.
- mapIndexed()도 유사하지만, 람다 함수에 index 와 data 를 함께 전달한다.
  - mapIndexed { index, data -> ... }
  
  
  
- lastIndexOf(element) : list 의 element 값에 대한 index 값 반환 (element가 없으면 -1 반환)
  - indexOf()는 앞에서부터 찾고, lastIndexOf()는 뒤에서부터 찾는다.
