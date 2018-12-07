package data.wrangler;
import java.util.List;

public class DatasetMetaData {
    private List<Column> columns;

    public DatasetMetaData(List<Column> columns) {
        this.columns = columns;
    }

    public List<Column> getColumns() {
        return this.columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }
}