/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionB;

import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author Brindusa
 */
public class ConstantTimeStack {

    LinkedList<Integer> elements = new LinkedList<>();
    LinkedList<Integer> minimums = new LinkedList<>();

    public void push(Integer element) {
        if (minimums.isEmpty()) {
            elements.push(element);
            minimums.push(element);
        } else {
            if (element >= minimums.getFirst()) {
                elements.push(element);
            } else {
                elements.push(element);
                minimums.push(element);
            }
        }
    }

    public Integer pop() {
        if (Objects.equals(elements.peekFirst(), minimums.peekFirst())) {
            minimums.removeFirst();
        }
        return elements.removeFirst();
    }

    public Integer minimum() {
        Integer index = elements.indexOf(minimums.getFirst());
        elements.remove(index.intValue());
        return minimums.removeFirst();
    }
}
