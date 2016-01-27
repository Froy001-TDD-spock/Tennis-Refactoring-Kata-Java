
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
            switch (player1Score)
            {
                case 0:
                        score = "Love-All";
                    break;
                case 1:
                        score = "Fifteen-All";
                    break;
                case 2:
                        score = "Thirty-All";
                    break;
                default:
                        score = "Deuce";
                    break;
                
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
            int currentPlayerScore=0;
            for (int i=1; i<3; i++)
            {
                if (i==1)
                    currentPlayerScore = player1Score;
                else {
                    score+="-";
                    currentPlayerScore = player2Score;
                }
                switch(currentPlayerScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    private boolean atLeastOneScoreAbove4() {
        return player1Score >=4 || player2Score >=4;
    }

    private boolean scoresAreEqual() {
        return player1Score == player2Score;
    }
}
