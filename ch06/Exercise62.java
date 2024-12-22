/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Exercise62 {
    
    static double squareRoot(double a){
        
        double initialGuess = a/2;
        double result = (initialGuess + a/initialGuess)/2;
        while (Math.abs(initialGuess - result)>0.0001) {
           initialGuess = result;
           result = (initialGuess + a/initialGuess)/2;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Square root: "+squareRoot(64));
        System.out.println((int)'e');
    }
    
}
