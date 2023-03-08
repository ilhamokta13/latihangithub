import java.util.Scanner

class cekbilanganprima{

    fun cekbilanganprima(num : Int):Boolean {
        if (num <= 1) {
            return false
        }
        for (i in 2..num / 2) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

}




fun main(args: Array<String>) {
    val cekbilprima = cekbilanganprima()

    print(" Masukkan bilangan : ")
    val num = readLine()!!.toInt()

    if (cekbilprima.cekbilanganprima(num)) {
        println("$num adalah bilangan prima.")
    } else {
        println("$num bukan bilangan prima.")
    }
}