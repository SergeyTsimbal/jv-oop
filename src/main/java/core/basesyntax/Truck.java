package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println(getClass().getSimpleName() + " started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println(getClass().getSimpleName() + " stopped its work");
    }
}
