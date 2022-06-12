public class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfMagic() {
        return this.powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return this.transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void printStudent(){
        System.out.println("Имя: " + getName() + " " + getSurname() + "; уровень колдовства: " + getPowerOfMagic() + "; расстояние трансгрессии: " + getTransgressionDistance() );
    }

    public void compareAllStudent(Hogwarts student){
        int sum = this.getPowerOfMagic() + this.getTransgressionDistance();
        int sum1 = student.getPowerOfMagic() + student.getTransgressionDistance();
        if (sum>sum1){
            System.out.println(this.getName()+ " " + this.getSurname()+ " обладает большей мощностью магии, чем " + student.getName()+ " " +student.getSurname() + ".");
        } else {
            System.out.println(student.getName()+ " " + student.getSurname()+ " обладает большей мощностью магии, чем " + this.getName()+ " " +this.getSurname() + ".");
        }
    }

}
