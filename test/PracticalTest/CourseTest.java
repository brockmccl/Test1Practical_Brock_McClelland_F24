package PracticalTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void testEqualsSame() {
        Course test1 = new Course("Name", "NAME123", "12/09/2024", 30);
        Course test2 = new Course("Name", "NAME123", "12/09/2024", 30);


        assertTrue(test1.equals(test2));


    }
    @Test
    void testEqualsDifferent(){
        Course test1 = new Course("Name", "NAME123", "12/09/2024", 30);
        Course test3 = new Course("DifferentName", "DIFNAME432", "18/07/2024", 35);
        assertFalse(test3.equals(test1));
    }
}