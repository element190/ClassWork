import java.util.Scanner;

public class SalaryTest {
    public static void main(String[] args) {
        Salary employee1 = new Salary();
        Salary employee2 = new Salary();
        Salary employee3 = new Salary();

        Scanner input = new Scanner(System.in);




        System.out.println("Type the employee name: ");
        String user1 = input.nextLine();

        employee1.setName(user1);
        employee2.setName(user1);
        employee3.setName(user1);

        String resultName1=employee1.getName();
        String resultName2=employee2.getName();
        String resultName3=employee3.getName();




        System.out.println("input period of hour: ");
        int user2 = input.nextInt();

        employee1.setHourly(user2);
        employee2.setHourly(user2);
        employee3.setHourly(user2);

        int hourly1=employee1.getHourly();
        int hourly2=employee2.getHourly();
        int hourly3=employee3.getHourly();




        System.out.println("Type the rate: ");
        Double user3 = input.nextDouble();

        employee1.setRate(user3);
        employee2.setRate(user3);
        employee3.setRate(user3);

        Double rate1=employee1.getRate();
        Double rate2=employee2.getRate();
        Double rate3=employee3.getRate();

        Double grossPay1 = hourly1 * rate1;
        Double grossPay2 = hourly2 * rate2;
        Double grossPay3 = hourly3 * rate3;


    }
}
