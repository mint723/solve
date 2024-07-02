SELECT order_id, product_id, SUBSTR(out_date,1,10) AS out_date,
    CASE
        WHEN out_date<=str_to_date('2022-05-01', '%Y-%m-%d')
        THEN '출고완료'
        
        WHEN out_date>str_to_date('2022-05-01', '%Y-%m-%d')
        THEN '출고대기'
        
        ELSE '출고미정'
    END
    AS 출고여부
FROM food_order
ORDER BY order_id
;