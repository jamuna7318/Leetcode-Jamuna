-- Last updated: 11/08/2026, 18:49:26
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id != 2
   OR referee_id IS NULL;