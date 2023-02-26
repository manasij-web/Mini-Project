package simplegrocerylist;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> grocerylist=new ArrayList<>();

public void addgroceryitem(String item) {
	grocerylist.add(item);
	
}
public void getgroceryitem() {
	System.out.println("You Have " +grocerylist.size()+ " Item In Your List");
	
	for(int i=0; i<grocerylist.size(); i++) {
		System.out.println((i+1)+","+grocerylist.get(i));
	}
	
}
public void modifygrocerylist(int position,String newitem) {
	grocerylist.set(position, newitem);
	System.out.println("Grocery Item Has Been Modifide With:"+grocerylist.get(position));
	
}
public void removegroceryitem(int position) {
	String theitem=grocerylist.get(position);
	grocerylist.remove(position);
	System.out.println("Grocery Item Has Been deleted sucessfully ");
}
public String finditem(String searchitem) {
	int position=grocerylist.indexOf(searchitem);
	
	if(position>=0) {
		return grocerylist.get(position);
	}
	return null;
}
}
