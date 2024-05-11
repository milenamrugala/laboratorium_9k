open class Freelancer(
    firstName: String,
    lastName: String,
    salary: Double,
    private var contract: Contract
) : Employee(firstName, lastName, salary) {
    constructor(firstName: String, lastName: String, contract: Contract) : this(firstName, lastName, 0.0, contract)
    override fun toString(): String {
        return "${super.toString()}, Contract: $contract"
    }
}