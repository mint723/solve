SELECT animal_id, name
FROM animal_ins
WHERE 
animal_type LIKE 'dog'
AND
LOWER(name) LIKE '%el%'
ORDER BY name
;