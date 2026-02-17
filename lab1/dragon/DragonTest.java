package dragon;

public class DragonTest {

    public static void main(String[] args) {

        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));

        if (dl.willDragonEatOrNot()) {
            System.out.println("Dragon will eat!");
        } else {
            System.out.println("Dragon will NOT eat!");
        }
    }
}
