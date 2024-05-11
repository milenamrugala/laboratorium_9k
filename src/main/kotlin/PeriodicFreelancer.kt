class PeriodicFreelancer (
    firstName: String,
    lastName: String,
    salary: Double,
    contract: Contract,
    private var period: Int
) : Freelancer(firstName, lastName, salary, contract) {
    constructor(firstName: String, lastName: String, contract: Contract, period: Int) : this(firstName, lastName, 0.0, contract, period)
    override fun toString(): String {
        return "${super.toString()}, Period: $period"
    }
}