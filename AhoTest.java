
public class AhoTest {
	
	//Aho aho = new Aho();
	
	String hikisu40 = "40";
	String hikisu400 = "400";
	
	@Test
	public void Aho() throws Exception {
		assertThat(aho(hikisu40),is("Ok"));
		
		assertThat(aho(hikisu400),is("Ok"));
		
		
		
		/*3の倍数の時に"Aho"が出るか
		assertTrue(aho(3)is("Aho"));
		assertTrue(aho(13)is("Aho"));
		assertTrue(aho(333)is("Aho"));
		*/
		
		assertTrue(aho());
		
	
		
	}
}
