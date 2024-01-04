import Models.T_shirt;
import Models.Order;
public class Main {
    public static void main(String[] args) {
        String[] Madhesi_Superman_sizes = {"Xl","Medium","Large"};

        String[] Gorkhali_Batman_sizes = {"Xl","Medium","Large"};

        String[] Bihari_Wonderwoman_sizes = {"Tiny","Medium","Small"};

        T_shirt Madhesi_Superman = new T_shirt("Madhesi_Superman",001,150,"Guccha","Paan khao, Krypton bachao", Madhesi_Superman_sizes);

        T_shirt Gorkhali_Batman = new T_shirt("Gorkhali_Batman",572,1234,"Karuna","You either die a hero or live long enough to see yourself be a villain", Gorkhali_Batman_sizes);

        T_shirt Bihari_Wonderwoman = new T_shirt("Bihari_Wonderwoman",580,1004,"Lois Vitton","Amazon ki chori, nahi he gori", Bihari_Wonderwoman_sizes);

        Gorkhali_Batman.display_tshirt();

        int[] order_1_ids = {001,572};
        double[] price_1 = {150,1234};


        Order Rajesh = new Order("Rajesh Desai", 98035288, order_1_ids, price_1);

        Rajesh.generateBill();
    }
}