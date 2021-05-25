배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거.
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지.


Main.java => 정확성 100%, 효율성 FAIL
1. Array => List
2. List.get(index)를 사용해서 값을 비교하고
List.remove(index)를 사용해 중복값을 제거한다.
3. List => Array

원인: ArrayList의 remove 메서드는 하나씩 list[a]=list[a+1] 하기 때문에
시간이 많이 걸린다.
해결: add메서드를 사용해 중복된 값을 추가하는 방식으로...



Main2.java => 정확성 100%, 효율성 PASS
1. Array에서 값을 비교.
2. 중복 값의 첫번째 값만 list에 add
3. List => Array
