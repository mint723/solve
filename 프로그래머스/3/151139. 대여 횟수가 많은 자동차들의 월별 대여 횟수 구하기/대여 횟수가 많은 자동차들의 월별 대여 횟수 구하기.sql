SELECT month, car_id, records
FROM (SELECT 
    MONTH(start_date) AS month,
    car_id,
    count(*) AS records
    FROM car_rental_company_rental_history
    WHERE 
    start_date BETWEEN '2022-08-01' AND '2022-10-31'
        AND 
    car_id IN (
    SELECT car_id
    FROM car_rental_company_rental_history AS crcrh
    WHERE start_date BETWEEN '2022-08-01' AND '2022-10-31'
    GROUP BY car_id
    HAVING count(*) >= 5
    )
GROUP BY MONTH(start_date), car_id) AS rent

ORDER BY month, car_id DESC
;