package skypro.course2.HW1;

public class HufflepuffStudent extends HogwartsStudent {

    private int diligence; //трудолюбие
    private int loyalty;  //верность
    private int honesty;  //честность

    private int ability() {        //общие способности студента Пуффендуя
        return diligence + loyalty + honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {   //сравнение студентов Хогвартса
        int ability1 = ability();  //сравнение из метода print
        int ability2 = hufflepuffStudent.ability();
        if (ability1>ability2) {
            System.out.printf("Пуффендуец: %s набрал %d баллов и он лучше, чем пуффендуец %s, который набрал %d баллов\n", getName(), ability1, hufflepuffStudent.getName(), ability2);
        } else if (ability1<ability2) {
            System.out.printf("Пуффендуец: %s набрал %d баллов и он лучше, чем пуффендуец %s, который набрал %d баллов\n", hufflepuffStudent.getName(), ability2, getName(), ability1);
        } else
            System.out.printf("Силы пуффендуйцев %s и %s равны, %d баллов и %d баллов\n", getName() , hufflepuffStudent.getName(), ability1, ability2);
    }

    public String toString() {
        return String.format("%s, трудолюбие: %d, верность: %d, честность: %d", super.toString(), diligence, loyalty, honesty);
    }

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;


    }
}
