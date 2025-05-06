-- Write your PostgreSQL query statement below

SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity
WHERE activity_date BETWEEN DATE '2019-07-28' - INTERVAL '30 days' AND DATE '2019-07-28'
GROUP BY activity_date