create database ams;
use ams;

CREATE  TABLE air_passenger_profile (   
profile_id VARCHAR(10)  PRIMARY KEY,   
password VARCHAR(10)  ,   
first_name VARCHAR(10)  ,   
last_name VARCHAR(10)  ,   
address VARCHAR(100)  ,   
mobile_number BIGINT ,   
email_id VARCHAR(30)   
); 

CREATE  TABLE air_credit_card_details (   
profile_id VARCHAR(10)  ,   
card_number BIGINT,   
card_type VARCHAR(10),   
expiration_month SMALLINT,   
expiration_year SMALLINT,
FOREIGN KEY(profile_id) REFERENCES air_passenger_profile(profile_id)
); 
 
CREATE  TABLE air_flight  
(   
flight_id VARCHAR(10) PRIMARY KEY ,   
airline_id VARCHAR(10)  ,   
airline_name VARCHAR(30)  ,   
from_location VARCHAR(20) ,   
to_location VARCHAR(20)  ,   
departure_time TIME  ,   
arrival_time TIME  ,   
duration TIME  ,   
total_seats  INT  
); 
 
CREATE  TABLE air_flight_details (   
flight_id VARCHAR(10)  ,   
flight_departure_date DATE  ,   
price NUMERIC(8,2)  ,   
available_seats INT,
FOREIGN KEY (flight_id) REFERENCES air_flight(flight_id)
); 


CREATE  TABLE air_ticket_info (   
ticket_id VARCHAR(10) PRIMARY KEY ,   
profile_id VARCHAR(10)  ,   
flight_id VARCHAR(10)  ,   
flight_departure_date DATE ,   
status VARCHAR(10) NULL ,
FOREIGN KEY(profile_id) REFERENCES air_passenger_profile(profile_id),
FOREIGN KEY (flight_id) REFERENCES air_flight(flight_id)
); 
 
insert into air_passenger_profile   
values
('PFL001',  'PFL001',   'LATHA',  'SANKAR',  '123 BROAD  CROSS ST,CHENNAI-48'  ,'9876543210','LATHA@GMAIL.COM' ), 
('PFL002','PFL002','ARUN','PRAKASH','768  2ND STREET,BENGALURU-20', '8094564243','ARUN@AOL.COM' ), 
('PFL003','PFL003','AMIT','VIKARAM','43 5TH STREET,KOCHI-84', '9497996990','AMIT@AOL.COM'),  
('PFL004','PFL004','AARTHI','RAMESH','343 6TH STREET,HYDERABAD-76','9595652530','AARTHI@GMAIL.COM' ), 
('PFL005','PFL005','SIVA','KUMAR','125 8TH STREET,CHENNAI-46',' 9884416986','SIVA@GMAIL.COM' ), 
('PFL006', 'PFL006','RAMESH','BABU',' 109 2ND CROSS ST,KOCHI-12',    '9432198760',' RAMESH@GMAIL.COM'), 
('PFL007', 'PFL007' ,'GAYATHRI','RAGHU' ,'23 2ND CROSS ST,BENGALURU-12' ,'8073245678' ,'GAYATHRI@GMAIL.COM'), 
('PFL008', 'PFL008','GANESH','KANNAN', '45 3RD ST,HYDERABAD-21',   '9375237890' ,'GANESH@GMAIL.COM'); 

 
 
insert into air_credit_card_details  
values
('PFL001', '4312467849804008','GOLD', 2, 2020), 
('PFL002',' 4763421245304900','PLATINIUM', 10 ,2015), 
('PFL003' ,'4112432643784789',' INSTANT', 3 ,2014), 
('PFL004', '4230412745604112' ,'GOLD', 7 ,2016), 
('PFL005', '4122432147834003' ,'PLATINIUM', 12, 2016), 
('PFL006', '4227438945674009' ,'GOLD' ,12, 2018), 
('PFL007', '4124459047784138','INSTANT' ,3 ,2015), 
('PFL008', '4312411745884010' ,'PLATINIUM', 9 ,2017); 
 
  
 
