-- Write your PostgreSQL query statement below

SELECT unique_id, name
FROM Employees
FULL JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id
WHERE name IS NOT NULL;