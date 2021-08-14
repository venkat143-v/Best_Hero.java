import java.io.*;
class Best_Hero
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String hero1_Name,hero2_Name;
int hero1_hit,hero2_hit,hero1_avg,hero2_avg,hero1_flop,hero2_flop,hero1_Tot, hero2_Tot;
System.out.println("Enter hero1 details");
hero1_Name=br.readLine();
hero1_hit=Integer.parseInt(br.readLine());
hero1_avg=Integer.parseInt(br.readLine());
hero1_flop=Integer.parseInt(br.readLine());
System.out.println("Enter hero2 details");
hero2_Name=br.readLine();
hero2_hit=Integer.parseInt(br.readLine());
hero2_avg=Integer.parseInt(br.readLine());
hero2_flop=Integer.parseInt(br.readLine());
hero1_Tot=hero1_hit*10+hero1_avg*5+hero1_flop*-5;
hero2_Tot=hero2_hit*10+hero2_avg*5+hero2_flop*-5;
if(hero1_Tot>hero2_Tot)
 System.out.println(hero1_Name+" is the best Hero with "+hero1_Tot+" points");
else if(hero1_Tot<hero2_Tot)
 System.out.println(hero2_Name+" is the best Hero with "+hero2_Tot+" points");
else
 System.out.println(hero1_Name+" and "+hero2_Name+" are having equal points");
}
}