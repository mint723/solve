SELECT ii.item_id, ii.item_name
FROM item_info AS ii JOIN item_tree AS it ON ii.item_id = it.item_id
WHERE parent_item_id IS NULL
ORDER BY ii.item_id
;