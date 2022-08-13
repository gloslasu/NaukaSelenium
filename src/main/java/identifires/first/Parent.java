package identifires.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fourth = "private";

    public void first() {
        System.out.println("public method");
    }
    void second() {
        System.out.println("default method");
    }
    protected void third() {
        System.out.println("protected method");
    }
    private void fourth() {
        System.out.println("private method");
    }

    public void testIdentifires() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        first();
        second();
        third();
        fourth();
    }

}
