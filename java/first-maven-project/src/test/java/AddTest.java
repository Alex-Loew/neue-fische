
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {


     @Test
     @DisplayName("Test 1 = num1: pos , num2: pos")
     public void test1(){
          //given
          int Num1 = 1;
          int Num2 = 2;

          //when
          int result = Add.add(Num1, Num2);

          //then
          assertEquals(3, result);
     }

     @Test
     @DisplayName("Test 2 = num1: pos + num2: neg")
     public void test2(){
          //given
          int Num1 = 1;
          int Num2 = -2;

          //when
          int result = Add.add(Num1, Num2);

          //then
          assertEquals(-1, result);
     }

     @Test
     @DisplayName("Test 3 = num1: neg + num2: pos")
     public void test3(){
          //given
          int Num1 = -1;
          int Num2 = 2;

          //when
          int result = Add.add(Num1, Num2);

          //then
          assertEquals(1, result);
     }

     @Test
     @DisplayName("Test 4 = num1: neg + num2: neg")
     public void test4(){
          //given
          int Num1 = -1;
          int Num2 = -2;

          //when
          int result = Add.add(Num1, Num2);

          //then
          assertEquals(-3, result);
     }



}