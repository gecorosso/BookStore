import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CompoundItemTest {

	private Item myCompound = new Compound("Cesto misto");
	
	@Before
	void initCompoundForNewTest() {
		myCompound = new Compound("Cesto misto");
	}
	
	@Test
	void aCompoundHasAName() {
		assertEquals("Cesto misto", myCompound.getName());
	}
	
	@Test
	void aCompoundHasAPriceOfZeroOnCreate() {
		assertEquals(0, myCompound.getPrice());
	}
	
	@Test
	void aCompoundCanChangeName() {
		myCompound.setName("Cesto misto deluxe");
		assertEquals("Cesto misto deluxe", myCompound.getName());
	}
	
	@Test
	void aCompoundCannotChangePrice() {
		assertThrows(Exception.class, ()->{myCompound.setPrice(2);});
	}
	
	@Test
	void aCompoundHasItems() {
		assertEquals(0, myCompound.getItemsQuantity());
	}
	
	@Test
	void aCompoundHasMoreItem() throws Exception {
		Item myNewItem = new SingleItem("Mandarino", 2);
		myCompound.add(myNewItem);
		assertEquals(1, myCompound.getItemsQuantity());
	}
	
	@Test
	void aCompoundCalculateHisPriceWithOneItem() throws Exception {
		Item myNewItem = new SingleItem("Mandarino", 2);
		myCompound.add(myNewItem);
		assertEquals(2, myCompound.getPrice());
	}
	
	@Test
	void aCompoundCalculateHisPriceWithMoreThanOneItem() throws Exception {
		Item myNewItem = new SingleItem("Mandarino", 2);
		myCompound.add(myNewItem);
		Item mySecondItem = new SingleItem("Mandarino", 2);
		myCompound.add(mySecondItem);
		assertEquals(4, myCompound.getPrice());
	}
	
	@Test
	void aCompoundWriteHisCorrectToString() throws Exception {
		String expected = "Cesto misto: Mandarino, 2";
		Item myNewItem = new SingleItem("Mandarino", 2);
		myCompound.add(myNewItem);
		
		assertEquals(expected, myCompound.toString());
	}
}
