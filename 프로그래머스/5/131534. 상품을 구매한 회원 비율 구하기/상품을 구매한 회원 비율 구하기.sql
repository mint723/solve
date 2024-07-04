SELECT 
    YEAR(sales_date) AS YEAR,
    MONTH(sales_date) AS MONTH, 
    COUNT(DISTINCT os.user_id) AS PURCHASED_USERS,
    ROUND(COUNT(DISTINCT os.user_id)/(
        SELECT count(DISTINCT user_id)
        FROM user_info
        WHERE YEAR(joined) = 2021
    ),1) AS PUCHASED_RATIO
FROM user_info AS ui JOIN online_sale AS os ON ui.user_id = os.user_id
WHERE YEAR(joined) = 2021
GROUP BY YEAR(sales_date), MONTH(sales_date)
ORDER BY year, month
;