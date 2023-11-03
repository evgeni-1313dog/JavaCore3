public class Employee {
    private String Name;

    private String date;

    public int getSalary() {
        return salary;
    }

    private int salary;

    public String getName() {
        return Name;
    }

    public  String getDate() {
        return date;
    }






    public void setName(String name) {
        Name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Employee(String name, String date, int salary) {
        this.date = date;
        this.Name = name;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return String.format("%s, %s  %d", Name, date, salary);
    }




}
