-- 코드를 입력하세요
SELECT book_id, author_name, SUBSTR(published_date,1,10) AS published_date
FROM book JOIN author ON book.author_id = author.author_id
WHERE category LIKE '경제'
ORDER BY published_date
;