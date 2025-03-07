package cleancode.minesweeper.tobe.gameLevel;

public class Middle implements GameLevel {
    @Override
    public int getRowSize() {
        return 14;
    }

    @Override
    public int getColumnSize() {
        return 18;
    }

    @Override
    public int getLandMineCount() {
        return 40;
    }
}
