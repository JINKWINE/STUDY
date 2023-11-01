-- 코드를 입력하세요
SELECT mcdp_cd as "진료과코드"  ,
       count(*) as "5월예약건수"      
FROM appointment
WHERE to_char(apnt_ymd, 'mm') = '05'
GROUP BY mcdp_cd
ORDER BY "5월예약건수", "진료과코드"
