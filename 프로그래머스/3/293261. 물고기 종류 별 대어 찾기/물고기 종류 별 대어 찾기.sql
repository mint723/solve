SELECT id, fish_name, length
FROM fish_info, fish_name_info
WHERE fish_info.fish_type = fish_name_info.fish_type
    and (length, fish_info.fish_type) IN (
        SELECT MAX(length) as length, fish_type
        FROM fish_info
        GROUP BY fish_type
    )
;