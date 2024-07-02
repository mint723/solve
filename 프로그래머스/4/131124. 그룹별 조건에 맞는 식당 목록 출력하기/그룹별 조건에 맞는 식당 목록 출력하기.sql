SELECT member_name, review_text, SUBSTR(review_date,1,10) AS review_date
FROM rest_review JOIN member_profile ON rest_review.member_id = member_profile.member_id
WHERE rest_review.member_id IN (SELECT member_id
FROM 
(
    SELECT mp.member_id, count(*) as review_count
    FROM member_profile AS mp 
    JOIN rest_review AS rr ON mp.member_id = rr.member_id
    GROUP BY mp.member_id
) AS reviews
WHERE review_count = (
        SELECT max(review_count)
        FROM (
            SELECT count(*) as review_count
            FROM rest_review
            GROUP BY member_id
        ) AS subquery
    )
)
ORDER BY review_date, review_text
;