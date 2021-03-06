/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;


import ir.ac.kntu.Permutation;

import java.util.Arrays;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 * 30 points
 * @author Hamed Khashehchi
 */
public class SolutionTest {
    static {
        System.err.println("$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:40, priority:1  }  | $$$GRADER$$$");
    }

    @Before
    public void setup() {
        Class<Permutation> permutationClass = Permutation.class;
        Field[] fields = permutationClass.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            if (Modifier.isPrivate(field.getModifiers())) {
                field.setAccessible(true);
            }
            String typeName = fieldType.getName().toUpperCase().replace(".", "");
            try {
                if (typeName.equals("INT")) {
                    field.setInt(permutationClass, 0);
                } else if (typeName.equals("[LJAVALANGSTRING;")) {
                    field.set(permutationClass, null);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @Test
    public void testNormal() {
        String[] args = new String[2];
        args[0] = "0";
        args[1] = "2";
        Permutation.main(args);
        String[] list = Permutation.permutation;
        Arrays.sort(list);
        String[] answer = new String[2];
        answer[0] = "ba";
        answer[1] = "ab";
        Arrays.sort(answer);
        assertArrayEquals(answer, list);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:8 , reason:\"Your Output is correct.\" } | $$$GRADER$$$" );
    }

    @Test
    public void testNormal1() {
        String[] args = new String[2];
        args[0] = "25";
        args[1] = "28";
        Permutation.main(args);
        String[] list = Permutation.permutation;
        Arrays.sort(list);
        String[] answer = new String[6];
        answer[0] = "zAB";
        answer[1] = "zBA";
        answer[2] = "AzB";
        answer[3] = "ABz";
        answer[4] = "BzA";
        answer[5] = "BAz";
        Arrays.sort(answer);
        assertArrayEquals(answer, list);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:8 , reason:\"Your Output is correct.\" } | $$$GRADER$$$" );
    }

    @Test
    public void testNormal2() {
        String[] args = new String[2];
        args[0] = "32";
        args[1] = "35";
        Permutation.main(args);
        String[] list = Permutation.permutation;
        Arrays.sort(list);
        String[] answer = new String[6];
        answer[0] = "GHI";
        answer[1] = "GIH";
        answer[2] = "HGI";
        answer[3] = "HIG";
        answer[4] = "IHG";
        answer[5] = "IGH";
        Arrays.sort(answer);
        assertArrayEquals(answer, list);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:8 , reason:\"Your Output is correct.\" } | $$$GRADER$$$" );
    }


    @Test
    public void testEmpty() {
        String[] args = new String[2];
        args[0] = "1";
        args[1] = "1";
        Permutation.main(args);
        String[] list = Permutation.permutation;
        Arrays.sort(list);
        String[] answer = new String[0];
        Arrays.sort(answer);
        assertArrayEquals(answer, list);
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:6 , reason:\"Your Output is correct.\" } | $$$GRADER$$$" );
    }

}
