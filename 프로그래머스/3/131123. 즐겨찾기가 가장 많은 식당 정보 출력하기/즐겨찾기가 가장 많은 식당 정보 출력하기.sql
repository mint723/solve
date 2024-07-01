-- 코드를 입력하세요

SELECT rest_info.food_type, rest_id, rest_name, FAVORITES
FROM 
(
    SELECT food_type, max(favorites) AS MAX_FAVORITES FROM rest_info
    GROUP BY food_type
    HAVING max(favorites)
) AS max_fav JOIN rest_info on favorites
WHERE favorites = max_favorites AND max_fav.food_type = rest_info.food_type
ORDER BY food_type DESC
;

