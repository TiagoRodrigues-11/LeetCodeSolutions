-- Write your PostgreSQL query statement below


WITH Category AS (
    SELECT account_id, (
        CASE 
            WHEN income < 20000 THEN 'Low Salary'
            WHEN 20000 <= income AND income <= 50000 THEN 'Average Salary'
            WHEN 50000 < income THEN 'High Salary' END
    ) AS category
    FROM Accounts
)

SELECT name AS category, SUM(CASE WHEN account_id >= 0 THEN 1 ELSE 0 END) as accounts_count
FROM Category c
RIGHT JOIN (
    VALUES ('Low Salary'), ('Average Salary'), ('High Salary')
) CategoryName(name) ON name=category 
GROUP BY name
