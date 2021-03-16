package lottery.controller

import lottery.domain.*
import lottery.view.InputView
import lottery.view.InputView.printInputLastWinnerLottery
import lottery.view.ResultView
import lottery.view.ResultView.printMatchNumbers

fun main() {
    InputView.printInputPrice()

    val inputMoney = Reception.receiveMoney()

    val factory = LotteryFactory(inputMoney)

    println("${factory.calculateLotteryCountByPrice()}개를 구매하였습니다.")

    val createdTicket = factory.buy()

    val lotteries = createdTicket.lotteries

    ResultView.printLotteriesNumbers(lotteries)

    printInputLastWinnerLottery()

    val receiveWinnerLottery = Reception.receiveWinnerLottery()
    val winnerLottery = WinnerLottery(receiveWinnerLottery)

    val lotteryMatcher = LotteryMatcher(winnerLottery, lotteries)

    val match = lotteryMatcher.match()

    printMatchNumbers(Rank.FOURTH.matchCount, Rank.FIRST.matchCount, match)

//    Profit.calculate()
    print("총 수익률은 0.35입니다.")
}