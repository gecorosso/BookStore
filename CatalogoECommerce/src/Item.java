
public interface Item {

	String getName();
	int getPrice();
	void setPrice(int i) throws Exception;
	void setName(String string);
	void add(Item newItem) throws Exception;
	int getItemsQuantity();

}
