package detail;

public class ControlGear extends AbstractDetail {

    private int detailPrice=50;
    private String detailName;

    public ControlGear(int detailPrice, String detailName) {
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
        return "ControlGear{" +
                "detailPrice=" + detailPrice +
                ", detailName='" + detailName + '\'' +
                '}';
    }
}
