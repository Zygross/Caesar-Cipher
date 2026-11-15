import java.util.Scanner;
class CaesarCipherEncriptor
{
    public static void main ()
    {
        String k="";char gh;
        Scanner br=new Scanner (System.in);
        System.out.println ("Enter the text");
        String s= br.nextLine ();
        s=s.toUpperCase();
        int len=s.length();
        for (int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            int t=ch;
            
             if(ch>='A'&&ch<='W')
            {
                t+=3;
                k+=(char)t;
            }
            if (ch=='Z')
            {
                gh='C';
                k+=gh;
            }
            if (ch=='Y')
            {
                gh='B';
                k+=gh;
            }
            if(ch=='X')
            {
                gh='A';
                k+=gh;
            }
            if(ch==' ')
            {
               k+='@'; 
            }
        }
        System.out.println (k);
    }
}