
//조건에 맞게 수열 변환하기 3

/*
 * 자연수 k
 * 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
 * 변환을 마친 후의 arr를 return 하는 solution 함수
 */
public class basic19 {
    public int[] solution(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {

            if(k%2!=0){ 
                arr[i] = arr[i]*k;
            }else{
                arr[i] = arr[i]+k;
            }
           
        }
      
        return arr;
    }
}
