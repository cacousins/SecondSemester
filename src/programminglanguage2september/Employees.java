package programminglanguage2september;

/**
 *
 * @author cacousins
 */
public class Employees {

    int bonus = 0;  //instance variable
    static int salary = 1000; //static variable

    public Employees() {

    }

    public Employees(int bonus) {
        this.bonus = bonus;
    }

    //partTime, 10% bonus , print salary, void
    /*
    Method Name:        partTime
    Purpose:            to determine the salary for a parttime emp
    Accepts:            nothing
    Returns:            void
     */
    public void partTime() {
       // double bonus = salary * .10;
        System.out.println("Employee salary is : " + salary
                + " bonus is : " + this.bonus + " net salary is : "
                + (this.bonus + salary));
    }

    //fullTime, 20% bonus , print salary, void
    
    public void fullTime() {
        double bonus = salary * .20;
        System.out.println("Employee salary is : " + salary
                + " bonus is : " + bonus + " net salary is : "
                + (bonus + salary));
    }
}
