class scanning_double 
{
    private double float_num;
    double get()
    {
        return float_num;
    }
    void set (double x)
    {
        float_num = x;
    }
    public static void main(String args[])
    {
        //allocating space to non-static members
        scanning_double scan = new scanning_double();

        //allocating space to non-static members of SCANNER class
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Initial Value "+scan.get());
        System.out.print("Enter the number : ");
        scan.set(scanner.nextDouble());
        System.out.println("\nEntered number is : "+scan.get());
    }
}