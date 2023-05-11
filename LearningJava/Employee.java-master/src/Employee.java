public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double bonus;
    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        if (this.salary > 1000) {

        return (this.salary*3)/100;
        }
        return 0;

    }
    double bonus(){
        if (this.workHours > 40) {

        bonus = (this.workHours-40)*30;
        return bonus;
        }
        return 0;
    }
    double raiseSalary(){
        if (2021-this.hireYear<9) {
            return (this.salary*5)/100;
        }
        if (9<=2021-this.hireYear && 2021-this.hireYear<19) {
            return (this.salary*10)/100;
        }
        if (19<=2021-this.hireYear) {
           return(this.salary*15)/100;
        }
        return 0;
    }
    public String toString(){
        double maas1 = salary-tax()+bonus()+raiseSalary();
        double maas2= salary-tax()+bonus();
        System.out.println("Name \t: "+this.name);
        System.out.println("Salary \t: "+this.salary);
        System.out.println("Working Hours \t: "+this.workHours);
        System.out.println("Hiring Year \t: "+this.hireYear);
        System.out.println("Tax \t: "+tax());
        System.out.println("Bonus \t: "+bonus());
        System.out.println("Salary Raise \t: "+raiseSalary());
        System.out.println("Salary with Tax and Bonus \t: "+maas2);
        System.out.println("Total Salary \t: "+maas1 );
        return null;
    }
}
