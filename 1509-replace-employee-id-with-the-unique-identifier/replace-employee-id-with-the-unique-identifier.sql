# Write your MySQL query statement below
select eu.unique_id as unique_id, e.name as name
from Employees e
Left Join EmployeeUNI eu
ON e.id = eu.id