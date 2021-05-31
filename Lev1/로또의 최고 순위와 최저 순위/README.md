<h3>문제</h3>
<p>
민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수
알아볼 수 없는 번호를 0
최저 순위와 최고 순위는?
</p>
<h3>풀이</h3>
<p>
  1. lottos와 win_nums를 오름차순으로 정렬. <br>
  2. for문으로 lottos에서 0의 개수를 cnt 변수에 담기 <br>
  3. 0을 제외한 lotto를 새로운 배열 lottos2에 담기.<br>
  4. lottos2와 win_nums와 비교해 중복된 수가 몇개인지 세기(nums) <br>
  5. 최고 개수: nums+cnt <br>
     최저 개수: nums<br>
  => 개수가 6이면 1, 5면 2, .... 
  
</p>
