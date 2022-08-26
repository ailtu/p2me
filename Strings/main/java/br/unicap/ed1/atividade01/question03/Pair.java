package br.unicap.ed1.atividade01.question03;

public class Pair {

    private String left = new String();
    private String right = new String();

    public Pair(String left, String right) throws Exception {

        this.left = left;
        this.right = right;

        if (left == null || right == null) {
            throw new RuntimeException("null values");
        }

        else if (left == "" || right == "") {
            throw new RuntimeException("empty values");
        }
    }

    @Override
    public String toString() {
        return '(' + this.left + ", " + this.right + ')';
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Pair) {
            Pair other = (Pair) obj;
            if (this.left.equals(other.left) && this.right.equals(other.right)) {
                return true;
            }
        }
        return false;
    }
}