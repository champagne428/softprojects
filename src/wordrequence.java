import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
public class wordrequence {
    public static void main(String[] args)throws IOException
    {
        List<Integer> list=new ArrayList<>();
        DecimalFormat df=new DecimalFormat("######0.00"); 
        FileInputStream fip = new FileInputStream("D:/english.txt");
        InputStreamReader reader = new InputStreamReader(fip, "gbk");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }
        reader.close();
        fip.close();
        int i;
        String str=sb.toString();
        String M="abcdefghijklmnopqrstuvwxyz";
        String temp = "";
        char NUM[]=new char[A.length()];
        char zimu[]=new char[26];
        int X[]=new int[26];
        int MAX=0;
        zimu=M.toCharArray();
        for(int k=0;k<26;k++)
        {
            X[k]=0;
            for(i=0;i<str.length();i++)
            {
                NUM[i]=str.charAt(i);
                if(zimu[k]==NUM[i]||zimu[k]==ch(NUM[i]))
                {
                    X[k]++;
                }
            }
        }
        System.out.println("英文字母频率为:");
        double sum=0;
        for(i=0;i<25;i++)
            for(int k=0;k<25-i;k++)
            {
                if(X[k]<X[k+1])
                {
                    int temp2=X[k];
                    X[k]=X[k+1];
                    X[k+1]=temp2;
                    char temp3=Z[k];
                    zimu[k]=zimu[k+1];
                    zimu[k+1]=temp3;
                }
            }
        for(i=0;i<26;i++)
        {
            sum=sum+X[i];
        }

        for(i=0;i<26;i++)
        {
            double fre=(X[i])/sum*100;
            System.out.println(Z[i]+"字母频率为:"+df.format(fre)+"%");
        }
    }
    static char ch(char c)
    {
        if(!(c>=97&&c<=122))
            c+=32;
        return c;
    }
}
