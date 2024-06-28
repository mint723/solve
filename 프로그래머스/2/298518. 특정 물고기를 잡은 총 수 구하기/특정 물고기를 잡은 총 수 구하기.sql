-- 코드를 작성해주세요
SELECT count(*) AS fish_count
FROM fish_info
WHERE fish_type IN
(
    SELECT fish_type
    FROM fish_name_info
    WHERE fish_name LIKE 'BASS' OR fish_name LIKE 'SNAPPER'
)
;