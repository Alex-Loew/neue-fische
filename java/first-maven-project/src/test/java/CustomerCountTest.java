import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerCountTest {

    @Test
    @DisplayName("Testfall 1 = Anzahl ist unter 30")
    public void test1(){
        //given
            int Num1 = 1;
        //when
            String custCounter= CustomerCount.counter(Num1);
        //then
            assertEquals("Maximale Personenanzahl nicht überschritten", custCounter);
    }

    @Test
    @DisplayName("Testfall 2 = Anzahl ist über 30")
    public void test2(){
        //given
        int Num1 = 31;
        //when
        String custCounter = CustomerCount.counter(Num1);
        //then
        assertEquals("Zu viele Personen", custCounter);
    }

    @Test
    @DisplayName("Testfall 1 = Alarmstufe rot")
    public void test_alarm_1(){
        //given
        String anzahl="rot";
        //when
        int alarmstufe = CustomerCount.alarm(anzahl);
        //then
        assertEquals(0,alarmstufe);
    }

}