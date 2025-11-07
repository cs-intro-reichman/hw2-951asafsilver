// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void SingleHail(int seed,String mode) {//בניתי פונקציה שמקבלת מצב ומספר ועושה על המספר את הHAILSTORM
		String totalstring = seed + " "; // מחרוזת שתכיל את כל המספרים עד 1
		int count = 0; // סופר צעדים
		while (seed !=1) // עוצר כשהמספר מגיע לאחד
		{	
			if (seed%2==0)// אם זוגי
			{
				seed =seed/2;
			}
			else// אם אי זוגי
			{ 
			seed= seed*3 +1;
			}
			totalstring = totalstring + " "+ seed;// מוסיף את המספר הנוכחי לרצף
			count++; // מעלה את ספירת השלבים

		}
		if (mode.equals("v"))// אם המצב הוא V
		{
			System.out.println(totalstring + "(" + count +")");// מדפיס את המחרוזת עם כל המספרים שהיו
		}
	}
	public static void main(String[] args) 
	{
		int starterSeed = Integer.parseInt(args[0]);//מקבל מצב ומספר 
		String mode = args[1];
		for (int i=1; i<=starterSeed;i++) // N רץ פעמים
		{
			SingleHail(i, mode); //מריץ את הפונקציה
		} 
		System.out.println("Every one of the first " + starterSeed+   " hailstone sequences reached 1."); // מדפיס את השורה האחרונה

	}

}
