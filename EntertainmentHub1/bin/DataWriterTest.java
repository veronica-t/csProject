import org.junit.jupiter.api.Test;;


class DataWriterTest{

	@Test
	void testWrieAcc() {
		DataWriter.writeAccountJSON();
	}
	
	@Test
	void testwriteShow() {
		DataWriter.writeShowsJSON();
	}
	

}
