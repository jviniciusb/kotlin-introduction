# Named arguments

Altere o método **toJsonString** para que ele retorne uma **String** no formato JSON
que represente a lista de entrada.

Por exemplo: Uma lista formada pelos valores **"a"**, **"b"** e **"c"** deve retornar a String **"[a, b, c]"**

Faça isso especificando apenas dois argumentos do método [joinToString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html)

```kotlin
fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String
```

Caso necessário consulte a documentação sobre [Default and named arguments](https://kotlinlang.org/docs/functions.html#default-arguments).