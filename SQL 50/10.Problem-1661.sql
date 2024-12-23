SELECT a1.machine_id , ROUND(AVG(a1.timestamp - a2.timestamp),3) AS processing_time
FROM Activity a1
JOIN Activity a2 
WHERE a1.timestamp > a2.timestamp
AND a1.process_id = a2.process_id
AND a1.machine_id = a2.machine_id
GROUP BY a1.machine_id