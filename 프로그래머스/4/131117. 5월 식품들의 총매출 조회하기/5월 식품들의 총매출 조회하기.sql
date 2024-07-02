SELECT fp.product_id, fp.product_name, SUM(price*amount) AS total_sales
FROM food_product AS fp JOIN food_order as fo ON fp.product_id = fo.product_id
WHERE YEAR(produce_date) = 2022 AND MONTH(produce_date) = 5
GROUP BY fp.product_id, fp.product_name
ORDER BY total_sales DESC, product_id
;