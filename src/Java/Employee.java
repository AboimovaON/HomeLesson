package Java;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee{
    String fullName;
    String post;
    String email;
    String phoneNumber;
    double salary;
    int age;

// 2. Конструктор класса должен заполнять эти поля при создании объекта.
    Employee(String fullName, String post, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    void ListOfEmployees() {
        System.out.println("ФИО " +  fullName);
        System.out.println("Должность " +  post);
        System.out.println("Email " +  email);
        System.out.println("Номер телефона " +  phoneNumber);
        System.out.println("Зарплата " +  salary);
        System.out.println("Возраст " +  age);
    }



}
