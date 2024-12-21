# Groovy Implicit Type Coercion Bug
This example demonstrates a common error in Groovy related to implicit type coercion.  When a method expects a specific type (like String) and receives a different type (like Integer) without explicit type handling, it can result in unexpected runtime exceptions.

The `bug.groovy` file contains the buggy code.  The `bugSolution.groovy` file shows how to fix this using explicit type checking or more robust handling of unexpected input types.

## How to Reproduce
1. Save the code in `bug.groovy`.
2. Run the script using Groovy: `groovy bug.groovy`
3. Observe the exception when an integer is passed to `myMethod()`.