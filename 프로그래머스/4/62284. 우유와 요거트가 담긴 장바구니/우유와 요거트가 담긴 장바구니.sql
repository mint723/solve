-- 코드를 입력하세요
SELECT cart_id
FROM
    (SELECT cart_id, name
    FROM cart_products
    WHERE 
        name LIKE '%Milk%'
    UNION 
    SELECT cart_id, name
    FROM cart_products
    WHERE 
        name LIKE '%Yogurt%'
    ) AS calcProducts
GROUP BY cart_id
HAVING COUNT(name)>=2
ORDER BY cart_id
;