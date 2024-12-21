```groovy
def myMethod(String str) {
  if (str == null) {
    return ""
  }
  return str.toUpperCase()
}

println myMethod(null) // Output: ""
println myMethod("hello") // Output: HELLO
println myMethod(123) // Output: Exception
```