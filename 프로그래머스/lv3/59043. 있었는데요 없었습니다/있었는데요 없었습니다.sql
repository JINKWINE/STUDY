-- 코드를 입력하세요
SELECT ai.animal_id,
       ai.name
FROM ANIMAL_INS AI, ANIMAL_OUTS AO
WHERE ai.animal_id = ao.animal_id
AND ai.datetime > ao.datetime
ORDER BY ai.datetime ASC;