package session1;
import java.util.*;

public class Vaccincenter {
	//String arr[] = {"yash","divyansh","uvais","harsh","anshul","shaaran","ankit"};
	public static void lineB(String name)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please show me your AADHAR CARD.");
		System.out.print("Your reply -> ");
		String iu = sc.next();
		System.out.println("Ok come here and wait in the line for about " + Math.floor((Math.random()*15)+3) + " minutes.");
		System.out.print("Your reply -> ");
		String lk=sc.next();
		System.out.println(name + " i think you forgot that you have booked a slot.");
		System.out.print("Your reply -> ");
		String asd = sc.next();
		System.out.println("Ok, it's fine.Just wait for " + Math.floor((Math.random()*20)+5)+ " minutes. Then it will be your turn.");
		System.out.print("Your reply -> ");
		String hjk = sc.next();
		System.out.println(name + " come here, now it's your turn.");
		System.out.print("Your reply -> ");
		String kio = sc.next();
		System.out.println("-------------------------------CONGRATULATIONS! SUCCESSFULLY VACCINTAED!------------------------------");
	}
	
	public static void counter10(Vector<String> v)
	{
		System.out.println("-------------counter 10---------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Yeah just wait here!");
		System.out.print("Your reply -> ");
		String ls = sc.next();
		System.out.print("Ok. I am booking a slot for COVACCINE.So, tell me your full name?");
		String name = sc.next();
		name = name.toUpperCase();
		int count=0;
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i).equalsIgnoreCase(name))
			{
				count++;
				break;
			}
		}
		
		int rount=0;
		if(count>0)
		{
			System.out.println("Your name is already registered. Please go to line B ");
			lineB(name);
		}
		else if(count == 0)
		{
			v.add(name);
			System.out.println("Now, i've booked a slot for you. So, now go and join line B");
			System.out.print("Tour reply -> ");
			String awe = sc.next();
			lineB(name);
		}
		else
		{
			rount++;
			System.out.println("ERROR! I think you have wrongly spelled your name. Just go back and come again and just check your name again from the AADHAR CARD.");
			counter10(v);
		}
		
		if(rount==2)
		{
			System.out.println("ERROR AGAIN!I think you should come again later.Bye");
			System.out.print("Your reply -> ");
			String yt = sc.next();
		}
	}
	
	public static void counter9(Vector<String> v)
	{
		System.out.println("-------------counter 9------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Yeah just wait here!");
		System.out.print("Your reply -> ");
		String ls = sc.next();
		System.out.println("Ok. I am booking a slot for COVISHIELD.So, tell me your full name?");
		String name = sc.next();
		name = name.toUpperCase();
		int count=0;
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i).equalsIgnoreCase(name))
			{
				count++;
				break;
			}
		}
		
		int rount=0;
		if(count>0)
		{
			System.out.println("Your name is already registered. Please go to line B ");
			lineB(name);
		}
		else if(count == 0)
		{
			v.add(name);
			System.out.println("Now, i've booked a slot for you. So, now go and join line B");
			System.out.print("Tour reply -> ");
			String awe = sc.next();
			lineB(name);
		}
		else
		{
			rount++;
			System.out.println("ERROR! I think you have wrongly spelled your name. Just go back and come again and just check your name again from the AADHAR CARD.");
			counter10(v);
		}
		
		if(rount==2)
		{
			System.out.println("ERROR AGAIN!I think you should come again later.Bye");
			System.out.print("Your reply -> ");
			String yt = sc.next();
		}
}

	public static void counter7(Vector<String> v)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------counter 7-----------");
		System.out.println("Yeah, come here!");
		System.out.print("Your reply -> ");
		String rere = sc.next();
		System.out.println("Ok. So I am booking a slot for you.");
		System.out.println("By the way, which one do you want to get: COVISHIELD(1) or COVACCINE(0)");
		int ke = sc.nextInt();
		int dount=0;
		if(ke == 1)
		{
			System.out.println("Ok. Go to counter 9");
			counter9(v);
		}
		else if(ke == 0)
		{
			System.out.println("Ok. Go to counter 10");
			counter10(v);
		}
		else
		{
			dount++;
			System.out.println("No such vaccine available. Sorry! Try again.");
			counter7(v);
		}
		if(dount==2)
		{
			System.out.println("ERROR AGAIN!I think you should come again later.Bye");
			System.out.print("Your reply -> ");
			String yt = sc.next();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello! Everyone. Welcome to the vaccine center");
	System.out.println("Make seperate lines on the basis of whether your name is registered or not.");
	System.out.print("Your reply -> ");
	String r = sc.next();
	System.out.println("A line -> registered ; B line -> non - registered");
	System.out.println("So have you booked a slot for the vaccine?");
	System.out.println("YES(1) or NO(0)");
	int re = sc.nextInt();
	Vector<String> v =new Vector<String>();
	v.add("DIVYANSH");
	v.add("YASH");
	v.add("UVAIS");
	v.add("HARSH");
	v.add("ANSHUL");
	v.add("SHAARAN");
	v.add("ANKIT");
	//String arr[] = {"yash","divyansh","uvais","harsh","anshul","shaaran","ankit"};
	if(re==0)
	{
		System.out.println("OK no issue's. Just go to counter 7 there , they will book you the slot for the same.");
		System.out.println("Your reply: ");
		String rep = sc.next();
		counter7(v);
	}
	else if(re==1)
	{
		System.out.println("Ok. Then which COVISHIELD(0) or COVACCINE(1)?");
		int qws = sc.nextInt();
		if(qws == 0)
		{
			System.out.println("Ok, then go to counter 9");
			counter9(v);
		}
		else if(qws==1)
		{
			System.out.println("Ok, then go to counter 10");
			counter10(v);
		}
		else
		{
			System.out.println("If you just came here to roam. Then don't do this. Just go oustide. Now!");
		}
	}
	else
	{
		System.out.println("If you just came here to roam. Then don't do this. Just go oustide. Now!");
	}
	
	System.out.println("These are the one's who are successfully vaccinted today -> ");
	for(int i=0;i<v.size();i++)
	{
		System.out.print(v.get(i) + " ");

	}
}
}
