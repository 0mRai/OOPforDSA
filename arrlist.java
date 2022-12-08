import java.util.ArrayList;
import java.util.*;

class arrlist
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(24);
    list.add(24);

    list.add(24);

    list.add(24);

    list.add(24);
    System.out.println(list);
    for(int i=0;i<5;i++)
    {
        list.add(sc.nextInt());//to take input
    }
    for(int i=0;i<5;i++)
    {
        System.out.println(list.get(i));//pass index here,list[index] doesnt work here
    }

}
}