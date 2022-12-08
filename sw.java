class sw {
     public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a,b);
        System.out.println("the values of a and b are "+a+" "+b);
        
    }
    public static void swap(int a, int b)
    {
        int temp=0;//the swap function doesnt work because in java because there is call by value and not call by reference like in c.
        temp=a;//even if there are objects like Integer a=5; you cant swap it beacause it is like a final class which cant be modified. 
        a=b;
        b=temp;
    }
}
