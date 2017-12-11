package human;

public abstract class AbstractHuman {
    private String name;


    public AbstractHuman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        if (name != null)
            this.name = name;
    }


}
