-- 코드를 작성해주세요

SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPER_INFOS
WHERE 
skill_1 LIKE 'PYTHON' OR
skill_2 LIKE 'PYTHON' OR
skill_3 LIKE 'PYTHON'
ORDER BY ID;