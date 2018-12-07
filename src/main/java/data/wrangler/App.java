package data.wrangler;

public class App
{
    public static void main( String[] args )
    {
        // prepare dataset
    	String[][] data = {{"Canada", "Shoes", "9897"}, {"China", "Wood", "6823.987"}, {"US", "Soccer", "86823.7"}};
    	String[] cols = {"Country", "Prodcut", "Sales"};
    	Dataset ds = new Dataset(data, cols);

    	// prepare transform
    	Column sourceCol = new Column("Prodcut");
    	Column targetCol = new Column("Prodcut_Copy");
    	Transform t = new Transform("DuplicateColumn", sourceCol, targetCol);

    	// init transform service
    	DataTransformService dts = new DuplicateColumnTransform();

    	// perform transform
    	System.out.println(ds);
    	Dataset targetDataset = dts.performTransform(ds, t);
    	System.out.println(targetDataset);
    }
}
