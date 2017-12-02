package detail;

public abstract class AbstractDetail {
    private String detailName;
    private int detailPrice;

    public AbstractDetail(String detailName, int detailPrice) {
        this.detailName = detailName;
        this.detailPrice = detailPrice;
    }

    public int getDetailPrice() {
        return detailPrice;
    }

    public String getDetailName() {

        return detailName;
    }

    public void setDetailName(String detailName) {
        if(detailName!=null)
        this.detailName = detailName;
    }

    public void setDetailPrice(int detailPrice) {
        if (detailPrice>=0)
        this.detailPrice = detailPrice;
    }
}
