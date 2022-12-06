package com.training.Tenis.Torneio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TorneioTest {
	@Test
	public void testVitoria() {
		TorneioTenis tenis = new TorneioTenis();
		char[] Partidas = {'|wd\w};
		int resp = tenis.Torneio(Partidas);
		assertTrue(resp == 1);
	}
	
}
