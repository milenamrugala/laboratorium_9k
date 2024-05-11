class Leader(
    firstName: String,
    lastName: String,
    salary: Double,
    contract: Contract,
    private var department: String,
    private var bonus: Double
) : PermanentEmployee(firstName, lastName, salary, contract) {
    override fun toString(): String {
        return "${super.toString()}, Department: $department, Bonus: $bonus"
    }
}