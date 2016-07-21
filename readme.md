# kotlin-unwrap

[ ![Download](https://api.bintray.com/packages/importre/maven/kotlin-unwrap/images/download.svg) ](https://bintray.com/importre/maven/kotlin-unwrap/_latestVersion) [![Build Status](https://travis-ci.org/importre/kotlin-unwrap.svg?branch=master)](https://travis-ci.org/importre/kotlin-unwrap)

> Unwrap nullable variables


## build.gradle

```gradle
repositories {
    jcenter()
}

dependencies {
    compile "com.importre:kotlin-unwrap:<VERSION>"
}
```


## Example

```kotlin
// returns nullable
fun foo(name: String?): String? = name

fun bar(): String {
    val _a = foo("Hello")
    val _b = foo("World")
    val _c = foo("!")

    // unwrap all variables
    return unwrap(_a, _b, _c) { a, b, c ->
        "$a $b$c"
    } ?: return ""
}

fun baz(): String {
    val _a = foo("Hello")
    val _b = foo("World")
    val _c = foo(null)

    // unwrap all variables
    return unwrap(_a, _b, _c) { a, b, c ->
        "$a $b$c"
    } ?: return ""
}

fun main(args: Array<String>) {
    println(bar())       // "Hello World!"
    println(baz() == "") // true
}
```

### Error handling

```kotlin
unwrap(_a, _b) { a, b ->
  // do something
} ?: run {
  // handle error
}
```


## Test

```sh
$ ./gradlew check
```


## License

Apache 2.0 © Jaewe Heo
