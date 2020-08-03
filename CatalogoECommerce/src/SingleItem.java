
public class SingleItem implements Item {
	
	private String name;
	private int price;

	public SingleItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public String toString() {
		return this.name + ", " + this.price;
	}

	@Override
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}

	@Override
	public void setName(String newName) {
		this.name = newName;
	}

	@Override
	public void add(Item newItem) throws Exception{
		throw new Exception("Single Items cannot add anything");
		
	}

	@Override
	public int getItemsQuantity() {
		return 1;
	}
}
