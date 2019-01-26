package string;
import java.util.*;
public class Software {
	Scanner in;
	Software()
	{
		in=new Scanner(System.in);
		System.out.println("***************WELCOME TO SALARY SLIP PORTAL***************");
	}
	public static void main(String[] args) {
		Software ob=new Software();
		String Data[][]= {{"101","A","Engineer","20000","3000","1200"},
				{"102","B","Software engineer","25000","5000","2500"},
				{"103","C","Clerk","28500","2500","1000"},
				{"104","D","Programmer","21000","3000","1200"},
				{"105","E","Software engineer","25450","5000","2500"},
				{"106","F","Manager","40000","12000","3500"},
				{"107","G","Engineer","21000","3000","1200"}
		};
		String Data2[][]= {{"Engineer","e","2200"},
				{"Software engineer","s","2500"},
				{"Clerk","c","1800"},
				{"Programmer","p","3200"},
				{"Manager","m","4000"},
				{"Software engineer","s","2500"},
				{"Engineer","e","2200"}
			};
		String Shop[][]= {{"Jeans","1500"},
				{"Jacket","2000"},
				{"Blazer","4000"},
				{"Shirt","1200"},
				{"Huddy","1800"}
			};
		Scanner inp=new Scanner(System.in);
		String panel[]= {"shivamgupta9","shivam"};
		for(int a=0;a<3;a++)
		{
		System.out.println("Enter the username :");
		String username=inp.next();
		System.out.println("Enter the password :");
		String password=inp.next();
		if(username.equals(panel[0]) && password.equals(panel[1]))
		{
			System.out.println("Enter your employ number to search your salary slip :");
			String id=inp.next();
			switch(id)
			{
			case "101":
				System.out.println("**********SALARY SLIP**********");
				System.out.println("DESGINATION --> "+Data[0][2]);
				System.out.println("Basic = "+Data[0][3]);
				System.out.println("HRA = "+Data[0][4]);
				System.out.println("IT = "+Data[0][5]);
				System.out.println("DA = "+Data2[0][2]);
				float B,H,I,D;
				double gs,g;
				B=Integer.parseInt(Data[0][3]);
				H=Integer.parseInt(Data[0][4]);
				I=Integer.parseInt(Data[0][5]);
				D=Integer.parseInt(Data2[0][2]);
				gs=B+H+D-I;
				System.out.println("Gross Salary : "+gs);
				g=(20.0/100.0)*gs;
				System.out.println("20% of your salary is "+g);
				if(g<B)
				{
					int ch;
					do
					{
					System.out.println("*******You have enough money to do shopping*******");
					System.out.println("1. Jeans");
					System.out.println("2. Jacket");
					System.out.println("3. Blazer");
					System.out.println("4. Shirt");
					System.out.println("5. Huddy");
					System.out.println("6. Exit");
					System.out.println("Enter your choice : ");
					ch=inp.nextInt();
					switch(ch)
					{
					case 1:
						int p=Integer.parseInt(Shop[0][1]);
						if(p<g)
						{
							System.out.println("*****Item purchased*****");
							g -= p;
							System.out.println("Available balance : "+g);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
														
							
						}
						break;
					case 2:
						int p1=Integer.parseInt(Shop[1][1]);
						if(p1<g)
						{
							System.out.println("*****Item purchased*****");
							g -= p1;
							System.out.println("Available balance : "+g);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 3:
						int p2=Integer.parseInt(Shop[2][1]);
						if(p2<g)
						{
							System.out.println("*****Item purchased*****");
							g-=p2;
							System.out.println("Available balance : "+g);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 4:
						int p3=Integer.parseInt(Shop[3][1]);
						if(p3<g)
						{
							System.out.println("*****Item purchased*****");
							g-=p3;
							System.out.println("Available balance : "+g);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 5:
						int p4=Integer.parseInt(Shop[4][1]);
						if(p4<g)
						{
							System.out.println("*****Item purchased*****");
							g-=p4;
							System.out.println("Available balance : "+g);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 6:
						System.out.println("Balance left : "+g);
						System.out.println("**********Thank you for shopping**********");
						break;
				   }
					}while (ch != 6);
				}
				else
				{
					System.out.println("*****20% of salary has been deposited in the bank*****");
				}
				break;
			case "102":
				System.out.println("**********SALARY SLIP**********");
				System.out.println("DESGINATION --> "+Data[1][2]);
				System.out.println("Basic = "+Data[1][3]);
				System.out.println("HRA = "+Data[1][4]);
				System.out.println("IT = "+Data[1][5]);
				System.out.println("DA = "+Data2[1][2]);
				float B1,H1,I1,D1;
				double gs1,g1;
				B1=Integer.parseInt(Data[1][3]);
				H1=Integer.parseInt(Data[1][4]);
				I1=Integer.parseInt(Data[1][5]);
				D1=Integer.parseInt(Data2[2][2]);
				gs1=B1+H1+D1-I1;
				System.out.println("Gross Salary : "+gs1);
				g1=(20.0/100.0)*gs1;
				System.out.println("20% of your salary is "+g1);
				if(g1<B1)
				{
					int ch1;
					do
					{
					System.out.println("*******You have enough money to do shopping*******");
					System.out.println("1. Jeans");
					System.out.println("2. Jacket");
					System.out.println("3. Blazer");
					System.out.println("4. Shirt");
					System.out.println("5. Huddy");
					System.out.println("6. Exit");
					System.out.println("Enter your choice : ");
					ch1=inp.nextInt();
					switch(ch1)
					{
					case 1:
						int p=Integer.parseInt(Shop[0][1]);
						if(p<g1)
						{
							System.out.println("*****Item purchased*****");
							g1-=p;
							System.out.println("Available balance : "+g1);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 2:
						int p1=Integer.parseInt(Shop[1][1]);
						if(p1<g1)
						{
							System.out.println("*****Item purchased*****");
							g1-=p1;
							System.out.println("Available balance : "+g1);
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 3:
						int p2=Integer.parseInt(Shop[2][1]);
						if(p2<g1)
						{
							System.out.println("*****Item purchased*****");
							g1-=p2;
							System.out.println("Available balance : "+g1);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 4:
						int p3=Integer.parseInt(Shop[3][1]);
						if(p3<g1)
						{
							System.out.println("*****Item purchased*****");
							g1-=p3;
							System.out.println("Available balance : "+g1);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 5:
						int p4=Integer.parseInt(Shop[4][1]);
						if(p4<g1)
						{
							System.out.println("*****Item purchased*****");
							g1-=p4;
							System.out.println("Available balance : "+g1);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 6:
						System.out.println("Balance left : "+g1);
						System.out.println("**********Thank you for shopping**********");
						break;
				   }
					}while(ch1 != 6);
				}
				else
				{
					System.out.println("*****20% of salary has been deposited in the bank*****");
				}
				break;
			case "103":
				System.out.println("**********SALARY SLIP**********");
				System.out.println("DESGINATION --> "+Data[2][2]);
				System.out.println("Basic = "+Data[2][3]);
				System.out.println("HRA = "+Data[2][4]);
				System.out.println("IT = "+Data[2][5]);
				System.out.println("DA = "+Data2[2][2]);
				float B2,H2,I2,D2;
				double g2,gs2;
				B2=Integer.parseInt(Data[2][3]);
				H2=Integer.parseInt(Data[2][4]);
				I2=Integer.parseInt(Data[2][5]);
				D2=Integer.parseInt(Data2[2][2]);
				gs2=B2+H2+D2-I2;
				System.out.println("Gross Salary : "+gs2);
				g2=(20.0/100.0)*gs2;
				System.out.println("20% of your salary is "+g2);
				if(g2<B2)
				{
					int ch1;
					do
					{
					System.out.println("*******You have enough money to do shopping*******");
					System.out.println("1. Jeans");
					System.out.println("2. Jacket");
					System.out.println("3. Blazer");
					System.out.println("4. Shirt");
					System.out.println("5. Huddy");
					System.out.println("6. Exit");
					System.out.println("Enter your choice : ");
					ch1=inp.nextInt();
					switch(ch1)
					{
					case 1:
						int p=Integer.parseInt(Shop[0][1]);
						if(p<g2)
						{
							System.out.println("*****Item purchased*****");
							g2-=p;
							System.out.println("Available balance : "+g2);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 2:
						int p1=Integer.parseInt(Shop[1][1]);
						if(p1<g2)
						{
							System.out.println("*****Item purchased*****");
							g2-=p1;
							System.out.println("Available balance : "+g2);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 3:
						int p2=Integer.parseInt(Shop[2][1]);
						if(p2<g2)
						{
							System.out.println("*****Item purchased*****");
							g2-=p2;
							System.out.println("Available balance : "+g2);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 4:
						int p3=Integer.parseInt(Shop[3][1]);
						if(p3<g2)
						{
							System.out.println("*****Item purchased*****");
							g2-=p3;
							System.out.println("Available balance : "+g2);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 5:
						int p4=Integer.parseInt(Shop[4][1]);
						if(p4<g2)
						{
							System.out.println("*****Item purchased*****");
							g2-=p4;
							System.out.println("Available balance : "+g2);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 6:
						System.out.println("Balance left : "+g2);
						System.out.println("**********Thank you for shopping**********");
						break;
				   }
					}while(ch1 !=6);
				}
				else
				{
					System.out.println("*****20% of salary has been deposited in the bank*****");
				}
				break;
			case "104":
				System.out.println("**********SALARY SLIP**********");
				System.out.println("DESGINATION --> "+Data[3][2]);
				System.out.println("Basic = "+Data[3][3]);
				System.out.println("HRA = "+Data[3][4]);
				System.out.println("IT = "+Data[3][5]);
				System.out.println("DA = "+Data2[3][2]);
				float B3,H3,I3,D3;
				double g3,gs3;
				B3=Integer.parseInt(Data[3][3]);
				H3=Integer.parseInt(Data[3][4]);
				I3=Integer.parseInt(Data[3][5]);
				D3=Integer.parseInt(Data2[3][2]);
				gs3=B3+H3+D3-I3;
				System.out.println("Gross Salary : "+gs3);
				g3=(20.0/100.0)*gs3;
				System.out.println("20% of your salary is "+g3);
				if(g3<B3)
				{
					int ch1;
					do
					{
					System.out.println("*******You have enough money to do shopping*******");
					System.out.println("1. Jeans");
					System.out.println("2. Jacket");
					System.out.println("3. Blazer");
					System.out.println("4. Shirt");
					System.out.println("5. Huddy");
					System.out.println("6. Exit");
					System.out.println("Enter your choice : ");
					ch1=inp.nextInt();
					switch(ch1)
					{
					case 1:
						int p=Integer.parseInt(Shop[0][1]);
						if(p<g3)
						{
							System.out.println("*****Item purchased*****");
							g3-=p;
							System.out.println("Available balance : "+g3);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 2:
						int p1=Integer.parseInt(Shop[1][1]);
						if(p1<g3)
						{
							System.out.println("*****Item purchased*****");
							g3-=p1;
							System.out.println("Available balance : "+g3);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 3:
						int p2=Integer.parseInt(Shop[2][1]);
						if(p2<g3)
						{
							System.out.println("*****Item purchased*****");
							g3-=p2;
							System.out.println("Available balance : "+g3);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 4:
						int p3=Integer.parseInt(Shop[3][1]);
						if(p3<g3)
						{
							System.out.println("*****Item purchased*****");
							g3-=p3;
							System.out.println("Available balance : "+g3);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 5:
						int p4=Integer.parseInt(Shop[4][1]);
						if(p4<g3)
						{
							System.out.println("*****Item purchased*****");
							g3-=p4;
							System.out.println("Available balance : "+g3);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 6:
						System.out.println("Balance left : "+g3);
						System.out.println("**********Thank you for shopping**********");
				   }
					}while(ch1 !=6);
				}
				else
				{
					System.out.println("*****20% of salary has been deposited in the bank*****");
				}
				break;
			case "105":
				System.out.println("**********SALARY SLIP**********");
				System.out.println("DESGINATION --> "+Data[4][2]);
				System.out.println("Basic = "+Data[4][3]);
				System.out.println("HRA = "+Data[4][4]);
				System.out.println("IT = "+Data[4][5]);
				System.out.println("DA = "+Data2[4][2]);
				float B4,H4,I4,D4;
				double g4,gs4;
				B4=Integer.parseInt(Data[4][3]);
				H4=Integer.parseInt(Data[4][4]);
				I4=Integer.parseInt(Data[4][5]);
				D4=Integer.parseInt(Data2[4][2]);
				gs4=B4+H4+D4-I4;
				System.out.println("Gross Salary : "+gs4);
				g4=(20.0/100.0)*gs4;
				System.out.println("20% of your salary is "+g4);
				if(g4<B4)
				{
					int ch1;
					do
					{
					System.out.println("*******You have enough money to do shopping*******");
					System.out.println("1. Jeans");
					System.out.println("2. Jacket");
					System.out.println("3. Blazer");
					System.out.println("4. Shirt");
					System.out.println("5. Huddy");
					System.out.println("6. Exit");
					System.out.println("Enter your choice : ");
					ch1=inp.nextInt();
					switch(ch1)
					{
					case 1:
						int p=Integer.parseInt(Shop[0][1]);
						if(p<g4)
						{
							System.out.println("*****Item purchased*****");
							g4-=p;
							System.out.println("Available balance : "+g4);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 2:
						int p1=Integer.parseInt(Shop[1][1]);
						if(p1<g4)
						{
							System.out.println("*****Item purchased*****");
							g4-=p1;
							System.out.println("Available balance : "+g4);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 3:
						int p2=Integer.parseInt(Shop[2][1]);
						if(p2<g4)
						{
							System.out.println("*****Item purchased*****");
							g4-=p2;
							System.out.println("Available balance : "+g4);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 4:
						int p3=Integer.parseInt(Shop[3][1]);
						if(p3<g4)
						{
							System.out.println("*****Item purchased*****");
							g4-=p3;
							System.out.println("Available balance : "+g4);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 5:
						int p4=Integer.parseInt(Shop[4][1]);
						if(p4<g4)
						{
							System.out.println("*****Item purchased*****");
							g4-=p4;
							System.out.println("Available balance : "+g4);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 6:
						System.out.println("Balance left : "+g4);
						System.out.println("**********Thank you for shopping**********");
						break;
				   }
					}while(ch1 !=6);
				}
				else
				{
					System.out.println("*****20% of salary has been deposited in the bank*****");
				}
				break;
			case "106":
				System.out.println("**********SALARY SLIP**********");
				System.out.println("DESGINATION --> "+Data[5][2]);
				System.out.println("Basic = "+Data[5][3]);
				System.out.println("HRA = "+Data[5][4]);
				System.out.println("IT = "+Data[5][5]);
				System.out.println("DA = "+Data2[5][2]);
				float B5,H5,I5,D5;
				double g5,gs5;
				B5=Integer.parseInt(Data[5][3]);
				H5=Integer.parseInt(Data[5][4]);
				I5=Integer.parseInt(Data[5][5]);
				D5=Integer.parseInt(Data2[5][2]);
				gs5=B5+H5+D5-I5;
				System.out.println("Gross Salary : "+gs5);
				g5=(20.0/100.0)*gs5;
				System.out.println("20% of your salary is "+g5);
				if(g5<B5)
				{
					int ch1;
					do
					{
					System.out.println("*******You have enough money to do shopping*******");
					System.out.println("1. Jeans");
					System.out.println("2. Jacket");
					System.out.println("3. Blazer");
					System.out.println("4. Shirt");
					System.out.println("5. Huddy");
					System.out.println("6. Exit");
					System.out.println("Enter your choice : ");
					ch1=inp.nextInt();
					switch(ch1)
					{
					case 1:
						int p=Integer.parseInt(Shop[0][1]);
						if(p<g5)
						{
							System.out.println("*****Item purchased*****");
							g5-=p;
							System.out.println("Available balance : "+g5);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 2:
						int p1=Integer.parseInt(Shop[1][1]);
						if(p1<g5)
						{
							System.out.println("*****Item purchased*****");
							g5-=p1;
							System.out.println("Available balance : "+g5);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 3:
						int p2=Integer.parseInt(Shop[2][1]);
						if(p2<g5)
						{
							System.out.println("*****Item purchased*****");
							g5-=p2;
							System.out.println("Available balance : "+g5);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 4:
						int p3=Integer.parseInt(Shop[3][1]);
						if(p3<g5)
						{
							System.out.println("*****Item purchased*****");
							g5-=p3;
							System.out.println("Available balance : "+g5);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 5:
						int p4=Integer.parseInt(Shop[4][1]);
						if(p4<g5)
						{
							System.out.println("*****Item purchased*****");
							g5-=p4;
							System.out.println("Available balance : "+g5);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 6:
						System.out.println("Balance left : "+g5);
						System.out.println("**********Thank you for shopping**********");
						break;
				   }
					}while(ch1 !=6);
				}
				else
				{
					System.out.println("*****20% of salary has been deposited in the bank*****");
				}
				break;
			case "107":
				System.out.println("**********SALARY SLIP**********");
				System.out.println("DESGINATION --> "+Data[6][2]);
				System.out.println("Basic = "+Data[6][3]);
				System.out.println("HRA = "+Data[6][4]);
				System.out.println("IT = "+Data[6][5]);
				System.out.println("DA = "+Data2[6][2]);
				float B6,H6,I6,D6;
				double g6,gs6;
				B6=Integer.parseInt(Data[6][3]);
				H6=Integer.parseInt(Data[6][4]);
			    I6=Integer.parseInt(Data[6][5]);
				D6=Integer.parseInt(Data2[6][2]);
				gs6=B6+H6+D6-I6;
				System.out.println("Gross Salary : "+gs6);
				g6=(20.0/100.0)*gs6;
				System.out.println("20% of your salary is "+g6);
				if(g6<B6)
				{
					int ch1;
					do
					{
					System.out.println("*******You have enough money to do shopping*******");
					System.out.println("1. Jeans");
					System.out.println("2. Jacket");
					System.out.println("3. Blazer");
					System.out.println("4. Shirt");
					System.out.println("5. Huddy");
					System.out.println("6. Exit");
					System.out.println("Enter your choice : ");
					ch1=inp.nextInt();
					switch(ch1)
					{
					case 1:
						int p=Integer.parseInt(Shop[0][1]);
						if(p<g6)
						{
							System.out.println("*****Item purchased*****");
							g6-=p;
							System.out.println("Available balance : "+g6);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 2:
						int p1=Integer.parseInt(Shop[1][1]);
						if(p1<g6)
						{
							System.out.println("*****Item purchased*****");
							g6-=p1;
							System.out.println("Available balance : "+g6);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 3:
						int p2=Integer.parseInt(Shop[2][1]);
						if(p2<g6)
						{
							System.out.println("*****Item purchased*****");
							g6-=p2;
							System.out.println("Available balance : "+g6);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 4:
						int p3=Integer.parseInt(Shop[3][1]);
						if(p3<g6)
						{
							System.out.println("*****Item purchased*****");
							g6-=p3;
							System.out.println("Available balance : "+g6);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 5:
						int p4=Integer.parseInt(Shop[4][1]);
						if(p4<g6)
						{
							System.out.println("*****Item purchased*****");
							g6-=p4;
							System.out.println("Available balance : "+g6);
							
						}
						else
						{
							System.out.println("*****You have insufficient balance to buy this product*****");
							
						}
						break;
					case 6:
						System.out.println("Balance left : "+g6);
						System.out.println("**********Thank you for shopping**********");
						
						break;
				   }
					}while(ch1 !=6);
				}
				else
				{
					System.out.println("You don't have money for shopping");
					System.out.println("*****20% of salary has been deposited in the bank*****");
				}
				break;
				}
			break;
		}
		else
		{
			System.out.println("login failed....you have only "+(2-a) +" tries");
		}
	 }
  }
}
