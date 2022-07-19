package skypro.course2.HW2_2;

public class Truck extends WheeledTransport implements Maintenance, Enginable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("***** Обслуживаем " + getModelName() + " *****");
        for (int i = 0; i < getWheelsCount(); i++) {
            WheeledTransport.updateTyre();
        }
        checkEngine();
        WheeledTransport.checkTrailer();
    }

    @Override
    public void checkEngine() {
        System.out.println("Двигатель у грузовика проверен");
    }
}