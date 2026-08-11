-- Last updated: 11/08/2026, 18:51:42
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;