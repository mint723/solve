-- 코드를 입력하세요
SELECT ai.animal_id, ai.animal_type, ai.name
FROM animal_ins AS ai JOIN animal_outs AS ao ON ai.animal_id = ao.animal_id
WHERE 
    ai.sex_upon_intake LIKE 'intact%' AND
    (
        ao.sex_upon_outcome LIKE 'spayed%'
        OR
        ao.sex_upon_outcome LIKE 'neutered%'
    )
ORDER BY ai.animal_id
;