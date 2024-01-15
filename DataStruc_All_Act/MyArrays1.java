/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myarrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/**
 *
 * @author COMLAB101
 */
public class MyArrays1 {
    public static void main(String []args) {
        Integer arrayA[] = {0, 1, 2, 3, 4, 5};
        int arrLen = arrayA.length;
        
        
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arrayA));
        A.add(6);
        
        Iterator <Integer> ListElement = A.iterator();
        recur(ListElement);
        
    }   
    static void recur(Iterator<Integer>ListE) {
        while(ListE.hasNext()) {
        System.out.println(ListE.next());
        recur(ListE);
    }
    }
}