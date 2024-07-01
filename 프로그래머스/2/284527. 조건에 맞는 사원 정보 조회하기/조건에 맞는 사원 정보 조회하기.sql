WITH scoreSummary AS (
    SELECT emp_no, year, sum(score) AS total_score
    FROM hr_grade
    GROUP BY emp_no, year    
)

SELECT 
    total_score AS score,
    hr_employees.emp_no,
    hr_employees.emp_name,
    hr_employees.position,
    hr_employees.email
    
FROM
hr_employees
JOIN
(SELECT emp_no, year, total_score
FROM scoreSummary
WHERE total_score = (SELECT max(total_score) FROM scoreSummary)
)AS best_hr 
ON hr_employees.emp_no = best_hr.emp_no

;
