import java.util.Scanner;

public class College {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int gradecounter = 1;

        while(gradecounter<=10){
            System.out.print("input 1 for Pass or 2 for fail : ");
            int result = input.nextInt();

            if(result ==1){
                passes = passes + 1;
            }

            else{
                failures = failures + 1;
            }
            gradecounter= gradecounter + 1;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if(passes > 8){
            System.out.println("Bonus to Instructor");
        }
        else{
            System.out.println("Try harder next time");

        }
    }
}
