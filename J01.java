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
			System.out.println("�K�X��J����");
			System.out.print("�п�J�K�X:");
			str1=scanner.nextLine();
			System.out.print("�ЦA��J�@���K�X:");
			str2=scanner.nextLine();
			if(str2.equals(str1)) 
			{
				System.out.println("�K�X���T");
				System.out.print("�ЦA��J�@���K�X:");
				str3=scanner.nextLine();
				if(str3.equals(str1))
				{
					System.out.println("�K�X���T");
				}
			}
			else
			{
				System.out.println("�P�Ĥ@����J���P!");
				num=num+1;
			}
			if(num==1)
			{
				System.out.print("�ЦA��J�@���K�X:");
				str3=scanner.nextLine();
				if(str3.equals(str1))
				{
					System.out.println("�K�X���T");
				}
				else
				{
					System.out.println("�P�Ĥ@����J���P!");
					num=num+1;
				}
			}
			if(num==2)
			{
				System.out.print("�ЦA��J�@���K�X:");
				str4=scanner.nextLine();
				if(str4.equals(str1))
				{
					System.out.println("�K�X���T");
				}
				else
				{
					throw new Aaaa();
				}
			}
		}
		catch(Aaaa e)
		{
			System.out.println("��J�T�����~!�{������!");
		}
	}

}
