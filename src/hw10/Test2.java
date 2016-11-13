package hw10;

public class Test2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (ExcClass excClass) {
            System.out.println("End");
        }

    }
    public static void f() throws ExcClass {
        try {
            g();
        } catch (ExcClass excClass) {
            excClass.myOwnExceptionMsg();
            throw excClass;
        }
    }
    public static void g() throws ExcClass {
     throw new ExcClass("Ups");
    }
}
