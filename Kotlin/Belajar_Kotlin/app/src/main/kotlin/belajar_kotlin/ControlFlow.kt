package belajar_kotlin

fun main(){
    //When Expressions
    val value = 0

    when(value) { //mencocokan semua argumen sampai salah satu kondisi terpenuhi
        6 -> println("value is 6")
        7 -> {
            println("Seven is $value")
            println("value is 7")
        }

        8 -> println("value is 8")

        else -> println("agak laen ini") //jika tidak ada kondisi yang terpenuhi maka akan ke bagian else
    }
    //While dan While Do

    //While
//    var counter = 1
//    while (counter <= 7){ //selama nilai dari counter <=7 maka program akan terus berjalan sampai kondisi tersebut tdk terpenuhi lagi
//        println("Hello, World!")
//        counter++
//    }

    //While Do
//        var counter2 = 1
//        do { //melakukan terlebih dahulu
//            println("Hello, World!")
//            counter2++
//        } while (counter2 <= 7)     //diakhir melakukan evaluasi

    //Range
//        val rangeInt = 1..10
//        rangeInt.forEach {
//            println("$it ")
//        }
//        println(rangeInt)

    //For Loop
//    val ranges = 1..5
//    for (i in ranges){
//        println("value is $i!")
//    }

    //Break and Continue

    //Continue
//    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
//    for (i in listOfInt) {
//        if(i == null) continue
//        println(i)
//    }

    //Break
//    val listOfInt2 = listOf(1, 2, 3, null, 5, null, 7)
//
//    for (j in listOfInt2) {
//        if (j == null) break
//        print(j)
//    }



}