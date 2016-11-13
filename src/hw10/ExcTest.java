package hw10;

public class ExcTest {
    public static void main(String[] args) {
        try {
            go();
        } catch (ExcClass | ExcClassTwo | ExcClassThree excClass) {
            excClass.printStackTrace();

        }

    }
    public static void go() throws ExcClass, ExcClassTwo, ExcClassThree{
    }
}
