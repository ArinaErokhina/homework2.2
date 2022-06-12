public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 67, 87, 56, 87, 65);
        Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер", 87, 98, 56, 78, 89);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 56, 64, 76, 54, 65);

        Slytherin draco = new Slytherin("Драко", "Малфой", 65, 74, 65, 87, 34, 54, 65);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 45, 35, 75, 63, 65, 85, 41);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 32, 12, 46, 52, 75, 17, 9);

        Hufflepuff zachariah = new Hufflepuff("Захария", "Смит", 54, 76, 23, 63, 87);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 62, 75, 13, 83, 51);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 52, 15, 19, 61, 91);

        Ravenclaw zhou = new Ravenclaw("Чжоу", "Чанг", 41, 12, 19, 23, 61, 77);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 32, 29, 73, 47, 86, 99);
        Ravenclaw marcus = new Ravenclaw("Маркус", "Белби", 85, 67, 4, 15, 3, 78);

        harry.printStudent();
        ron.compareStGryffindor(harry);
        graham.compareStSlytherin(draco);
        justin.compareStHufflepuff(zachariah);
        zhou.compareStRavenclaw(marcus);
        graham.compareAllStudent(draco);


    }
}