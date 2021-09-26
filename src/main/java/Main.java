public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Kirill", "Student", "kir@kir.ru", "977797979", 50000, 35);
        worker.printWorkerInfo();


        Worker[] workersArray = new Worker[5];
        workersArray[0] = new Worker("Ivan Ivanov", "CEO", "1@mail.ru", "+7999999", 150000, 27);
        workersArray[1] = new Worker("Petr Petrov", "project manager", "2@mail.ru", "+7999990", 50000, 35);
        workersArray[2] = new Worker("Anton Pulnikov", "project manager", "3@mail.ru", "+7999991", 60000, 36);
        workersArray[3] = new Worker("Ekaterina Taskaeva", "project manager", "4@mail.ru", "+7999992", 70000, 41);
        workersArray[4] = new Worker("Ekaterina Petrunina", "project manager", "5@mail.ru", "+7999993", 80000, 42);

        for (int i = 0; i < workersArray.length; i++) {
            if (workersArray[i].getAge() > 40) {
                workersArray[i].printWorkerInfo();
            }
        }
    }
}

