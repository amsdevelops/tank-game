package domain

interface UObject {
    fun getProperty(key: String): Any
    fun setProperty(key: String, value: Any)
}