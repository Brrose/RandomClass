package pos.randomclass;

public class Main {

    public static void main(String[] args) {
        RandomInheritance randInherit = new RandomInheritance(5);
        RandomComposition randComp = new RandomComposition(5);
        
        System.out.println("Using Inheritance:");
        randInherit.nextInt(20);
        
        System.out.println("Using Composition:");
        randComp.nextInt(20);
    }
}
