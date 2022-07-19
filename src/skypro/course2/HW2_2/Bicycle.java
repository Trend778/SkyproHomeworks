package skypro.course2.HW2_2;

public class Bicycle extends WheeledTransport implements Maintenance {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("***** Обслуживаем " + getModelName() + " *****");
        for (int i = 0; i < getWheelsCount(); i++) {
            WheeledTransport.updateTyre();
        }
    }
}
