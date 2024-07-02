SELECT
    he.dept_id ,dept_name_en, round(sum(sal)/count(*)) AS avg_sal
FROM hr_employees AS he JOIN hr_department AS hd ON he.dept_id = hd.dept_id
    GROUP BY dept_id, dept_name_en
ORDER BY avg_sal DESC 
;