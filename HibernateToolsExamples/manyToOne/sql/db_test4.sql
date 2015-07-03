DROP DATABASE IF EXISTS `db_test4`;
CREATE DATABASE `db_test4` CHARACTER SET gb2312;
USE `db_test4`;
CREATE TABLE `customer` (
  `ID` int(4) NOT NULL auto_increment,
  `CNAME` char(20) default NULL,
  `BANK` varchar(40) default NULL,
  `PHONE` varchar(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;
CREATE TABLE `orders` (
  `ID` int(4) NOT NULL auto_increment,
  `ORDERNO` varchar(20) default NULL,
  `MONEY` decimal(10,2) default NULL,
  `CUSTOMER_ID` int(4) NOT NULL default '0',
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=gb2312;