import java.util.Arrays;
import java.io.*;
class nospace
{
 public static void main(String ar[])throws IOException
{
 DataInputStream d=new DataInputStream(System.in);
 System.out.println("Enter the sizes of 2 array:");
 int m=Integer.parseInt(d.readLine());
 int n=Integer.parseInt(d.readLine());
 int a[]=new int[m],t;
 int b[]=new int[n];
 System.out.println("___");
 for(int i=0;i<m;i++)
  a[i]=Integer.parseInt(d.readLine());
 System.out.println("___");
 for(int i=0;i<n;i++)
  b[i]=Integer.parseInt(d.readLine());
 //Arrays.sort(a);
 //Arrays.sort(b); 
 for(int i=0;i<m;i++)
  for(int j=0;j<=i&&j<n;j++)
    if(b[j]<a[i])
     {
       t=a[i];
       a[i]=b[j];
       b[j]=t;
     }
 Arrays.sort(b);
  System.out.println("__ANSWER__");
 for(int k :a)
  System.out.println(k);
  System.out.println("___");
 for(int k :b)
  System.out.println(k);
}}
 
 