
package pos.randomclass;

import java.util.Random;

public class RandomInheritance extends Random{
    private int increase;
    
    public RandomInheritance (int increase) {
        this.increase = increase;
    }
    
    @Override
    public int nextInt (int intervall) {
        int generated = super.nextInt(intervall);
        int generatedIncrease = generated + increase;
        System.out.println("Inheritance generated: " + generated + ", increased to " + generatedIncrease);
        return generatedIncrease;
    }
}
