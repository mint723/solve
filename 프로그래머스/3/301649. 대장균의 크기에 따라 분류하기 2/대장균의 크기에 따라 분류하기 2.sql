SELECT 
    id,
    CASE
        WHEN ranking <=0.25
        THEN 'CRITICAL'
        WHEN ranking <=0.50
        THEN 'HIGH'
        WHEN ranking <=0.75
        THEN 'MEDIUM'
        WHEN ranking <=1
        THEN 'LOW'
    END AS colony_name
FROM 
(
    SELECT 
        id,
        size_of_colony,
        PERCENT_RANK() OVER (ORDER BY size_of_colony DESC) AS ranking
    FROM ECOLI_DATA
) AS data
ORDER BY id
;