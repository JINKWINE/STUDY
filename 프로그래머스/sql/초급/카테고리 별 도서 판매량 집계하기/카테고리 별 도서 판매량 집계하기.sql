-- 코드를 입력하세요
SELECT B.category,
       SUM(BS.sales) as sales 
FROM BOOK B
JOIN BOOK_SALES BS ON B.book_id = BS.book_id
WHERE TO_CHAR(BS.sales_date, 'YYYY-MM') = '2022-01'
GROUP BY B.category
ORDER BY B.category
