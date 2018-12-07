package data.wrangler;
import java.util.ArrayList;
import java.util.List;

public class Dataset {
    private DatasetMetaData metaData;
    private List<Row> rows;

    public Dataset(String[][] data, String[] columns) {
        rows = this.convertToRowsFromArray(data);

        List<Column> cols = new ArrayList<>();
        for(String col: columns) {
            cols.add(new Column(col));
        }
        this.metaData = new DatasetMetaData(cols);
    }

    public List<Row> getRows() {
        return this.rows;
    }

    public DatasetMetaData getMetaData() {
        return this.metaData;
    }

    private List<Row> convertToRowsFromArray(String[][] data) {
        List<Row> rows = new ArrayList<>();

        for(String[] rowData: data) {
            List<Cell> cells = new ArrayList<>();
            for(String cellVal: rowData) {
                cells.add(new Cell(cellVal));
            }
            Row curRow = new Row(cells);
            rows.add(curRow);
        }

        return rows;
    }

    public List<Cell> getColumnCells(Column col) {
        int colIdx = this.metaData.getColumns().indexOf(col);
        List<Cell> colCells = new ArrayList<>();
        for(Row row: this.rows) {
            colCells.add(row.getCells().get(colIdx));
        }
        return colCells;
    }

    public void addColumn(Column targetCol, List<Cell> colCells) {
    	List<Column> cols = this.metaData.getColumns();
    	cols.add(targetCol);
        this.metaData.setColumns(cols);
        for(int i = 0; i < colCells.size(); i++) {
        	Row row = this.rows.get(i);
        	List<Cell> rowCells = row.getCells();
        	rowCells.add(colCells.get(i));
        	row.setCells(rowCells);
        }
    }

    @Override
    public String toString() {
    	return this.rows.toString();
    }
}