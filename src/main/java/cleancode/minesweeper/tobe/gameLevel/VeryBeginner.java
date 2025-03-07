package cleancode.minesweeper.tobe.gameLevel;

public class VeryBeginner implements GameLevel {
    @Override
    public int getRowSize() {
        return 4;
    }

    @Override
    public int getColumnSize() {
        return 5;
    }

    @Override
    public int getLandMineCount() {
        return 2;
    }
}
