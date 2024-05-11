open class Contract(
    private var type: String
) {
    override fun toString(): String {
        return "Class: ${this.javaClass.simpleName}, Type: $type"
    }

    fun getType(): String {
        return type
    }

    fun setType(firstName: String) {
        this.type = type
    }
}