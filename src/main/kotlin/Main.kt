fun main() {
    val contract = Contract("Fixed Term")
    val head = Head(
        "Barbara",
        "Nowak",
        12000.0,
        contract,
        "Customer Service",
        2000.0)
    println(head)

    val secondContract = Contract("B2B")
    val freelancer = PeriodicFreelancer(
        "Andrzej",
        "Nowak",
        15000.0,
        secondContract,
        12)
    println(freelancer)
}