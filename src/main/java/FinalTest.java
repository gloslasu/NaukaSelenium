public class FinalTest {

    public static void main(String[] args) {

        final int x = 2;
        // x= 5; // nie da się zmienić wartości zmiennej final.
        final Person person = new Person("Sławek", 36);
        person.agePerson = 25; // to działa
        // person = new Person("Bartek", 22) // to już nie działa
    }
}
