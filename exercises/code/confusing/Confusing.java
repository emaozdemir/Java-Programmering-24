package confusing;
/*
 * To do: Fix the stuff and the things
 * as discussed in the Sprint of week 23 2009
 */

public class Confusing {
    Mysterious mysterious;
    
    public Confusing(int varX, String varY, String varZ) {
        mysterious = new Mysterious(varX, varY, varZ);
    }

    public void start() {
        mysterious.doSomething();
    }

    public static void main(String[] args) {
        Confusing confusing = new Confusing(10, "5", "Hello");
        confusing.start();
        System.out.println("sema");
    }
    
}