package kalkulatorBMI

class BodyMassIndex(val weight : Double, val height : Double) {
    fun calculate(): Double {
        val heightInMeters = height / 100
        return weight / (heightInMeters * heightInMeters)
    }
}
