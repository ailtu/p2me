package br.unicap.ed1.atividade01.question02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {

	@Test
	public void lowZero() {
		int volume = 0;
		String actual = Volume.getName(volume);
		String expected = "Min Volume";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void low1() {
		int volume = 1;
		String actual = Volume.getName(volume);
		String expected = "Low Volume";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void low25() {
		int volume = 25;
		String actual = Volume.getName(volume);
		String expected = "Low Volume";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void medium26() {
		int volume = 26;
		String actual = Volume.getName(volume);
		String expected = "Medium Volume";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void medium75() {
		int volume = 75;
		String actual = Volume.getName(volume);
		String expected = "Medium Volume";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void high76() {
		int volume = 76;
		String actual = Volume.getName(volume);
		String expected = "High Volume";
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void lowLowerThanZero() {
		int volume = -1;
		String actual = Volume.getName(volume);
		String expected = "Min Volume";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void highGreatedThanOrEqual100() {
		int volume = 100;
		String actual = Volume.getName(volume);
		String expected = "Max Volume";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void highGreatedThan100() {
		int volume = 101;
		String actual = Volume.getName(volume);
		String expected = "Max Volume";
		Assertions.assertEquals(expected, actual);
	}
}
