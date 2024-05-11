class PermanentFreelancer(
    firstName: String,
    lastName: String,
    salary: Double,
    contract: Contract
) : Freelancer(firstName, lastName, salary, contract) {
    constructor(firstName: String, lastName: String, contract: Contract) : this(firstName, lastName, 0.0, contract)
}