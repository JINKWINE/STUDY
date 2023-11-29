-- 코드를 입력하세요
SELECT 
    uu.user_id,
    uu.nickname,
    uu.city || ' ' || uu.street_address1 || ' ' || uu.street_address2 AS 전체주소,
    SUBSTR(uu.tlno, 1, 3) || '-' || SUBSTR(uu.tlno, 4, 4) || '-' || SUBSTR(uu.tlno, 8) AS 전화번호
FROM used_goods_user uu 
WHERE uu.user_id IN (SELECT writer_id
                     FROM used_goods_board
                     GROUP BY writer_id
                     HAVING count(writer_id) >= 3)
ORDER BY uu.user_id DESC

