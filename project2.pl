/*CIS 365-01 - AI Project 2 
* Option 1: GVSU Registrar’s Office
* Authors: Lauren Mills , Kyle Niewiada
*/

/*Rules*/
teaches(X, LIST):-findall(A,(taughtby(LIST,X),classname(LIST,A)),LIST).
teachesclass(X,Y):-classname(Z,X),taughtby(Z,Y).

/*Facts*/
classname(330,'Systems Analysis and Design').
classname(333,'DB Management and Implementation').
classname(337,'Network Systems Management').
classname(339,'IT Project Management').
classname(343,'Structure of Programming Languages').
classname(350,'Software Engineering').
classname(353,'Database').
classname(358,'Information Insurance').
classname(361,'System Programming').
classname(365,'AI').
classname(371,'Web Application Programming').
classname(375,'Wireless Networking Systems').
classname(437,'Distributed Computing').
classname(443,'Software Development Tools').
classname(450,'IS Project Management').
classname(451,'Computer Architecture').
classname(452,'OS Concepts').
classname(457,'Data Communications').
classname(460,'MIS').
classname(463,'IS Project').
classname(467,'CS Project').
classname(661,'Medical and BioInformatics').
classname(671,'Information Visualization').
classname(691,'MBI Capstone').

classtimestart(330,'9:00 am').
classtimestart(333,'6:00 pm').
classtimestart(337,'3:00 pm').
classtimestart(339,'1:00 pm').
classtimestart(343,'1:00 pm').
classtimestart(350,'10:00 am').
classtimestart(353,'12:00 pm').
classtimestart(358,'3:00 pm').
classtimestart(361,'4:00 pm').
classtimestart(365,'10:00 am').
classtimestart(371,'4:00 pm').
classtimestart(375,'6:00 pm').
classtimestart(437,'10:00 am').
classtimestart(443,'11:00 am').
classtimestart(450,'12:00 pm').
classtimestart(451,'10:00 am').
classtimestart(452,'1:00 pm').
classtimestart(457,'2:00 pm').
classtimestart(460,'10:00 am').
classtimestart(463,'2:00 pm').
classtimestart(467,'10:00 am').
classtimestart(661,'6:00 pm').
classtimestart(671,'6:00 pm').
classtimestart(691,'6:00 pm').

classtimeend(330,'9:50 am').
classtimeend(333,'8:50 pm').
classtimeend(337,'3:50 pm').
classtimeend(339,'2:15 pm').
classtimeend(343,'1:50 pm').
classtimeend(350,'10:50 am').
classtimeend(353,'12:50 pm').
classtimeend(358,'3:50 pm').
classtimeend(361,'5:15 pm').
classtimeend(365,'11:15 am').
classtimeend(371,'5:15 pm').
classtimeend(375,'7:50 pm').
classtimeend(437,'10:50 am').
classtimeend(443,'11:50 am').
classtimeend(450,'12:50 pm').
classtimeend(451,'10:50 am').
classtimeend(452,'1:50 pm').
classtimeend(457,'2:50 pm').
classtimeend(460,'11:15 am').
classtimeend(463,'2:50 pm').
classtimeend(467,'10:50 am').
classtimeend(661,'8:50 pm').
classtimeend(671,'8:50 pm').
classtimeend(691,'8:50 pm').


classday(467,'M').
classday(467,'W').
classday(467,'F').
classday(463,'M').
classday(463,'W').
classday(463,'F').
classday(457,'M').
classday(457,'W').
classday(457,'F').
classday(452,'M').
classday(452,'W').
classday(452,'F').
classday(451,'M').
classday(451,'W').
classday(451,'F').
classday(450,'M').
classday(450,'W').
classday(450,'F').
classday(443,'M').
classday(443,'W').
classday(443,'F').
classday(437,'M').
classday(437,'W').
classday(437,'F').
classday(375,'R').
classday(371,'M').
classday(371,'W').
classday(365,'T').
classday(365,'R').
classday(361,'T').
classday(361,'R').
classday(358,'M').
classday(358,'W').
classday(358,'F').
classday(353,'M').
classday(353,'W').
classday(353,'F').
classday(350,'M').
classday(350,'W').
classday(350,'F').
classday(343,'M').
classday(343,'W').
classday(343,'F').
classday(339,'T').
classday(339,'R').
classday(337,'T').
classday(337,'R').
classday(333,'W').
classday(330,'M').
classday(330,'W').
classday(330,'F').
classday(661,'T').	
classday(671,'R').
classday(691,'M').
classday(460,'T').
classday(460,'R').

