SELECT FILME, ANO "DATA_LCTO", 
    LEAD(ANO, 1, 0) 
    OVER(ORDER BY ANO)
    AS "PROX_LCTO"
FROM FILMES
WHERE FILMES = " Homem de ferro";


-- 1param campo da tabela
-- 2param offset, prox linha da tabela
-- 3param valor padra para nulo