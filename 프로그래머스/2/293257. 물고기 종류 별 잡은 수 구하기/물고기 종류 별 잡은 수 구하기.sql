SELECT count(*) AS fish_count, fish_name
FROM fish_name_info AS fni JOIN fish_info AS fi ON  fni.fish_type = fi.fish_type
GROUP BY fish_name
ORDER BY fish_count DESC 
;