-- 코드를 작성해주세요

-- 년도별 가장 큰 대장균
# SELECT DIFFERENTIATION_DATE, MAX(size_of_colony)
# FROM ecoli_data
# GROUP BY DIFFERENTIATION_DATE;

SELECT year(ecoli_data.DIFFERENTIATION_DATE) YEAR,
        max_colony - size_of_colony  YEAR_DEV,
        ecoli_data.id ID
FROM ecoli_data join
(
    SELECT year(DIFFERENTIATION_DATE) AS MAX_YEAR, MAX(size_of_colony) AS max_colony
    FROM ecoli_data
    GROUP BY MAX_YEAR
) AS max_size
on max_year = year(ecoli_data.DIFFERENTIATION_DATE)
ORDER BY year, year_dev;