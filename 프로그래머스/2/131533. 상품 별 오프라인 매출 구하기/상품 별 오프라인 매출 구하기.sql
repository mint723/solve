SELECT product_code, price*SUM(sales_amount) AS sales
FROM product AS pd JOIN offline_sale AS os ON pd.product_id = os.product_id
GROUP BY product_code
ORDER BY sales DESC, product_code
;