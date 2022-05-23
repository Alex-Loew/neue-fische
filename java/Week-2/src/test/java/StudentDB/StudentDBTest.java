package StudentDB;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void insertArray(){

        //given


        //when
        Student[] actual = {new Student("Alex", 1), new Student("Berti", 2)};
        Student[] expected =  {new Student("Alex", 1), new Student("Berti", 2)};

        //then
        assertArrayEquals(expected, actual);
    }

    @Test
    void testListArray(){

        Student[] testArray = {new Student("Alex", 1), new Student("Berti", 2)};

        StudentDB testDB = new StudentDB(testArray);

        Student[] actual = testDB.list();

        assertArrayEquals(testArray, actual);
        System.out.println(Arrays.toString(testArray));

    }

   @Test
    void testToString(){

        Student[] testArray = {new Student("Alex", 1), new Student("Berti", 2)};

        StudentDB testDB = new StudentDB(testArray);

        String expected = "StudentDB{" +"studenten=[Student{name='Alex', id=1}, Student{name='Berti', id=2}]}";

        String actual = testDB.toString();

        assertEquals(expected, actual);

    }

}