USE poseid;

-- 刪除
-- DROP TABLE table_name;

INSERT `user` (`password`,`fullname`,`username`,`birthday`,`address`,`phoneNumber`,`email`) VALUES
('test', 'eric', 'eric','1998-12-20','home' ,'0912312345' , 'eric@gmail.com'),
('test', 'kai', 'kai', '1999-01-04', 'home', '0912345678', 'kai@gmail.com'),
('test', 'kai2', 'kai2', '2000-02-07', 'home', '0966477382', 'kai2@gmail.com'),
('test', 'joe', 'joe', '2000-03-20', 'home', '0918537624', 'joe@gmail.com'),
('test', 'peter', 'peter', '1998-04-25', 'home', '0987654321', 'peter@gmail.com'),
('test', 'jj', 'jj', '1999-05-30', 'home', '0912837465', 'jj@gmail.com'),
('test', 'potato', 'potato', '1999-05-30', 'home', '0912837465', 'potato@gmail.com');

INSERT `discount` (`value`,`code` ,`name` ,`startDate`,`endDate`) VALUES
(0,0,0,0,0),
(0.8,"NY001", "2022 New Year Sale 20% OFF","2022-01-01", "2022-01-30"),
(0.5,"SP001", "Special Offer 50% OFF","2022-01-01", "2022-12-31"),
(0.2,"TE001", "Mr. Liu Become Suger Duddy","2022-01-01", "2022-12-31");

-- SELECT * FROM `item`;
-- ALTER TABLE `item` DROP column `size`;

INSERT `item` (`name`,`quantity`,`category`,`price`,`description`,`pictureURL`) VALUES
("Professional Grooming Styling Cream (HARD) (80g)",15,"hair-styling",149,"徹底堅持髮腊\r\nPoseid造型品能讓你透過各式各樣造型\r\n成為成熟上質感大人","./img/items/P-HS-21-001_img01.png"),
("Professional Grooming Styling Cream (EX HARD) (80g)",10,"hair-styling",149,"歷久彌堅髮腊\r\nPoseid造型品能讓你透過各式各樣造型\r\n成為成熟上質感大人","./img/items/P-HS-21-002_img01.png"),
("Professional Grooming Styling Cream (WET) (80g)",15,"hair-styling",149,"極度洗練髮凍\r\nPoseid造型品能讓你透過各式各樣造型\r\n成為成熟上質感大人","./img/items/P-HS-21-003_img01.png"),
("Professional Grooming Styling Cream (MATTE) (80g)",15,"hair-styling",149,"絕對上進凝土\r\nPoseid造型品能讓你透過各式各樣造型\r\n成為成熟上質感大人","./img/items/P-HS-21-004_img01.png"),
("Professional Grooming Styling Cream (NUANCE) (80g)",15,"hair-styling",149,"隨意帥性輕髮腊\r\nPoseid造型品能讓你透過各式各樣造型\r\n成為成熟上質感大人","./img/items/P-HS-21-005_img01.png"),
("Professional Face Care Face Cream (NORMAL) (100g)",20,"face-care",169,"完效肌膚保養凍\r\n其實很簡單！濃縮5道保養程序，早上洗臉後，1瓶就可以！\r\n新升級活膚配方，ALL IN ONE多效保養一瓶搞定","./img/items/P-FC-21-001_img01.png"),
("Professional Face Care Face Cream (MOIST) (100g)",20,"face-care",169,"完效肌膚保養凍 保濕型\r\n其實很簡單！濃縮5道保養程序，早上洗臉後，1瓶就可以！\r\n1瓶即可充分補水，長效保濕！","./img/items/P-FC-21-002_img01.png"),
("Professional Face Care Face Cream (EX COOL) (100g)",20,"face-care",169,"完效肌膚保養凍 特涼型\r\n新升級活膚配方，ALL IN ONE多效保養一瓶搞定","./img/items/P-FC-21-003_img01.png"),
("Professional Face Care Face Cream (GOLD) (90g)",20,"face-care",209,"完效肌膚保養凍 黃金配方\r\n新升級活膚配方，ALL IN ONE多效保養一瓶搞定","./img/items/P-FC-21-004_img01.png"),
("Professional Whip Wash (BLACK) (120g)",25,"face-wash",129,"炭洗顏\r\n添加淨油炭粉的超濃密泡沫！\r\n控油力UP\r\n清除皮脂、洗淨油光，呈現超清爽肌膚。","./img/items/P-FW-21-001_img01.png"),
("Professional Whip Wash (SCRUB) (120g)",25,"face-wash",129,"淨洗顏\r\n添加雙重植物性磨砂成分的濃密泡沫\r\n潔淨力UP\r\n能深入清潔毛孔髒污、黑頭，同時去除粗糙角質","./img/items/P-FW-21-002_img01.png"),
("Professional Whip Wash (MOIST) (120g)",25,"face-wash",129,"潤洗顏\r\n添加雙重玻尿酸的超濃密泡沫\r\n保水力UP\r\n溫和潔淨，為乾燥的肌膚充足保水","./img/items/P-FW-21-003_img01.png"),
("Professional Skin Care Tank (MOIST) (110ml)",15,"skin-care",199,"俐落至上機能水 保濕型\r\n1瓶即可充分補水，長效保濕！\r\n10秒針對男人的乾粗困擾","./img/items/P-SC-21-001_img01.png"),
("Professional Skin Care Tank (OIL CONTROL) (110ml)",15,"skin-care",199,"俐落至上機能水 控油型\r\n1瓶即可避免油光，乾淨清爽！\r\n10秒針對男人的油光困擾","./img/items/P-SC-21-002_img01.png"),
("Professional Skin Care Tank (MILD) (110ml)",15,"skin-care",199,"俐落至上機能水 敏感型\r\n1瓶即可溫和保養，調理肌膚！\r\n10秒針對男人的敏感困擾","./img/items/P-SC-21-003_img01.png");

INSERT `like` VALUES
(1,1),
(1,3),
(2,2),
(2,1),
(2,4);

INSERT `rate` VALUES
(1,1,"good",5),
(1,2,"bad quality",1),
(1,3,"good service",4);

-- status code 0 = new order,  2 = shipout, 3 = arrived(done) default 0
INSERT `order`(`orderDate`,`status`,`orderUserID`) VALUES
("2021-12-12", 0, 1),
("2021-12-31", 3, 1);

INSERT `itemlist` VALUES
(2,1,2),
(1,1,1),
(3,1,1),
(4,2,2),
(3,2,3);

----------------------------
-- test
----------------------------
-- SELECT * FROM `user`;
-- SELECT * FROM `item`;
-- SELECT * FROM `discount`;
-- SELECT * FROM `like`;
-- SELECT * FROM `order`;
-- SELECT * FROM `itemlist`;
-- SELECT * FROM `rate`;
-- SHOW INDEX FROM `discount` WHERE key_name = 'PRIMARY';