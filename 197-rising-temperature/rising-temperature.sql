-- Write your PostgreSQL query statement below


SELECT id
FROM (
    SELECT id, temperature, LAG(temperature, 1) OVER (ORDER BY recordDate) AS previous_temperature, recordDate AS today, LAG(recordDate, 1) OVER (ORDER BY recordDate) AS yesterday
    FROM Weather
)
WHERE today - yesterday = 1 AND temperature > previous_temperature;
