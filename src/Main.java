//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat(); // создали кота из класса Cat
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        bigCat.setName("Pushok");
        System.out.println("The name of big cat is " + bigCat.getName());
        System.out.println("The name of small cat is " + smallCat.getName());
    }
}