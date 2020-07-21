
import java.util.*;
public class GiftPacket {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		NewYear.InputForGifts();
		NewYear.Total_weight_of_Gift();
		System.out.println("Enter the sorting Parameter :");
		System.out.println("Sort by Price (P/p) : ");
		System.out.println("Sort by weight (W/w): ");
		String parameter = sc.nextLine();
		NewYear.sortChocolates(parameter);
	}
}
