fun main() {

    fun action (colorOne: String, colorTwo: String, mix:(String, String) -> String): String{
        return mix(colorOne, colorTwo)
    }

    println(action("Белый","Черный", ::mix))
}

fun mix(colorOne: String, colorTwo:String):String{
    return "Получившийся цвет"
}