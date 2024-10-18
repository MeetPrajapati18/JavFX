public class NailGun extends RentableHardware{
    private String feature;

    private NailGun(String n, double c, double p, int rentalCost, String feature){
        super(n,c,p,rentalCost);
        this.feature = feature;
    }

}
