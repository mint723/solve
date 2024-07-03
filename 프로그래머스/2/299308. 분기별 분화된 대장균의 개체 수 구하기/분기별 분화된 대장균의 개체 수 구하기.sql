SELECT 
    CASE
        WHEN MONTH(DIFFERENTIATION_DATE)<4
        THEN '1Q'
        WHEN MONTH(DIFFERENTIATION_DATE)<7
        THEN '2Q'
        WHEN MONTH(DIFFERENTIATION_DATE)<10
        THEN '3Q'
        WHEN MONTH(DIFFERENTIATION_DATE)<13
        THEN '4Q'
    END
    AS quarter,
    COUNT(*) AS ecoli_count
FROM ecoli_data
GROUP BY quarter
ORDER BY quarter
;