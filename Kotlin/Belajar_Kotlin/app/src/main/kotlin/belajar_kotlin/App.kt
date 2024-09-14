
package belajar_kotlin



// single line comment
/*
   multi line comment
   Hello Kotlin
*/



fun main() {
    // Kotlin Fundamental
    val nama  = "Woody"
    //val nama:String?  = null //nullable type
    //println("Namaku adalah $nama") //*opsi simple
    print("Namaku adalah ")
    println(nama)

    //Coba1 = mengetahui panjang dari sebuah teks
    var nama2  = "Woody"
    println(nama2?.length)

    val integerList = listOf(6,23,2,9,7,6)
    println(integerList)
    println(integerList[0]) //memanggil berdasarkan index

    val integerSet = setOf(6,23,2,9,7,6)
    println(integerSet) //Pada Set menyimpan nilai yang bersifat unik jadi jika ada angka yang sama maka tidak akan ditampilkan

    val capital = mapOf(
        "Jakarta" to "Indonesia", //Key to Value
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital)
    println(capital["Jakarta"]) //untuk mengambil value kita perlu mengambil key terlebih dahulu
    capital.getValue("London")


 //DATA Types and Variabel
 //var identifier: Type = initialization //struktur
    var company: String = "Dicoding" //jika menggunakan val maka akan terjadi error
    company = "Dicoding Academy" //mengubah value dari variabel company
    println(company)

    val valueA: Int = 10
    val valueB = 20
    println(valueA + valueB)

    var anotherValue = 1
    anotherValue += 2 // anotherValue = anotherValue + 2
    println(anotherValue)

    //Char
        var vocal = 'A' //hanya bisa 1 karakter
        // increment (++) dan decrement (--)
        println("Vocal " + vocal++) // char bisa menggunakan ++ dan -- karena merupakan representasi dari Unicode
        println("Vocal " + vocal++)
        println("Vocal " + vocal++)
        println("Vocal " + vocal--)
        println("Vocal " + vocal--)
        println("Vocal " + vocal--)
        println("Vocal " + vocal--)

    //String
        val text  = "Dicoding"
        val firstChar = text[3]

        println("huruf keemapat dari $text adalah $firstChar")

    val text2  = "Kotlin"
    for (char in text2){ //for loop
        print("$char ")
    }

    val statement = "\nKotlin is Awesome!" //escaped string
    println(statement)

    val unicode = "Unicode test: \u00A9" //unicode
    println(unicode)
    //untuk mendifinisikan Raw String menggunakan triple quote
    val line = """ 
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)
}
