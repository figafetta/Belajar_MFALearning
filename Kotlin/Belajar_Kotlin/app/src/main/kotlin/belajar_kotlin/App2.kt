package belajar_kotlin

fun main() {
    //string template
    val name = "Woody"
    val old = 22
    println("Namaku adalah $name") //menyisipkan sebuah variabel ke dalam sebuah String tanpa concatenation (penggabungan objek String menggunakan +)
    println("Namaku adalah $name dan umurku $old tahun") //memasukkan dengan tipe data int
    println("${if (name == "Woody") "Betul Sekali $name" else "Salahhhhhh"}") //exspression juga bisa

    //IF Expressions
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    println(office)

    //Boolean
    val officeOpen = 7
    val officeClosed = 16
    val now2 = 20

    val isOpen = if (now2 >= officeOpen && now2 <= officeClosed) { //Conjunction atau AND (&&)
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    val isOpen2 = true
    if (!isOpen2) { //Negation atau NOT (!) akan mengembalikan nilai ke false
        println("Office is closed")
    } else {
        println("Office is open")
    }
    //Number
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val Number1 = 23
    val Number2 = 90


    println(maxInt)
    println(minInt)
    println(Number1 * Number2)
    //println(5 + 4 * 4)

    //Array
    val intArray = intArrayOf(1, 3, 5, 7)
    println(intArray[2])

    //Nullable
    val text: String? = null
    println(text)

    var string: String? = "Dicoding"
    if(string != null) { // smart cast
        println(string.length) // It works now!
    }

    //Safe Calls dan Elvis Operator

    val textt: String? = null
    textt?.length //safecall operator (?.) //kompiler akan melewatkan proses jika bernilai null

    val text1: String? = null
    val textLength = text1?.length ?: 7 //Elvis Operator(?:)
    println(textLength)

    //Function
    //fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    //    return result
    //}

    fun setUser(name: String, age:Int): String{
        return "Your name is $name, and you $age years old"
    }
    println(setUser("Woody",9))
}


