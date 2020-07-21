
import java.util.*;
public class NewYear extends MainSweetChocolate {
	static ArrayList<Integer>  sweetweightarray = new ArrayList<Integer>();
	static ArrayList<Integer>  sweetpricearray = new ArrayList<Integer>();
	static ArrayList<Integer>  chocolateweightarray = new ArrayList<Integer>();
	static ArrayList<Integer>  chocolatepricearray = new ArrayList<Integer>();
	static Map <Integer,Integer> sweetsarray = new HashMap <Integer, Integer>();
	static Map <Integer,Integer> chocolatesarray = new HashMap <Integer, Integer>();
	static Map<Integer, Integer> finalsweetssorted = new LinkedHashMap<Integer, Integer>(); 
	ArrayList<Integer>  final_sweets_list = new ArrayList<Integer>();
	ArrayList<Integer>  final_chocolate_list = new ArrayList<Integer>();
	static int no_of_sweets, m;
	static Scanner sc = new Scanner(System.in);
	public static void InputForGifts() throws Exception{
		System.out.println("Enter the number of sweets:");
		no_of_sweets = sc.nextInt();
		for(int i=0;i<no_of_sweets;i++) {
			System.out.println("Enter the sweet name: (KajuBarfi/GulabJamun/DoubleKaMeeta )");
			String sweetName=sc.next();
//			System.out.print(sweetName);
//			System.out.println(sweetName);
//			if(sweetName.equals("GulabJamun")) {
//				Class<?> cls = Class.forName("GulabJamun");
			Class <?> cls = Class.forName(sweetName);
			Object o = cls.newInstance();
			Sweets s =(Sweets)o;
			MainSweetChocolate chocosweet = new MainSweetChocolate();
			chocosweet.setSweet(s);
			chocosweet.InputtingSweetsweight();
			chocosweet.InputtingSweetsPrice();
			sweetweightarray.add(weight);
			sweetpricearray.add(price);
			}
		//}
		System.out.println("Enter the number of chocolates:");
		m = sc.nextInt();
		for(int i=0;i<m;i++) {
			System.out.println("Enter the Chocolate name: (DairyMilkSilk/FruitAndNut/KitKat) : ");
			String chocolateName = sc.next();
			Class<?> cls = Class.forName(chocolateName);
			Object o = cls.newInstance();
			Chocolates ch =(Chocolates)o;
			MainSweetChocolate chocosweet = new MainSweetChocolate();
			chocosweet.setChocolate(ch);
			chocosweet.InputtingChocolatesweight();
			chocosweet.InputtingChocolatesPrice();
			chocolateweightarray.add(weight);
			chocolatepricearray.add(price);
		}
		for(int i=0;i<no_of_sweets;i++) {
			sweetsarray.put(sweetweightarray.get(i), sweetpricearray.get(i));
		}
		for(int i=0;i<m;i++) {
			chocolatesarray.put(chocolateweightarray.get(i), chocolatepricearray.get(i));
		}
	}
		public static void Total_weight_of_Gift() {
			int weight_of_box =0;
			for(int i=0;i<no_of_sweets;i++) {
				weight_of_box += sweetweightarray.get(i);
			}
			for(int i=0;i<m;i++) {
				weight_of_box += chocolateweightarray.get(i);
			}
			System.out.println("Total weight of the giftBox is:"+ weight_of_box);
		// TODO Auto-generated method stub
	}
		public static void sortChocolates(String parameter) {
			//int t;
			if(parameter.equals("p") || parameter.equals("P")){
				List<Map.Entry<Integer, Integer> > sortedsweets = new LinkedList<Map.Entry<Integer, Integer> >(sweetsarray.entrySet()); 
				Collections.sort(sortedsweets, new Comparator<Map.Entry<Integer, Integer> >() { 
		            public int compare(Map.Entry<Integer, Integer> o1,  Map.Entry<Integer, Integer> o2) 
		            { 
		                return (o1.getValue()).compareTo(o2.getValue()); 
		            } 
		        }); 
				
		        for (Map.Entry<Integer, Integer> aa : sortedsweets) { 
		            finalsweetssorted.put(aa.getKey(), aa.getValue()); 
		        } 
		        System.out.println("After sorting Chocolates based on price:" );
		        System.out.println("Weight   -------->   Price");
		        for (Map.Entry<Integer, Integer> mapElement : finalsweetssorted.entrySet()) { 
		            System.out.println(mapElement.getKey()+"  ----->   "+mapElement.getValue());
			}
		}
			else {
				List<Map.Entry<Integer, Integer> > sortedsweets = new LinkedList<Map.Entry<Integer, Integer> >(sweetsarray.entrySet()); 
				Collections.sort(sortedsweets, new Comparator<Map.Entry<Integer, Integer> >() { 
		            public int compare(Map.Entry<Integer, Integer> o1,  Map.Entry<Integer, Integer> o2) 
		            { 
		                return (o1.getKey()).compareTo(o2.getKey()); 
		            } 
		        }); 
				
		        for (Map.Entry<Integer, Integer> aa : sortedsweets) { 
		            finalsweetssorted.put(aa.getKey(), aa.getValue()); 
		        } 
		        System.out.println("After sorting based on weight:" );
		        System.out.println("Weight   -------->   Price");
		        for (Map.Entry<Integer, Integer> mapElement : finalsweetssorted.entrySet()) { 
		            System.out.println(mapElement.getKey()+"  ----->   "+mapElement.getValue());
			}
			}
				
			}
		

}
