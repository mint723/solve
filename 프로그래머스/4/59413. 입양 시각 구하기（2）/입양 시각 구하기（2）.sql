WITH RECURSIVE all_date
AS(
    SELECT 0 AS hour, 0 AS count
    UNION ALL
    SELECT hour+1, count FROM all_date
    WHERE hour<23
)

SELECT hour, MAX(count) AS count FROM
(SELECT hour, count FROM all_date
UNION
SELECT HOUR(datetime) AS hour, count(*) AS count
FROM animal_outs
GROUP BY hour) AS sum_table
GROUP BY hour
ORDER BY hour
;