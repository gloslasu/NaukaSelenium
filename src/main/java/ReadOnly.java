public class ReadOnly {

    private String name = "Sławek";

    public String getName() {

        return name + "jest OK";
    }

    public void setName(String name) {
        this.name = name;
    }
}