public class conteststats {
    int[] scores = {85, 90, 95};

    void printFirstScore() {
        System.out.println("First score: " + scores[0]);
    }

    public static void main(String[] args) {
        conteststats c = new conteststats();
        c.printFirstScore();
    }
}
