-- 코드를 입력하세요
SELECT name,
       datetime
FROM       
    (SELECT I.name,
            I.datetime
    FROM ANIMAL_INS I
    LEFT JOIN ANIMAL_OUTS O
    ON I.animal_id = O.animal_id
    WHERE O.name IS NULL
    ORDER BY datetime)
WHERE ROWNUM <= 3 AND NAME IS NOT NULL