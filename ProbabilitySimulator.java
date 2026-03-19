import java.util.Scanner;
public class ProbabilitySimulator{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Probability Simulator");

        System.out.println("Enter number of trials: ");
        int trials = keyboard.nextInt();

        int sum = 0;
        int[] counts = new int[6];
        
        for(int i = 0; i < trials; i++)
        {
            int roll = (int)(Math.random() *6) + 1;
            sum+=roll;
            counts[roll-1]++;
        }

        double experimentalAvg = (double) sum/trials;
        double expectedValue = 3.5;
        
        System.out.println("Results: ");
        System.out.println("Trials: " + trials);
        System.out.println("Experimental Average: " + experimentalAvg);
        System.out.println("Theoretical Expected Value: " + expectedValue);

        double difference = Math.abs(experimentalAvg - expectedValue);
        System.out.println("Difference: " + difference);

        System.out.println("Distribution: ");
        for (int i = 0; i<6; i++)
        {
            double probability = (double) counts[i] /trials;
            System.out.println("Number " + (i+1) + ": " + counts[i] + " (" + probability + ") ");
        }
        keyboard.close();
    
    
    }   

}