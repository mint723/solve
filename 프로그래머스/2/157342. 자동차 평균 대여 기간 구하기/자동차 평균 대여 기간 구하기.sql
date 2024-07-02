SELECT 
    car_id, 
    ROUND(SUM(DATEDIFF(end_date, start_date)+1)/count(*),1) AS average_duration
FROM car_rental_company_rental_history
GROUP BY car_id
HAVING SUM(DATEDIFF(end_date, start_date)+1)/count(*) >= 7
ORDER BY average_duration DESC, car_id DESC
;
