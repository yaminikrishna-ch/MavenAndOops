
import java.util.*;
public class MainSweetChocolate {
	Scanner sc = new Scanner(System.in);
	static int weight=0, price =0;
	Sweets sweet;
	Chocolates chocolate;
	public void setSweet(Sweets sweet) {
		this.sweet = sweet;
	}
	public void setChocolate(Chocolates chocolate) {
		this.chocolate = chocolate;
	}
	public void InputtingSweetsweight() {
		sweet.SweetweightIntake();
	}
	public void InputtingSweetsPrice() {
		sweet.SweetpriceIntake();
	}
	public void InputtingChocolatesweight() {
		chocolate.chocolateweightIntake();
	}
	public void InputtingChocolatesPrice() {
		chocolate.chocolatepriceIntake();
	}
}
