import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);

        System.out.println("Please insert a number= "); //request a number from user
        int num = dat.nextInt();// the number from user

        int sum = 0; // addition all number
        int count = 0; // number count

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i; // addition the numbers that  divide 3 and 4
                count++; // how many numbers that divide 3 and 4
            }
        }
        System.out.println("Average= " + (sum / count)); //result


    }
}
