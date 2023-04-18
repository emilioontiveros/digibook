CREATE TABLE CATEGORY (
ID INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(100) NOT NULL,
DESCRIPTION VARCHAR (250) NOT NULL,
URL VARCHAR(100) NOT NULL,



INSERT INTO CATEGORY (NAME, DESCRIPTION, URL) VALUES
('Gold','Habitacion XXL con cama doble, vista al mar... ','data:image/jpeg;base64,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');
INSERT INTO CATEGORY (NAME, DESCRIPTION, URL) VALUES
('Platinum','Habitacion comoda, bañera...  ','https://www.google.com/imgres?imgurl=https%3A%2F%2Fwww.santuariohotel.com%2Fwp-content%2Fuploads%2F2019%2F01%2FGaleriaHabitacion2.jpg&imgrefurl=https%3A%2F%2Fwww.santuariohotel.com%2Fhabitacion-doble&tbnid=_WlNHhuPHr20RM&vet=12ahUKEwj3pv6K66z9AhV0lIQIHQ-rB14QMygDegUIARDmAQ..i&docid=zrXCVYy3mvMbpM&w=865&h=510&q=habitacion%20doble&ved=2ahUKEwj3pv6K66z9AhV0lIQIHQ-rB14QMygDegUIARDmAQ');

