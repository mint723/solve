SELECT 
    YEAR(ym) AS year,
    ROUND(AVG(PM_VAL1),2) AS pm10,
    ROUND(AVG(PM_VAL2),2) AS 'pm2.5'
FROM air_pollution
WHERE location2 LIKE '수원'
GROUP BY year
ORDER BY year
;