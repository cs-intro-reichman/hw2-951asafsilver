// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        
        String cheer = args[0];
        String uppercheer = cheer.toUpperCase(); // הופך את כל האותיות לגדולות
        int reps = Integer.parseInt(args[1]);
        int length = cheer.length(); // אורך המילה
        
        // המשתנה עם האותיות הדורשות "an"
        String AN_LETTERS = "AEFHILMNORSX"; 
        
        for (int i = 0; i < length; i++) // רץ על כל אות
        {
            char letter = uppercheer.charAt(i); // בוחן אות ספציפית
                        // אם האות נמצאת במחרוזת (כלומר, האינדקס שלה הוא 0 ומעלה)
            if (AN_LETTERS.indexOf(letter) >= 0) 
            {
                System.out.println("Give me an " + letter + ": " + letter + "!"); 
            } 
            else 
            {
                System.out.println("Give me a  " + letter + ": " + letter + "!"); 
            }
        }
        
        System.out.println("What does that spell?"); // הדפסה פעם אחת
        
        for (int i = 0; i < reps; i++) // כמספר החזרות
        {
            System.out.println(uppercheer + "!!!");
        }
    }
}