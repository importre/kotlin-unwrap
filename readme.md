<h1 align="center">kotlin-unwrap</h1>

<p align="center">🎁📦💝🎁📦💝🎁📦💝</p>

[![Download][bintray-badge]][bintray-version]
[![Build Status][travis-badge]][travis-url]

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
val _a = foo("Hello")
val _b = foo("World")
val _c = foo("!")

// example: unwrap all variables
unwrap(_a, _b, _c) { a, b, c ->
    println("$a, $b$c")
}
```

### Error handling

```kotlin
val _a = foo("Hello")
val _b = foo("World")
val _c = foo(null)

// example: error handing
unwrap(_a, _b, _c) { a, b, c ->
    println("$a, $b$c")
} nah {
    println("Nah!")
}
```


## Test

```sh
$ ./gradlew check
```


## License

Apache 2.0 © Jaewe Heo




[bintray-badge]: https://api.bintray.com/packages/importre/maven/kotlin-unwrap/images/download.svg
[bintray-version]: https://bintray.com/importre/maven/kotlin-unwrap/_latestVersion
[travis-badge]: https://travis-ci.org/importre/kotlin-unwrap.svg?branch=master
[travis-url]: https://travis-ci.org/importre/kotlin-unwrap
