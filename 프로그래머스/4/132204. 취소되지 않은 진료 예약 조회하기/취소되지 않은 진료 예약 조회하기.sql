SELECT apnt_no, pt_name, ap.pt_no, ap.mcdp_cd, dr_name, apnt_ymd
FROM
    appointment AS ap
    LEFT OUTER JOIN
    patient AS pt
    ON ap.pt_no = pt.pt_no
    LEFT OUTER JOIN
    doctor AS dt
    ON
    ap.mddr_id = dt.dr_id
WHERE 
    apnt_cncl_yn LIKE 'N'
    AND
    apnt_ymd LIKE '2022-04-13%'
ORDER BY apnt_ymd
;