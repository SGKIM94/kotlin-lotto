package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class LotteriesTest {
    @Test
    fun `로또들들 생성한다`() {
        val createdLotteries = Lotteries.createLotteries(5)

        val lotteries = createdLotteries.lotteries

        assertAll(
            { assertThat(lotteries.size).isEqualTo(5) },
            { assertThat(lotteries[0].numbers).isNotNull },
            { assertThat(lotteries[0].price).isEqualTo(1000) }
        )
    }
}
