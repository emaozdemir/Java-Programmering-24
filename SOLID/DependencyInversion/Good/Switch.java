package DependencyInversion.Good;

class Switch {
    // Depends on abstraction
    private Switchable device;  
    private boolean isOn;
    
    // Dependency injection
    public Switch(Switchable device) {  
        this.device = device;
        isOn = false;
    }
    
    public void press() {
        if (isOn) {
            device.turnOff();
            isOn = false;
        } else {
            device.turnOn();
            isOn = true;
        }
    }
}



