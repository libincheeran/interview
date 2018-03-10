package libin;

public class SubString {


    public static void main(String[] args) {

        SubString sb = new SubString();
        System.out.println(sb.isSubString("defabef","afc"));
    }

    public boolean isSubString(String a1, String a2) {

        char[] s1Arr = a1.toCharArray();
        char[] s2Arr = a2.toCharArray();

        for(int i=0; (i + s2Arr.length) < s1Arr.length; i++){

            boolean match = true;

            for( int j = 0; j < s2Arr.length; j++){

                if( (i+j) >= s1Arr.length || s1Arr[i+j] != s2Arr[j]){
                    match = false;
                    break;
                }
            }

            if(match){
                return true;
            }
        }

        return false;
    }
}
