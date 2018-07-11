public class ScoreBoard
{
    private ScoreBoard board;
    private int score;
    private ScoreBoard()
    {
        score = 0;
    }
    public ScoreBoard getInstance()
    {
        if(board == null)
        {
            board = new ScoreBoard();
        }
        return board;
    }
}