insert into air_flight 
values
('916' , '100000' ,'ABC AIRLINES' , 'CHENNAI', 'HYDERABAD' ,'19:55:00', '21:00:00', '01:05:00', 40), 
('289', '100000' ,'ABC AIRLINES' ,'CHENNAI' ,'KOCHI' ,'08:40:00' ,'09:55:00', '01:15:00', 80), 
('1011','100000', 'ABC AIRLINES' ,'HYDERABAD' ,'CHENNAI' ,'12:30:00', '13:55:00', '01:25:00', 50), 
('3004','100000', 'ABC AIRLINES', 'BENGALURU' ,'CHENNAI', '09:05:00', '10:25:00' ,'01:20:00', 100), 
('3307','100000', 'ABC AIRLINES', 'BENGALURU', 'CHENNAI' ,'18:45:00' ,'19:45:00', '01:00:00' ,40), 
('3013','100000' ,'ABC AIRLINES', 'CHENNAI', 'BENGALURU', '07:40:00' ,'08:45:00', '01:05:00' ,50), 
('3148','100000' ,'ABC AIRLINES','CHENNAI','BENGALURU','20:15:00' , '21:20:00', '01:05:00' ,100), 
('1265','100000', 'ABC AIRLINES', 'CHENNAI','HYDERABAD','21:25:00' ,'22:55:00', '01:30:00', 100), 
('3241','100000', 'ABC AIRLINES', 'CHENNAI' , 'KOCHI' ,'10:40:00', '12:05:00', '01:25:00', 80), 
( '3244' ,'100000' ,'ABC AIRLINES' ,'KOCHI' ,'CHENNAI' ,'21:10:00', '22:40:00', '01:30:00' ,50), 
('1262','100000' ,'ABC AIRLINES' ,'HYDERABAD' ,'CHENNAI' ,'06:00:00' ,'07:20:00' ,'01:20:00', 100); 
 
 
insert into air_flight_details  
values 
( '916',   '2013-04-28','4086.00',40), 
('916','2013-05-12', '3023.00', 40), 
('916', '2013-05-01','4086.00', 40), 
('916','2013-05-06','3603.00', 38), 
('289', '2013-05-06','3603.00', 80), 
('289','2013-05-08','3603.00',80), 
('289','2013-05-20','3052.00', 80), 
('289','2013-05-31','2773.00', 80), 
('1011','2013-04-30','4614.00', 50), 
('1011','2013-05-09','4131.00', 46), 
('1011','2013-05-21','3580.00', 50), 
('3004','2013-05-02','3603.00', 97), 
('3004','2013-05-24','3052.00', 100), 
('3004','2013-05-19','3304.00', 100), 
('3307','2013-05-03','3603.00', 40), 
('3307','2013-05-03','3304.00', 40), 
('3307','2013-05-23','3304.00', 40), 
('3307','2013-05-29','3305.00', 40), 
('3013','2013-05-04','3603.00', 50), 
('3013','2013-05-06','3603.00', 50), 
('3013','2013-05-22','3052.00', 50), 
('3013','2013-05-30','2773.00', 50), 
('3148','2013-05-16','3052.00', 100), 
('3148','2013-05-21','3052.00', 98), 
('3148' ,'2013-06-01', '2773.00', 95), 
('1265' ,'2013-04-29', '4086.00', 99), 
('1265','2013-05-14', '3052.00', 100), 
('1265','2013-05-18','4086.00', 100), 
('1265' ,'2013-05-29', '2773.00', 99), 
('3241','2013-05-01', '4086.00', 80), 
('3241','2013-05-13', '3052.00', 80), 
('3241','2013-05-27', '2773.00', 80), 
('3244' ,'2013-05-03' , '3647.00', 43), 
('3244','2013-05-15', '3096.00', 50), 
('1262' , '2013-05-20','3580.00' , 99), 
('1262' , '2013-05-29','3309.00' ,100); 


insert into air_ticket_info 
values 
 ('TKT001', 'PFL007', '3004', '2013-05-02' ,'BOOKED'),  
