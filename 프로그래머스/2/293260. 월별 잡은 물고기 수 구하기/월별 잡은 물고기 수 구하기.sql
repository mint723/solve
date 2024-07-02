SELECT COUNT(*) AS fish_count, MONTH(time) month
FROM fish_info
GROUP BY MONTH(time)
ORDER BY month
;