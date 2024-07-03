SELECT 
    CASE
        WHEN 
        skill_code&(
            SELECT SUM(code)
            FROM skillcodes
            WHERE 
                category LIKE 'Front End'
        )
        AND
        skill_code&(
            SELECT code
            FROM skillcodes
            WHERE 
                name LIKE 'Python'
        )
        
        THEN 'A'
    
        WHEN skill_code&(
            SELECT code
            FROM skillcodes
            WHERE 
                name LIKE 'C#'
        )
        THEN 'B'
        
        WHEN skill_code&(
            SELECT SUM(code)
            FROM skillcodes
            WHERE 
                category LIKE 'Front End'
        )
        THEN 'C'
        
    END AS grade,
    id,
    email
FROM developers
GROUP BY grade, id, email
HAVING grade IS NOT NULL
ORDER BY grade, id
;