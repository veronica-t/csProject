import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShowlistTest {
	static Showlist sl;
	@Test
	void testGetInstance() {
		sl.getInstance();
	}

	@Test
	void testAddShow() {
		Showlist showL = Showlist.getInstance();
		showL.getShowList().clear();
		Show show = new Show();
		show.setShowName("Hamlet");
		showL.addShow("play", "Hamlet", "2 PM", "7 PM", "Greatest play of all time", "*****");
	
		assertEquals(0, showL.getShowList().size());
	}


}
