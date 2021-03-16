package lottery.domain

class WinnerLottery(numbers: List<Int>) {
    val lotteryNumbers: LotteryNumbers = LotteryNumbers(numbers)

    fun match(lotteries: List<Lottery>): HashMap<Int, Int> {
        val result = HashMap<Int, Int>()

        lotteries.map {
            val count = matchCount(it.lotteryNumbers)

            if (Rank.isInTheRank(count)) {
                addMatchCount(result, count)
            }
        }

        return result
    }

    private fun addMatchCount(result: HashMap<Int, Int>, count: Int) {
        result[count] = result.getOrDefault(count, DEFAULT_MATCH_COUNT) + ADD_COUNT_VALUE
    }

    fun matchCount(lotteryNumbers: LotteryNumbers): Int {
        return lotteryNumbers.numbers.filter { this.lotteryNumbers.numbers.contains(it) }.count()
    }

    companion object {
        const val DEFAULT_MATCH_COUNT = 0
        const val ADD_COUNT_VALUE = 1
    }
}
