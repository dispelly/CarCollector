package detail;

public class Painting extends AbstractDetail {

    private int detailPrice=50;
    private String detailName;

    public Painting(int detailPrice, String detailName) {
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
        return "Painting{" +
                "detailPrice=" + detailPrice +
                ", detailName='" + detailName + '\'' +
                '}';
    }
}
