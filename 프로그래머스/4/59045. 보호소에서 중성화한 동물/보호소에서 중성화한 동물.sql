-- 코드를 입력하세요
SELECT ai.animal_id,
       ai.animal_type,
       ai.name
FROM animal_ins ai, animal_outs ao
WHERE ai.animal_id = ao.animal_id AND
      ai.sex_upon_intake LIKE 'Intact%' AND
      ao.sex_upon_outcome NOT LIKE 'Intact%'
ORDER BY ai.animal_id