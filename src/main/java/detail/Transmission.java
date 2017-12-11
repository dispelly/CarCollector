package detail;

public class Transmission extends AbstractDetail {
    private int detailPrice=50;
    private String detailName;

    public Transmission(int detailPrice, String detailName) {
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
        return "Transmission{" +
                "detailPrice=" + detailPrice +
                ", detailName='" + detailName + '\'' +
                '}';
    }
}
