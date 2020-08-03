import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IT_Item {
	
	private static Item myTestCompound = new Compound("Test");
		
	
	@BeforeAll
	static void initWorld() throws Exception {
		Item firstItem = new SingleItem("s1", 3);
		Item secondItem = new SingleItem("s2", 5);
		
		Item internalCompound = new Compound("Internal");

		internalCompound.add(firstItem);
		internalCompound.add(secondItem);
		
		myTestCompound.add(internalCompound);
		
		myTestCompound.add(firstItem);
	}

	@BeforeEach
	void Clean() throws Exception{
		initWorld();
	}

	
	@Test
	void aCompoundCalculate() {
		assertEquals(33, myTestCompound.getPrice());
	}
	
	
	@Test
	void aWriteCompoundCalculate() {
		assertEquals("Test: Internal, s1, Internal, s1, 22", myTestCompound.toString());
	}
	

}
