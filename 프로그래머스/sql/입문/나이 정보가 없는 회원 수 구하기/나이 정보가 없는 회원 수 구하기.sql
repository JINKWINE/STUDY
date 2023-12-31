--정답--
SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO
WHERE AGE IS NULL

--note--
SELECT COUNT(USER_ID) AS USERS 
FROM USER_INFO 
WHERE AGE IS NULL:
--USER_ID를 조회한 후 AGE값이 NULL인 것을 찾기 때문에 AGE 컬럼의 값이 NULL인 것이 조회 가능

SELECT COUNT(AGE) AS USERS 
FROM USER_INFO 
WHERE AGE IS NULL:
--이미 NULL값을 제외한 AGE컬럼의 값들을 조회한 상태에서 NULL값을 조회하려고 하기 때문에 NULL값 조회 불가
