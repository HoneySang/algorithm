package com.honeysang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class B11382Test {

    @Test
    @DisplayName("A + B + C 의 값을 출력한다")
    void testSolution01() {
        long a = 77;
        long b = 77;
        long c = 7777;
        long expected = 7931;

        long value = B11382.solution(a, b, c);

        assertThat(value).isEqualTo(expected);
    }
}
