package jatekElmelet2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class jatekEBead2Test {

    @Test
    void nyeregPont() {
        jatekEBead2 c = new jatekEBead2();
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {10, 18, 4}}; int sor=3;
        assertFalse(c.nyeregPont(matrix,3));
    }

    @Test
    void nyeregPont2() {
        jatekEBead2 c = new jatekEBead2();
        double[][] matrix = {{4, 5, 6}, {7, 18, 9}, {5, 1, 3}}; int sor=3;
        assertTrue(c.nyeregPont(matrix,3));
    }

    @Test
    void nyeregPont3() {
        jatekEBead2 c = new jatekEBead2();
        double[][] matrix = {{4, 16, 12}, {2, 8, 14}, {1, 3, 6}}; int sor=3;
        assertTrue(c.nyeregPont(matrix,sor));
    }

    @Test
    void nyeregPont4() {
        jatekEBead2 c = new jatekEBead2();
        double[][] matrix = {{2, 2, 3, 5}, {8, 6, 4, 5}, {9, 3, 2, 5}, {8, 2, 6, 4}}; int sor=4;
        assertFalse(c.nyeregPont(matrix,sor));
    }

}