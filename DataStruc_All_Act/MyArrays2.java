/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myarrays;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author COMLAB101
 */
public class MyArrays2 {
    public static void main(String []args) {
        Integer arrayA[] = {0, 1, 2, 3, 4, 5};
        int arrLen = arrayA.length;
        
        
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arrayA));
        A.add(6);
        
        for(int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
        }
    }
}