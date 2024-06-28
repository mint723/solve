SELECT substr(sales_date,1,10) AS SALES_DATE, PRODUCT_ID, 
        USER_ID, SUM(SALES_AMOUNT) AS SALES_AMOUNT
FROM 
(SELECT product_id, USER_ID, sales_amount, sales_date
FROM online_sale


UNION

SELECT product_id, null as USER_ID, sales_amount, sales_date
FROM offline_sale)
AS total_sale
WHERE MONTH(sales_date) = 3
GROUP BY SALES_DATE, PRODUCT_ID, USER_ID
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID
;



# SELECT product_id, null as USER_ID, sales_amount, sales_date
# FROM offline_sale
# WHERE MONTH(sales_date) = 3;
