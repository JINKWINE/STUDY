-- 코드를 입력하세요
SELECT mcdp_cd as "진료과코드"  ,
       count(*) as "5월예약건수" --숫자로 시작하는 별칭은 홑따옴표(')가 아닌 쌍따옴표(")로 감쌀 것
FROM appointment
WHERE to_char(apnt_ymd, 'mm') = '05'
GROUP BY mcdp_cd
ORDER BY "5월예약건수", "진료과코드"
