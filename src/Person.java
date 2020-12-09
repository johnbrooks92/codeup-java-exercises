public class Person {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name);
    }

    public Person(String name) {
        setName(name);
    }

    public static void main(String[] args) {
        Person joon = new Person("John");

        System.out.println(joon.getName());
        joon.setName("Joon");
        joon.sayHello();


    }
}

