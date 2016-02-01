
public class TennisGame1 implements TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        if (scoresAreEqual())
        {
            return scoreForTie();
        }
        else if (atLeastOneScoreAbove4() && advantagePlayer1()) {
            return advantageScoreFor(player1Name);

        }
        else if(atLeastOneScoreAbove4() && advantagePlayer2()) {
            return advantageScoreFor(player2Name);
        }

        else if(atLeastOneScoreAbove4() && advantagePlayer1ByTwoOrMorePoints()) {
            return winScoreFor(player1Name);
        }

        else if(atLeastOneScoreAbove4() && advantagePlayer2ByTwoOrMorePoints()) {
            return winScoreFor(player2Name);
        }
        else
        {
            return scoreForBothBelow4();
        }
    }

    private static String winScoreFor(String playerName) {
        return "Win for " + playerName;
    }

    private static String advantageScoreFor(String playerName) {
        return "Advantage " + playerName;
    }

    private String scoreForBothBelow4() {
        String score;
        score = nameFor(player1Score) + "-" + nameFor(player2Score);
        return score;
    }

    private String scoreForTie() {
        String score;
        if(player1Score > 2) {
            score = "Deuce";
        }
        else {
            score = nameFor(player1Score) + "-All";
        }
        return score;
    }

    private boolean advantagePlayer1ByTwoOrMorePoints() {
        return player1Score - player2Score >= 2;
    }

    private boolean advantagePlayer2ByTwoOrMorePoints() {
        return player2Score - player1Score >= 2;
    }

    private boolean advantagePlayer2() {
        return player1Score - player2Score == -1;
    }

    private boolean advantagePlayer1() {
        return player1Score - player2Score == 1;
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

    private boolean atLeastOneScoreAbove4() {
        return player1Score >= 4 || player2Score >=4;
    }

    private boolean scoresAreEqual() {
        return player1Score == player2Score;
    }
}
