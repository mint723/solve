SELECT animal_type, count(*) as count
FROM animal_ins
GROUP BY animal_type
ORDER BY animal_type
;