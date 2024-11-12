package LiskovsExample.Bad;

class Penguin extends Bird {  // Penguins can't fly (or play hockey)!
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}