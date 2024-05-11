open class Employee(
    private var firstName: String,
    private var lastName: String,
    private var salary: Double
) {

    constructor(firstName: String, lastName: String) : this(firstName, lastName, 0.0)

    override fun toString(): String {
        return "Class: ${this.javaClass.simpleName}, Name: $firstName $lastName, Salary: $salary"
    }

    fun getFirstName(): String {
        return firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun getSalary(): Double {
        return salary
    }
    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun setSalary(salary: Double) {
        this.salary = salary
    }
}