```groovy
def myMethod(String str) {
  if (str == null) {
    return ""
  }
  //Explicit type checking
  if (!(str instanceof String)){
    return "Invalid input type"
  }
  return str.toUpperCase()
}

println myMethod(null) // Output: ""
println myMethod("hello") // Output: HELLO
println myMethod(123) // Output: Invalid input type
```