classroom(467,'MAK B1118').
classroom(463,'MAK D2123').
classroom(460,'MAK B1116').
classroom(457,'MAK D1117').
classroom(452,'MAK D1117').
classroom(451,'MAK B1118').
classroom(450,'MAK D1117').
classroom(443,'MAK B1124').
classroom(437,'MAK B1118').
classroom(4375,'EC 612').
classroom(371,'MAK D1117').
classroom(365,'MAK D1117').
classroom(361,'MAK B1116').
classroom(358,'MAK A1105').
classroom(353,'MAK B1118').
classroom(350,'MAK D1117').
classroom(343,'MAK B1124').
classroom(339,'MAK A1105').
classroom(337,'MAK B1124').
classroom(333,'MAK D1117').
classroom(330,'MAK D1117').
classroom(661,'EC 612').
classroom(671,'EC 612').
classroom(691,'EC 612').

taughtby(330,'Dr. Du').
taughtby(333,'Ms. Posada').
taughtby(337,'Dr. El-Said').
taughtby(339,'Mr. Lange').
taughtby(343,'Dr. Nandigam').
taughtby(350,'Dr. Jorgensen').
taughtby(353,'Dr. Alsabbagh').
taughtby(358,'Dr. Kalafut').
taughtby(361,'Dr. Trefftz').
taughtby(365,'Dr. J. Leidig').
taughtby(371,'Dr. Scripps').
taughtby(375,'Dr. El-Said').
taughtby(437,'Dr. Engelsma').
taughtby(443,'Ms. Peterman').
taughtby(450,'Dr. Schymik').
taughtby(451,'Dr. Kurmas').
taughtby(452,'Dr. Wolffe').
taughtby(457,'Dr. Kalafut').
taughtby(460,'Dr. P. Leidig').
taughtby(463,'Mr. Lange').
taughtby(467,'Dr. Engelsma').
taughtby(661,'Dr. J. Leidig').
taughtby(671,'Dr. J. Leidig').
taughtby(691,'Dr. J. Leidig').

classtype(330,'IS').
classtype(333,'IS').
classtype(337,'IS').
classtype(339,'IS').
classtype(343,'CS').
classtype(350,'CS').
classtype(353,'CS').
classtype(358,'CS').
classtype(361,'CS').
classtype(365,'CS').
classtype(371,'CS').
classtype(375,'IS').
classtype(437,'CS').
classtype(443,'IS').
classtype(450,'IS').
classtype(451,'CS').
classtype(452,'CS').
classtype(457,'CS').
classtype(460,'IS').
classtype(463,'IS').
classtype(467,'CS').
classtype(661,'CIS').
classtype(671,'CIS').
classtype(691,'CIS').

studenttaking(467,'Jim').
studenttaking(452,'Jim').
studenttaking(457,'Jim').
studenttaking(463,'Gaius Baltar').
studenttaking(460,'Gaius Baltar').
studenttaking(375,'Gaius Baltar').
studenttaking(467,'Kara Thrace').
studenttaking(452,'Kara Thrace').
studenttaking(365,'Kara Thrace').
studenttaking(437,'Pam').
studenttaking(457,'Pam').
studenttaking(452,'Pam').

print_solution :-

/*Question 1*/
write('1.) What does Dr. J. Leidig teach?'), nl,
findall(Classname1,(taughtby(Classnumber1,'Dr. J. Leidig'),classname(Classnumber1,Classname1)),Query1),
tab(5),write(Query1), nl,nl,

/*Question 2*/
write('2.) Does Dr. J. Leidig teach Database?'), nl,
(teachesclass('Database','Dr. J. Leidig') -> Query2 = true; Query2 = false),
tab(5),write(Query2),nl,nl,

