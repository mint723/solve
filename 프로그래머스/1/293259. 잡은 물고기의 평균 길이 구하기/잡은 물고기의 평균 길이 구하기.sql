SELECT ROUND(sum(IFNULL(length,10))/count(*),2) AS average_length
FROM fish_info
;

