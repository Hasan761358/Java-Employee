public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Hasan Özgündüz", 8500,45,2001);
        System.out.println("Adı            : "+ employee.name);
        System.out.println("Brüt Maaş      : "+ employee.salary);
        System.out.println("Çalışma Saati  : "+ employee.workHours);
        System.out.println("Başlangıç Yılı : "+ employee.hireYear);
        System.out.println("Vergi          : "+ employee.tax());
        System.out.println("Bonus          : "+ employee.bonus());
        System.out.println("Maaş artışı    : "+ employee.raiseSalary());
        double totalSalary = employee.salary - employee.tax()+ employee.bonus()+ employee.raiseSalary();

        System.out.println("Toplam Maaş    : "+ totalSalary);

    }
}