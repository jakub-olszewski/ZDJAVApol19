package pl.sdacademy.testowanie.podstawy.tdd;

import org.junit.Test;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @since : 19.07.2020
 **/
public class CalculatorTest {


    @Test
    public void add2and4equals6Test(){

        //given
        Calculator calc = new Calculator();

        //when
        String result = calc.add(2,4);

        //then
        String expected = "6";
    }
}
