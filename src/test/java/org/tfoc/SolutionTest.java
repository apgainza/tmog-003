package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class SolutionTest {

    private static Stream<Arguments> provideInputNums() {
        return Stream.of(
                Arguments.of(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{5, 4, -1, 7}, 15),
                Arguments.of(new int[]{5, 4, -1, -3, -2, -8}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("provideInputNums")
    void testSolution(int[] nums, Integer sumExpected) {
        Integer sum = Solution.maxSubArray(nums);

        Assertions.assertEquals(sumExpected, sum);
    }

}