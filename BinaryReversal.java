public class BinaryReversal{
  
    public static String reversal(String str){
        String s = Integer.toBinaryString(Integer.parseInt(str));
        StringBuilder result = new StringBuilder();
        int N = s.length();
        for(int i = N-1; i>=0; i--)
           result.append(s.charAt(i));
        if(N%8 > 0){
           for(int i = 0;i < (8-N%8); i++){
               result.append("0");
           }
        }   
        //System.out.println(result.toString());
        str = Integer.toString(Integer.parseInt(result.toString(),2));
        return str;
    }


    public static void main (String[] args) {  
        // keep this function call here     
        String str = "47";
        System.out.println(reversal(str)); 
  }
 }


