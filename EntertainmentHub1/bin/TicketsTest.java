import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicketsTest {

	static Show testShow;
	static Tickets ticket;
	
	@Test
	void testToString() {
		assertEquals("Show: " + ticket.getShow() + "Time: " + ticket.getTime() + "Price: " + ticket.getPrice() + "Enjoy your show!", ticket.toString());
	}
	
	@Test
	void testGetName(){
		ticket.setName("testNAme");
	}
	
	@Test
	void testSetShow() {
		testShow = new Show("Movie", "King Kong", "11 AM", "2 PM", "Story about an APE in China!", "*****");
		ticket.setShow(testShow);
		assertEquals(testShow, ticket.getShow());
	}

}
