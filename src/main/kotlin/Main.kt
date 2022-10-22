fun main(args: Array<String>) {
    println("Hello World!")
    print("írd be a stringet amit szeretnél látni: ")
    val a = readln()
    println(a)
    println(Short.MIN_VALUE)
    println(Short.MAX_VALUE)
    println(Byte.MIN_VALUE)
    println(Byte.MAX_VALUE)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}