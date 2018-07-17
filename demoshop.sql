/*
Navicat MySQL Data Transfer

Source Server         : tcmp058
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : demoshop

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-07-17 15:46:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for code
-- ----------------------------
DROP TABLE IF EXISTS `code`;
CREATE TABLE `code` (
  `codeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商户编号',
  `codeName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商户姓名',
  `codePwd` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商户密码',
  `phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号',
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `levelId` int(11) DEFAULT NULL COMMENT '上级代理商',
  `rate` double DEFAULT NULL COMMENT '费率',
  PRIMARY KEY (`codeId`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of code
-- ----------------------------
INSERT INTO `code` VALUES ('2', '李四', '123123', '10010110000', '北京', '1', '0.02');
INSERT INTO `code` VALUES ('3', '王五', '123123', '10010110000', '北京', '1', '0.01');
INSERT INTO `code` VALUES ('4', '赵六', '123123', '10010110000', '北京', '1', '0.01');
INSERT INTO `code` VALUES ('5', '宇轩', '123123', '15015015000', '朝阳', '1', '0.02');
INSERT INTO `code` VALUES ('6', '宇轩1', '123123', '16016016000', '北京朝阳', '3', '0.02');
INSERT INTO `code` VALUES ('7', '张三2', '123123', '10010110000', '北京', '2', '0.01');
INSERT INTO `code` VALUES ('8', '张3', '123123', '10010110000', '北京', '2', '0.02');
INSERT INTO `code` VALUES ('10', '张三5', '123123', '10010110000', '北京', '2', '0.01');
INSERT INTO `code` VALUES ('11', '宇轩3', '123123', '16016016000', '管庄', '3', '0.01');
INSERT INTO `code` VALUES ('12', '宇轩4', '123123', '100861006', '管庄', '3', '0.02');
INSERT INTO `code` VALUES ('13', '宇轩15', '123123', '15555100101', '管庄', '3', '0.02');
INSERT INTO `code` VALUES ('14', '宇轩2', '123123', '16016016000', '管庄', '3', '0.01');
INSERT INTO `code` VALUES ('15', '下课', '123123', '12312313222', '北京朝阳', '2', '0.01');
INSERT INTO `code` VALUES ('16', '宇轩', '123123', '15015015000', '管庄', '3', '0.02');
INSERT INTO `code` VALUES ('17', '测试', '123123', '15015015000', '朝阳', '3', '0.01');
INSERT INTO `code` VALUES ('18', '宇轩', '123123', '15015015000', '朝阳', '3', '0.01');
INSERT INTO `code` VALUES ('19', '宇轩', '123123', '15015015000', '朝阳', '2', '0.01');
INSERT INTO `code` VALUES ('23', '宇轩', '123123', '12123122112', '北京', '2', '0.01');
INSERT INTO `code` VALUES ('24', '宇轩', '123123', '15515515555', '北京', '2', '0.02');

-- ----------------------------
-- Table structure for rank
-- ----------------------------
DROP TABLE IF EXISTS `rank`;
CREATE TABLE `rank` (
  `rankId` int(11) NOT NULL AUTO_INCREMENT COMMENT '收银编号',
  `rankMoney` double(255,0) DEFAULT NULL COMMENT '交易金额',
  `codeId` int(11) DEFAULT NULL COMMENT '商户交易人',
  `rankDate` datetime DEFAULT NULL COMMENT '交易时间',
  `rate` double DEFAULT NULL COMMENT '费率',
  PRIMARY KEY (`rankId`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of rank
-- ----------------------------
INSERT INTO `rank` VALUES ('1', '150', '1', '2018-07-17 09:53:25', '0.01');
INSERT INTO `rank` VALUES ('2', '260', '2', '2018-07-17 10:37:58', '0.02');
INSERT INTO `rank` VALUES ('3', '100', '2', '2018-07-17 15:00:29', '0.02');
INSERT INTO `rank` VALUES ('4', '268', '4', '2018-07-17 10:38:15', '0.02');
INSERT INTO `rank` VALUES ('5', '128', '5', '2018-07-17 11:26:29', '0.02');
INSERT INTO `rank` VALUES ('6', '200', '5', '2018-07-17 10:14:05', '0.5');
INSERT INTO `rank` VALUES ('7', '250', '1', '2018-07-17 10:14:19', '0.02');
INSERT INTO `rank` VALUES ('8', '300', '4', '2018-07-17 10:15:13', '0.5');
INSERT INTO `rank` VALUES ('9', '400', '7', '2018-07-17 10:20:40', '0.02');
INSERT INTO `rank` VALUES ('10', '100', '2', '2018-07-17 10:16:07', '0.5');
INSERT INTO `rank` VALUES ('11', '50', '3', '2018-07-17 10:17:57', '0.02');
INSERT INTO `rank` VALUES ('12', '1000', '4', '2018-07-12 00:00:00', '0.5');
INSERT INTO `rank` VALUES ('13', '100', '1', '2018-07-16 13:18:33', '0.2');
INSERT INTO `rank` VALUES ('14', '100', '1', '2018-07-16 13:22:25', '0.02');
INSERT INTO `rank` VALUES ('15', '100', '1', '2018-07-16 14:08:49', '0');
INSERT INTO `rank` VALUES ('16', '1000', '1', '2018-07-16 14:09:38', '0.02');
INSERT INTO `rank` VALUES ('17', '100', '4', '2018-07-16 14:09:56', '0.02');
INSERT INTO `rank` VALUES ('18', '100', '4', '2018-07-16 14:12:14', '0.02');
INSERT INTO `rank` VALUES ('19', '100', '5', '2018-07-16 14:15:39', '0.02');
INSERT INTO `rank` VALUES ('21', '100', '1', '2018-07-16 14:32:20', '0.02');
INSERT INTO `rank` VALUES ('22', '1500', '18', '2018-07-16 18:52:03', '0.5');
INSERT INTO `rank` VALUES ('23', '268', '4', '2018-07-17 10:39:48', '0.02');
INSERT INTO `rank` VALUES ('24', '100', '6', '2018-07-17 14:56:23', '2');
INSERT INTO `rank` VALUES ('25', '100', '6', '2018-07-17 14:56:37', '0.02');
INSERT INTO `rank` VALUES ('26', '100', '4', '2018-07-17 14:57:33', '0.02');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '代理商编号',
  `userName` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '代理商姓名',
  `userPwd` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '代理商密码',
  `phone` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '手机号',
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `parentId` int(11) DEFAULT NULL COMMENT '父级Id',
  `levelId` int(11) DEFAULT NULL COMMENT '上级代理商',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '宇轩', 'yuxuan', '12312312333', '北京', '1', '1');
INSERT INTO `user` VALUES ('2', '小天', 'xiaotian', '12312312333', '北京', '2', '2');
INSERT INTO `user` VALUES ('3', '赵日天', 'zhaoritian', '12312312333', '北京', '3', '3');
INSERT INTO `user` VALUES ('4', '小轩', 'xiaoxuan', '123123', '北京', '2', '2');
INSERT INTO `user` VALUES ('5', '小刘', 'abc123', '123123', '北京', '2', '2');
INSERT INTO `user` VALUES ('6', '叶良辰', '123123', '123123', '北京', '3', '3');
