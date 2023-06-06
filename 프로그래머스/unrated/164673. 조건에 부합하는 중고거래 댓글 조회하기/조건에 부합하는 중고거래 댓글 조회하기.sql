-- 코드를 입력하세요
SELECT BOARD.TITLE, BOARD.BOARD_ID, REPLY.REPLY_ID, REPLY.WRITER_ID, REPLY.CONTENTS, DATE_FORMAT(REPLY.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
FROM USED_GOODS_BOARD AS BOARD, USED_GOODS_REPLY AS REPLY
WHERE BOARD.BOARD_ID = REPLY.BOARD_ID AND BOARD.CREATED_DATE LIKE('2022-10%') ORDER BY REPLY.CREATED_DATE, TITLE;