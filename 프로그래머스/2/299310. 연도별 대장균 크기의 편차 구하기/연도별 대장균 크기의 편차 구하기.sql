-- 분화된 연도별 가장 큰 대장균의 크기
SELECT CAST(YEAR AS UNSIGNED) YEAR, max - size_of_colony AS YEAR_DEV, ID
FROM ecoli_data, (
    SELECT substring(DIFFERENTIATION_DATE, 1, 4) as year, MAX(size_of_colony) as max
    FROM ecoli_data
    GROUP BY substring(DIFFERENTIATION_DATE, 1, 4)) AS data
WHERE substring(DIFFERENTIATION_DATE, 1, 4) = data.year
ORDER BY year, year_dev
;