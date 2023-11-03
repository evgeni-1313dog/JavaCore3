import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ira", "1535-6-15", 2445));
        list.add(new Employee("Vacay", "2001-12-23", 8224));
        list.add(new Employee("Vacay", "1171-12-23", 9784));
        list.add(new Director("Tim", "987-01-23", 125));


        list.sort(Comparator.comparing(Employee::getDate));
        for (Employee em: list) {

            int res = em.getSalary()*10;
            System.out.println("Имя:  " + em.getName() + "   Дата: " + em.getDate() + " Зарплата: " + em.getSalary() + "   "+ res);
        }
    }
}

