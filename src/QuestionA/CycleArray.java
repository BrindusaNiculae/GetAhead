/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Brindusa
 */
public class CycleArray {

    public static int calculateVisited(List<Integer> array, List<Boolean> visited) {
        int n = 1;
        int index = array.get(0);
        visited.set(0, true);

        for (int i = 0; i < array.size() - 1; i++) {
            if (index < 0) {
                index += array.size();
            }
            if (visited.get(index) == null) {
                visited.set(index, true);
                n++;
            }
            index += array.get(index);
        }
        return n;
    }

    public static void isCycle(List<Integer> array) {

        int flag = calculateVisited(array,
                new ArrayList<>(Arrays.asList(new Boolean[array.size()])));
        if (flag == array.size()) {
            System.out.println("TRUE. This array forms a complete cycle.");
        } else {
            System.out.println("FALSE. This array does not form a complete cycle.");
        }
    }

    public static void main(String[] args) {

        isCycle(new ArrayList<>(Arrays.asList(3, 1, 2, -2, 1)));
        isCycle(new ArrayList<>(Arrays.asList(2, 5, -3, -2, -2)));
        isCycle(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1)));

    }
}
