SELECT ai.animal_id, ai.name
FROM animal_ins AS ai JOIN animal_outs AS ao ON ai.animal_id = ao.animal_id
WHERE ai.datetime > ao.datetime
ORDER BY ai.datetime
;