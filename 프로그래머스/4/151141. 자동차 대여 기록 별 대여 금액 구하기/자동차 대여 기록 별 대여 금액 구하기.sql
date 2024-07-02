SELECT history_id, 
    CASE
        WHEN datediff(end_date, start_date)>=90
        THEN 
            ROUND(
            (daily_fee)
            *
            (1-(0.01*(SELECT discount_rate FROM car_rental_company_discount_plan 
            WHERE duration_type LIKE '90%' 
            AND car_rental_company_discount_plan.car_type = crcc.car_type)))
            *
            (datediff(end_date, start_date) + 1)
            )
        WHEN datediff(end_date, start_date)>=30
        THEN 
            ROUND(
            (daily_fee)
            *
            (1-(0.01*(SELECT discount_rate FROM car_rental_company_discount_plan 
            WHERE duration_type LIKE '30%' 
            AND car_rental_company_discount_plan.car_type = crcc.car_type)))
            *
            (datediff(end_date, start_date) + 1)
            )
        WHEN datediff(end_date, start_date)>=7
        THEN 
            ROUND(
            (daily_fee)
            *
            (1-(0.01*(SELECT discount_rate FROM car_rental_company_discount_plan 
            WHERE duration_type LIKE '7%' 
            AND car_rental_company_discount_plan.car_type = crcc.car_type)))
            *
            (datediff(end_date, start_date) + 1)
            )
        ELSE
            ROUND(
            (daily_fee)
            *
            (datediff(end_date, start_date) + 1)
            )
    END AS fee
FROM car_rental_company_car AS crcc, 
    car_rental_company_rental_history AS crmrh
where crcc.car_id = crmrh.car_id
AND crcc.car_type LIKE '트럭'
ORDER BY fee DESC, history_id DESC
;
