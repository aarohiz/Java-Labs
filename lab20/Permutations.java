import java.util. *;
import java.util.Collections. *;
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
public class Permutations
{
    /**
     * This was a method I used to check the values at each position of the array. It does not get called in PermutationsTEST, however,
     * it is merely for reference.
     */
    public void printArray(ArrayList<Integer> orig)
    {
        for (int j = 0; j < orig.size(); j++)
        {
            System.out.println("Element at position" + j + "is" + orig.get(j));
        }
    }

    /**
     * This method makes a new ArrayList, perm, which stores the new values. It calls Math.random and adds them to rand. It also calcu-
     * lates the sum of both the first and last elements of the new ArrayList and prints them out. This method is for reference and does
     * not get called in PermutationsTEST
     */
    public void nextPermutation(ArrayList <Integer> orig)
    {
        ArrayList <Integer> perm = new ArrayList<Integer>();
        for (int i = 1; i == 10; i++)
        {
            int rand = (int)((i * Math.random()));
            perm.add(rand);
        }

        System.out.println(perm);
        int sum = (perm.get(perm.size() - 1) + perm.get(0));
        System.out.println("sum: " + sum);
    }

    /**
     * This method uses java.util.Collections to shuffle original array and prints it out. It also calculates the sum of the first and last
     * elements of the array and prints it out.
     */
    public void nextPermutations (ArrayList <Integer> orig)
    {
        Collections.shuffle(orig);
        System.out.println(orig);
        int sum = (orig.get(orig.size() - 1) + orig.get(0));
        System.out.println("sum: " + sum);
    }
    /**
    ''''''''''''|||||'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''|||||'''''''''''''''''''
    ''''''''''|||||||||'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''|||||'''''''''''''''''''
    ''''''''|||||||||||||'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''|||||'''''''''''''''''''
    ''''''||||||''''''|||||""'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''|||||'''''''''''''''''''
    '''''||||||''''''''||||||'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''|||||''''''''''''''||||'
    ''''||||||''''''''''||||||''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''|||||''''''''''''''||||'
    '''||||||'''''''''''||||||""''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''|||||'''''''''''''''''''
    '''|||||||||||||||||||||||""''''''''''||||||||'''''''''''''|||||'''''''''''|||||||||||||''|||||||||||||||||''||||'
    '''|||||||||||||||||||||||"""'''''''||||||||||||'''''''''''|||||'''''''''''|||||||||||||''|||||||||||||||||''||||'
    '''||||||''''''''''''|||||""'''''||||||''''''|||||'''''''''|||||||||||||'''|||''''''''||''|||||''''''''||||''||||'
    '''||||||''''''''''''|||||''''''|||||''''''''''||||''''''''||||||||||||||''|||''''''''||''|||||''''''''||||''||||'
    '''||||||''''''''''''|||||''''''|||||''''''''''||||''''''''|||||'''''''|||'|||''''''''||''|||||''''''''||||''||||'
    '''||||||''''''''''''|||||''''''|||||''''''''''||||''''''''|||||'''''''||''|||''''''''||''|||||''''''''||||''||||'
    '''||||||''''''''''''|||||''''''|||||''''''''''||||''''''' |||||'''''''''''|||''''''''||''|||||''''''''||||''||||'
    '''||||||''''''''''''|||||''''''|||||''''''''''||||''''''''|||||'''''''''''|||''''''''||' |||||''''''''||||''||||'
    '''||||||''''''''''''|||||""'''''||||||''''''||||||''''''''|||||'''''''''''|||''''''''||''|||||''''''''||||''||||'
    '''||||||''''''''''''|||||"""'''''''||||||||||||||||||||'''|||||'''''''''''|||||||||||||''|||||''''''''||||''||||'
    ''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
     */

}
