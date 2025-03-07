package cleancode.minesweeper.tobe.gameLevel;

public class Beginer implements GameLevel {
    @Override
    public int getRowSize() {
        return 8;
    }

    @Override
    public int getColumnSize() {
        return 10;
    }

    @Override
    public int getLandMineCount() {
        return 10;
    }
}
