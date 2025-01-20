public class Student implements Rankable {
    private String name;
    private String surname;
    private double average;


    public Student(String name, String surname, double average) {
        this.name = name;
        this.surname = surname;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getAverage() {
        return average;
    }
    @Override
    public float getRank(){
       return (float) (average/10);
    }
}
