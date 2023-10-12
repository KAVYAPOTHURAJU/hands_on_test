import java.io.BufferedReader
import java.io.InputStreamReader

def calculate() {
    println("Simple Calculator in Groovy")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    println("5. Exit")

    def reader = new BufferedReader(new InputStreamReader(System.in))

    while (true) {
        print("Enter your choice (1/2/3/4/5): ")
        def choice = reader.readLine().toInteger()

        if (choice == 5) {
            println("Goodbye!")
            break
        }

        print("Enter the first number: ")
        def num1 = reader.readLine().toInteger()

        print("Enter the second number: ")
        def num2 = reader.readLine().toInteger()

        def result

        switch (choice) {
            case 1:
                result = num1 + num2
                break
            case 2:
                result = num1 - num2
                break
            case 3:
                result = num1 * num2
                break
            case 4:
                if (num2 == 0) {
                    result = "Division by zero is not allowed."
                } else {
                    result = num1 / num2
                }
                break
            default:
                println("Invalid choice. Please select a valid option (1/2/3/4/5).")
                continue
        }

        println("Result: $result")
    }
}

calculate()
