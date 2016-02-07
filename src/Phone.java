import java.util.ArrayList;

/**
 * Created by ZackLapt on 2016-02-05.
 */
public class Phone {

    private static ArrayList<Phone> allPhones = new ArrayList<>();

    public int myNumber;

    public static int phonesMade = 0;
    //constructor
    public Phone(int myNumber, int age){
        Phone.allPhones.add(this);
        phonesMade++;
        this.myNumber = myNumber;
        this.age = age;
    }

    public void Call(int number) {
        System.out.println(this.myNumber);

    }

    public static Phone findPhone(int age){
        //Magically know that this is the right phone.
        for(int i = 0; i < allPhones.size(); i++) {
            Phone p = allPhones.get(i);
            if (p.age == age) {
                return p;
            }
        }
        return null;
    }

    private int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0) return;
        this.age = newAge;
    }


}
