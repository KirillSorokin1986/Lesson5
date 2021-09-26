public class Worker {
    private String name;
    private String position;
    private String email;
    private String telNumber;
    private int salary;
    private int age;


    public Worker(String name, String position, String email, String telNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printWorkerInfo() {
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
