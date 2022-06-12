public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return this.cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return this.thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public void printStudent() {
        System.out.println("Имя: " + getName() + " " + getSurname() + "; уровень колдовства: " + getPowerOfMagic() + "; расстояние трансгрессии: " + getTransgressionDistance() + "; хитрость: " + getCunning() + "; решительность: " + getDetermination() + "; амбициозность: " + getAmbition() + "; находчивость: " + getResourcefulness() + "; жажда власти: " + getThirstForPower() + ".");
    }

    public void compareStSlytherin(Slytherin student) {
        int sum = this.getAmbition() + this.getThirstForPower() + this.getResourcefulness() + this.getDetermination()+this.getCunning();
        int sum1 = student.getAmbition() + student.getThirstForPower() + student.getResourcefulness() + student.getDetermination()+student.getCunning();
        if (sum > sum1) {
            System.out.println(this.getName() + " " + this.getSurname() + " лучший Слизеринец, чем " + student.getName() + " " + student.getSurname() + ".");
        } else {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Слизеринец, чем " + this.getName() + " " + this.getSurname() + ".");
        }
    }
}
