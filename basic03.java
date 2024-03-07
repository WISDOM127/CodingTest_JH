
//홀짝에 따라 다른 값 반환하기

//양의 정수 n이 매개변수로 주어질 때, 
//n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
//n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 함수
class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
           System.out.println("i : " + i);
            if(n%2!=0 && i%2!=0){ //홀수 : 합
                answer += i;        
            } else if(n%2==0 && i%2==0){  //짝수 : 제곱의 합
                answer += i*i;     
            }
        }        
        System.out.println(answer);
        return answer;

    }
}

