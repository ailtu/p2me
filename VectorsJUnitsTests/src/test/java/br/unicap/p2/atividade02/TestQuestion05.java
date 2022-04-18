package br.unicap.p2.atividade02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuestion05 {

	@Test
	public void test10CalculateCableBridgeOneCableSteel() {

		double bridgeLenght = 2;
		int numSteelCables = 1;
		double halfBridgeLenght = bridgeLenght / 2;
		double maxCableHeight = 1 / 20 * halfBridgeLenght;
		double cableLenght = Math.sqrt(Math.pow(halfBridgeLenght, 2) + Math.pow(maxCableHeight, 2));
		double expected = 4 * cableLenght;
		double actual = Utils.calculateCableBridge(bridgeLenght, numSteelCables);
		Assertions.assertEquals(expected, actual, .001);
	}

	@Test
	public void test11CalculateCableBridgeTwoCableSteel() {
		double bridgeLenght = 2;
		int numSteelCables = 2;
		double halfBridgeLenght = bridgeLenght / 2;
		double maxCableHeight = 1 / 20 * halfBridgeLenght;

		double cableLenghtMax = Math.sqrt(Math.pow(halfBridgeLenght, 2) + Math.pow(maxCableHeight, 2));
		double cableLenghtMin = Math.sqrt(Math.pow(halfBridgeLenght / 2, 2) + Math.pow(maxCableHeight / 2, 2));
		double expected = 4 * (cableLenghtMax + cableLenghtMin);

		double actual = Utils.calculateCableBridge(bridgeLenght, numSteelCables);
		Assertions.assertEquals(expected, actual, .001);
	}
}
