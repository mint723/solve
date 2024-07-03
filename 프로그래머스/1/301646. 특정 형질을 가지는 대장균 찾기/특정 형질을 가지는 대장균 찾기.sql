SELECT COUNT(*) AS count
FROM ecoli_data
WHERE 
    (conv(genotype,10,2) LIKE '%1' OR
    conv(genotype,10,2) LIKE '%1__')
    AND
    conv(genotype,10,2) NOT LIKE '%1_'
;