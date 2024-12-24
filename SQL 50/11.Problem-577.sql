SELECT e.name , b.bonus
FROM Employee e 
LEFT JOIN Bonus b
ON e.empid = b.empid
WHERE Ib.bonus IS NULL OR b.bonus < 1000

-- method 2

SELECT e.name , b.bonus
FROM Employee e 
LEFT JOIN Bonus b
ON e.empid = b.empid
WHERE IFNULL(b.bonus , 0) < 1000