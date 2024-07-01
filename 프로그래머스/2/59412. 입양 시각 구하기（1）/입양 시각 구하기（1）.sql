-- 코드를 입력하세요
SELECT HOUR(datetime) hour, count(*) AS count
FROM animal_outs
GROUP BY HOUR(datetime)
HAVING hour<20 AND hour>08
ORDER BY hour
;