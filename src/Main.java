public class Main
{

    public static void main(String[] args)
    {
	boolean monthRange = false;
    int birthMonth = 13;

    if (birthMonth >=1 && birthMonth <=12)
        {
            monthRange = true;
            System.out.println("Your birth month is:" + birthMonth);
        }
    else
        {
            monthRange = false;
            System.out.println("You entered an incorrect month value:" + birthMonth);
        }
    }
}
