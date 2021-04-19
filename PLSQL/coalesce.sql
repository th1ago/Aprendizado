SELECT COALESCE(null, null, null,'PL/SQL')result
FROM dual

SELECT COALESCE(null, 'NOT NULL', null,'PL/SQL')result
FROM dual

-- retorna sempre o primeio valor nao nulo na lista de expressao