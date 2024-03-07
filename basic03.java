
//공배수

//number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if(number % n == 0 && number % m ==0) answer = 1;
        else answer = 0;

        return answer;
    }

    // public int solution(int number, int n, int m) {
    //     return number % n == 0 && number % m == 0 ? 1 : 0;
    // }
}