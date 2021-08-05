#### [K번째 수](https://github.com/Jsueeee/KotlinAlgorithm/blob/master/%EC%A0%95%EB%A0%AC/sort_1.kt)
[프로그래머스](https://programmers.co.kr/learn/courses/30/lessons/42748)
#### slice
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

####[가장 큰 수]()
[프로그래머스](https://programmers.co.kr/learn/courses/30/lessons/42746)
#### Comparator
```Kotlin
    fun solution(numbers: IntArray): String {
        var answer = ""
        numbers.sortedWith(Comparator { num1: Int, num2: Int -> "$num2$num1".compareTo("$num1$num2") }).forEach { answer += it }
        if ("(0*)".toRegex().replace(answer, "").isEmpty()) {
            answer = "0"
        }
        return answer
    }
```
- toRegex() : 
#### [정규표현식 정리 바로가기](https://github.com/Jsueeee/KotlinAlgorithm/edit/master/%EC%9D%B4%EB%A1%A0%EC%A0%95%EB%A6%AC/%EC%A0%95%EA%B7%9C%ED%91%9C%ED%98%84%EC%8B%9D.md)
#### [^0-9] : 숫자가 아닌 것을 지정할 때 쓴다.
```Kotlin
// 문자열에서 숫자를 빼고 모두 ""로 replace

var answer = "안녕안녕00023424안녕2323"
println("[^0-9]".toRegex().replace(answer, ""))

// result : 000234242323
```






