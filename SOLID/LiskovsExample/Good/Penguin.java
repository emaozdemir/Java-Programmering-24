package LiskovsExample.Good;

class Penguin implements Bird { // Still can't play hockey though! 
    @Override
    public void move() {
        System.out.println("Waddling and swimming...");
    }
}