-- the table has null values as well , to print names having null values we have 2 methods

-- METHOD 1

SELECT name 
FROM Customer 
WHERE referee_id != 2 OR referee_id is NULL

-- METHOD 2

SELECT name 
FROM Customer 
WHERE IFNULL(referee_id , 0) <> 2
