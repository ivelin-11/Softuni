SELECT `first_name`,`last_name`,`department_id`
FROM `employees` AS e1
WHERE e1.`salary`>(
SELECT AVG(e2.`salary`) FROM `employees` AS e2
WHERE e1.`department_id`=e2.`department_id`
GROUP BY e2.`department_id`
 ) 
ORDER BY `department_id`,`employee_id` LIMIT 10;


SELECT `first_name`,`last_name`,`department_id`
FROM `employees` AS e1
WHERE e1.`salary`>(
SELECT AVG(e2.`salary`) FROM `employees` AS e2
WHERE e1.`department_id`=e2.`department_id`
GROUP BY e2.`department_id`
 ) 
ORDER BY `department_id`,`employee_id` LIMIT 10;

