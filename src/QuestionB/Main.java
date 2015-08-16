/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionB;

/**
 *
 * @author Brindusa
 */
public class Main {

    public static void main(String[] args) {
        ConstantTimeStack myStack = new ConstantTimeStack();
        
        myStack.push(2);
        myStack.push(0);
        myStack.push(-1);
        myStack.push(1);;
        myStack.push(5);
        
        System.out.println("Elements: " + myStack.elements.toString());
        System.out.println("Minimums: " + myStack.minimums.toString());

        System.out.println("Minimum: " + myStack.minimum());
        System.out.println("Elements: " + myStack.elements.toString());
        System.out.println("Minimums: " + myStack.minimums.toString());

        System.out.println("Element: " + myStack.pop());
        System.out.println("Elements: " + myStack.elements.toString());
        System.out.println("Minimums: " + myStack.minimums.toString());

    }
}
