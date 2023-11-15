-- 코드를 입력하세요
SELECT ai.animal_id,
       ai.animal_type,
       ai.name
FROM animal_ins ai, animal_outs ao
WHERE ai.animal_id = ao.animal_id AND
      ai.sex_upon_intake LIKE 'Intact%' AND
      (ao.sex_upon_outcome LIKE 'Spayed%' OR
      ao.sex_upon_outcome LIKE 'Neutered%')
ORDER BY ai.animal_id      


--조금 더 보기 편하게 수정할 수 있었음
SELECT ai.animal_id,
       ai.animal_type,
       ai.name
FROM animal_ins ai, animal_outs ao
WHERE ai.animal_id = ao.animal_id AND
      ai.sex_upon_intake LIKE 'Intact%' AND
      ao.sex_upon_outcome NOT LIKE 'Intact%'
ORDER BY ai.animal_id        
