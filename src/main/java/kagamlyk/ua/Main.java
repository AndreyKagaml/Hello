package kagamlyk.ua;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Ukraine");
        }
    }
}

class Person{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
