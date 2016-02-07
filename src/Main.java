import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat cat1 = new Cat(10, "felix");
        Dog dog1 = new Dog(7, "bob");

        //cat1.shit();
        //dog1.shit();

        Animal a = new Cat(1, "cleo");
        Animal kennel = a;

        a.shit();
        a = dog1;
        a.shit();
        kennel.shit();

        Robot r = new Robot();

        ArrayList<Jumpable> jumpers = new ArrayList<>();
        jumpers.add(dog1);
        jumpers.add(cat1);
        jumpers.add(r);

        for(Jumpable jumper : jumpers) {
            jumper.Jump();

        }

        //cat1.Meow();
        //((Cat)a).Meow();

        Animal a2 = new Cat(2,"");
        Cat c = (Cat)a2;

        Animal a3 = c;
        a3.shit();

        //Cat c1 = (Cat)(new Animal(3,""));


    }

    public void DoStuff(Animal a) {
        a.shit();

    }

    /*public static void main(String[] args) {
	// write your code here

        //Variables hold references to objects.


        Phone davidsPhone = new Phone(647111111, 1);
        Phone dantesPhone = new Phone(1,5);

        dantesPhone = davidsPhone;

        System.out.println(dantesPhone.myNumber);
        System.out.println(davidsPhone.myNumber);


        Phone lostPhone = Phone.findPhone(5);

    }*/

    /*CAShirt danteShirt = new CAShirt("Challenge Accepted", "Medium");

        Shirt zackShirt = new CAShirt("Challenge Accepted", "Small");

        CAShirt otherShirt = (CAShirt)zackShirt;
    */
}
