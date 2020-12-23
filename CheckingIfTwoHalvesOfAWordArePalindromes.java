import java.util.*;

public class CheckingIfTwoHalvesOfAWordArePalindromes
{
  public static void main(String [] args)
  {
    //Initializing Scanner functions
    Scanner input = new Scanner(System.in);
    //variable which decides whether or not the user wants to continue on with the game
    int playing = 0;
    //if "playing" is 0, then the palindrome program runs, or else the program stops if it is anything else.
    while (playing == 0)
    {
      //Asks the user for the word with an even length and stores it
       System.out.println("Enter a word/set of characters with an even number of characters:\t");
       String word = input.nextLine();
       //If the user doesn't want to use the program anymore, they enter "Quit!" into the word input box. The game stops because the running variable is false
       if (word.matches("Quit!"))
      {
        playing = 1;
        break;
       }
       else
       {
         playing = 0;
       }
       
       int wordMidpoint = word.length()/2;
       
       String firstHalf;
       String reverse1 = "";
       firstHalf = word.substring(0, wordMidpoint);
       System.out.println(firstHalf);
       
       String secondHalf;
       String reverse2 = ""; 
       secondHalf = word.substring(wordMidpoint, word.length());
       System.out.println(secondHalf);
        

       for (int i = firstHalf.length() - 1; i >= 0; i--)
       {
         reverse1 = reverse1 + firstHalf.charAt(i);
       }
       
       for (int x = secondHalf.length() - 1; x >= 0; x--)
       {
        reverse2 = reverse2 + secondHalf.charAt(x);
        }
         
       if (firstHalf.equals(reverse1) && secondHalf.equals(reverse2))
       {
       System.out.println("YES");
       }
       else
       {
       System.out.println("NO");
       }
    }
  }
}