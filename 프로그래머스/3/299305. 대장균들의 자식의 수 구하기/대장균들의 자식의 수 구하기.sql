
SELECT id, CHILD_COUNT
FROM (
    SELECT parent_id AS id, COUNT(*) AS CHILD_COUNT
    FROM ECOLI_DATA
    WHERE parent_id IS NOT NULL
    GROUP BY parent_id

    UNION 

    SELECT id, 0
    FROM ECOLI_DATA
    WHERE id NOT IN
        (
            SELECT parent_id AS id
            FROM ECOLI_DATA
            WHERE parent_id IS NOT NULL
            GROUP BY parent_id
        )
    GROUP BY id
) AS sum_data
ORDER BY id;