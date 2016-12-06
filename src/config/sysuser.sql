/*
Navicat MySQL Data Transfer

Source Server         : stu
Source Server Version : 50540
Source Host           : 127.0.0.1:3306
Source Database       : ssmtest

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-12-06 22:33:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
