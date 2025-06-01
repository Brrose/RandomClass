package pos.randomclass;

import java.util.Random;

public class RandomComposition {
    private Random random;
    private int increase;
    
    public RandomComposition (int increase) {
        this.random = new Random();
        this.increase = increase;
    }
    
    public int nextInt (int intervall) {
        int generated = random.nextInt(intervall);
        int generatedIncrease = generated + increase;
        System.out.println("Composition generated: " + generated + ", increased to " + generatedIncrease);
        return generatedIncrease;
    }
}
