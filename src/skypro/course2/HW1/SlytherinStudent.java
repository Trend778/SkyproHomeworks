package skypro.course2.HW1;

public class SlytherinStudent extends HogwartsStudent{

    private int cunning; //хитрость
    private int determination;  //решительность
    private int ambition;  //амбициозность
    private int resourcefulness; //находчивость
    private int lustForPower; //жажда власти

    private int ability() {        //общие способности студента Слизерина
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {   //сравнение студентов Хогвартса
        int ability1 = ability();  //сравнение из метода print
        int ability2 = slytherinStudent.ability();
        if (ability1>ability2) {
            System.out.printf("Слизеринец: %s набрал %d баллов и он лучше, чем слизеринец %s, который набрал %d баллов\n", getName(), ability1, slytherinStudent.getName(), ability2);
        } else if (ability1<ability2) {
            System.out.printf("Слизеринец: %s набрал %d баллов и он лучше, чем слизеринец %s, который набрал %d баллов\n", slytherinStudent.getName(), ability2, getName(), ability1);
        } else
            System.out.printf("Силы слизеринцев %s и %s равны, %d баллов и %d баллов\n", getName() , slytherinStudent.getName(), ability1, ability2);
    }

    public String toString() {
        return String.format("%s, хитрость: %d, решительность: %d, амбициозность: %d, " +
                "находчивость: %d, жажда власти: %d", super.toString(), cunning, determination, ambition, resourcefulness, lustForPower);
    }

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;


    }
}
