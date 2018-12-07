package data.wrangler;

public interface DataTransformService {
    public Dataset performTransform(Dataset dataset, Transform t);
}