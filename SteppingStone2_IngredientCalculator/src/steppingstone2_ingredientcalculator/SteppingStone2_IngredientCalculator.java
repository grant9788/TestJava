/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package steppingstone2_ingredientcalculator;
import java.util.Scanner;
/**
 *
 * @author Brent Grant 8/18/2024
 */
public class SteppingStone2_IngredientCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
     * @param args the command line arguments
     */
        /**
         * Assign the following variables with the appropriate data type and
         * value: VARIABLE 
          NAMEVALUE*/ 
          String nameOfIngredient; 
          float numberCups;
          int numberCaloriesPerCup; 
          float totalCalories;
         
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the name of the ingredient: ");
        nameOfIngredient = scnr.next();
        System.out.println("Please enter the number of cups of "
                + nameOfIngredient + " we'll need: ");
        numberCups = scnr.nextFloat();
        System.out.println("Please enter the number of calories per cup: ");
        numberCaloriesPerCup = scnr.nextInt();
        
        /**
         * Write an expression that multiplies the number of cups by the
         * Calories per cup. Assign this value to totalCalories
         */
        totalCalories = numberCups * numberCaloriesPerCup;
        
        System.out.println(nameOfIngredient + " uses " + numberCups
                + " cups and has " + totalCalories + " calories.");
    }
 }
    

