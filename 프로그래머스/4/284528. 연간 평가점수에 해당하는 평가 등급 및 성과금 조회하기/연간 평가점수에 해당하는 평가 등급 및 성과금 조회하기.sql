SELECT 
    hr_employees.emp_no AS emp_no,
    hr_employees.emp_name AS emp_name,
    CASE
        WHEN SUM(score)/2 >= 96
        THEN 'S'
        WHEN SUM(score)/2 >= 90
        THEN 'A'
        WHEN SUM(score)/2 >= 80
        THEN 'B'
        ELSE 'C'
    END
    AS grade,
    
    CASE
        WHEN SUM(score)/2 >= 96
        THEN sal * 0.2
        WHEN SUM(score)/2 >= 90
        THEN sal * 0.15
        WHEN SUM(score)/2 >= 80
        THEN sal * 0.1
        ELSE sal * 0
    END
    AS bonus
    
FROM
    hr_employees
    JOIN
    hr_grade
    ON hr_employees.emp_no = hr_grade.emp_no
    GROUP BY emp_no, emp_name
ORDER BY emp_no
;

