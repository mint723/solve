-- 코드를 입력하세요
SELECT CAR_TYPE ,count(*) CARS
FROM car_rental_company_car
WHERE 
OPTIONS 
LIKE '%가죽시트%' OR
OPTIONS 
LIKE '%통풍시트%' OR
OPTIONS 
LIKE '%열선시트%'
GROUP BY car_type
ORDER BY CAR_TYPE;