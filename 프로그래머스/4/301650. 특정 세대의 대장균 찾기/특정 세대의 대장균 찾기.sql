
SELECT ID 
FROM ecoli_data
WHERE parent_id IN
(
    SELECT ID 
    FROM ecoli_data
    WHERE parent_id IN
    (
        SELECT ID
        FROM ecoli_data
        WHERE parent_id IS NULL    
    )
)


;