-- 코드를 입력하세요
SELECT book_id,
       TO_CHAR(published_date, 'YYYY-MM-DD') as published_date
FROM book
WHERE category = '인문' AND TO_CHAR(published_date, 'YYYY') = '2021'
ORDER BY 2
