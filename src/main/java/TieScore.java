public class TieScore extends Score {

    public TieScore(Player player1, Player player2) {
        super(player1, player2);
    }

    public Boolean isAppliable() {
        return player1.isInATieWith(player2);
    }

    @Override
    public String toString() {
        return player1.getScore() > 2 ? "Deuce" : nameFor(player1.getScore()) + "-All";
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
        }
        return name;
    }
}
