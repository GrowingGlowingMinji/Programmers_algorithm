<h3>문제</h3>
<p>
124 나라에는 자연수만 존재<br>
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용<br>
1, 2, 4를 사용하면서 자연수에 차례대로 붙임.<br>
  자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return<br>
</p>

<h3>풀이</h3>
<p>
  1. 무조건 수행 == 1의 자리수: n-1을 1로 나눴을 때<br>
  몫을 3으로 나눴을 때 <br>
  나머지가 0=> 1<br>
  나머지가 1=> 2<br>
  나머지가 2=> 4<br><br>
  2. 3뺐을 때 양수면 10의 자리수: n-3-1을 3으로 나눴을 때<br>
  몫을 3으로 나눴을 때<br>
  나머지가 0=> 1<br>
  나머지가 1=> 2<br>
  나머지가 2=> 4<br><br>
  3. 3+3^2뻈을 때 양수면 100의 자리수: n-3^2-3-1를 3^2로 나눴을 때<br>
  몫을 3으로 나눴을 때<br>
  나머지가 0=> 1<br>
  나머지가 1=> 2<br>
  나머지가 2=> 4<br><br>
  .<br>.<br>.<br>.<br>.<br>
  
  4. 3+3^2+....+3^a를 뻈을 때 양수면 10^a 자리수: n-(3+3^2+....+3^a)-1를 3^a로 나눴을 때<br>
   몫을 3으로 나눴을 때<br>
  나머지가 0=> 1<br>
  나머지가 1=> 2<br>
  나머지가 2=> 4<br><br>
  
  5. while문을 사용하여 3+3^2+....+3^a 가 양수일 때 무한 반복.
</p>
