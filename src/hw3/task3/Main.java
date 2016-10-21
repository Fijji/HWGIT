package hw3.task3;

public class Main {
    public static void main(String[] args) {
        Course[] kur = new Course[5];
        kur[0] = new Course("Math", 10, "Boss" );
        kur[1] = new Course("Bio", 12, "Cheif" );
        kur[2] = new Course("Read", 20, "Head" );
        kur[3] = new Course("Fiz", 15, "Key" );
        kur[4] = new Course("Box", 5, "Lead" );

        Student st1 = new Student("Mike", "SecondN", 1);
        Student st2 = new Student("Kim" , kur );
        CollegeStudent st3 = new CollegeStudent("wake", "Boom", 2);
        CollegeStudent st4 = new CollegeStudent("Look", kur);
        CollegeStudent st5 = new CollegeStudent("Lol", "Bol", 3, "Prinston", 10, 15, kur);
        SpecialStudent st6 = new SpecialStudent("Duke", kur);
        SpecialStudent st7 = new SpecialStudent("Ivan", "Ivanich", 4, "Oxward", 10, 22, kur);
        SpecialStudent st8 = new SpecialStudent("Lastmen", kur, 123456);
    }
}
