SELECT YEAR(sales_date) AS year, MONTH(sales_date) AS month, gender,
    count(distinct online_sale.user_id) AS count
FROM user_info, online_sale
WHERE user_info.user_id = online_sale.user_id
GROUP BY YEAR(sales_date), MONTH(sales_date), gender
HAVING gender IS NOT NULL
ORDER BY year, month, gender
;
