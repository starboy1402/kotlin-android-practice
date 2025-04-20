fun main() {
    println("Simple Calculator")

    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()

    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    print("Enter operator (+, -, *, /): ")
    val op = readLine()

    val result = when(op) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by zero"
        else -> "Invalid operator"
    }

    println("Result: $result")
}
