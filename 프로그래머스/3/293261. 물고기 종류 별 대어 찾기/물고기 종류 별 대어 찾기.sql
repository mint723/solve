-- 코드를 작성해주세요

SELECT 
ID,
(
    SELECT fish_name_info.fish_name
    FROM fish_name_info
    WHERE gro_fish.fish_type = fish_name_info.fish_type
) AS fish_name,
fish_info.LENGTH

FROM fish_info join
(
    SELECT FISH_TYPE, MAX(LENGTH) as LENGTH
    FROM FISH_INFO
    GROUP BY FISH_TYPE    
) as gro_fish 
on fish_info.fish_type = gro_fish.fish_type
AND fish_info.LENGTH = gro_fish.LENGTH
ORDER BY id
;
