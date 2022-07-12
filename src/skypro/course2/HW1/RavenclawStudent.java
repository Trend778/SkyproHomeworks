package skypro.course2.HW1;

public class RavenclawStudent extends HogwartsStudent{

    private int cleverness; //ум
    private int wisdom; //мудрость
    private int wit;  //остроумие
    private int creativity;  //кретивность

    private int ability() {        //общие способности студента Когтеврана
        return cleverness + wisdom + wit + creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void compareRavenclaw(RavenclawStudent ravenclawStudent) {   //сравнение студентов Хогвартса
        int ability1 = ability();  //сравнение из метода print
        int ability2 = ravenclawStudent.ability();
        if (ability1>ability2) {
            System.out.printf("Когтевранец: %s набрал %d баллов и он лучше, чем когтевранец %s, который набрал %d баллов\n", getName(), ability1, ravenclawStudent.getName(), ability2);
        } else if (ability1<ability2) {
            System.out.printf("Когтевранец: %s набрал %d баллов и он лучше, чем когтевранец %s, который набрал %d баллов\n", ravenclawStudent.getName(), ability2, getName(), ability1);
        } else
            System.out.printf("Силы когтевранцев %s и %s равны, %d баллов и %d баллов\n", getName() , ravenclawStudent.getName(), ability1, ability2);
    }

    public String toString() {
        return String.format("%s, ум: %d, мудрость: %d, остроумие: %d, креативность: %d", super.toString(), cleverness, wisdom, wit, creativity);
    }

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;


    }
}
