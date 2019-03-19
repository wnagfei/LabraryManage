/*
Navicat MySQL Data Transfer

Source Server         : 17
Source Server Version : 50637
Source Host           : 10.20.1.17:3306
Source Database       : labraymanage

Target Server Type    : MYSQL
Target Server Version : 50637
File Encoding         : 65001

Date: 2019-03-19 15:40:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for labray_info
-- ----------------------------
DROP TABLE IF EXISTS `labray_info`;
CREATE TABLE `labray_info` (
  `id` int(11) NOT NULL,
  `labrayAdress` varchar(255) DEFAULT NULL,
  `labrayName` varchar(255) DEFAULT NULL,
  `labrayRemark` varchar(255) DEFAULT NULL,
  `labrayStatus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of labray_info
-- ----------------------------

-- ----------------------------
-- Table structure for material_for
-- ----------------------------
DROP TABLE IF EXISTS `material_for`;
CREATE TABLE `material_for` (
  `id` int(11) NOT NULL,
  `materialNo` varchar(255) DEFAULT NULL,
  `payforNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_for
-- ----------------------------

-- ----------------------------
-- Table structure for material_info
-- ----------------------------
DROP TABLE IF EXISTS `material_info`;
CREATE TABLE `material_info` (
  `id` int(11) NOT NULL,
  `materialAdress` varchar(255) DEFAULT NULL,
  `materialCategory` varchar(255) DEFAULT NULL,
  `materialName` varchar(255) DEFAULT NULL,
  `materialNo` varchar(255) DEFAULT NULL,
  `materialOrder` varchar(255) DEFAULT NULL,
  `materialOwner` varchar(255) DEFAULT NULL,
  `materialRemark` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_info
-- ----------------------------

-- ----------------------------
-- Table structure for material_payfor_info
-- ----------------------------
DROP TABLE IF EXISTS `material_payfor_info`;
CREATE TABLE `material_payfor_info` (
  `id` int(11) NOT NULL,
  `materialName` varchar(255) DEFAULT NULL,
  `materialNo` varchar(255) DEFAULT NULL,
  `payForMoney` varchar(255) DEFAULT NULL,
  `payForOwner` varchar(255) DEFAULT NULL,
  `payForReason` varchar(255) DEFAULT NULL,
  `payForRemark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_payfor_info
-- ----------------------------

-- ----------------------------
-- Table structure for material_repair
-- ----------------------------
DROP TABLE IF EXISTS `material_repair`;
CREATE TABLE `material_repair` (
  `id` int(11) NOT NULL,
  `materialNo` varchar(255) DEFAULT NULL,
  `repairNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_repair
-- ----------------------------

-- ----------------------------
-- Table structure for material_repair_info
-- ----------------------------
DROP TABLE IF EXISTS `material_repair_info`;
CREATE TABLE `material_repair_info` (
  `id` int(11) NOT NULL,
  `materialName` varchar(255) DEFAULT NULL,
  `materialNo` varchar(255) DEFAULT NULL,
  `repairReason` varchar(255) DEFAULT NULL,
  `repairRemark` varchar(255) DEFAULT NULL,
  `repairReturnDate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material_repair_info
-- ----------------------------

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `id` int(11) NOT NULL,
  `materialNo` varchar(255) DEFAULT NULL,
  `orderEnddate` datetime DEFAULT NULL,
  `orderPurpose` varchar(255) DEFAULT NULL,
  `orderStartdate` datetime DEFAULT NULL,
  `studentId` int(11) DEFAULT NULL,
  `teacherId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------

-- ----------------------------
-- Table structure for public_info
-- ----------------------------
DROP TABLE IF EXISTS `public_info`;
CREATE TABLE `public_info` (
  `id` int(11) NOT NULL,
  `publicContent` varchar(255) DEFAULT NULL,
  `publicEndTime` datetime DEFAULT NULL,
  `publicName` varchar(255) DEFAULT NULL,
  `publicStartTime` datetime DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of public_info
-- ----------------------------

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('1', '?????', '???', '', '123456', null, '??', '?', null, '??');

-- ----------------------------
-- Table structure for teacher_info
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `remart` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('1', '???', '???', '', '123456', null, '??', '?', null, '???', 'wang');

-- ----------------------------
-- Table structure for violation_info
-- ----------------------------
DROP TABLE IF EXISTS `violation_info`;
CREATE TABLE `violation_info` (
  `id` int(11) NOT NULL,
  `materialNo` varchar(255) DEFAULT NULL,
  `orderId` int(11) DEFAULT NULL,
  `payforId` int(11) DEFAULT NULL,
  `studentId` int(11) DEFAULT NULL,
  `teacherId` int(11) DEFAULT NULL,
  `violationReason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of violation_info
-- ----------------------------
