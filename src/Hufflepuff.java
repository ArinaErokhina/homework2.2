public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return this.diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return this.honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() + "; уровень колдовства: " + getPowerOfMagic() + "; расстояние трансгрессии: " + getTransgressionDistance() + "; трудолюбие: " + getDiligence() + "; верность: " + getLoyalty() + "; честность: " + getHonesty() + ".");
    }

    public void compareStHufflepuff(Hufflepuff student) {
        int sum = this.getDiligence() + this.getHonesty() + this.getLoyalty();
        int sum1 = student.getDiligence() + student.getHonesty() + student.getLoyalty();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Пуффендуец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Пуффендуец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
