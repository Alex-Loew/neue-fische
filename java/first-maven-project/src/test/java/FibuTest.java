import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibuTest {

    @Test
    public void shouldFibuRecBe6(){

        //given
        int input = 6;
        int expected = 8;

        //when
        int actual = Fibu.callFibuRec(input);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFibuItBe6(){

        //given
        int input = 2;
        int expected = 1;

        //when
        int actual = Fibu.callFibuIt(input);

        //then
        assertEquals(expected, actual);
    }

}