/*Question 3*/
/*A: Name of class
 *B: Day of the week
 *C: class start time
 *N: class number
 */
write('3.) What is Dr. J. Leidig’s schedule?'), nl,
findall((A,B,C,D),(taughtby(N,'Dr. J. Leidig'),classname(N,A),classday(N,B),classtimestart(N,C),classtimeend(N,D)),Query3),
tab(5),write(Query3), nl,nl,

/*Question 4*/
/*X: Prof name
 *N: class number
 *Name: class name
 */   
write('4.) Who is scheduled to teach what subject on TTH, 10am?'), nl,
setof((X,NAME),(taughtby(N,X),classday(N,'T'),classday(N,'R'),classtimestart(N,'10:00 am'),classname(N,NAME)),Query4),
tab(5),write(Query4), nl,nl,

/*Question 5*/
/*A5: Day of class
 *B5: Class start time
 *M5: Class2 number
 *N5: Class1 number
 */
write('5.) When do Dr. J. Leidig and Dr. El-Said teach at the same time?'), nl,
findall((A5,B5),((taughtby(N5,'Dr. El-Said'),classday(N5,A5),classtimestart(N5,B5)),(taughtby(M5,'Dr. J. Leidig'),classday(M5,A5),classtimestart(M5,B5))),Query5),
tab(5),write(Query5), nl,nl,

/*Question 6*/
/*A6: Class1 number
 *B6: Class2 number
 *X6: Prof2
 *Y6: Day of class
 *Z6: Class start time
 */
write('6.) Who teaches at the same time as Dr. J. Leidig?'), nl,
setof((X6),A6^B6^Y6^Z6^((taughtby(A6,'Dr. J. Leidig'),classday(A6,Y6),classtimestart(A6,Z6)),(taughtby(B6,X6),classday(B6,Y6),classtimestart(B6,Z6))),Q6),subtract(Q6,['Dr. J. Leidig'],Query6),
tab(5),write(Query6), nl,nl,

/*Question 7*/
/*S7:Student name
 */
write('7.) What courses do Jim and Pam have in common?'), nl,
setof((S7),(studenttaking(S7,'Jim'),studenttaking(S7,'Pam')),Q7),
tab(5),write(Q7), nl,nl,

/*Question 8*/
/*A8: Student name
 *N8: Class number
 */
write('8.) Who is taking CS courses?'), nl,
setof(A8,N8^(studenttaking(N8,A8),classtype(N8,'CS')),Query8),
tab(5),write(Query8), nl,nl,

/*Question 9*/
/*A9: Class type
 *S9: Class number
 */
write('9.) What types of courses are Gaius Baltar taking?'), nl,
setof((A9),S9^(studenttaking(S9,'Gaius Baltar'),classtype(S9,A9)),Q9),
tab(5),write(Q9), nl,nl,

/*Question 10*/
write('10.) Are there any scheduling conflicts of professors or locations?'), nl,nl,

/* Location conflicts*/
tab(5),write('Locations conflicts:'), nl,
tab(5),setof((Day_10, StartTime_10, Location_10),Course1_10^Course2_10^(taughtby(Course1_10, Prof1_10),taughtby(Course2_10, Prof2_10),classroom(Course1_10, Location_10),classroom(Course2_10, Location_10),classday(Course1_10,Day_10),classday(Course2_10,Day_10),classtimestart(Course1_10, StartTime_10),classtimestart(Course2_10, StartTime_10),Prof1_10 \= Prof2_10),Q10),write(Q10), nl,nl,

/* Scheduling conflicts*/
tab(5),write('Scheduling conflicts:'), nl,
tab(5),setof((Prof1_11, Day_11, StartTime_11),Course1_11^Course2_11^(taughtby(Course1_11, Prof1_11),taughtby(Course2_11, Prof1_11),classday(Course1_11,Day_11),classday(Course2_11,Day_11),classtimestart(Course1_11, StartTime_11),classtimestart(Course2_11, StartTime_11),Course1_11 \= Course2_11),Q11),write(Q11),nl.

?- print_solution.