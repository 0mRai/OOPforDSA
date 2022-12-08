package inheritance;

public class box {

    int l;
    int w;
    int h;

    box(int side)
    {
        this.l=side;
        this.w=side;
        this.h=side;
    }
    box(int l,int w,int h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
        
    }
}