import java.util.*;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double studentSum = 0; // 학점 * 과목 평점
        double totalObjScore = 0; //과목 총 학점 (나누는 수)
        for(int i = 0; i<20; i++){
            String obj = br.readLine();
            String[] objs = obj.split(" ");
            double objScore = Double.parseDouble(objs[1]);
            
            if(objs[2].equals("A+")){
                studentSum+=4.5*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("A0")){
                studentSum+=4.0*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("B+")){
                studentSum+=3.5*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("B0")){
                studentSum+=3.0*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("C+")){
                studentSum+=2.5*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("C0")){
                studentSum+=2.0*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("D+")){
                studentSum+=1.5*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("D0")){
                studentSum+=1.0*objScore;
                totalObjScore+=objScore;
            }else if(objs[2].equals("F")){
                studentSum+=0*objScore;
                totalObjScore+=objScore;
            }
            
        }
        System.out.printf("%.7f",(studentSum/totalObjScore));
        
        br.close();
    }
}