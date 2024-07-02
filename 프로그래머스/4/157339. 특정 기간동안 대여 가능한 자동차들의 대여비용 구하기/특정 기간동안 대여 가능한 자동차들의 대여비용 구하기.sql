SELECT crcc.car_id, crcc.car_type, 
    FLOOR(daily_fee*(0.01*(100-discount_rate)) * 30) AS fee
FROM 
    car_rental_company_car AS crcc
    JOIN
    car_rental_company_discount_plan AS crcdp
    ON crcc.car_type = crcdp.car_type
WHERE 
    (crcc.car_type LIKE '세단' OR crcc.car_type LIKE 'SUV') AND 
    car_id NOT IN (
        SELECT car_id
        FROM car_rental_company_rental_history
        WHERE 
        # (YEAR(start_date) = 2022 AND MONTH(start_date) = 11)
        # OR
        # (YEAR(end_date) = 2022 AND MONTH(end_date) = 11)
        END_DATE >= '2022-11-01' AND START_DATE <= '2022-11-30'
    ) 
    AND duration_type LIKE '30%'
    AND (FLOOR(daily_fee*(0.01*(100-discount_rate))) * 30) >= 500000 
    AND (FLOOR(daily_fee*(0.01*(100-discount_rate))) * 30) < 2000000
ORDER BY fee DESC, car_type, car_id DESC
;