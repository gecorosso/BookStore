import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class SingleItemTest {
	
	Item myItem = new SingleItem("Arancia", 3);;
	
	@Before
	void initBeforeTest() {
		myItem = new SingleItem("Arancia", 3);
	}
	
	@Test
	void anItemHasAName() {
		assertEquals("Arancia", myItem.getName());
	}
	
	@Test
	void anItemHasAPrice() {
		assertEquals(3, myItem.getPrice());
	}
	
	@Test
	void anItemToStringReturnsNameAndPrice() {
		assertEquals("Arancia, 3", myItem.toString());
	}
	
	@Test
	void anItemCanChangePrice() throws Exception {
		myItem.setPrice(5);
		assertEquals(5, myItem.getPrice());
	}
	
	@Test
	void anItemCanChangeName() {
		myItem.setName("Arancia di Sicilia");
		assertEquals("Arancia di Sicilia", myItem.getName());
	}
	
	@Test
	void anItemHasOneItem() {
		assertEquals(1, myItem.getItemsQuantity());
	}
	
	@Test
	void anItemThrowsExceptionOnAddCall() {
		Item newItem = new SingleItem("Arancia", 2);
		assertThrows(Exception.class, ()->{myItem.add(newItem);});
	}

}
