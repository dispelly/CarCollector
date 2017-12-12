package detail;

/**
 * Class of body.
 */
public class Body extends AbstractDetail {

    private int detailPrice=50;
    private String detailName;

    public Body(int detailPrice, String detailName) {
        this.detailPrice = detailPrice;
        this.detailName = detailName;
    }

    @Override
    public int getDetailPrice() {
        return this.detailPrice;
    }

    @Override
    public String getDetailName() {
        return this.detailName;
    }

    @Override
    public String toString() {
        return "Body{" +
                "detailPrice=" + detailPrice +
                ", detailName='" + detailName + '\'' +
                '}';
    }
}
