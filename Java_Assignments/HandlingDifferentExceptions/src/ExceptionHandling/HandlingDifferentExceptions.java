package ExceptionHandling;

import java.util.Scanner;
import java.lang.Exception;

/*
Problem link
https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/exception-handling-2-46f67551/
 */
public class HandlingDifferentExceptions
{
    static void solve(int[] arr) throws Exception
    {
        int ans=0;

        for(int i=0;i<10;i++)
            for(int j=i+1;j<10;j++)
                ans+=arr[i]/arr[j];

        throw new MyException(ans);
    }
    public static void main(String[] args)
    {
        try
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int []arr= new int[n];
            in.nextLine();
            for(int i=0;i<10;i++)
                arr[i]=Integer.parseInt(in.nextLine());

            String s=in.nextLine();
            System.out.println(s.charAt(10));

            solve(arr);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Invalid division");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Format mismatch");
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Index is invalid");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is invalid");
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Exception encountered");
        }
        finally
        {
            System.out.println("Exception Handling Completed");
        }
    }
}
class MyException extends Exception
{
    private final int param;
    MyException(int a)
    {
        param=a;
    }
    public String toString()
    {
        return "MyException["+param+"]";
    }
}