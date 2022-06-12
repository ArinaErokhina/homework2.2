public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return this.nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return this.bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() + "; уровень колдовства: " + getPowerOfMagic() + "; расстояние трансгрессии: " + getTransgressionDistance() + "; благородство: " + getNobility() + "; честь: " + getHonor() + "; храбрость: " + getBravery() + ".");
    }

    public void compareStGryffindor(Gryffindor student) {
        int sum = this.getNobility() + this.getHonor() + this.getBravery();
        int sum1 = student.getNobility() + student.getHonor() + student.getBravery();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Гриффиндорец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффиндорец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
