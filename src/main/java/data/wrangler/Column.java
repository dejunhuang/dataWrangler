package data.wrangler;

public class Column {
    private String columnName;
    private DataType columnType;

    public Column(String columnName) {
        this.columnName = columnName;
        this.columnType = DataType.STRING;
    }

    public Column(String columnName, DataType columnType) {
        this.columnName = columnName;
        this.columnType = columnType;
    }

    public String getColumnName() {
        return this.columnName;
    }

    @Override
    public boolean equals(Object a) {
    	if(a == this) return true;
    	if (!(a instanceof Column)) return false;
    	Column colA = (Column) a;
        return colA.getColumnName().equals(this.getColumnName());
    }
}