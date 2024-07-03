SELECT id, email, first_name, last_name
FROM developers
WHERE skill_code&(
    SELECT SUM(code)
    FROM skillcodes
    WHERE 
        name LIKE 'Python' OR
        name LIKE 'C#'
)
ORDER BY id
;