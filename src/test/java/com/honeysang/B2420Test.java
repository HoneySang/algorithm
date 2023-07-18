package com.honeysang;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class B2420Test {

    @Test
    @DisplayName("-2와 5를 입력하면 7을 출력한다.")
    void testSolution01() {
        // given 설정하는 단계
        long n = -2;
        long m = 5;
        long expected = 7;

        // when 실행단계
        long value = B2420.solution(n, m);

        // then 검증단계
        assertThat(value).isEqualTo(expected);
    }
}
