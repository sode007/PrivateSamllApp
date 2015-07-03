DROP DATABASE IF EXISTS `db_test3`;
CREATE DATABASE `db_test3` CHARACTER SET gb2312;
USE `db_test3`;
CREATE TABLE `address` (
  `ID` int(4) NOT NULL auto_increment,
  `PROVINCE` varchar(40) default NULL,
  `CITY` varchar(40) default NULL,
  `STREET` varchar(100) default NULL,
  `ZIPCODE` char(10) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=gb2312;
CREATE TABLE `client` (
  `ID` int(4) NOT NULL auto_increment,
  `CLIENTNAME` char(20) default NULL,
  `PHONE` char(20) default NULL,
  `EMAIL` varchar(100) default NULL,
  `ADDRESS` int(4) NOT NULL default '0',
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=gb2312;
CREATE TABLE `company` (
  `ID` int(4) NOT NULL auto_increment,
  `COMPANYNAME` varchar(100) default NULL,
  `LINKMAN` char(20) default NULL,
  `TELEPHONE` char(20) default NULL,
  `EMAIL` varchar(100) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=gb2312;
CREATE TABLE `login` (
  `ID` int(4) NOT NULL default '0',
  `LOGINNAME` char(20) default NULL,
  `LOGINPWD` char(20) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;