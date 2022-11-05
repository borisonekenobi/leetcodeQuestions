public class Solution {
    public string IntToRoman(int num) {
        string output = "";
        while (num > 0) {
            if (num - 1000 >= 0) {
                output += "M";
                num -= 1000;
            } else if (num - 900 < 100 && num - 900 >= 0) {
                output += "CM";
                num -= 900;
            } else if (num - 500 >= 0) {
                output += "D";
                num -= 500;
            } else if (num - 400 < 100 && num - 400 >= 0) {
                output += "CD";
                num -= 400;
            } else if (num - 100 >= 0) {
                output += "C";
                num -= 100;
            } else if (num - 90 < 10 && num - 90 >= 0) {
                output += "XC";
                num -= 90;
            } else if (num - 50 >= 0) {
                output += "L";
                num -= 50;
            } else if (num - 40 < 10 && num - 40 >= 0) {
                output += "XL";
                num -= 40;
            } else if (num - 10 >= 0) {
                output += "X";
                num -= 10;
            } else if (num - 9 == 0) {
                output += "IX";
                num -= 9;
            } else if (num - 5 >= 0) {
                output += "V";
                num -= 5;
            } else if (num - 4 == 0) {
                output += "IV";
                num -= 4;
            } else if (num - 1 >= 0) {
                output += "I";
                num--;
            }
        }
        return output;
    }
}