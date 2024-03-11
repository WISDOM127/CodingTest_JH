
//더 크게 합치기
/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환
 * 
 * a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수
 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 */
public class basic20 {
    public int solution(int a, int b) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(a).append(b);
        sb2.append(b).append(a);

        int res1 = Integer.parseInt(sb1.toString());
        int res2 = Integer.parseInt(sb2.toString());

        // if(res1>res2 || res1==res2) answer = res1;
        // else answer = res2;
    
        return res1>res2 || res1==res2 ? res1 : res2;
    }
}
