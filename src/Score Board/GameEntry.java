public class GameEntry {
    private String[] names;
    private int[] score;

    public GameEntry(int capacity){
        names = new String[capacity];
        score = new int[capacity];
    }

    //Getters
    public int[] getScore() {
        return score;
    }
    public String[] getNames() {
        return names;
    }
    //Setters

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
}
