package detail;

public class Body extends AbstractDetail {
    private int detailPrice;
    private String detailName;

    @Override
    public void setDetailPrice() {
        this.detailPrice = detailPrice;
    }

    @Override
    public int getDetailPrice() {
        return this.detailPrice;
    }

    @Override
    public String getDetail() {
        return this.detailName;
    }

    @Override
    public String setDetail() {
        detailName="Кузов";
        return detailName;
    }
}
