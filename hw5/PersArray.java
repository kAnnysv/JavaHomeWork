package hw5;

public class PersArray {

    public static Employee[] persArray = new Employee[5];

    public static void main(String[] args){

        persArray[0] = new Employee("Serov E.E.", "QA", "ser@com", "89876548756", 50000, 25);
        persArray[1] = new Employee("Perov A.E.", " Engineer", "per@com", "898734568756", 70000, 35);
        persArray[2] = new Employee("Sedov E.D.", "QA", "sed@com", "89876548756", 50000, 45);
        persArray[3] = new Employee("Malinin R.G.", "QA", "mal@com", "89876468756", 50000, 54);
        persArray[4] = new Employee("Serova N.E.", "QA", "sern@com", "89876548756", 50000, 25);

        checkPers();
        System.out.println("===========================================================================");

        Employee ivan = new Employee("Ivan", "QA", "rtg@ru", "456789432", 60000, 47);

        System.out.println("Имя - " + ivan.getName());
        System.out.println("Должность - " + ivan.getPosition());
        System.out.println("Почта - " + ivan.getEmail());
        System.out.println("Телефое - " + ivan.getTelephone());
        System.out.println("Зарплата - " + ivan.getSalary());
        System.out.println("Возраст - " + ivan.getAge());









    }
    public static void checkPers() {

        for (int i = 0; i < 5; i++) {
            if (persArray[i].age > 40 ){
                System.out.println(persArray[i].name +" ддолжность-" + persArray[i].position + ". почта-" + persArray[i].email + ". телефон-" + persArray[i].telephone + ". зарплата-" + persArray[i].salary + ". возраст-" + persArray[i].age);
            }


        }
    }
}
