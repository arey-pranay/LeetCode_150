
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num >= 1000) {
            sb.append('M');
            num -= 1000;
        }
        while (num >= 900) {
            sb.append("CM");
            num -= 900;
        }
        while (num >= 500) {
            sb.append('D');
            num -= 500;
        }
        while (num >= 400) {
            sb.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            sb.append('C');
            num -= 100;
        }
        while (num >= 90) {
            sb.append("XC");
            num -= 90;
        }
        while (num >= 50) {
            sb.append('L');
            num -= 50;
        }
        while (num >= 40) {
            sb.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            sb.append('X');
            num -= 10;
        }
        while (num >= 9) {
            sb.append("IX");
            num -= 9;
        }
        while (num >= 5) {
            sb.append('V');
            num -= 5;
        }
        while (num >= 4) {
            sb.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            sb.append('I');
            num -= 1;
        }

        return sb.toString();
    }


}

// class Solution {
// public String intToRoman(int num) {
//         String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
//         String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
//         String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
//         String ths[]={"","M","MM","MMM"};        
//         return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
//     }
// };
