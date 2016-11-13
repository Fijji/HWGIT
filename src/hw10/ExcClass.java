package hw10;

public class ExcClass extends Exception {
    private String someString;
    public ExcClass (String string) {
        this.someString = string;
        System.out.println("Exception ExcClass");
    }
    public void myOwnExceptionMsg() {
        System.err.println("This is exception massage for srting: " + someString);
    }
}
