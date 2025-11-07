// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args) { 
        int length = Integer.parseInt(args[0]);// אורך הפעולה
        boolean ispositive = true;
        int divide = 1; // המספר בו נחלק את 1
        double sum = 0; 
        for(int i = 0; i<length; i++)
        {
            if (ispositive)// מתחיל בלהוסיף לסכום
            {
                sum = sum + 1.0 / divide;
                ispositive = false;
            }
            else
            {
                sum = sum - 1.0 / divide; //מוריד לסכום לסירוגין
                ispositive = true;
            }
            divide = divide+2;
        }
                
        System.out.println("pi according to Java: "+Math.PI);
        
        System.out.println("pi, approximated:     "+ sum*4); 
    }
}