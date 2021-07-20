T1: ANIMAL_INS 
Features: ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE 
          동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부
          
T2: ANIMAL_OUTS
Features: ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME
          동물의 아이디, 생물 종, 입양일, 이름, 성별 및 중성화 여부
          
          
ANIMAL_OUTS 테이블의 ANIMAL_ID는 ANIMAL_INS의 ANIMAL_ID의 외래 키


관리자의 실수로 일부 동물의 입양일이 잘못 입력되었습니다. 
보호 시작일보다 입양일이 더 빠른 동물의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 
이때 결과는 보호 시작일이 빠른 순으로 조회해야합니다.
