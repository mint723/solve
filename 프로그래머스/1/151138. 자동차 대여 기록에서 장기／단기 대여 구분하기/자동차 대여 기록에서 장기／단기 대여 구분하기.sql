SELECT 
    history_id,
    car_id,
    DATE_FORMAT(SUBSTR(start_date,1,10),'%Y-%m-%d') AS start_date,
    DATE_FORMAT(SUBSTR(end_date,1,10),'%Y-%m-%d') AS end_date,
    CASE
        WHEN datediff(end_date,start_date)>=29
        THEN '장기 대여'
        ELSE '단기 대여'
    END
    AS rent_type
FROM car_rental_company_rental_history
WHERE YEAR(start_date) = 2022 AND MONTH(start_date) = 09
ORDER BY history_id DESC
;