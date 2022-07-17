package skypro.course2.HW2_2;

public abstract class WheeledTransport implements Maintenance {

    private String modelName;
    private int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public static void checkTrailer() {
        System.out.println("Прицеп проверен");
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
