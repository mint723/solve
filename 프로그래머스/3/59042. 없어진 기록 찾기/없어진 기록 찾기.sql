SELECT ao.animal_id, ao.name
FROM animal_outs AS ao LEFT OUTER JOIN animal_ins AS ai ON ao.animal_id = ai.animal_id
WHERE intake_condition IS NULL
ORDER BY animal_id
;