// This program simulates rolling a fair six-sided die multiple times
//to analyze probability distribution and expected value using a Monte Carlo approach.

import java.util.Scanner;
public class ProbabilitySimulator{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Probability Simulator");
        //User input for number of trials is stored 
        System.out.println("Enter number of trials: ");
        int trials = keyboard.nextInt();

        int sum = 0;
        //Frequency of each outcome (1-6) is stored
        int[] counts = new int[6];

        //Runs a simulation of dice rolls
        for(int i = 0; i < trials; i++)
        {
            //Generates random number from 1 to 6
            int roll = (int)(Math.random() *6) + 1;
            sum+=roll;
            //maps values from 1 to 6 to indices 0 to 5
            counts[roll-1]++;
        }
        //calculates experimental average from simulation
        double experimentalAvg = (double) sum/trials;
        // theoretical expected value of a fair die:
        // E[X] = (1 + 2 + 3 + 4 + 5 + 6) / 6 = 21/6 = 3.5
        // each outcome has equal probability (1/6), so this is the Long-run average 
        double expectedValue = 3.5;
        
        System.out.println("Results: ");
        System.out.println("Trials: " + trials);
        System.out.println("Experimental Average: " + experimentalAvg);
        System.out.println("Theoretical Expected Value: " + expectedValue);
        
        // difference shows how far simulation is from theoretical value
        double difference = Math.abs(experimentalAvg - expectedValue);
        System.out.println("Difference: " + difference);

        // displays frequency and probability distribution
        System.out.println("Distribution: ");
        for (int i = 0; i<6; i++)
        {
            double probability = (double) counts[i] /trials;
            System.out.println("Number " + (i+1) + ": " + counts[i] + " (" + probability + ") ");
        }
        keyboard.close();
    
    
    }   

}
