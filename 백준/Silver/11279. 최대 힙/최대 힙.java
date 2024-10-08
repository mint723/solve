import java.io.*;
import java.util.*;

public class Main {
    
    static int[] heap = new int[100001]; // 힙 배열
    static int size = 0; // 힙의 크기
    
    public static void insert(int x){
        heap[++size] = x;
        int i = size;
        
        // 부모와 비교해서 더 크면 교환
        while(i>1 && heap[i] > heap[i / 2]){
            int temp = heap[i];
            heap[i] = heap[i/2];
            heap[i/2] = temp;
            i /= 2;
        }
    }
    
    public static int delete(){
        if(size == 0) return 0; 
        
        int max = heap[1]; 
        heap[1] = heap[size--];
        int i = 1;
        
        // 자식과 비교해서 더 작으면 교환
        while(i * 2 <= size){
            int child = i*2;
            if(child + 1 <= size && heap[child + 1] > heap[child]){
                child ++;
            }
            if(heap[i] >= heap[child]) break;
            
            int temp = heap[i];
            heap[i] = heap[child];
            heap[child] = temp;
            i = child;
        }
        return max;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            
            if(num == 0){
                System.out.println(delete());
            }else{
                insert(num);
            }
        }
        
        br.close();
    }
}