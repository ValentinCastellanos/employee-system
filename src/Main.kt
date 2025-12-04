fun main() {

    val empleados = mutableListOf<Employee>()

    var manager1 = Manager()
    var developer1 = Developer()
    var designer1 = Designer()

    println("Introduce el nombre del manager1")
    manager1.name = readLine().toString()
    println("Introduce el salario del manager1")
    manager1.salary = readLine()!!.toDouble()
    empleados.add(manager1)

    println("\nIntroduce el nombre del developer1")
    developer1.name = readLine().toString()
    println("Introduce el salario del developer1")
    developer1.salary = readLine()!!.toDouble()
    empleados.add(developer1)

    println("\nIntroduce el nombre del designer1")
    designer1.name = readLine().toString()
    println("Introduce el salario del designer1")
    designer1.salary = readLine()!!.toDouble()
    empleados.add(designer1)
    println("\n")


    for (empleado in empleados) {
        empleado.details()
        empleado.work()
        empleado.calculateAnnualBonus()
        empleado.evaluatePerformance()
        println("-------------------------------------\n")
    }

}