-- 코드를 작성해주세요

SELECT sum(price) AS TOTAL_PRICE
FROM item_info
WHERE RARITY like 'LEGEND';
