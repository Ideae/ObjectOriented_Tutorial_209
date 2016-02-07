/**
 * Created by ZackLapt on 2016-02-05.
 */
public class Animal implements Jumpable {
    public int age;
    public String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void shit() {
        System.out.println(this.name + " is taking a poo");
    }
    public void Walk() {

    }
    public void Eat(int food) {
        System.out.println("Yum");
    }
    public void Sleep() {

    }
    public void Jump() {

    }
}
