정수 배열 numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return
<HashSet 사용>: 중복 불가

1. 배열 중복 제거
- 배열 => HashSet
- 중복값은 따로 더해 최종 arr2에 미리 add.

2. for 문으로 두 수 합을 새로운 HashSet에 입력. => 중복 불가
3. HashSet을 Array로 변환
4. Array sort.
