package skypro.course2.HW2_2;

public class Car extends WheeledTransport implements Maintenance, Enginable{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
        System.out.println("***** Обслуживаем " + getModelName() + " *****");
        for (int i = 0; i < getWheelsCount(); i++) {
            WheeledTransport.updateTyre();
        }
        checkEngine();
    }
    @Override
    public void checkEngine() {
        System.out.println("Двигатель у машины проверен");
    }
}
