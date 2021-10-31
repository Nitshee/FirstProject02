package org.nitshe.course;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("testing scoring depending on age")

class ScoringServiceTest {
    private ScoringService cut = new ScoringService();

    @Test
    @DisplayName("should return -100 when age < 18")
    public void test1(){
        //given
        int age = 17;
        //when
        int result = cut.calculate(age);
        //then
        assertEquals(-100, result);

    }

    @Test
    @DisplayName("should return -200 when age > 60")
    public void test2(){
        //given
        int age = 65;
        //when
        int result = cut.calculate(age);
        //then
        assertEquals(-200, result);

    }

    @Test
    @DisplayName("should return 0 when age < 18 and > 60")
    public void test3(){
        //given
        int age = 45;
        //when
        int result = cut.calculate(age);
        //then
        assertEquals(0, result);

    }
}
