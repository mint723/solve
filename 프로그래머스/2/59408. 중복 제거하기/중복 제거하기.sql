-- 코드를 입력하세요
SELECT count(*) as count
FROM (SELECT * FROM animal_ins GROUP BY name HAVING name is not null) as gro_name;