/**
 * Created by aroche on 07/10/14.
 */
public class UnProduit {
    public UnProduit(String id, String libéllé) {
        _id = id;
        _libéllé=libéllé;
    }

    private String _id;
    private String _libéllé;

    public String RécupèreLeLibéllé() {
        return _libéllé;
    }
}
