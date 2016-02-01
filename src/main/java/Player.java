public class Player {

    private Integer score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public Integer getScore() {
        return score;
    }

    public void wonPoint() {
        score++;
    }

    public String getName() {
        return name;
    }
}
