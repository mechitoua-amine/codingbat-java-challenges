package code.codingbat.warmup1;

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
public class MonkeyTrouble {

    public static void main(String[] args) {
        if (monkeyTrouble(true, true))
            System.out.println("true");
        if (!monkeyTrouble(false, false))
            System.out.println("false");
        if (monkeyTrouble(true, false) == false)
            System.out.println("false");
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || !(aSmile || bSmile) ? true : false;
    }
}
