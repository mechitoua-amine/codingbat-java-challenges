package code.codingbat.warmup1;

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
public class Sleepin {
    public static void main(String[] args) {
        if (sleepIn(false, false)) {
            System.out.println("True");
        }
        if (!sleepIn(true, false)) {
            System.out.println("False");
        }
        if (sleepIn(false, true)) {
            System.out.println("True");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return weekday && !vacation ? false : true;
    }
}
