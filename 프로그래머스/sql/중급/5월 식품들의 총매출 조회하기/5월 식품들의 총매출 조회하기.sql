-- 코드를 입력하세요
SELECT fp.product_id,
       fp.product_name,
       amount * fp.price AS total_sales
FROM food_product fp, (SELECT product_id, sum(amount) as amount
                       FROM food_order
                       WHERE TO_CHAR(produce_date, 'YYYY-MM') = '2022-05'
                       GROUP BY product_id) fo
WHERE fp.product_id = fo.product_id
ORDER BY total_sales DESC, fp.product_id
