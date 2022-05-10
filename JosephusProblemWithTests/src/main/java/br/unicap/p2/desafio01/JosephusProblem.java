package br.unicap.p2.desafio01;

public class JosephusProblem {

	public static int[] solve(int m, int n) {
		
		int[] positions = new int[n];
		int[] sequenceEliminated = new int[n];
		int countEliminated = 0;
		int currentPosition = -1;	
		
		while(countEliminated < n) {
			currentPosition = moveNext(positions, currentPosition, n, m);
			positions[currentPosition] = -1;
			sequenceEliminated[countEliminated] = currentPosition;
			countEliminated++;
		}		
		return sequenceEliminated;		
	}
	
	public static int moveNext(int[] positions, int currentPosition, int n, int m) {		
		
		int individuals = 0;		
		
		while(individuals < m) {			
			currentPosition++;
			currentPosition = currentPosition % n;
			
			//Already eliminated?
			if(positions[currentPosition] == -1) {
				continue;
			}
			individuals++;
		}		
		return currentPosition;			
	}
}