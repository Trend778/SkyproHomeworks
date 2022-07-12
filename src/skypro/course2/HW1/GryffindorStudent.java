package skypro.course2.HW1;

public class GryffindorStudent extends HogwartsStudent {

    private int nobility;  //благородство
    private int honor;  //честь
    private int bravery;  //храбрость

    private int ability() {        //общие способности студента Гриффиндора
        return nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareGryffindor(GryffindorStudent gryffindorStudent) {   //сравнение студентов Хогвартса
        int ability1 = ability();  //сравнение из метода print
        int ability2 = gryffindorStudent.ability();
        if (ability1>ability2) {
            System.out.printf("Гриффиндорец: %s набрал %d баллов и он лучше, чем гриффиндорец %s, который набрал %d баллов\n", getName(), ability1, gryffindorStudent.getName(), ability2);
        } else if (ability1<ability2) {
            System.out.printf("Гриффиндорец: %s набрал %d баллов и он лучше, чем гриффиндорец %s, который набрал %d баллов\n", gryffindorStudent.getName(), ability2, getName(), ability1);
        } else
            System.out.printf("Силы гриффиндорцев %s и %s равны, %d баллов и %d баллов \n", getName() , gryffindorStudent.getName(), ability1, ability2);
    }

    @Override
    public String toString() {
        return String.format("%s, благородство: %d, честь: %d, храбрость: %d", super.toString(), nobility, honor, bravery);
    }

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;


    }
}

