-- 코드를 입력하세요
SELECT b.book_id,
       a.author_name,
       TO_CHAR(b.published_date, 'YYYY-MM-DD') AS published_date
FROM BOOK b, AUTHOR a
WHERE b.author_id = a.author_id and
      b.category = '경제'
ORDER BY published_date
