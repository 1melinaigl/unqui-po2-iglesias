package ar.edu.unq.po2.tp8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PokerStatusTest {
	private PokerStatus poker;

	public void setUp() {
			
		poker = new PokerStatus();
		}
		
	@Test
	public void unPokerStatusRetornaNull() {
		poker = new PokerStatus();
		
		assertEquals(false, poker.verificar("3P", "8C", "5D", "4T", "2P"));
				
}
}