package dev.kata.stringcalculator

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

internal class StringCalculatorShould : DescribeSpec({
    describe("StringCalculator") {
        it("should return 0 when execute is called") {
            val stringCalculator = StringCalculator()
            val result = stringCalculator.execute()
            result shouldBe 0
        }
    }
})
