import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class uppgift15 
{
	public static void main(String[] args) 
	{
		ArrayList randomSiffror = new ArrayList();
		Scanner inkommande = new Scanner(System.in);
		int tal = 1;
		int summa = 0;
		int counter;
		int forstaSiffra;
		int andraSiffra;
		boolean keepOnIt = true;
		
		//while loop f�r att samla in v�rden fr�n anv�ndaren. V�rdena summeras ocks� f�r att senare anv�ndas f�r att
		//ber�kna medelv�rdet.
		System.out.println("Mata in random siffor! Tryck 0 f�r att avsluta inmatningsfasen.");
		while(tal != 0)
		{
			
			try 
			{
				tal = inkommande.nextInt();
				
					summa = summa + tal;
					if(tal != 0)
					{
						randomSiffror.add(tal);
					}
					else
					{
						if(randomSiffror.size() < 1)
						{
							tal = 1;
							System.out.println("Tack och hej, leverpastej\n");
							System.exit(1);
						}
					}
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("Numbers retard! DO YOU USE THEM?!");
				System.exit(1);				
			}
			
			
			
		}
		//Inmatning av v�rden �r �ver, nu sorteras arrayen v�rdena i storleksordning i en for loop som k�rs tills den
		//har k�rt genom ett helt iteration utan att beh�vt flytta p� tal och d� bryts while loopen den sitter i.
		//V�rden printas ut p� sk�rmen
		counter = randomSiffror.size();
		if(counter == 1)
		{
			System.out.println("Fick bara ett v�rde, ie �r st�rsta och minsta talet " + randomSiffror.get(0) + " och medelv�rdet �r " + randomSiffror.get(0));
		}
		else
		{
			while(keepOnIt == true)
			{
				boolean swapped = false;
				for(int i = 0; i < (counter - 1); i++)
				{
					forstaSiffra = (Integer) randomSiffror.get(i);
					andraSiffra = (Integer) randomSiffror.get(i + 1);
				
					if(forstaSiffra > andraSiffra)
					{
						randomSiffror.set((i + 1), forstaSiffra);
						randomSiffror.set(i, andraSiffra);
						swapped = true;					
					}
					else
					{
						if(i == (counter - 2) && swapped == false)
						{
							keepOnIt = false;
						}					
					}
				}
			}
		
			System.out.println(randomSiffror);
			System.out.println("Dem tv� minsta siffor �r: " + randomSiffror.get(0) + " och " + randomSiffror.get(1));
			System.out.println("Dem tv� st�rsta siffor �r " + randomSiffror.get(counter - 2) + " och " + randomSiffror.get(counter - 1));
			System.out.println("Medelv�rdet �r " + ((double)summa / (double)randomSiffror.size()));
		}
	}

}
