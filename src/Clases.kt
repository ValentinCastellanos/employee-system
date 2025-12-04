abstract class Employee : Evaluable {

    abstract val name: String
    abstract val salary: Double

    abstract fun work(): Unit
    abstract fun calculateAnnualBonus(): Unit
    fun details(): Unit {
        println("El empleado $name tiene un salario de $salary euros")
    }
}

class Developer() : Employee() {
    override var name: String = ""
        get() = field
    override var salary: Double = 0.0
        get() = kotlin.math.round(field * 100) / 100.0

    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus() {
        println("El bonus que ha recibido este Developer es ${salary*0.1} euros este año (es un 10% de tu salario)")
    }

    override fun evaluatePerformance() {
        println("Este Developer ha trabajado bien este año")
    }

}

class Manager() : Employee() {
    override var name: String = ""
        get() = field
    override var salary: Double = 0.0
        get() = kotlin.math.round(field * 100) / 100.0

    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus() {
        println("El bonus que ha recibido este Manager es ${salary*0.2} euros este año (es un 20% de tu salario)")
    }

    override fun evaluatePerformance() {
        println("Este Manager ha trabajado bien este año")
    }
}

class Designer() : Employee() {
    override var name: String = ""
        get() = field
    override var salary: Double = 0.0
        get() = kotlin.math.round(field * 100) / 100.0

    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus() {
        println("El bonus que ha recibido este Designer es ${salary*0.15} euros este año (es un 15% de tu salario)")
    }

    override fun evaluatePerformance() {
        println("Este Designer ha trabajado bien este año")
    }

}