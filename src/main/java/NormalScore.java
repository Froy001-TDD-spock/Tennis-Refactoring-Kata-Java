public class NormalScore extends Score {

    public NormalScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public Boolean isAppliable() {
        return player1.getScore() <= 3 && player2.getScore() <= 3;
    }

    @Override
    public String toString() {
        return nameFor(player1.getScore()) + "-" + nameFor(player2.getScore());
    }

    private String nameFor(int score) {
        String name = "";
        switch(score)
        {
            case 0:
                name+="Love";
                break;
            case 1:
                name+="Fifteen";
                break;
            case 2:
                name+="Thirty";
                break;
            case 3:
                name+="Forty";
                break;
        }
        return name;
    }
}
