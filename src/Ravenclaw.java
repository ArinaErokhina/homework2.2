public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int wit;
    private int creativity;
    private int mind;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int wisdom, int wit, int creativity, int mind) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        this.mind = mind;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return this.wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return this.creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getMind() {
        return this.mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() + "; уровень колдовства: " + getPowerOfMagic() + "; расстояние трансгрессии: " + getTransgressionDistance() + "; ум: " + getMind() + "; мудрость: " + getWisdom() + "; остроумие: " + getWit() + "; креативность: " + getCreativity() + ".");
    }

    public void compareStRavenclaw(Ravenclaw student) {
        int sum = this.getWisdom() + this.getWit() + this.getCreativity() + this.getMind();
        int sum1 = student.getWisdom() + student.getWit() + student.getCreativity() + student.getMind();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Когтевранец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
