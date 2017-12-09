package orders;

public class DisassembleOrder extends AbstractOrder implements Order {
    public DisassembleOrder(int priceForCar, int id) {
        super(priceForCar, id);
    }

    @Override
    public void printOrderName() {
        System.out.println("Заказ на разборку машины");
    }
}
