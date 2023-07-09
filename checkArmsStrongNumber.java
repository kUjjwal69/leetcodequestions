import java.util.*;
public class Main {
	public static boolean armStrongNum(int n ){

   int originalno = n;
    int count = 0;
    int temp = n;
    while (temp != 0)
    {
        count++;
        temp = temp / 10;
    }
    int sumofpower = 0;
    while (n != 0)
    {
        int digit = n % 10;
        sumofpower += Math.pow(digit,count);
        n /= 10;
    }
    return (sumofpower == originalno);
}
	
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(armStrongNum(n));
		

	}
}
