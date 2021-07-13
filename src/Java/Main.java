package Java;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(
                        "Ivanov Ivan Ivanovich",
                        "Director",
                        "director@gmail.com",
                        "5475",
                        3000,
                        45),
                new Employee(
                        "Petrov Petr Petrovich",
                        "Chief Accountant",
                        "chiefaccountant@gmail.com",
                        "4785",
                        2500,
                        41),
                new Employee(
                        "Ivanov Petr Ivanovich",
                        "Economist",
                        "economist@gmail.com",
                        "4475",
                        2000,
                        35),
                new Employee(
                        "Ivanov Petr Petrovich",
                        "Economist",
                        "economist@gmail.com",
                        "4476",
                        2000,
                        34),
                new Employee(
                        "Petrov Ivan Ivanovich",
                        "Accountant",
                        "accountant@gmail.com",
                        "4785",
                        2000,
                        28)
        };

        int minAge = 40;
        for (Employee employee : employees) {
            if (employee.age > minAge)
            {
                employee.ListOfEmployees();
                System.out.println();
            }

        }
    }
}
