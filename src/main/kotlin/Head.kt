// klasa Dyrektor
class Head(
    firstName: String,
    lastName: String,
    salary: Double,
    contract: Contract,
    department: String,
    bonus: Double
) : TeamLeader(firstName, lastName, salary, contract, department, bonus) {
    constructor(firstName: String, lastName: String, contract: Contract, department: String) : this(firstName, lastName, 0.0, contract, department, 0.0)
}
