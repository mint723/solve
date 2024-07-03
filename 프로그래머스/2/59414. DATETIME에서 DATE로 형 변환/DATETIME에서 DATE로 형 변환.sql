SELECT animal_id, name, SUBSTR(datetime,1,10) AS 날짜
FROM animal_ins
ORDER BY animal_id
;