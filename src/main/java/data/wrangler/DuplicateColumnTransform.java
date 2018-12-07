package data.wrangler;
import java.util.List;

public class DuplicateColumnTransform implements DataTransformService {
    public Dataset performTransform(Dataset dataset, Transform t) {
        Column sourceCol = t.sourceColumn;
        Column targetCol = t.targetColumn;

        List<Cell> colCells = dataset.getColumnCells(sourceCol);
        dataset.addColumn(targetCol, colCells);

        return dataset;
    }
}