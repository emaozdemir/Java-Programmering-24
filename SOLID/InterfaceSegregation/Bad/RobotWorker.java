package InterfaceSegregation.Bad;

class RobotWorker implements WorkerInterface {
    @Override
    public void work() {
        System.out.println("Robot working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot cannot eat!");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robot cannot sleep!");
    }
}
