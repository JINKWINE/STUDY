-- 코드를 입력하세요
SELECT *
FROM(SELECT AO.animal_id,
            AO.name       
            FROM ANIMAL_INS AI, ANIMAL_OUTS AO
            WHERE AI.animal_id = AO.animal_id
            ORDER BY AO.datetime - AI.datetime DESC)
WHERE ROWNUM <= 2
