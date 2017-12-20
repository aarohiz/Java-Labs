import chn.util. *;
import java.util. *;
import java.util.ArrayList. *;
/**
 * This method uses java.util.Collections to shuffle original array and prints it out. It also calculates the sum of the first and last
 * elements of the array and prints it out. The method is executed 10 times in the main method.
 * 
 * We learn to use ArrayLists in this Lab
 * 
 * LAB 20.2
 *
 * @author (Aarohi Zade)
 * @version (12/16/2017)
 */
public class PermutationsTEST
{
    public static void main (String [] args)
    {
        ArrayList<Integer> orig = new ArrayList<Integer>(); //makes new ArrayList orig

        for (int num = 1; num < 11; num++)
        {
            orig.add(num); //adds numbers 1-10 to arrayList
        }
        Permutations p = new Permutations(); //calls Permutation methods

        for (int n = 0; n < 11; n++) //prints permutations 10 times
        {
            p.nextPermutation(orig); //calls method
            System.out.println(""); //prints spaces
        }
    }
}

