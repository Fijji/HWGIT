package hw10;

public class Test {
    public static void main(String[] args) {

        try {                                                                 //Ex. 1
            throw new ArithmeticException("Exception string");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("I was here");
        }

        try {                                                                //Ex. 2
            String s = "SomeString";
            throw new ExcClass(s);
        } catch (ExcClass ex) {
            ex.myOwnExceptionMsg();
        }

        try {                                                                 //Ex. 3
            int[] a = null;
            a.toString();
        }catch (NullPointerException e){
            System.out.println("Catched");
        }

    }
}
