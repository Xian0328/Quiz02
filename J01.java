import java.util.*;
class Aaaa extends Exception
{}
public class J01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int num=0;
			String str1,str2,str3,str4;
			Scanner scanner=new Scanner(System.in);
			System.out.println("密碼輸入測試");
			System.out.print("請輸入密碼:");
			str1=scanner.nextLine();
			System.out.print("請再輸入一次密碼:");
			str2=scanner.nextLine();
			if(str2.equals(str1)) 
			{
				System.out.println("密碼正確");
				System.out.print("請再輸入一次密碼:");
				str3=scanner.nextLine();
				if(str3.equals(str1))
				{
					System.out.println("密碼正確");
				}
			}
			else
			{
				System.out.println("與第一次輸入不同!");
				num=num+1;
			}
			if(num==1)
			{
				System.out.print("請再輸入一次密碼:");
				str3=scanner.nextLine();
				if(str3.equals(str1))
				{
					System.out.println("密碼正確");
				}
				else
				{
					System.out.println("與第一次輸入不同!");
					num=num+1;
				}
			}
			if(num==2)
			{
				System.out.print("請再輸入一次密碼:");
				str4=scanner.nextLine();
				if(str4.equals(str1))
				{
					System.out.println("密碼正確");
				}
				else
				{
					throw new Aaaa();
				}
			}
		}
		catch(Aaaa e)
		{
			System.out.println("輸入三次錯誤!程式停止!");
		}
	}

}
