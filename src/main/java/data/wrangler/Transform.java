package data.wrangler;

public class Transform {
    // TODO: make operator a separate class
    public String operator;
    public Column sourceColumn;
    public Column targetColumn;

    public Transform(String operator, Column sourceColumn, Column targetColumn) {
    	this.operator = operator;
    	this.sourceColumn = sourceColumn;
    	this.targetColumn = targetColumn;
    }
}