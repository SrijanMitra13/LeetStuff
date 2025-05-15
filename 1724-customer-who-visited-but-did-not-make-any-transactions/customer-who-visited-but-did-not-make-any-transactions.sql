# Write your MySQL query statement below
select v.customer_id, COUNT(customer_id) as count_no_trans
from Visits v
left join Transactions t
On v.visit_id = t.visit_id
where t.transaction_id is NUll
group by v.customer_id