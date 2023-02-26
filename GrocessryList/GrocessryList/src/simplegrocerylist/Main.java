package simplegrocerylist;

import java.util.Scanner;

public class Main {
	
private static Scanner sc=new Scanner(System.in);

private static GroceryList grocerylist=new GroceryList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean quit=false;
int choice=0;
printInstruction();

while(!quit) {
	System.out.println("Enter Your Choice:");
	 choice=sc.nextInt();
	 //sc.next();
	 
	 switch (choice) {
	 case 0:
		 printInstruction();
		 break;
	 case 1:
		grocerylist.getgroceryitem();
		 break;
	 case 2:
		 additem();
		 break;
	 case 3:
		 modifyitem();
		 break;
	 case 4:
		 removeitem();
		 break;
	 case 5:
		 searchitem();
		 break;
	 case 6:
		 System.out.println("*************************************");
		 grocerylist.getgroceryitem();
		 break;
	 case 7:
		 quit=true;
		 System.out.println("exit");
		 break;
	}
	 
}
	}

	private static void printInstruction() {
		// TODO Auto-generated method stub
		System.out.println("***************************************************************");
		System.out.println("*****************WELCOME TO GROCERY MANAGEMENT*****************");
		System.out.println("***************************************************************");
		System.out.println("\n press:");
		System.out.println("\t  0.to print choice option:");
		System.out.println("\t 1.Check how many item have in list:");
		 System.out.println("\t 2.Add item to list:");
		 System.out.println("\t 3.Modify item to the list:");
		 System.out.println("\t 4.Remove item to the list:");
		 System.out.println("\t 5.Search item from list:");
		 System.out.println("\t 6.print all item in the list:");
		 System.out.println("\t 7.Exit:");
	}
	public static void additem() {
		 System.out.println("please enter grocery item:");
		 grocerylist.addgroceryitem(sc.next());
	 }
	 public static void modifyitem() {
		 System.out.println("Enter item number");
		 int itemno=sc.nextInt();
		 //sc.next();
		 System.out.println("Enter replacement item:");
		 String newitem=sc.next();
		 //int price=sc.nextInt();
		 grocerylist.modifygrocerylist(itemno-1, newitem);
		 
	 }
	public static void removeitem() {
		System.out.println("Enter item Number:");
		int itemno=sc.nextInt();
		//sc.next();
		grocerylist.removegroceryitem(itemno-1);
	}
	public static void searchitem() {
		System.out.println("Enter Item for search");
		String searchitem=sc.next();
		if(grocerylist.finditem(searchitem)!=null) {
			System.out.println(searchitem+":Found item in grocery list");
		}
		else {
			System.out.println(searchitem+" is not in the list");
		}
	}
 

}
