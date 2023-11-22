-- 코드를 입력하세요
SELECT c.car_id
FROM car_rental_company_car c, car_rental_company_rental_history h
WHERE c.car_id = h.car_id AND
      TO_CHAR(h.start_date,'MM') = '10' AND
      c.car_type = '세단'
GROUP BY c.car_id
ORDER BY c.car_id DESC
        
