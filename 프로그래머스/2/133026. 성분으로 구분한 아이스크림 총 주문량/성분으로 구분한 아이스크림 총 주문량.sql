-- 코드를 입력하세요
SELECT i.ingredient_type,
       sum(f.total_order) AS total_order
FROM first_half f, icecream_info i
WHERE f.flavor = i.flavor
GROUP BY i.ingredient_type
ORDER BY total_order