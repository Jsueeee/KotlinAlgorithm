
#### chunked
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
