package br.unicap.ed1.atividade01.question03;

public class Pairing {

	private Pair pairs[];

	public Pair[] getPairs() {
		return this.pairs;
	}

	private String[] getList(String s) {
		String[] subString = s.split(", ");
		return subString;
	}

	public Pair[] obtainPairs(String s1, String s2) throws Exception {

		String pair1[] = getList(s1);
		String pair2[] = getList(s2);

		Pair[] pair3 = new Pair[pair1.length];

		if (pair1.length != pair2.length) {

			throw new Exception("Cannot obtain pairs with different sizes!");
		}

		for (int i = 0; i < pair1.length; i++) {

			if (s1 == "" || s2 == "") {
				return new Pair[0];
			} else {
				pair3[i] = new Pair(pair1[i], pair2[i]);
			}
		}
		return pair3;
	}

	Pairing(String s1, String s2) throws Exception {

		if (s1 == null || s2 == null) {
			throw new Exception("null values");
		} else {
			this.pairs = obtainPairs(s1, s2);
		}
	}

	@Override
	public String toString() {

		String s = new String();
		int size = this.pairs.length - 1;

		if (size < 0) {
			return "";
		}

		for (int i = 0; i < size; i++) {
			s += this.pairs[i] + ", ";
		}

		s += this.pairs[size];
		return s;
	}
}