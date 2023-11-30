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



-- 처음 작성했던 오답--
-- SELECT 
--     uu.user_id,
--     uu.nickname,
--     uu.city || '' || uu.street_address1 || '' || uu.street_address2 AS 전체주소,
--     SUBSTR(uu.tlno, 1, 3) || '-' || SUBSTR(uu.tlno, 4, 4) || '-' || SUBSTR(uu.tlno, 8) AS 전화번호
-- FROM used_goods_board ub JOIN used_goods_user uu
-- ON uu.user_id = ub.writer_id
-- GROUP BY uu.user_id, uu.nickname, uu.city, uu.street_address1, uu.street_address2, uu.tlno
-- HAVING COUNT(ub.board_id) >= 3  //거래 게시물이 3건인 사용자를 조회
-- ORDER BY uu.user_id DESC

-- user_id 와 writer_id 를 기준으로 조인 한 후에 게시물 개수를 카운트 해도 게시물 작성자를 조회할 수 없었음
-- 그래서 user_id의 옵션 안에서 작성자의 수(writer_id)를 세는 방법으로 쿼리 수정
