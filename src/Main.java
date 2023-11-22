public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Семён";
        String middleName = "Иванов";
        String lastName = "Семёнович";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        System.out.println("Задача 2");
        System.out.println(fullName.toUpperCase());
        System.out.println("Задача 3");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName.replace('ё','е'));
    }
}