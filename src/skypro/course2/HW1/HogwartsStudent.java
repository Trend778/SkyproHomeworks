package skypro.course2.HW1;

public abstract class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgressionSkill;

    private int ability() {        //общие способности студента
        return magicPower + transgressionSkill;
    }

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionSkill = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionSkill;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionSkill = transgressionDistance;
    }

    public void print() {
        System.out.println(this);   //наследуемая печать в классах
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {   //сравнение студентов Хогвартса
        int ability1 = ability();  //сравнение из метода print
        int ability2 = hogwartsStudent.ability();
        if (ability1>ability2) {
            System.out.printf("Студент: %s набрал %d баллов и он лучше, чем студент %s, который набрал %d баллов\n", getName(), ability1, hogwartsStudent.getName(), ability2);
        } else if (ability1<ability2) {
            System.out.printf("Студент: %s набрал %d баллов и он лучше, чем студент %s, который набрал %d баллов\n", hogwartsStudent.getName(), ability2, getName(), ability1);
        } else
            System.out.printf("Силы студентов %s и %s равны, %d баллов и %d баллов\n", getName() , hogwartsStudent.getName(), ability1, ability2);
    }
    @Override
    public String toString() {
        return String.format("Студент: %s, сила магии: %d, сила трансгрессии: %d", name, magicPower, transgressionSkill);
    }
}
