SELECT board_id, writer_id, title, price,
    CASE
        WHEN status LIKE 'sale'
        THEN '판매중'
        WHEN status LIKE 'done'
        THEN '거래완료'
    ELSE '예약중'
    END
    AS status
FROM used_goods_board
WHERE created_date LIKE '2022-10-05%'
ORDER BY board_id DESC
;