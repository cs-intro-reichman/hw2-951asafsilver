// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void SingleHail(int seed,String mode) {//
        
        if (seed == 1) {
            System.out.println("1 4 2 1 (4)");
            return;
        }

        int originalSeed = seed; // שומרים את הערך ההתחלתי לטובת הדפסה
        String totalstring = seed + " "; // מחרוזת שתכיל את כל המספרים עד 1
        int count = 0; // סופר צעדים

        while (seed != 1) // עוצר כשהמספר מגיע לאחד
        { 
            if (seed % 2 == 0)// אם זוגי
            {
                seed = seed / 2;
            }
            else// אם אי זוגי
            { 
                // עבור מספרים גדולים, יש סיכוי לגלישה, אך נשמור על טיפוס int
                seed = seed * 3 + 1;
            }
            totalstring = totalstring + seed + " "; // מוסיף את המספר הנוכחי לרצף
            count++; // מעלה את ספירת השלבים
        }

        count++; 

        if (mode.equals("v"))// אם המצב הוא V
        {
            System.out.println(totalstring.trim() + " (" + count + ")");
        }
    }

    public static void main(String[] args) 
    {
        int starterSeed = Integer.parseInt(args[0]);//מקבל מצב ומספר 
        String mode = args[1];

        for (int i = 1; i <= starterSeed; i++) // N רץ פעמים
        {
            SingleHail(i, mode); //מריץ את הפונקציה
        } 
        
        // הדפסת שורת הסיכום )
        System.out.println("Every one of the first " + starterSeed + " hailstone sequences reached 1."); 
    }
}