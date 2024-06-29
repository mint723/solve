
SELECT CATEGORY, sum(bs_sales) AS TOTAL_SALES
FROM book 
JOIN
(
    SELECT book_id, SUM(sales) bs_sales FROM book_sales
    WHERE YEAR(sales_date) = 2022 AND MONTH(sales_date)=1
    GROUP BY book_id    
) AS sales
WHERE book.book_id = sales.book_id
GROUP BY category
ORDER BY category
;


    