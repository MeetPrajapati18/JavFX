public class RentableHardware extends TimsProduct{
    private int rentalCost;
    private boolean rented;

    public RentableHardware(String n, double c, double p, int rentalCost){
        super(n, c, p);
        this.rentalCost = rentalCost;
    }

    public void setRentalCost(int rentalCost){
        this.rentalCost = rentalCost;
    }

    public static RentableHardware create(){
        String n = "Nail Gun";
        int rentalCost = 10;
        double p = 50.00;
        double c = p+rentalCost;
        RentableHardware rh = new RentableHardware (n,c,p,rentalCost);
        rh.setRentalCost(rentalCost);
        return rh;

    }
}
