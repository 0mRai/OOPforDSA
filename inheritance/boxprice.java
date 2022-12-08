package inheritance;

public class boxprice extends childBox{
    double price;
    boxprice(int side, int weight, double pricemoney)
    {
        super(side, weight);
        this.price=pricemoney;
    }
    boxprice(int l, int b, int h, int w)
    {
        super(l, b, h, w);
        System.out.println(super.l);
    }
}
