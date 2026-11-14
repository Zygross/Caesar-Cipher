import java.util.Scanner;
class CaesarCipher
{
    public static void main ()
    {
        String k="";char gh;
        Scanner br=new Scanner (System.in);
        System.out.println ("Enter the text");
        String s= br.nextLine ();
        s=s.toUpperCase();
        System.out.println(s);
        int len=s.length();
        for (int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            int t=ch;
             if(ch>='A'&&ch<='W')
            {
                t=+3;
                k+=(char)t;
            }
            if (t==90)
            {
                gh='C';
                k+=gh;
            }
            if (t==89)
            {
                gh='B';
                k+=gh;
            }
            if(t==88)
            {
                gh='A';
                k+=gh;
            }
       
        }
        System.out.println (k);
    }
}