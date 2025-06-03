-- 코드를 입력하세요
SELECT count(*)
FROM (
SELECT * FROM animal_ins GROUP BY name HAVING name IS NOT NULL
) as name_table
;