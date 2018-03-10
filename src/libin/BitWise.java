package libin;

public class BitWise {

    public static void main(String[] args) {

        int n = 10;

        byte[] b = new byte[2];
        b[0] =127;
        b[n/8] = (byte) (b[n/8] | (1 << (n%8)));


        //System.out.println(b[0]);
        //System.out.println(b[1]);

        for(int i =0; i < b.length; i++){
            for (int j = 0; j < 8; j++) {
                if((b[i] & (1<<j)) == 0){
                    System.out.println(i*8+j);
                }
            }
        }
    }
}
