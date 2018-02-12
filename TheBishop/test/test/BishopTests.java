package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bishop.TheBishop;


class BishopTests {

	@Test
	void test() {
		TheBishop myBishop = new TheBishop(0,0);
		assertTrue(myBishop.moves() == 0, "Should return 0 but returned something else");
		myBishop.updatePosition(0, 6);
		assertTrue(myBishop.moves() == 2, "Should be two moves away");
		myBishop.updatePosition(0, 48);
		assertTrue(myBishop.moves() == 2, "should be two moves away");
		myBishop.updatePosition(0, 56);
		assertTrue(myBishop.moves() == -1, "should be impossible, -1 return");
		myBishop.updatePosition(0,  18);
		assertTrue(myBishop.moves() == 1, "should be one move away");
	}
}
