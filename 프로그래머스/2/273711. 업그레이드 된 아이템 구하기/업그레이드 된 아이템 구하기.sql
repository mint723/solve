-- 코드를 작성해주세요
# SELECT * FROM item_info
# WHERE item_id in
# (SELECT parent_item_id
# FROM item_info AS info JOIN item_tree as tree ON info.item_id = tree.item_id
# WHERE info.rarity LIKE 'rare');
SELECT ITEM_ID, ITEM_NAME, RARITY
FROM item_info
WHERE item_id in
(
    SELECT item_id
    FROM item_tree
    WHERE parent_item_id IN
    (
        SELECT item_id FROM item_info
    WHERE rarity LIKE 'RARE' AND item_id in
        (   
        SELECT parent_item_id
        FROM item_tree

        )
    )
)
ORDER BY item_id DESC
;