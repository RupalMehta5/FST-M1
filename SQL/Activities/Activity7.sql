select Sum(purchase_amount) as Total_sum from orders;
select avg(purchase_amount) as Average from orders;
select max(purchase_amount) as maximum from orders;
select min(purchase_amount) as minimum from orders;
select count(distinct salesman_id) as employeecount from orders;