('TKT002', 'PFL007' ,'3004', '2013-05-02','BOOKED'), 
('TKT003' ,'PFL007', '3004','2013-05-02','BOOKED'), 
('TKT004','PFL001','1265','2013-04-29','BOOKED'), 
('TKT005', 'PFL001','1011' ,'2013-05-09','BOOKED' ), 
('TKT006','PFL007','3148','2013-05-21','BOOKED'), 
('TKT007','PFL007','3148',' 2013-05-21','BOOKED'), 
('TKT008','PFL003','3244','2013-05-03','BOOKED' ), 
('TKT009','PFL003','3244','2013-05-03','BOOKED' ), 
('TKT010','PFL003','3244','2013-05-03','BOOKED' ), 
('TKT011','PFL002','3148','2013-06-01','BOOKED' ), 
('TKT012','PFL002','3148','2013-06-01','BOOKED' ), 
('TKT013','PFL002','3148','2013-06-01','BOOKED' ), 
('TKT014','PFL002','3148','2013-06-01','BOOKED'), 
('TKT015','PFL002','3148','2013-06-01','BOOKED'), 
('TKT016','PFL004','1262','2013-05-20','BOOKED' ), 
('TKT017','PFL004','1265','2013-05-29','BOOKED'), 
('TKT018','PFL006','3244','2013-05-03','BOOKED'), 
('TKT019','PFL006','3244','2013-05-03','BOOKED'), 
('TKT020','PFL006','3244','2013-05-03','BOOKED'), 
('TKT021','PFL006','3244','2013-05-03','BOOKED'), 
('TKT022','PFL005','916','2013-05-06','BOOKED'), 
('TKT023','PFL005','916','2013-05-06','BOOKED'), 
('TKT024','PFL005','1011','2013-05-09','BOOKED' ), 
('TKT025','PFL005','1011','2013-05-09','BOOKED'), 
('TKT026','PFL008','1011','2013-05-09','BOOKED'); 

#1-------------------------------------------------------------------
select f.flight_id ,f.from_location,f.to_location,d.price 
from air_flight f,air_flight_details d
where f.flight_id=d.flight_id and month(flight_departure_date)=4;

#2-------------------------------------------------------------------
select f.flight_id, f.from_location, f.to_location, avg(d.price) as Price
from air_flight f ,air_flight_details d
where f.flight_id = d.flight_id
group by flight_id, flight_departure_date
order by f.flight_id, from_location, to_location asc;

#3-------------------------------------------------------------------

select p.profile_id,concat(app.first_name,',',app.last_name) name,p.address 
from air_passenger_profile p inner join air_ticket_info a
on p.profile_id=a.profile_id
inner join air_flight af
on a.flight_id=af.flight_id
where af.from_location='Chennai' and af.to_location='Hyderabad';

#4-------------------------------------------------------------------
select distinct  profile_id,password, concat(first_name,last_name) as customer_name,address,mobile_number,email_id from  air_passenger_profile order by profile_id;
create table max as select profile_id,count(status) as st from air_ticket_info group by profile_id order by profile_id;  
select profile_id,st from max where st=(select max(st) from max) order by profile_id;

#5-------------------------------------------------------------------
SELECT af.flight_id, af.from_location, af.to_location,(af.total_seats-afd.available_seats) as No_of_Tickets 
FROM air_flight af,air_flight_details afd
WHERE (af.total_seats-afd.available_seats)>0 order by af.flight_id;

#6-------------------------------------------------------------------

SELECT flight_id,count(flight_departure_date) as No_of_Services ,sum(price) as Total_Price from air_flight_details group by flight_id order by flight_id;

#7-------------------------------------------------------------------

SELECT af.flight_id, afd.flight_departure_date,(af.total_seats-afd.available_seats) as No_of_Passengers 
FROM air_flight af,air_flight_details afd
WHERE (af.total_seats-afd.available_seats)>0 order by af.flight_id,afd.flight_departure_date;

#8-------------------------------------------------------------------

create table mini as select profile_id,count(ticket_id) as mintic from air_ticket_info group by profile_id;
select profile_id from mini where mintic=(select min(mintic) from mini);


#9-------------------------------------------------------------------

select distinct app.profile_id,app.first_name,app.mobile_number,app.email_id
from air_passenger_profile app inner join air_ticket_info ati 
on app.profile_id=ati.profile_id
inner join air_flight af
on ati.flight_id=af.flight_id
where af.from_location='Hyderabad' and af.to_location='Chennai' 
order by app.profile_id;

#10------------------------------------------------------------------

select distinct app.profile_id,app.first_name,app.last_name,ati.flight_id,ati.flight_departure_date,af.departure_time,af.arival_time,
addtime(af.departure_time,'01:00') as Delayed_departure_time,addtime(af.arival_time,'01:00') as Delayed_arival_time
from air_passenger_profile app inner join air_ticket_info ati 
on app.profile_id=ati.profile_id
inner join air_flight af
on ati.flight_id=af.flight_id
where af.from_location='Chennai' and af.to_location='Hyderabad' or ati.flight_departure_date='2013-06-06'; 
#------------------------------------------------------------------- 







