-- 코드를 입력하세요
SELECT A.FLAVOR FROM FIRST_HALF A, ICECREAM_INFO B
WHERE A.TOTAL_ORDER>3000 AND A.FLAVOR = B.FLAVOR AND B.INGREDIENT_TYPE = 'fruit_based'
ORDER BY A.TOTAL_ORDER DESC;