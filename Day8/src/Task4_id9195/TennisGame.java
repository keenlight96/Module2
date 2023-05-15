package Task4_id9195;

public class TennisGame {
    public static void main(String[] args) {
        System.out.println(getScore("Long", "Duyên", 2, 0));
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (player1Score == player2Score) {
            switch (player1Score) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            score += getTextScore(player1Score) + " - " + getTextScore(player2Score);
        }
        return score;
    }

    private static String getTextScore(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return null;
    }
}
