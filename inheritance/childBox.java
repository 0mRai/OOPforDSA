package inheritance;

public class childBox extends box
{
    int weight;
   childBox(int l, int b, int h, int weight)
   {
    super(l, b, h);
   this.weight=weight;
   System.out.println(super.l);
   }

   childBox(int s, int weight)
   {
      super(s);
      this.weight=weight;
   }
    
}