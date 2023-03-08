package kalkulatorBMI

fun main(){


    print("Masukkan berat badan (kg): ")
    val weight = readLine()!!.toDouble()

    print("Masukkan tinggi badan (cm): ")
    val height = readLine()!!.toDouble()

    val bmi = BodyMassIndex(weight, height)
    val result = bmi.calculate()

    println("Indeks Massa Tubuh (BMI) Anda adalah $result.")
}





