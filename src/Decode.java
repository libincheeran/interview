public class Decode {

    public int numDecodings(String s) {
        return numDecodings(s,0);
    }

    public int numDecodings(String s, int digit) {

        int sum = 0;

        if(s == null || s.isEmpty()) return 0;

        if( digit == 1 && s.length() == 1){
            int value = Integer.parseInt(s);
            if(value == 0){
                return 0;
            }else {
                return 1;
            }
        }

        if(digit ==2 && s.length() == 2){
            int value = Integer.parseInt(s);
            if(value < 10 || value > 26){
                return 0;
            } else {
                return 1;
            }
        }

        for(int i =0; i < s.length() ; i++ ){
            StringBuilder sb = new StringBuilder(s);
            StringBuilder s1 = sb.deleteCharAt(i);
            sum = numDecodings(s1.toString(),1);
            s+= numDecodings(s1.toString(),2);
        }

        return sum;

    }

    public static void main(String[] args) {
        Decode d = new Decode();
        d.numDecodings("12");
    }
}
