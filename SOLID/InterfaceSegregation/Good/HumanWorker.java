package InterfaceSegregation.Good;

class HumanWorker implements Workable, Eatable, Sleepable {
    
    @Override
    public void work() {
        System.out.println("Human working");
    }

    @Override
    public void eat() {
        System.out.println("Human eating during break");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeping at home");
    }
}