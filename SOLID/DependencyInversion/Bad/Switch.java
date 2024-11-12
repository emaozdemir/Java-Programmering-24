package DependencyInversion.Bad;

class Switch {
    private LightBulb bulb;  
    private boolean isOn;
    
    public Switch() {
        bulb = new LightBulb();  // Direct instantiation creates tight coupling
        isOn = false;
    }
    
    public void press() {
        if (isOn) {
            bulb.turnOff();
            isOn = false;
        } else {
            bulb.turnOn();
            isOn = true;
        }
    }
}