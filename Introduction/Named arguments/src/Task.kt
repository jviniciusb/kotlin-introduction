fun toJsonString(values: List<String>): String {
    return values.joinToString(prefix = "[", postfix = "]")
}