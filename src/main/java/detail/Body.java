package detail;

public class Body extends AbstractDetail {
    private int detailPrice;
    private String detailName;

    public Body(int detailPrice, String detailName) {
        this.detailPrice = detailPrice;
        this.detailName = detailName;
    }

    @Override
    public void setDetailPrice() {
        this.detailPrice = detailPrice;
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
