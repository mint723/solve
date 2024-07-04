SELECT author.author_id, author_name, category,
    SUM(sales * price)  AS total_sales
FROM 
    book JOIN
    author ON book.author_id = author.author_id JOIN
    book_sales ON book.book_id = book_sales.book_id
WHERE YEAR(sales_date)=2022 AND MONTH(sales_date) = 1
GROUP BY author_id, author_name, category
ORDER BY author_id, category DESC 
;