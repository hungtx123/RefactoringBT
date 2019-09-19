public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int Playerscore1, int Playerscore2) {
        String score = "";
        int tempScore = 0;
        if (Playerscore1 == Playerscore2) {
            switch (Playerscore1) {
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
        } else if (Playerscore1 >= 4 || Playerscore2 >= 4) {
            int minusResult = Playerscore1 - Playerscore2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = Playerscore1;
                else {
                    score += "-";
                    tempScore = Playerscore2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}