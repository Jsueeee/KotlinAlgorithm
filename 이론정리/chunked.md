
### chunked
#### 문자열(배열) 자르기

```Kotlin
    val tempList = ArrayList<List<String>>()
    
    for (i in 1 until s.length/2) {
        tempList.add(s.chunked(i))
    }

    tempList.forEach {
        println("자른 문자열 ${it}")
    }
```

#### 결과
```
자른 문자열 [a, b, c, a, b, c, a, b, c, a, b, c, d, e, d, e, d, e, d, e, d, e, d, e]
자른 문자열 [ab, ca, bc, ab, ca, bc, de, de, de, de, de, de]
자른 문자열 [abc, abc, abc, abc, ded, ede, ded, ede]
자른 문자열 [abca, bcab, cabc, dede, dede, dede]
자른 문자열 [abcab, cabca, bcded, edede, dede]
자른 문자열 [abcabc, abcabc, dedede, dedede]
자른 문자열 [abcabca, bcabcde, dededed, ede]
자른 문자열 [abcabcab, cabcdede, dededede]
자른 문자열 [abcabcabc, abcdedede, dedede]
자른 문자열 [abcabcabca, bcdededede, dede]
자른 문자열 [abcabcabcab, cdedededede, de]
```


### joinToString
```Kotlin
public fun <T> Iterable<T>.joinToString(
separator: CharSequence = ", ", 
prefix: CharSequence = "", 
postfix: CharSequence = "", 
limit: Int = -1, 
truncated: CharSequence = "...", 
transform: ((T) -> CharSequence)? = null): String {
    return joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()
}
```
1. separator : 원소 연결 사이에 들어갈 문자열 ("" -> 공백없이 연결)
2. prefix : 만들 문자열에서 시작할 문자열
3. postfix : 만들 문자열에서 종료할 문자열
4. limit : 개수제한


