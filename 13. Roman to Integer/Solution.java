class Solution {
    public int romanToInt(String s) {
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') digits[i] = 1;
            else if (s.charAt(i) == 'V') digits[i] = 5;
            else if (s.charAt(i) == 'X') digits[i] = 10;
            else if (s.charAt(i) == 'L') digits[i] = 50;
            else if (s.charAt(i) == 'C') digits[i] = 100;
            else if (s.charAt(i) == 'D') digits[i] = 500;
            else if (s.charAt(i) == 'M') digits[i] = 1000;
        }
        
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length - 1) {
                sum += digits[i];
            } else if (digits[i + 1] > digits[i]) {
                sum += digits[i + 1] - digits[i];
                i++;
            } else {
                sum += digits[i];
            }
        }
        return sum;
    }
}