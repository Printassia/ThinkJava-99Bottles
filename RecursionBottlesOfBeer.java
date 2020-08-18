package Horsy.com.company;

/**
 *Think Java Exercise 5-5.
 * The purpose of this exercise is to take a problem and break it into smaller problems,
 * and to solve the smaller problems by writing simple methods. Consider the first verse
 * of the song “99 Bottles of Beer”:
 *
 * 99 bottles of beer on the wall,
 * 99 bottles of beer,
 * ya’ take one down, ya’ pass it around,
 * 98 bottles of beer on the wall.
 *
 * Subsequent verses are identical except that the number of bottles gets smaller by one
 * in each verse, until the last verse:
 * No bottles of beer on the wall,
 * no bottles of beer,
 * ya’ can’t take one down, ya’ can’t pass it around,
 * ’cause there are no more bottles of beer on the wall!
 * And then the song (finally) ends.
 * Write a program that displays the entire lyrics of “99 Bottles of Beer”.
 */
public class RecursionBottlesOfBeer {
    public static void main(String[] args) {
        zero(99);
    }

    public static void zero(int zeroNumber) {
        if (zeroNumber == 0) {
            System.out.println("No bottles of beer on the wall, \n" +
                    "no bottles of beer, \n" +
                    "ya' can't take one down, ya cant pass it around, \n" +
                    "cause there are no more bottles of beer on the wall! \n");
        } else {
            System.out.println(
                    zeroNumber + " bottles of beer on the wall, \n" +
                            zeroNumber + " bottles of beer, \n" +
                            "ya take one down, ya pass it around, \n" +
                            (zeroNumber - 1) + " bottles of beer on the wall! \n");
            zero(zeroNumber - 1);


        }
    }
}
