public class Shirt {

    int quantity;
    boolean forWomen;
    String type;
    double cost;
   
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean isForWomen() {
        return forWomen;
    }
    public void setForWomen(boolean forWomen) {
        this.forWomen = forWomen;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
   
    public Shirt(int quantity, boolean forWomen, String type, double cost) {
        this.quantity = quantity;
        this.forWomen = forWomen;
        this.type = type;
        this.cost = cost;
    }



}
