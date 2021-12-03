fun main() {
    fun part1(input: List<String>): Int {
        var increases = 0;
        for (i in 1..input.size-1) {
            if (input[i].toInt() > input[i-1].toInt()) {
                increases++
            }
        }
        return increases
    }

    fun part2(input: List<String>): Int {
        var increases = 0
        for (i in 0..input.size-4) {
            if (input[i+3].toInt() > input[i].toInt()) {
                increases++;
            }
        }
        return increases
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
