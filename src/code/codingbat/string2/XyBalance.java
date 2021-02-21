package code.codingbat.string2;

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 * there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
 * but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given
 * string is xy-balanced.

 * xyBalance("aaxbby") → true
 * xyBalance("aaxbb") → false
 * xyBalance("yaaxbb") → false
 */

class XyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }

    public static boolean xyBalance(String str) {
        int lastX = str.lastIndexOf("y");
        int lastY = str.lastIndexOf("x");
        if (lastX == -1 && lastY == -1) return true;
        return (lastX > lastY);
    }
}
