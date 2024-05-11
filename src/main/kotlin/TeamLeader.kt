// klasa Kierownik
open class TeamLeader(
    firstName: String,
    lastName: String,
    salary: Double,
    contract: Contract,
    private var department: String,
    private var bonus: Double
) : PermanentEmployee(firstName, lastName, salary, contract) {
    constructor(firstName: String, lastName: String, contract: Contract, department: String, bonus: Double) :
            this(firstName, lastName, 0.0, contract, department, bonus)
    override fun toString(): String {
        return "${super.toString()}, Department: $department, Bonus: $bonus"
    }
}