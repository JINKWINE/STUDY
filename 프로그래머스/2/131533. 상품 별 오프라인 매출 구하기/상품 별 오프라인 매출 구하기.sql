-- 코드를 입력하세요
SELECT P.product_code,
       SUM(P.price * OS.sales_amount) as sales
FROM PRODUCT P 
JOIN OFFLINE_SALE OS ON P.product_id = OS.product_id       
GROUP BY P.product_code        
ORDER BY sales DESC, P.product_code        