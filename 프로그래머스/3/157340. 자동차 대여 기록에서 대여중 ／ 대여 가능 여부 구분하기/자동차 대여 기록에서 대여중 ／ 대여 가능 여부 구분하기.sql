SELECT car_id,
CASE
    WHEN car_id in 
    (
        SELECT car_id
        FROM car_rental_company_rental_history
        WHERE start_date<='2022-10-16' AND end_date>='2022-10-16'
    )
    THEN '대여중'
    ELSE '대여 가능'
END AS availability
FROM car_rental_company_rental_history
GROUP BY car_id
ORDER BY car_id DESC
;
