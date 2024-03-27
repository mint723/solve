import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            String nums = br.readLine();
            String[] numArr = nums.split(" ");
            int firstNum = Integer.parseInt(numArr[0]);
            int secondNum = Integer.parseInt(numArr[1]);
            BigInteger sF = new BigInteger("1");
            BigInteger mF = new BigInteger("1");
            for(int j=secondNum; j>(secondNum-firstNum); j--){
                sF=sF.multiply(new BigInteger(String.valueOf(j)));
            }
            for(int k=firstNum; k>0; k--){
                mF=mF.multiply(new BigInteger(String.valueOf(k)));
            }
            System.out.println(sF.divide(mF));
        }
        
        br.close();
    }
}