
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
        if (playerName == "player1")
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        String score = "";
        if (scoresAreEqual())
        {
            if(player1Score > 2) {
                score = "Deuce";
            }
            else {
                score = nameFor(player1Score) + "-All";
            }
        }
        else if (atLeastOneScoreAbove4())
        {
            int differenceBetweenScores = player1Score - player2Score;
            if (differenceBetweenScores==1) score ="Advantage player1";
            else if (differenceBetweenScores ==-1) score ="Advantage player2";
            else if (differenceBetweenScores>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            score = nameFor(player1Score) + "-" + nameFor(player2Score);
        }
        return score;
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
        return player1Score >=4 || player2Score >=4;
    }

    private boolean scoresAreEqual() {
        return player1Score == player2Score;
    }
}
