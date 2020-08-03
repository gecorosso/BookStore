import java.util.LinkedList;

public class Compound implements Item {

	private String name;
	private LinkedList<Item> myItems = null;

	public Compound(String name) {
		this.name = name;
		myItems = new LinkedList<Item>();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		int myPrice = 0;
		
		for(int i=0; i<myItems.size(); i++) {
			myPrice+=myItems.get(i).getPrice();
		}
		
		return myPrice;
	}

	@Override
	public void setPrice(int i) throws Exception {
		throw new Exception("A Compound cannot change it's price!");
	}

	@Override
	public void setName(String newName) {
		this.name = newName;
	}

	@Override
	public void add(Item newItem) {
		myItems.add(newItem);
		
	}

	@Override
	public int getItemsQuantity() {
		return myItems.size();
	}
	
	@Override
	public String toString() {
		String result = this.name+": ";
		
		for(int i=0; i<myItems.size(); i++) {
			result=result+myItems.get(i).getName()+", ";
		}
		
		result = result+getPrice();
		
		return result;
	}

}
