public class Main {


    public static String print(int n) {

        String result ="";
        for(int i = 0 ; i < n/2; i++) {
            for(int j =n/2; j>i; j-- ){
                result+=" ";
            }
            for(int x=0; x<(i*2)+1; x++){
                result+="x";
            }
            result+="\n";
        }
        for(int i = 0 ; i < n; i++){
            result+="x";
        }
        result+="\n";
        for(int i = 0 ; i < n/2; i++) {
            for(int j =0; j<i+1; j++ ){
                result+=" ";
            }
            for(int x=n-2; x>(i*2); x--){
                result+="x";
            }
            result+="\n";
        }
        return result;
    }



    public static void main(String[] args){
        System.out.println(print(11));


    }

}
