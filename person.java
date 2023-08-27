
    // Person.java
public class person {
    private String name;
    private int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
    // Main.java
public class Main {
  public static void main(String[] args) {
    person person1 = new person("Eva", 16);
    person person2 = new person("Ema", 20);
    System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
  }

}
