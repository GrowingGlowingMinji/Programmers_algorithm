문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.


1. 대소문자 구분해 두 list에 담기
String 대소문자 판별
Character.isUpperCase(s.charAt(0))
Character.isLowerCase(s.charAt(0))
2. 각각 정렬
3. 두 list 합치기, a
