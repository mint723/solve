SELECT food_product.category, max_price, product_name
FROM food_product
JOIN
(SELECT category, max(price) AS max_price
FROM food_product
WHERE category IN ('과자','국','김치','식용유')
GROUP BY category
HAVING max(price) 
) AS maxPrice
ON
food_product.category = maxPrice.category
WHERE 
food_product.category = maxPrice.category
AND
food_product.price = maxPrice.max_price
ORDER BY max_price DESC
;