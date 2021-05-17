2진수로 변환했을 때 1의 갯수가 같은 바로 다음 큰 숫자를 구해라.

이진수 변환 => toBinaryString() 메서드 사용
for문으로 charAt(int index)로 1의 개수를 세고
같은 1의 개수를 가지고 있는 2진수 중 파라미터값보다 큰 값일 때 break.



이진수 => 10진수 int num2To10 = Integer.parseInt(num2, 2);
문자열 -> 숫자 변환  Integer.parseInt()
숫자 -> 문자열 변환  Integer.toString()

_________________________________________________________________
bitCount() 1의 개수를 세어줌.

