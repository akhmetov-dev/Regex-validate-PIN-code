public class Solution {
    public static boolean validatePin(String pin) {
        if (pin.length() > 0) {
            try {
                Integer.parseInt(pin);
            } catch (NumberFormatException exception) {
                return false;
            }

            if (pin.charAt(0) == '-' || pin.charAt(0) == '+') return false;

            return pin.length() == 4 || pin.length() == 6;
        }
        return false;
    }
}
