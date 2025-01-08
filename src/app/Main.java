package app;

public class Main {
    private static int count;

    public static void main(String[] args) {

        Person person1 = new Person("Nick", 25, "Logistic manager");
        Person person2 = new Person("Marina", 60, "Teacher");
        Person person3 = new Person("Andrey", 50, "Entrepreneur");
        Person person4 = new Person("Alexander", 25, "Student");

        count++;
        System.out.println();
        System.out.print(count + ". ");
        PersonInfo.getInfo(person1.name,person1.age,person1.profession);

        System.out.print("   ");
        PersonInfo.getInfo(person2.name,person2.age,person2.profession);

        System.out.print("   ");
        PersonInfo.getInfo(person3.name,person3.age,person3.profession);

        count++;
        System.out.println();
        System.out.print(count + ". ");
        PersonInfo.getInfo(person4.name,person4.age,person4.profession);
    }
}
