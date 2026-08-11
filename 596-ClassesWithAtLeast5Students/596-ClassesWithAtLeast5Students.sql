-- Last updated: 11/08/2026, 18:49:18
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;