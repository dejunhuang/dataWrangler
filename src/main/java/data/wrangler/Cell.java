package data.wrangler;

public class Cell {
    private String value;
    private DataType dataType;

    public Cell(String value) {
        this.value = value;
        this.dataType = DataType.STRING;
    }

    public Cell(String value, DataType dataType) {
        this.value = value;
        this.dataType = dataType;
    }

    public String getValue() {
        return this.value;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
    	return this.value;
    }
}