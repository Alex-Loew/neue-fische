import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AufgabenKlassen1Test {

    @Test
    void GetterSetterName(){

        //given
        Student student1 = new Student();
        String expected = "Willi";

        //when
        student1.setName(expected);
        String actual = student1.getName();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void GetterSetterSemesterCount(){

        //given
        Student student1 = new Student();
        int expected = 1;

        //when
        student1.setSemesterCount(expected);
        int actual = student1.getSemesterCount();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void GetterSetterActive(){

        //given
        Student student1 = new Student();
        boolean expected = true;

        //when
        student1.setActive(expected);
        boolean actual = student1.getActive();

        //then
        assertEquals(expected, actual);
    }




}