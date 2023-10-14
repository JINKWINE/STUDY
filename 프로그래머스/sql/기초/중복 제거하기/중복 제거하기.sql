-- 코드를 입력하세요
SELECT COUNT(DISTINCT NAME)
FROM ANIMAL_INS

COUNT(*)
  조회된 전체행 건수 반환
COUNT(COLUMN)
  컬럼의 값이 NULL 인 행은 카운트 제외
COUNT(DISTINCT COLUMN)
  컬럼 값 중복 과 NULL 제거
