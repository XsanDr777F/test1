public class Main {

    private static final Employee[] employees = {

            new Employee("Иванов Иван Иванович", 10_000, 1),
            new Employee("Сергеев Андрей Владимирович", 11_000, 1),
            new Employee("Мухин Александр Игоревич", 50_000, 2),
            new Employee("Синякаев Павел Николаевич", 35_000, 2),
            new Employee("Переверзева Галина Валентиновна", 32_000, 3),
            new Employee("Переверзев Сергей Владимирович", 33_000, 3),
            new Employee("Переверзев Андрей Сергеевич", 23_000, 3),
            new Employee("Ким Ир Сен", 100_000, 4),
            new Employee("Ким Чен Ыр", 110_000, 5),
            new Employee("Ким Чен Ын", 120_000, 5),};

    public static void main(String[] args) {

        printEmployees();

        System.out.println("Сумма всех зарплат " + calcAllSallary());
        System.out.println("наименьшая зарплата " + findEmployeePoor());
        System.out.println("наибольшая зарплата " + findEmployeeRich());
        System.out.println("Средняя зарплата " + sumAllSallary());

        printFullNames();
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calcAllSallary() {
        int sumSallary = 0;
        for (Employee employee : employees) {
            sumSallary += employee.getSallary();
        }
        return sumSallary;
    }

    public static Employee findEmployeePoor() {
        Employee employeeMinSallary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSallary() < employeeMinSallary.getSallary()) {
                employeeMinSallary = employee;
            }
        }
        return employeeMinSallary;
    }

    public static Employee findEmployeeRich() {
        Employee employeeMaxSallary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSallary() > employeeMaxSallary.getSallary()) {
                employeeMaxSallary = employee;
            }
        }
        return employeeMaxSallary;
    }

    public static float sumAllSallary() {
         return calcAllSallary() /(float) employees.length;
    }

    public static void printFullNames(){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}