SELECT ed.id, ed.genotype, pd.genotype AS parent_genotype
FROM 
    ecoli_data AS ed
    JOIN 
    ecoli_data AS pd
    ON ed.parent_id = pd.id
WHERE
    #CONV(pd.genotype,10,2) LIKE SUBSTR(
    # CONV(ed.genotype,10,2),
    # LENGTH(CONV(ed.genotype,10,2)) - LENGTH(CONV(pd.genotype,10,2)) + 1,
    # LENGTH(CONV(pd.genotype,10,2))
    # )
    ed.genotype&pd.genotype = pd.genotype
ORDER BY ed.id
;