WITH RECURSIVE ecoli_path(id, parent_id ,generation) AS(
    SELECT id, parent_id, 1
    FROM ecoli_data
    WHERE parent_id IS NULL
    UNION ALL
    SELECT e.id, e.parent_id, ep.generation+1
    FROM ecoli_data e
    INNER JOIN ecoli_path ep ON e.parent_id = ep.id
)
SELECT count(*) AS count ,generation
FROM ecoli_path
WHERE NOT EXISTS (SELECT 1 FROM ecoli_path ep2 WHERE ep2.parent_id = ecoli_path.id)
GROUP BY generation
ORDER BY generation;