SELECT item_id, item_name, rarity 
FROM item_info
WHERE item_id NOT IN 
    (SELECT parent_item_id
    FROM item_info ii JOIN item_tree it ON ii.item_id = it.item_id
    WHERE parent_item_id IS NOT NULL)
ORDER BY item_id DESC
;