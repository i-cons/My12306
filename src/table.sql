create table user_info(
userID number(7) not null,
userEmail varchar2(30) not null,
userPassword varchar2(30) not null,
userName varchar2(20) not null,
userSex varchar2(8) not null,
userNumber varchar2(20) not null,
userPhone varchar2(20) not null,
userLastLogin varchar2(30),
userState varchar2(8),
userType varchar2(30),
primary key(userID)
)


userType

user
dataManager
planManager
scheduleManager
userManager
financeManager

CREATE SEQUENCE userIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE; 

userIDSequence.nextval;


create table station_info(
stationID number(7) not null,
stationName varchar2(50) not null unique,
stationPhonetic varchar2(50) not null,
stationRailway varchar2(50),
stationRank varchar2(10),
stationCanton varchar(50) not null,
stationAddress varchar2(80),
primary key(stationID)
)

CREATE SEQUENCE stationIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;


create table train_info(
trainID number(7) not null,
trainStartStation varchar2(50) not null,
trainEndStation varchar2(50) not null,
trainStartTime varchar2(50) not null,
trainEndTime varchar2(50) not null,
trainDuration varchar2(50) not null,
trainDistance varchar(30) not null,
trainAirConditioner varchar2(10) not null,
trainType varchar2(20) not null,
trainStartDate varchar2(50) not null,
primary key(trainID,trainStartDate)
)


create table route_info(
routeID number(7) not null,
trainID number(7) not null,
stationName varchar2(50) not null,
routeStartTime varchar2(50) not null,
routeArriveTime varchar2(50),
routeDistance varchar2(30),
routeStayTime varchar2(50) not null,
routeDuration varchar2(50) not null,
routeStationIndex Integer not null
)

CREATE SEQUENCE routeIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;

create table train_group_info(
trainGroupID number(7) not null,
trainID number(7) not null,
carriageID int not null,
carriageSeatType varchar2(20),
carriageSeatNumber int,
carriageType varchar2(20)
)

CREATE SEQUENCE trainGroupIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;


create table fare_rate_info(
fareRateID number(7) not null,
seatType varchar2(20) not null,
fareRate varchar2(20) not null,
scale varchar2(20)
)

CREATE SEQUENCE fareRateIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;

create table travel_section_info(
travelSectionID number(7) not null,
travelSectionFrom varchar2(50) not null,
travelSectionTo varchar2(50) not null,
travelSectionNumber int not null
)

CREATE SEQUENCE travelSectionIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;

create table seat_info(
seatID number(7) not null,
trainID number(7) not null,
trainStartDate varchar2(50) not null,
carriageID int not null,
carriageSeatNumber int not null,
seatType varchar2(20) not null,
seatPrice varchar2(20) not null,
seatState varchar2(80) not null
)

CREATE SEQUENCE seatIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;


create table order_info(
orderID number(7) not null,
userID  number(7) not null,
orderState varchar2(20) not null,
orderTime varchar2(50) not null
)


CREATE SEQUENCE orderIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;

create table ticket_info(
ticketID number(7) not null,
orderID number(7) not null,
trainID number(7) not null,
trainStartDate varchar2(50) not null,
carriageID int not null,
carriageSeatNumber int not null,
travelSectionFrom varchar2(50) not null,
travelSectionTo varchar2(50) not null,
seatType varchar2(20) not null,
seatPrice varchar2(20) not null,
userID number(7) not null,
userType number(20) not null,
userName varchar2(20) not null,
userNumber varchar2(20) not null,
saleType  varchar2(20) not null,
saleInfo varchar2(50),
saleTime varchar2(50),
ticketState varchar2(20),
stateModifiedUserID  number(7) not null,
stateModifiedStationID number(7) not null,
stateModifiedTime varchar2(50)
)


CREATE SEQUENCE ticketIDSequence
INCREMENT BY 1
START WITH 1
MAXVALUE 999999999
NOCYCLE;