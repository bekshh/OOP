package dragon;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> people;

    public DragonLaunch() {
        people = new Vector<>();
    }

    public void kidnap(Person p) {
        people.add(p);
    }

    public boolean willDragonEatOrNot() {

        int boysWaiting = 0;

        for (Person p : people) {

            if (p.getGender() == Gender.BOY) {
                boysWaiting++;
            }
            else if (p.getGender() == Gender.GIRL) {

                if (boysWaiting == 0) {
                    return true;  // Girl без Boy → съест
                }

                boysWaiting--;
            }
        }

        return boysWaiting != 0; // если остались Boy без пары
    }
}
