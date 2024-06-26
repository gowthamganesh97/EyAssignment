select  app.profile_id,app.first_name,app.mobile_number,app.email_id,count(ticket_id) as No_of_Tickets
from air_passenger_profile app inner join air_ticket_info ati 
on app.profile_id=ati.profile_id
inner join air_flight af
on ati.flight_id=af.flight_id
where app.address like '%Kochi%' group by app.profile_id
order by app.profile_id;

#2------------------------------------------------------------------- 

select af.flight_id,af.from_location,af.to_location, count(afd.flight_departure_date) as No_of_Services
from air_flight af , air_flight_details afd
where MONTHNAME(afd.flight_departure_date) = 'MAY' group by af.flight_id;

#3------------------------------------------------------------------- 

select profile_id,last_name,mobile_number,email_id from air_passenger_profile where address like "%chennai%" order by profile_id;

#4------------------------------------------------------------------- 
select * from air_flight;

select count(flight_id) as FLIGHT_COUNT from air_flight where departure_time between '6:00:00' and '18:00:00'; 

#5------------------------------------------------------------------- 

select distinct app.profile_id,app.first_name,app.email_id from air_passenger_profile app,air_ticket_info ati 
where ati.flight_id=3148 order by app.profile_id;

#6------------------------------------------------------------------- 
select flight_id,from_location,to_location,departure_time,
case  
when departure_time between '05:00:01'  and '12:00:00' then 'Morning'
when departure_time between '12:00:01'  and '18:00:00' then 'AfterNoon'
when departure_time between '18:00:01'  and '24:00:00' then 'Evening'
when departure_time between '00:00:01'  and '05:00:00' then 'Night'
end as Time_of_Service
from air_flight group by flight_id;

#8------------------------------------------------------------------- 

select af.flight_id,afd.flight_departure_date,
case  
when afd.price<3000 then 'AIR PASSENGER'
when afd.price>3000 and afd.price<4000 then 'AIR BUS'
when afd.price>4000 then 'EXECUTIVE PASSENGER '
end as flight_type
from air_flight af , air_flight_details afd;
desc air_flight;

#9------------------------------------------------------------------- 
select card_type,count(card_number) as CARD_COUNT from air_credit_card_details group by card_type order by card_type;
select right(profile_id,3) as SERIAL_NO,first_name,mobile_number,email_id from air_passenger_profile where email_id like '%gmail.com' order by first_name;

#10------------------------------------------------------------------- 

select af.flight_id,af.from_location,af.to_location,count(afd.flight_departure_date) as 
No_of_Services 
from air_flight af join air_flight_details afd on  
af.flight_id=afd.flight_id 
where month(afd.flight_departure_date)='05' 
group by af.flight_id  
having count(afd.flight_departure_date) <= all (select count(afd.flight_departure_date) 
from air_flight af join air_flight_details afd on  af.flight_id=afd.flight_id 
where month(afd.flight_departure_date)='05' 
group by af.flight_id) 
 order by af.flight_id;

#11------------------------------------------------------------------- 
select from_location,count(flight_id) as no_of_flights from air_flight group by from_location order by from_location;
#12------------------------------------------------------------------- 
select af.flight_id,af.from_location,af.to_location,ati.flight_departure_date,
count(ati.ticket_id) as No_of_Passengers 
from air_flight af join air_ticket_info ati on af.flight_id=ati.flight_id 
group by af.flight_id,ati.flight_departure_date 
order by af.flight_id,ati.flight_departure_date; 
#13------------------------------------------------------------------- 

select af.flight_id,afd.flight_departure_date,af.from_location,af.to_location,af.duration 
from air_flight af join air_flight_details afd on af.flight_id=afd.flight_id 
where duration<'1:10:00' 
group by af.flight_id,afd.flight_departure_date  
order by af.flight_id,afd.flight_departure_date; 
#14------------------------------------------------------------------- 
select af.flight_id,afd.flight_departure_date,af.from_location,af.to_location,timediff(af.arival_time,af.departure_time)duration
from air_flight af, air_flight_details afd 
where  timediff(af.arival_time,af.departure_time)<'01:10:00' ;
#15------------------------------------------------------------------- 

select af.flight_id,af.from_location,af.to_location,
count(afd.flight_departure_date) as No_of_Services, avg(afd.price) as Average_Price 
from air_flight af join air_flight_details afd on af.flight_id=afd.flight_id 
group by af.flight_id 
having avg(afd.price)> (select avg(afd.price) 
			from air_flight_details afd) 
order by afd.price; 