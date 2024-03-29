
import java.util.Scanner;

//다음에 올 숫자
//반드시 등차수열 혹은 등비수열을 갖는 배열 common[] 의 다음에 올 숫자값 구하기
public class basic14 {

    public int solution(int[] common) {
        
        int tol = 0; //공차
        int com = 0; //공비
        int answer = 0;


         if(common.length > 2 && common.length <1000){

            //등차수열 일 때
            if(common[1]-common[0] == common[2]-common[1]){
                tol = common[1]-common[0];
                answer = common[common.length-1]+tol;
            //등비수열 일 때
            }else if(common[1]/common[0] == common[2]/common[1]){
                com = common[1]/common[0];
                answer = common[common.length-1]*com;
            }

         }else{
            System.out.println("등차수열인지 등비수열인지 판별 할 수 없습니다.");
         }

       
        return answer;
    }

}

