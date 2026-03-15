package problem5;

public class PhDStudent extends Student {

    private String research;

    public PhDStudent(String name, int age, String major, String research) {
        super(name, age, major);
        this.research = research;
    }

    @Override
    public void assignPet(Animal pet) {

        if(pet instanceof Dog) {
            System.out.println("PhD students cannot take care of dogs");
            return;
        }

        super.assignPet(pet);
    }

    public String getOccupation() {
        return "PhD Student researching " + research;
    }

}