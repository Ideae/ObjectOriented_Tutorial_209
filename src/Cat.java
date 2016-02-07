public class Cat extends Animal{
    public int lives;

    public Cat(int age, String name) {
        super(age, name);
        this.lives = 9;
    }
    public void Meow() {
        System.out.println(this.name + " : MEOOW");
    }
    public void Purr() {

    }
    //@Override
    public void shit() {
        super.shit();
        if (age <= 14) {
            System.out.println("I'm in the litterbox");
        }
    }
}
