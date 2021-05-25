배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수

매개변수: 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands
commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return

__________________________________________________________________

commands.length

list sort메서드를 사용하여 sort
get(index)메서드를 사용해 k번째 수를 answer array에 입력.

for 문으로 각 array 요소 별 위 과정 반복.
