import java.util.Random;
/* Denna version tar och bara slumpar positioner i en array,
 * h�mtar ut datan fr�n den positionen och printar det f�r att
 * sedan radera den positionen f�r att man ska inte f� samma 
 * v�rde igen.
 */
import java.util.ArrayList;
public class uppgift16a 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> lotto = new ArrayList(35);
		int position;
		int arraySize;
		Random dice = new Random();
		
		//Populate array with values
		for(int i = 0; i < 35; i++)
		{
			lotto.add(i, (i + 1));
		}
		System.out.print("Lottorad: ");
		//Randomly take values from array, print them out and then delete them
		for(int j = 0; j < 7; j++)
		{
			arraySize = lotto.size();
			position = dice.nextInt(arraySize);
			System.out.print(lotto.get(position) + " ");
			lotto.remove(position);
			
		}
	}

}
