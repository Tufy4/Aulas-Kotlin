package objects

data class Employee(val name: String, val salary: Double)

//Quero uma única instância dessa classe no sistema inteiro
object Payroll{
    val allEmployees = mutableListOf<Employee>()

    fun calculateSalary() : Double =
        allEmployees
            .map { e -> e.salary}
            .sum()
}

fun main(){
    Payroll.allEmployees.add(
        Employee("Moe", 100.0))
    Payroll.allEmployees.add(
        Employee("Larry", 150.0))

    val total = Payroll.calculateSalary()
    println(total)
}