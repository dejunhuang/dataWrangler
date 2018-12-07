package data.wrangler;
import java.util.List;

public class Row {
    // TODO: add IDX property
    private List<Cell> cells;

    public Row(List<Cell> cells) {
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return this.cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
    	return this.cells.toString();
    }
}