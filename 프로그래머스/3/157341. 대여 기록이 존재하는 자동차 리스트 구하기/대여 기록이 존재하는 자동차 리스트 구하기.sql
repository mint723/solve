SELECT DISTINCT crcc.car_id
FROM 
    car_rental_company_car AS crcc JOIN
    car_rental_company_rental_history AS crcrh
    ON crcc.car_id = crcrh.car_id
WHERE 
    car_type LIKE '세단'
    AND
    MONTH(start_date) = 10 
ORDER BY car_id DESC
;
