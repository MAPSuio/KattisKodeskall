fun main() {
    val n = readLine()!!.toInt()
    
    for (i in 1..n) {
        val (case, days) = readLine()!!.split(" ")
        val daysInt = days.toInt()
        var candles = daysInt
        
        for (j in 1..daysInt) {
            candles += j
        }
        println("$case $candles")
    }
}
