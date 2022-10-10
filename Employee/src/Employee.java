public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
     Employee(String name, double salary, int workHours, int hireYear){
         this.name= name;
         this.salary=salary;
         this.workHours=workHours;
         this.hireYear=hireYear;
     }
     public double tax(){
         if(this.salary>=1000){
             return salary*0.03;
         }
         return 0.0;
     }
     public double bonus(){
         if(this.workHours>40){
             int fazla = workHours-40;
             return fazla*30;
         }
         return 0.0;
     }
     public double raiseSalary(){
         int year=2021-this.hireYear;
         if(year<10){
             return this.salary*0.05;
         }
         else if (year>=10 && year<20){
             return this.salary*0.10;
         }else{
             return salary*0.15;
         }
     }
     }

