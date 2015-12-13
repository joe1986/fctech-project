/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50625
 Source Host           : localhost
 Source Database       : fctech

 Target Server Type    : MySQL
 Target Server Version : 50625
 File Encoding         : utf-8

 Date: 12/08/2015 21:36:06 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_BASE_ACCOUNT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_ACCOUNT`;
CREATE TABLE `T_BASE_ACCOUNT` (
  `account_id` varchar(32) NOT NULL COMMENT '账户ID',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `T_BASE_AUTHORITY`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_AUTHORITY`;
CREATE TABLE `T_BASE_AUTHORITY` (
  `AUTHORITY_ID` varchar(32) NOT NULL COMMENT 'PK',
  `AUTHORITY_NAME` varchar(32) NOT NULL COMMENT '权限名称',
  `AUTHORITY_NO` varchar(32) NOT NULL COMMENT '权限编号',
  `CREATE_TIME` varchar(50) DEFAULT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` varchar(50) DEFAULT NULL COMMENT '最后修改时间',
  `AUTO_AUTHORITY_FLAG` char(1) NOT NULL DEFAULT '1' COMMENT '是否为自动权限设置 1是 0否',
  `DELETE_FLAG` char(1) DEFAULT '0' COMMENT '删除标志  0 未删除 1已删除  默认 0',
  `OP_USER` varchar(32) NOT NULL COMMENT '操作人',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `T_BASE_AUTHORITY`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_AUTHORITY` VALUES ('201409051757241232545', '执行', '0036', '2014-09-05 17:57:24', '2014-09-05 17:57:24', '0', '0', '201409041323341231935', ''), ('201409091359221233017', '企业', '0029', '2014-09-09 13:59:22', '2014-09-09 13:59:22', '0', '0', '1', '企业管理权限'), ('201409091359441233018', '银行', '0030', '2014-09-09 13:59:44', '2014-09-09 13:59:44', '0', '0', '1', '银行相关权限'), ('201409091400011233019', '运营', '0033', '2014-09-09 14:00:01', '2014-09-09 14:00:01', '0', '0', '1', '运营相关权限'), ('201409131143281256264', '查看操作日志', '0037', '2014-09-13 11:43:28', '2014-09-13 11:43:28', '0', '0', '1', '查看操作日志权限'), ('201409131143451256265', '查看访问日志', '0038', '2014-09-13 11:43:45', '2014-09-13 11:43:45', '0', '0', '1', '查看访问日志权限'), ('201409131144021256266', '查看导入错误日志', '0039', '2014-09-13 11:44:02', '2014-09-13 11:44:02', '0', '0', '1', '查看导入错误日志权限'), ('7535f7863a5d489796cddb9134ac65fb', '内存同步', '0016', '2014-06-15 15:29:56', '2014-06-15 15:29:56', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('95933429241929907', '下载', '0020', '2015-03-31 12:53:40', '2015-03-31 12:53:40', '0', '0', '1', ''), ('F9F9CBEAD95CEF96E040007F01004A04', '完全控制', '0001', '2014-05-22 16:08:56', '2014-06-03 23:12:26', '1', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', '1212'), ('F9F9CDBD85D98581E040007F01004A1E', '增加', '0002', '2014-05-22 16:08:56', '2014-05-22 16:09:06', '1', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('F9F9D27A760CC183E040007F01004A31', '修改', '0003', '2014-05-22 16:08:56', '2014-05-22 16:09:06', '1', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('F9F9D39B77A82AD3E040007F01004A3C', '删除', '0004', '2014-05-22 16:08:56', '2014-05-22 16:09:06', '1', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('F9F9D5E3107DE8F6E040007F01004A50', '查询', '0005', '2014-05-22 16:08:56', '2014-05-22 16:09:06', '1', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FA23A72B5FB9D7BBE040007F01003086', '详情', '0006', '2014-05-24 18:16:17', '2014-05-24 18:16:17', '1', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FA44D604131D6EE2E040007F01007BA5', '审核', '0007', '2014-05-26 09:51:29', '2014-05-26 09:51:29', '1', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FA45EA5AB2152437E040007F01007F89', '失效', '0008', '2014-05-26 11:08:45', '2014-07-04 18:04:59', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FA45EE74D0D460C2E040007F01007FAA', '解约', '0009', '2014-05-26 11:09:55', '2014-05-26 11:09:55', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FA45F4695B643AC8E040007F01007FDA', '冻结', '0010', '2014-05-26 11:11:35', '2014-05-26 11:11:35', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FA45F6184882C8B5E040007F01007FE5', '解冻', '0011', '2014-05-26 11:12:03', '2014-05-26 11:12:03', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FA45F93AE7159C6AE040007F01000197', '退货', '0012', '2014-05-26 11:12:56', '2014-05-26 11:12:56', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FAFF2D58039582A8E040007F010062C4', '查询余额', '0013', '2014-05-26 11:12:03', '2014-05-26 11:12:03', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FB25872B1F0E4DBBE040007F01005794', '移出', '0014', '2014-05-26 11:11:35', '2014-05-26 11:11:35', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FB4E118EB9E93F42E040007F01006264', '可见', '0015', '2014-06-08 14:17:16', '2014-06-08 14:17:16', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FC808881E035DC06E040007F010016F8', '对账', '0017', '2014-06-23 19:54:31', '2014-06-23 19:54:31', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', '对账权限'), ('FC8114C728CAB909E040007F01001CDC', '调账', '0018', '2014-06-23 20:33:44', '2014-06-23 20:33:44', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', '调账权限'), ('FC911C0F15EA6A3AE040007F0100522F', '查看报表', '0019', '2014-06-24 15:41:04', '2014-06-24 15:41:04', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', '查看统计报表'), ('FD19CC16B4D76DC5E043DE0338ACE69D', '授权', '0023', '2014-07-01 12:03:02', '2014-08-26 11:02:21', '0', '0', '1', ''), ('FD1DF8757CFC2A61E043DE0338ACE54F', '续跑', '0024', '2014-07-01 16:16:43', '2014-07-01 16:16:43', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FD1DF8757CFE2A61E043DE0338ACE54F', '调起', '0025', '2014-07-01 16:17:13', '2014-07-01 16:17:13', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', null), ('FD1F6BF6415831F7E043DE0338ACE1E3', '已结算', '0026', '2014-07-01 19:00:19', '2014-07-01 19:00:19', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', '财务结算'), ('FD1F6BF6415931F7E043DE0338ACE1E3', '导入', '0028', '2014-07-01 19:01:16', '2014-07-01 19:01:16', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', '财务导入'), ('FD1FA70248C231F5E043DE0338ACAB63', '导出', '0027', '2014-07-01 19:00:52', '2014-07-01 19:00:52', '0', '0', '3f4f292550a641c08fdcc2e72b5c8ab4', '财务导出');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_COMPANY`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_COMPANY`;
CREATE TABLE `T_BASE_COMPANY` (
  `company_id` int(8) NOT NULL AUTO_INCREMENT,
  `company_name` varchar(20) COLLATE utf8_unicode_ci NOT NULL DEFAULT '' COMMENT '用户名',
  `company_address` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `organization_code` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '组织机构代码（单位代码）',
  `company_type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '企业类型（国企，外企，民营）',
  `company_email` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_phone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `legal_person_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `legal_person_id` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chief_engineer` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `engineer_psw` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `bank` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bankAccount` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_active` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '判断是否激活,激活，未激活，未审核',
  `register_name` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT '注册人姓名',
  `register_phone` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '注册人电话',
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_COMPANY`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_COMPANY` VALUES ('40', 'qqqqq', 'qq', null, null, 'q@q.com', '12', '12', '13', '12', '12', '中国工商银行', '12', '已通过', '', ''), ('41', 'xxxxxx', 'xxxx', null, null, 'xx', 'x', 'x', 'x', 'x', 'x', '中国建设银行', '1', '已通过', '', '');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_COMPANY_LICENSE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_COMPANY_LICENSE`;
CREATE TABLE `T_BASE_COMPANY_LICENSE` (
  `businessLicense_id` int(8) NOT NULL AUTO_INCREMENT,
  `businessLicense_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `businessLicense_dates` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `businessLicense_datee` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`businessLicense_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_COMPANY_LICENSE`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_COMPANY_LICENSE` VALUES ('46', '12', '12', '12', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\businessLicense', 'P40618-222025.jpg', '40'), ('47', '1', '1', '2', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\businessLicense', 'QQ截图20141109101245.png', '41');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_COMPANY_ORG_CODE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_COMPANY_ORG_CODE`;
CREATE TABLE `T_BASE_COMPANY_ORG_CODE` (
  `organizationCode_id` int(4) NOT NULL AUTO_INCREMENT,
  `organizationCode_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`organizationCode_id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_COMPANY_ORG_CODE`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_COMPANY_ORG_CODE` VALUES ('45', '12', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\organizationCode', 'P40630-193147.jpg', '40'), ('46', '1', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\organizationCode', 'QQ截图20141109101245.png', '41');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_COMPANY_QUALIFICATION`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_COMPANY_QUALIFICATION`;
CREATE TABLE `T_BASE_COMPANY_QUALIFICATION` (
  `qualification_id` int(8) NOT NULL AUTO_INCREMENT,
  `qualification_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qualification_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qualification_valperiod` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` int(8) DEFAULT NULL,
  PRIMARY KEY (`qualification_id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_COMPANY_QUALIFICATION`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_COMPANY_QUALIFICATION` VALUES ('63', '12', '12', '12', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\qualification', 'QQ截图20140804111917.png', '40'), ('64', '1', '2', '2', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\qualification', 'QQ截图20141109101245.png', '41');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_COMPANY_TAXREG`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_COMPANY_TAXREG`;
CREATE TABLE `T_BASE_COMPANY_TAXREG` (
  `taxReg_id` int(8) NOT NULL AUTO_INCREMENT,
  `taxReg_type` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `taxReg_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` int(8) DEFAULT NULL,
  PRIMARY KEY (`taxReg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_COMPANY_TAXREG`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_COMPANY_TAXREG` VALUES ('45', '国税', '12', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\taxReg', 'P40620-233528.jpg', '40'), ('46', '国税', '3', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\taxReg', 'QQ截图20141109101245.png', '41');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_MENU`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_MENU`;
CREATE TABLE `T_BASE_MENU` (
  `MENU_ID` varchar(32) NOT NULL COMMENT 'PK',
  `PARENT_MENU_ID` varchar(32) NOT NULL COMMENT '父级菜单',
  `MENU_ICON` varchar(100) DEFAULT NULL COMMENT '菜单图标或CSS',
  `MENU_URL` varchar(500) DEFAULT NULL COMMENT '菜单URL',
  `OPEN_FLAG` char(1) DEFAULT '1' COMMENT '是否启用  1启用 0不启用默认1',
  `MENU_NO` varchar(50) DEFAULT NULL COMMENT '菜单编码',
  `CREATE_TIME` varchar(50) NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` varchar(50) NOT NULL COMMENT '最后修改时间',
  `SYS_TYPE` char(1) DEFAULT '1' COMMENT '系统类型  1、运维支撑 2、门户  默认  1',
  `OP_USER` varchar(32) NOT NULL COMMENT '操作人',
  `MEMO` varchar(200) DEFAULT NULL COMMENT '备注',
  `SORT_NO` int(11) NOT NULL COMMENT '排序号',
  `LEAF` char(1) DEFAULT '1' COMMENT '0:树枝节点;1:叶子节点 默认1',
  `MENU_TYPE` varchar(2) DEFAULT '0' COMMENT '1系统菜单 0普通菜单 默认0',
  `DELETE_FLAG` char(1) DEFAULT '0' COMMENT '删除标志 0 未删除 1已删除  默认 0',
  `ROLE_AUTHORITY_VISIBLE` varchar(100) NOT NULL COMMENT '在角色授权界面中，该菜单，对哪些角色类型可见',
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `T_BASE_MENU_AUTHORITY`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_MENU_AUTHORITY`;
CREATE TABLE `T_BASE_MENU_AUTHORITY` (
  `ID` varchar(32) NOT NULL COMMENT 'PK',
  `AUTHORITY_ID` varchar(32) NOT NULL COMMENT '权限ID',
  `MENU_ID` varchar(32) NOT NULL COMMENT '菜单ID',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `T_BASE_MENU_INTERNATIONAL`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_MENU_INTERNATIONAL`;
CREATE TABLE `T_BASE_MENU_INTERNATIONAL` (
  `ID` varchar(32) NOT NULL COMMENT '主键',
  `MENU_ID` varchar(32) NOT NULL COMMENT '菜单表主键',
  `MENU_NAME` varchar(500) NOT NULL COMMENT '菜单名称',
  `LANGUAGE_TYPE` varchar(5) NOT NULL DEFAULT 'zh' COMMENT '语言标示',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `T_CM_M_INTER_UNI` (`MENU_ID`,`LANGUAGE_TYPE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `T_BASE_PROJECT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_PROJECT`;
CREATE TABLE `T_BASE_PROJECT` (
  `project_id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `project_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '名称',
  `project_code` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '项目代码',
  `project_address` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `project_owner` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '业主',
  `project_mainDesigner` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '主体设计',
  `project_pitDesigner` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '基坑设计',
  `project_Contractor` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '施工总包',
  `project_pitSubcontract` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '基坑分包',
  `project_supervision` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '监理',
  `project_monitor` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '监测',
  `project_pitArea` double DEFAULT NULL COMMENT '基坑面积',
  `project_commonDepth` double DEFAULT NULL COMMENT '普遍深度',
  `project_aroundLong` double DEFAULT NULL COMMENT '周边长',
  `project_deepestDepth` double DEFAULT NULL COMMENT '最深深度',
  `company_id` int(8) DEFAULT NULL COMMENT '单位编号',
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_PROJECT`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_PROJECT` VALUES ('1', 'eeee,,,,', null, 'eeee', 'eeee', null, null, null, null, null, null, null, null, null, null, '0'), ('2', 'rrrrr', null, 'rrrrrrr', 'rr', null, null, null, null, null, null, null, null, null, null, '0'), ('3', 'uuuu', null, 'uu', 'uu', null, null, null, null, null, null, null, null, null, null, '0'), ('4', 'oooo', null, 'oo', 'oo', null, null, null, null, null, null, null, null, null, null, '0'), ('5', 'pppp', null, 'pp', 'p', null, null, null, null, null, null, null, null, null, null, '0'), ('6', 'sss', null, 'ss', 'sss', null, null, null, null, null, null, null, null, null, null, '35'), ('7', 'swe', null, 'ddd', 'd', null, null, null, null, null, null, null, null, null, null, '35'), ('8', 'dddd', null, 'ff', 'dfd', null, null, null, null, null, null, null, null, null, null, '35'), ('9', 'zzzz', null, 'zz', 'z', null, null, null, null, null, null, null, null, null, null, '35'), ('10', '', null, '', '', null, null, null, null, null, null, null, null, null, null, '35'), ('11', 'wqre', null, 'qwer', 'qwer@qq.com', null, null, null, null, null, null, null, null, null, null, '0'), ('12', 'iiiii', null, 'iiiii', 'ii@qq.vn', null, null, null, null, null, null, null, null, null, null, '0'), ('13', 'ppppp', null, 'ppp', 'pp@qq.com', null, null, null, null, null, null, null, null, null, null, '35'), ('14', 'rrrrt', null, 'rrtt', 'ttt', null, null, null, null, null, null, null, null, null, null, '36'), ('15', 'pppppp', null, 'pppp', 'we', null, null, null, null, null, null, null, null, null, null, '36'), ('16', 'wwee', null, 'we', 'ewr', 'rrt5', '6', '676', 'def', 'ds', 'aa', null, null, null, null, '35');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_PROJECT_ALLO_READER`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_PROJECT_ALLO_READER`;
CREATE TABLE `T_BASE_PROJECT_ALLO_READER` (
  `project_readerid` int(8) NOT NULL AUTO_INCREMENT,
  `reader_id` int(8) DEFAULT NULL,
  `project_id` int(8) DEFAULT NULL,
  `reviewStatus` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`project_readerid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_PROJECT_ALLO_READER`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_PROJECT_ALLO_READER` VALUES ('1', '1', '1', '通过', null), ('2', '2', '1', '未通过', null), ('3', '13', '1', '未审核', '2014-10-19 00:00:00'), ('4', '14', '1', '未审核', '2014-10-18 00:00:00'), ('5', '15', '1', '未审核', '2014-10-18 00:00:00'), ('6', '16', '1', '未审核', '2014-10-18 00:00:00'), ('7', '17', '1', '未审核', '2014-10-18 00:00:00'), ('9', '19', '1', '未审核', '2014-10-19 00:00:00'), ('10', '20', '1', '未审核', '2014-10-19 00:00:00');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_PROJECT_DOC`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_PROJECT_DOC`;
CREATE TABLE `T_BASE_PROJECT_DOC` (
  `projectdoc_id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '路径',
  `file_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文件名',
  `projectdoc_type` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文件类型',
  `project_id` int(8) DEFAULT NULL COMMENT '项目编号',
  PRIMARY KEY (`projectdoc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_PROJECT_DOC`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_PROJECT_DOC` VALUES ('1', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\projectpppp\\monitorcontract', '', '监测项目合同', '5'), ('2', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sss\\monitorcontract', '需求-原.docx', '监测项目合同', '6'), ('3', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sddwe\\monitorcontract', '企业信息登记表.docx', '监测项目合同', '7'), ('4', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\dddd\\monitorcontract', '企业信息登记表.docx', '监测项目合同', '8'), ('5', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\dddd\\managerappoint', '需求-原.docx', '项目经理任命文件', '8'), ('10', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sddwe\\managerappoint', '企业信息登记表.docx', '项目经理任命文件', '7'), ('11', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sss\\managerappoint', '需求-原.docx', '项目经理任命文件', '6'), ('12', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wqre\\monitorcontract', '需求-原.docx', '监测项目合同', '11'), ('13', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wqre\\managerappoint', '需求-原.docx', '项目经理任命文件', '11'), ('14', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\iiiii\\monitorcontract', '基坑截图.docx', '监测项目合同', '12'), ('15', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\iiiii\\managerappoint', '复件 富城需求流程.docx', '项目经理任命文件', '12'), ('16', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\ppppp\\monitorcontract', '需求-原.docx', '监测项目合同', '13'), ('17', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\ppppp\\managerappoint', '需求-原.docx', '项目经理任命文件', '13'), ('18', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\rrrrt\\monitorcontract', '企业信息登记表.docx', '监测项目合同', '14'), ('19', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\rrrrt\\managerappoint', '基坑截图.docx', '项目经理任命文件', '14'), ('20', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\pppppp\\monitorcontract', '企业信息登记表.docx', '监测项目合同', '15'), ('21', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\pppppp\\managerappoint', '基坑-代码模块.docx', '项目经理任命文件', '15'), ('22', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wwee\\monitorcontract', '数据通信协议.doc', '监测项目合同', '16'), ('23', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wwee\\managerappoint', '数据通信协议.doc', '项目经理任命文件', '16'), ('50', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', 'Winter.jpg', '项目图片', '1'), ('51', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', 'Water lilies.jpg', '项目图片', '1'), ('52', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', 'Blue hills.jpg', '项目图片', '1'), ('58', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', '20130620591.jpg', '项目图片', '1'), ('59', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', '20130620593.jpg', '项目图片', '1'), ('60', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', '20130620463.jpg', '项目图片', '1'), ('61', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', '20130620448.jpg', '项目图片', '1'), ('62', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', '9.jpg', '项目图片', '1'), ('63', 'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage', '3.jpg', '项目图片', '1');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_PROJECT_READER`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_PROJECT_READER`;
CREATE TABLE `T_BASE_PROJECT_READER` (
  `reader_id` int(8) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `truename` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idcard` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `usefulLife` int(11) DEFAULT NULL,
  `unitName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`reader_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BASE_PROJECT_READER`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_PROJECT_READER` VALUES ('1', 'q', 'q', 'q', 'q', null, null, null, 'q', null), ('2', '', '', 'w', 'w', null, null, null, 'w', null), ('3', null, null, 'e', 'e', null, null, null, 'e', null), ('4', null, null, '65', '66', null, null, null, '56', null), ('5', null, null, '56', '67', null, null, null, '56', null), ('6', null, null, '00', '00', null, null, null, '00', null), ('7', null, null, 'aa', 'aa', null, null, null, 'aa', null), ('8', null, null, 'yt', 'ty', null, null, null, 'rt', null), ('9', null, null, 'uu', 'uu', null, null, null, 'uu', null), ('10', null, null, 'ff', 'ff', null, null, null, 'ff', null), ('11', null, null, 'tt', 'tt', null, null, null, 'tt', null), ('12', null, null, 'az', 'za', null, null, null, 'az', null), ('13', null, null, 'fg78', 'fg78', null, null, null, 'fg78', null), ('14', null, null, 'fgwe', 'fgwe', null, null, null, 'fgwe', null), ('15', null, null, 'fgew', 'fgwew', null, null, null, 'fgew', null), ('16', null, null, 'fgdf', 'fgdf', null, null, null, 'fgdf', null), ('17', null, null, 'fgr', 'fgr', null, null, null, 'fgr', null), ('19', null, null, 'fgdd', 'fgdd', null, null, null, 'fgdd', null), ('20', null, null, 'fgdf', 'fgdf', null, null, null, 'fgdf', null);
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_ROLE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_ROLE`;
CREATE TABLE `T_BASE_ROLE` (
  `ROLE_ID` varchar(32) NOT NULL COMMENT 'PK',
  `ROLE_NAME` varchar(50) NOT NULL COMMENT '角色名称',
  `ROLE_NO` varchar(50) DEFAULT NULL COMMENT '角色编号',
  `CREATE_TIME` varchar(50) NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` varchar(50) NOT NULL COMMENT '最后修改时间',
  `LOCKED` char(1) DEFAULT '0' COMMENT '1:锁定;0:激活',
  `BANK_ID` varchar(32) DEFAULT NULL COMMENT '银行ID',
  `COMPANY_ID` varchar(32) DEFAULT NULL COMMENT '公司ID',
  `DEPARTMENT_ID` varchar(32) NOT NULL COMMENT '部门ID',
  `OP_USER` varchar(32) NOT NULL COMMENT '操作人',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  `ROLE_TYPE` char(1) DEFAULT '1' COMMENT '角色类型:1:业务角色,角色类型:2:管理角色 3系统内置角色 默认：1',
  `ROLE_FLAG` char(2) DEFAULT '1' COMMENT ' 1 内部角色 2 企业角色  3 银行角色，默认1',
  `AUDIT_FLAG` char(1) DEFAULT '0' COMMENT '1审核 0 不审核',
  `DELETE_FLAG` char(1) DEFAULT '0' COMMENT '0 未删除 1已删除  默认 0',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `T_BASE_ROLE`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_ROLE` VALUES ('0521202b43ef4c97bee97adbeff1da52', '银联业务运维用户角色', '', '2015-03-11 10:58:37', '2015-03-11 10:58:37', '0', null, '9358865eeab4439481616716df3b9826', '201409091642241233409', '1', '', '1', '4', '0', '0'), ('18792b26423b45faa02790fb2cecf1ad', '银联技术运维管理员角色', '', '2015-03-11 10:55:22', '2015-03-11 10:55:22', '0', null, '9358865eeab4439481616716df3b9826', '201409091821021233519', '1', '', '1', '5', '0', '0'), ('51e608eafe16497c8cf437a7a84aa692', '银联业务运维管理员角色', '', '2015-03-11 10:05:57', '2015-03-11 10:05:57', '0', null, '9358865eeab4439481616716df3b9826', '201409091642241233409', '1', '', '1', '1', '0', '0'), ('b55260ecdcdd4eef99cf5f92202f4c79', '银联银行运维管理员角色', '', '2015-03-11 10:58:08', '2015-03-11 10:58:08', '0', null, '9358865eeab4439481616716df3b9826', '201409091642241233409', '1', '', '1', '3', '0', '0'), ('d26fcc6af87b48869cdfbd314d3a25ad', '银联企业运维管理员角色', '', '2015-03-11 10:57:52', '2015-03-11 10:57:52', '0', null, '9358865eeab4439481616716df3b9826', '201409091642241233409', '1', '', '1', '2', '0', '0'), ('daec1b13c9d04b28b46db599fc93f592', '银联技术运维用户角色', '', '2015-03-11 10:56:07', '2015-03-11 10:56:07', '0', null, '9358865eeab4439481616716df3b9826', '201409091821021233519', '1', '', '1', '6', '0', '0');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_ROLE_AUTHORITY`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_ROLE_AUTHORITY`;
CREATE TABLE `T_BASE_ROLE_AUTHORITY` (
  `ID` varchar(32) NOT NULL COMMENT 'PK',
  `AUTHORITY_ID` varchar(32) NOT NULL COMMENT '授权ID',
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID',
  `MENU_ID` varchar(32) DEFAULT NULL COMMENT '菜单ID',
  `AUTHORIZELEVEL` char(1) NOT NULL DEFAULT '1' COMMENT '权限级别',
  `CREATE_TIME` varchar(50) NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` varchar(50) NOT NULL COMMENT '最后修改时间',
  `OP_USER` varchar(32) NOT NULL COMMENT '操作人',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `T_BASE_ROLE_AUTHORITY`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_ROLE_AUTHORITY` VALUES ('95933429241367018', 'F9F9CBEAD95CEF96E040007F01004A04', '51e608eafe16497c8cf437a7a84aa692', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367019', '', '51e608eafe16497c8cf437a7a84aa692', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367020', 'F9F9CBEAD95CEF96E040007F01004A04', '51e608eafe16497c8cf437a7a84aa692', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367021', 'F9F9CDBD85D98581E040007F01004A1E', '51e608eafe16497c8cf437a7a84aa692', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367022', 'F9F9D27A760CC183E040007F01004A31', '51e608eafe16497c8cf437a7a84aa692', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367023', 'F9F9D39B77A82AD3E040007F01004A3C', '51e608eafe16497c8cf437a7a84aa692', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367024', 'F9F9D5E3107DE8F6E040007F01004A50', '51e608eafe16497c8cf437a7a84aa692', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367025', 'FA23A72B5FB9D7BBE040007F01003086', '51e608eafe16497c8cf437a7a84aa692', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367026', 'F9F9CBEAD95CEF96E040007F01004A04', '51e608eafe16497c8cf437a7a84aa692', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367027', 'F9F9CDBD85D98581E040007F01004A1E', '51e608eafe16497c8cf437a7a84aa692', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367028', 'F9F9D27A760CC183E040007F01004A31', '51e608eafe16497c8cf437a7a84aa692', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367029', 'F9F9D39B77A82AD3E040007F01004A3C', '51e608eafe16497c8cf437a7a84aa692', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367030', 'F9F9D5E3107DE8F6E040007F01004A50', '51e608eafe16497c8cf437a7a84aa692', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367031', 'FA23A72B5FB9D7BBE040007F01003086', '51e608eafe16497c8cf437a7a84aa692', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367032', 'FD19CC16B4D76DC5E043DE0338ACE69D', '51e608eafe16497c8cf437a7a84aa692', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367033', 'F9F9CBEAD95CEF96E040007F01004A04', '51e608eafe16497c8cf437a7a84aa692', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367034', 'F9F9CDBD85D98581E040007F01004A1E', '51e608eafe16497c8cf437a7a84aa692', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367035', 'F9F9D27A760CC183E040007F01004A31', '51e608eafe16497c8cf437a7a84aa692', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367036', 'F9F9D39B77A82AD3E040007F01004A3C', '51e608eafe16497c8cf437a7a84aa692', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367037', 'F9F9D5E3107DE8F6E040007F01004A50', '51e608eafe16497c8cf437a7a84aa692', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367038', 'FA23A72B5FB9D7BBE040007F01003086', '51e608eafe16497c8cf437a7a84aa692', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367039', 'FD19CC16B4D76DC5E043DE0338ACE69D', '51e608eafe16497c8cf437a7a84aa692', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:07:21', '2015-03-11 10:07:21', '1', null), ('95933429241367062', 'F9F9CBEAD95CEF96E040007F01004A04', '18792b26423b45faa02790fb2cecf1ad', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367063', '', '18792b26423b45faa02790fb2cecf1ad', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367064', 'F9F9CBEAD95CEF96E040007F01004A04', '18792b26423b45faa02790fb2cecf1ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367065', 'F9F9CDBD85D98581E040007F01004A1E', '18792b26423b45faa02790fb2cecf1ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367066', 'F9F9D27A760CC183E040007F01004A31', '18792b26423b45faa02790fb2cecf1ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367067', 'F9F9D39B77A82AD3E040007F01004A3C', '18792b26423b45faa02790fb2cecf1ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367068', 'F9F9D5E3107DE8F6E040007F01004A50', '18792b26423b45faa02790fb2cecf1ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367069', 'FA23A72B5FB9D7BBE040007F01003086', '18792b26423b45faa02790fb2cecf1ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367070', 'F9F9CBEAD95CEF96E040007F01004A04', '18792b26423b45faa02790fb2cecf1ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367071', 'F9F9CDBD85D98581E040007F01004A1E', '18792b26423b45faa02790fb2cecf1ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367072', 'F9F9D27A760CC183E040007F01004A31', '18792b26423b45faa02790fb2cecf1ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367073', 'F9F9D39B77A82AD3E040007F01004A3C', '18792b26423b45faa02790fb2cecf1ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367074', 'F9F9D5E3107DE8F6E040007F01004A50', '18792b26423b45faa02790fb2cecf1ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367075', 'FA23A72B5FB9D7BBE040007F01003086', '18792b26423b45faa02790fb2cecf1ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367076', 'FD19CC16B4D76DC5E043DE0338ACE69D', '18792b26423b45faa02790fb2cecf1ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367077', 'F9F9CBEAD95CEF96E040007F01004A04', '18792b26423b45faa02790fb2cecf1ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367078', 'F9F9CDBD85D98581E040007F01004A1E', '18792b26423b45faa02790fb2cecf1ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367079', 'F9F9D27A760CC183E040007F01004A31', '18792b26423b45faa02790fb2cecf1ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367080', 'F9F9D39B77A82AD3E040007F01004A3C', '18792b26423b45faa02790fb2cecf1ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367081', 'F9F9D5E3107DE8F6E040007F01004A50', '18792b26423b45faa02790fb2cecf1ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367082', 'FA23A72B5FB9D7BBE040007F01003086', '18792b26423b45faa02790fb2cecf1ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367083', 'FD19CC16B4D76DC5E043DE0338ACE69D', '18792b26423b45faa02790fb2cecf1ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:55:28', '2015-03-11 10:55:28', '1', null), ('95933429241367084', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367085', '', 'daec1b13c9d04b28b46db599fc93f592', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367086', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '0a6f0d7ee1f748a5aa8415c41becafa6', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367087', 'F9F9CDBD85D98581E040007F01004A1E', 'daec1b13c9d04b28b46db599fc93f592', '0a6f0d7ee1f748a5aa8415c41becafa6', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367088', 'F9F9D27A760CC183E040007F01004A31', 'daec1b13c9d04b28b46db599fc93f592', '0a6f0d7ee1f748a5aa8415c41becafa6', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367089', 'F9F9D39B77A82AD3E040007F01004A3C', 'daec1b13c9d04b28b46db599fc93f592', '0a6f0d7ee1f748a5aa8415c41becafa6', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367090', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', '0a6f0d7ee1f748a5aa8415c41becafa6', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367091', 'FA23A72B5FB9D7BBE040007F01003086', 'daec1b13c9d04b28b46db599fc93f592', '0a6f0d7ee1f748a5aa8415c41becafa6', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367092', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', 'f84fcfde90db429d8a875ed294c331ad', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367093', 'F9F9CDBD85D98581E040007F01004A1E', 'daec1b13c9d04b28b46db599fc93f592', 'f84fcfde90db429d8a875ed294c331ad', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367094', 'F9F9D27A760CC183E040007F01004A31', 'daec1b13c9d04b28b46db599fc93f592', 'f84fcfde90db429d8a875ed294c331ad', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367095', 'F9F9D39B77A82AD3E040007F01004A3C', 'daec1b13c9d04b28b46db599fc93f592', 'f84fcfde90db429d8a875ed294c331ad', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367096', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', 'f84fcfde90db429d8a875ed294c331ad', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367097', 'FA23A72B5FB9D7BBE040007F01003086', 'daec1b13c9d04b28b46db599fc93f592', 'f84fcfde90db429d8a875ed294c331ad', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367098', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '530d18f30a86477e9bddaff0ae9a9311', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367099', 'F9F9CDBD85D98581E040007F01004A1E', 'daec1b13c9d04b28b46db599fc93f592', '530d18f30a86477e9bddaff0ae9a9311', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367100', 'F9F9D27A760CC183E040007F01004A31', 'daec1b13c9d04b28b46db599fc93f592', '530d18f30a86477e9bddaff0ae9a9311', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367101', 'F9F9D39B77A82AD3E040007F01004A3C', 'daec1b13c9d04b28b46db599fc93f592', '530d18f30a86477e9bddaff0ae9a9311', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367102', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', '530d18f30a86477e9bddaff0ae9a9311', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367103', 'FA23A72B5FB9D7BBE040007F01003086', 'daec1b13c9d04b28b46db599fc93f592', '530d18f30a86477e9bddaff0ae9a9311', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367104', '7535f7863a5d489796cddb9134ac65fb', 'daec1b13c9d04b28b46db599fc93f592', '530d18f30a86477e9bddaff0ae9a9311', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367105', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '8aeabe8f9d7242edbec6647a29989a97', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367106', '', 'daec1b13c9d04b28b46db599fc93f592', '8aeabe8f9d7242edbec6647a29989a97', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367107', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', 'fe7c43b059f748c49515145f7b67518d', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367108', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', 'fe7c43b059f748c49515145f7b67518d', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367109', 'FD1DF8757CFC2A61E043DE0338ACE54F', 'daec1b13c9d04b28b46db599fc93f592', 'fe7c43b059f748c49515145f7b67518d', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367110', 'FD1DF8757CFE2A61E043DE0338ACE54F', 'daec1b13c9d04b28b46db599fc93f592', 'fe7c43b059f748c49515145f7b67518d', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367111', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '50dfdf6bfcf846f6841858d78d4fb029', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367112', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', '50dfdf6bfcf846f6841858d78d4fb029', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367113', 'FA23A72B5FB9D7BBE040007F01003086', 'daec1b13c9d04b28b46db599fc93f592', '50dfdf6bfcf846f6841858d78d4fb029', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367114', '201409051757241232545', 'daec1b13c9d04b28b46db599fc93f592', '50dfdf6bfcf846f6841858d78d4fb029', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367115', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '477a674b935e4f5399344f0d98c9dce3', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367116', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', '477a674b935e4f5399344f0d98c9dce3', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367117', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '05bc83dd53a244628d6a67a8bcb90874', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367118', '', 'daec1b13c9d04b28b46db599fc93f592', '05bc83dd53a244628d6a67a8bcb90874', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367119', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', 'eb0b22b3e1a04408a183eff2cd851e65', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367120', 'F9F9CDBD85D98581E040007F01004A1E', 'daec1b13c9d04b28b46db599fc93f592', 'eb0b22b3e1a04408a183eff2cd851e65', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367121', 'F9F9D27A760CC183E040007F01004A31', 'daec1b13c9d04b28b46db599fc93f592', 'eb0b22b3e1a04408a183eff2cd851e65', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367122', 'F9F9D39B77A82AD3E040007F01004A3C', 'daec1b13c9d04b28b46db599fc93f592', 'eb0b22b3e1a04408a183eff2cd851e65', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367123', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', 'eb0b22b3e1a04408a183eff2cd851e65', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367124', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '06df81419ead408187e4c15305d853e2', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367125', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', '06df81419ead408187e4c15305d853e2', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367126', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', 'ca2f7801484549518eba47ad8c14f526', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367127', 'F9F9CDBD85D98581E040007F01004A1E', 'daec1b13c9d04b28b46db599fc93f592', 'ca2f7801484549518eba47ad8c14f526', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367128', 'F9F9D27A760CC183E040007F01004A31', 'daec1b13c9d04b28b46db599fc93f592', 'ca2f7801484549518eba47ad8c14f526', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367129', 'F9F9D39B77A82AD3E040007F01004A3C', 'daec1b13c9d04b28b46db599fc93f592', 'ca2f7801484549518eba47ad8c14f526', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367130', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', 'ca2f7801484549518eba47ad8c14f526', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367131', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367132', 'F9F9CDBD85D98581E040007F01004A1E', 'daec1b13c9d04b28b46db599fc93f592', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367133', 'F9F9D27A760CC183E040007F01004A31', 'daec1b13c9d04b28b46db599fc93f592', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367134', 'F9F9D39B77A82AD3E040007F01004A3C', 'daec1b13c9d04b28b46db599fc93f592', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367135', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367136', 'FA23A72B5FB9D7BBE040007F01003086', 'daec1b13c9d04b28b46db599fc93f592', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367137', 'F9F9CBEAD95CEF96E040007F01004A04', 'daec1b13c9d04b28b46db599fc93f592', '679c2e64259840f1912f5e1e5726c7ee', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367138', 'F9F9CDBD85D98581E040007F01004A1E', 'daec1b13c9d04b28b46db599fc93f592', '679c2e64259840f1912f5e1e5726c7ee', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367139', 'F9F9D27A760CC183E040007F01004A31', 'daec1b13c9d04b28b46db599fc93f592', '679c2e64259840f1912f5e1e5726c7ee', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367140', 'F9F9D39B77A82AD3E040007F01004A3C', 'daec1b13c9d04b28b46db599fc93f592', '679c2e64259840f1912f5e1e5726c7ee', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367141', 'F9F9D5E3107DE8F6E040007F01004A50', 'daec1b13c9d04b28b46db599fc93f592', '679c2e64259840f1912f5e1e5726c7ee', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367142', 'FA23A72B5FB9D7BBE040007F01003086', 'daec1b13c9d04b28b46db599fc93f592', '679c2e64259840f1912f5e1e5726c7ee', '1', '2015-03-11 10:56:54', '2015-03-11 10:56:54', '1', null), ('95933429241367165', 'F9F9CBEAD95CEF96E040007F01004A04', 'd26fcc6af87b48869cdfbd314d3a25ad', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367166', '', 'd26fcc6af87b48869cdfbd314d3a25ad', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367167', 'F9F9CBEAD95CEF96E040007F01004A04', 'd26fcc6af87b48869cdfbd314d3a25ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367168', 'F9F9CDBD85D98581E040007F01004A1E', 'd26fcc6af87b48869cdfbd314d3a25ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367169', 'F9F9D27A760CC183E040007F01004A31', 'd26fcc6af87b48869cdfbd314d3a25ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367170', 'F9F9D39B77A82AD3E040007F01004A3C', 'd26fcc6af87b48869cdfbd314d3a25ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367171', 'F9F9D5E3107DE8F6E040007F01004A50', 'd26fcc6af87b48869cdfbd314d3a25ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367172', 'FA23A72B5FB9D7BBE040007F01003086', 'd26fcc6af87b48869cdfbd314d3a25ad', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367173', 'F9F9CBEAD95CEF96E040007F01004A04', 'd26fcc6af87b48869cdfbd314d3a25ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367174', 'F9F9CDBD85D98581E040007F01004A1E', 'd26fcc6af87b48869cdfbd314d3a25ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367175', 'F9F9D27A760CC183E040007F01004A31', 'd26fcc6af87b48869cdfbd314d3a25ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367176', 'F9F9D39B77A82AD3E040007F01004A3C', 'd26fcc6af87b48869cdfbd314d3a25ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367177', 'F9F9D5E3107DE8F6E040007F01004A50', 'd26fcc6af87b48869cdfbd314d3a25ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367178', 'FA23A72B5FB9D7BBE040007F01003086', 'd26fcc6af87b48869cdfbd314d3a25ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367179', 'FD19CC16B4D76DC5E043DE0338ACE69D', 'd26fcc6af87b48869cdfbd314d3a25ad', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367180', 'F9F9CBEAD95CEF96E040007F01004A04', 'd26fcc6af87b48869cdfbd314d3a25ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367181', 'F9F9CDBD85D98581E040007F01004A1E', 'd26fcc6af87b48869cdfbd314d3a25ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367182', 'F9F9D27A760CC183E040007F01004A31', 'd26fcc6af87b48869cdfbd314d3a25ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367183', 'F9F9D39B77A82AD3E040007F01004A3C', 'd26fcc6af87b48869cdfbd314d3a25ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367184', 'F9F9D5E3107DE8F6E040007F01004A50', 'd26fcc6af87b48869cdfbd314d3a25ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367185', 'FA23A72B5FB9D7BBE040007F01003086', 'd26fcc6af87b48869cdfbd314d3a25ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367186', 'FD19CC16B4D76DC5E043DE0338ACE69D', 'd26fcc6af87b48869cdfbd314d3a25ad', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:57:55', '2015-03-11 10:57:55', '1', null), ('95933429241367209', 'F9F9CBEAD95CEF96E040007F01004A04', 'b55260ecdcdd4eef99cf5f92202f4c79', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367210', '', 'b55260ecdcdd4eef99cf5f92202f4c79', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367211', 'F9F9CBEAD95CEF96E040007F01004A04', 'b55260ecdcdd4eef99cf5f92202f4c79', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367212', 'F9F9CDBD85D98581E040007F01004A1E', 'b55260ecdcdd4eef99cf5f92202f4c79', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367213', 'F9F9D27A760CC183E040007F01004A31', 'b55260ecdcdd4eef99cf5f92202f4c79', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367214', 'F9F9D39B77A82AD3E040007F01004A3C', 'b55260ecdcdd4eef99cf5f92202f4c79', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367215', 'F9F9D5E3107DE8F6E040007F01004A50', 'b55260ecdcdd4eef99cf5f92202f4c79', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367216', 'FA23A72B5FB9D7BBE040007F01003086', 'b55260ecdcdd4eef99cf5f92202f4c79', '3e1f26390698464198bc20c5662b7db8', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367217', 'F9F9CBEAD95CEF96E040007F01004A04', 'b55260ecdcdd4eef99cf5f92202f4c79', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367218', 'F9F9CDBD85D98581E040007F01004A1E', 'b55260ecdcdd4eef99cf5f92202f4c79', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367219', 'F9F9D27A760CC183E040007F01004A31', 'b55260ecdcdd4eef99cf5f92202f4c79', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367220', 'F9F9D39B77A82AD3E040007F01004A3C', 'b55260ecdcdd4eef99cf5f92202f4c79', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367221', 'F9F9D5E3107DE8F6E040007F01004A50', 'b55260ecdcdd4eef99cf5f92202f4c79', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367222', 'FA23A72B5FB9D7BBE040007F01003086', 'b55260ecdcdd4eef99cf5f92202f4c79', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367223', 'FD19CC16B4D76DC5E043DE0338ACE69D', 'b55260ecdcdd4eef99cf5f92202f4c79', '4c19ac456678442a91d908ccea94c8b0', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367224', 'F9F9CBEAD95CEF96E040007F01004A04', 'b55260ecdcdd4eef99cf5f92202f4c79', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367225', 'F9F9CDBD85D98581E040007F01004A1E', 'b55260ecdcdd4eef99cf5f92202f4c79', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367226', 'F9F9D27A760CC183E040007F01004A31', 'b55260ecdcdd4eef99cf5f92202f4c79', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367227', 'F9F9D39B77A82AD3E040007F01004A3C', 'b55260ecdcdd4eef99cf5f92202f4c79', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367228', 'F9F9D5E3107DE8F6E040007F01004A50', 'b55260ecdcdd4eef99cf5f92202f4c79', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367229', 'FA23A72B5FB9D7BBE040007F01003086', 'b55260ecdcdd4eef99cf5f92202f4c79', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367230', 'FD19CC16B4D76DC5E043DE0338ACE69D', 'b55260ecdcdd4eef99cf5f92202f4c79', '6bacc66e765b430ca065980bdbeef6b5', '1', '2015-03-11 10:58:12', '2015-03-11 10:58:12', '1', null), ('95933429241367265', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367266', '', '0521202b43ef4c97bee97adbeff1da52', '41535eebc6a24bae9ab5e6384c217483', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367267', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', '9760b5230115402e86f973856bcf2a54', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367268', 'F9F9CDBD85D98581E040007F01004A1E', '0521202b43ef4c97bee97adbeff1da52', '9760b5230115402e86f973856bcf2a54', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367269', 'F9F9D39B77A82AD3E040007F01004A3C', '0521202b43ef4c97bee97adbeff1da52', '9760b5230115402e86f973856bcf2a54', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367270', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', '9760b5230115402e86f973856bcf2a54', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367271', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', '387040f869f0442ca3414de5d7c0aa7a', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367272', 'F9F9CDBD85D98581E040007F01004A1E', '0521202b43ef4c97bee97adbeff1da52', '387040f869f0442ca3414de5d7c0aa7a', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367273', 'F9F9D27A760CC183E040007F01004A31', '0521202b43ef4c97bee97adbeff1da52', '387040f869f0442ca3414de5d7c0aa7a', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367274', 'F9F9D39B77A82AD3E040007F01004A3C', '0521202b43ef4c97bee97adbeff1da52', '387040f869f0442ca3414de5d7c0aa7a', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367275', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', '387040f869f0442ca3414de5d7c0aa7a', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367276', 'FA23A72B5FB9D7BBE040007F01003086', '0521202b43ef4c97bee97adbeff1da52', '387040f869f0442ca3414de5d7c0aa7a', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367277', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', '1fc3e26a38d044189687842dd88b7ec4', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367278', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', '1fc3e26a38d044189687842dd88b7ec4', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367279', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', '8ca01f9f67384990b303b4efe9e5d1fd', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367280', '', '0521202b43ef4c97bee97adbeff1da52', '8ca01f9f67384990b303b4efe9e5d1fd', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367281', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', 'fa02636cfe0943f98beabbd470b832fc', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367282', 'F9F9CDBD85D98581E040007F01004A1E', '0521202b43ef4c97bee97adbeff1da52', 'fa02636cfe0943f98beabbd470b832fc', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367283', 'F9F9D27A760CC183E040007F01004A31', '0521202b43ef4c97bee97adbeff1da52', 'fa02636cfe0943f98beabbd470b832fc', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367284', 'F9F9D39B77A82AD3E040007F01004A3C', '0521202b43ef4c97bee97adbeff1da52', 'fa02636cfe0943f98beabbd470b832fc', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367285', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', 'fa02636cfe0943f98beabbd470b832fc', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367286', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', 'b53e088bfd9045b191f78d7a70459204', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367287', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', 'b53e088bfd9045b191f78d7a70459204', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367288', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', '8061a982e0244398bd6dbc04f82bd192', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367289', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', '8061a982e0244398bd6dbc04f82bd192', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367290', 'FA23A72B5FB9D7BBE040007F01003086', '0521202b43ef4c97bee97adbeff1da52', '8061a982e0244398bd6dbc04f82bd192', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367291', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', '05bc83dd53a244628d6a67a8bcb90874', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367292', '', '0521202b43ef4c97bee97adbeff1da52', '05bc83dd53a244628d6a67a8bcb90874', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367293', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367294', 'F9F9CDBD85D98581E040007F01004A1E', '0521202b43ef4c97bee97adbeff1da52', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367295', 'F9F9D27A760CC183E040007F01004A31', '0521202b43ef4c97bee97adbeff1da52', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367296', 'F9F9D39B77A82AD3E040007F01004A3C', '0521202b43ef4c97bee97adbeff1da52', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367297', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241367298', 'FA23A72B5FB9D7BBE040007F01003086', '0521202b43ef4c97bee97adbeff1da52', 'b8c8ae2630c74c26bde8376445249a24', '1', '2015-03-11 10:58:47', '2015-03-11 10:58:47', '1', null), ('95933429241368148', 'F9F9CBEAD95CEF96E040007F01004A04', '0521202b43ef4c97bee97adbeff1da52', 'fa526d189e914bbb9718e63d3b306a68', '1', '2015-03-23 10:14:39', '2015-03-23 10:14:39', '1', null), ('95933429241368149', 'F9F9CDBD85D98581E040007F01004A1E', '0521202b43ef4c97bee97adbeff1da52', 'fa526d189e914bbb9718e63d3b306a68', '1', '2015-03-23 10:14:39', '2015-03-23 10:14:39', '1', null), ('95933429241368150', 'F9F9D27A760CC183E040007F01004A31', '0521202b43ef4c97bee97adbeff1da52', 'fa526d189e914bbb9718e63d3b306a68', '1', '2015-03-23 10:14:39', '2015-03-23 10:14:39', '1', null), ('95933429241368151', 'F9F9D39B77A82AD3E040007F01004A3C', '0521202b43ef4c97bee97adbeff1da52', 'fa526d189e914bbb9718e63d3b306a68', '1', '2015-03-23 10:14:39', '2015-03-23 10:14:39', '1', null), ('95933429241368152', 'F9F9D5E3107DE8F6E040007F01004A50', '0521202b43ef4c97bee97adbeff1da52', 'fa526d189e914bbb9718e63d3b306a68', '1', '2015-03-23 10:14:39', '2015-03-23 10:14:39', '1', null), ('95933429241368153', 'FA23A72B5FB9D7BBE040007F01003086', '0521202b43ef4c97bee97adbeff1da52', 'fa526d189e914bbb9718e63d3b306a68', '1', '2015-03-23 10:14:39', '2015-03-23 10:14:39', '1', null);
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_ROLE_REPORT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_ROLE_REPORT`;
CREATE TABLE `T_BASE_ROLE_REPORT` (
  `ID` varchar(32) NOT NULL COMMENT '编号',
  `REPORT_ID` varchar(32) NOT NULL COMMENT '报表ID',
  `ROLE_ID` varchar(32) NOT NULL COMMENT '角色ID',
  `CREATE_TIME` date NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` date NOT NULL COMMENT '最后修改时间',
  `OP_USER` varchar(32) NOT NULL COMMENT '最后修改人',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='报表授权表';

-- ----------------------------
--  Table structure for `T_BASE_SEQUENCE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_SEQUENCE`;
CREATE TABLE `T_BASE_SEQUENCE` (
  `name` varchar(50) NOT NULL,
  `current_value` bigint(20) unsigned NOT NULL DEFAULT '0',
  `increment` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='自定义ID自增字段维护表';

-- ----------------------------
--  Records of `T_BASE_SEQUENCE`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_SEQUENCE` VALUES ('BATCH_EXE_ID', '0', '1'), ('CUST_ID', '0', '1'), ('HISOFT_GUID', '0', '1'), ('SEQ_SYS_TXN_SSN', '0', '1'), ('SYS_MCHNT_CD', '0', '1');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_USER`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_USER`;
CREATE TABLE `T_BASE_USER` (
  `userid` varchar(32) NOT NULL,
  `truename` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `idcard` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `username` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `password` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `useremail` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `validtime` int(4) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `project_id` int(8) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `T_BASE_USER`
-- ----------------------------
BEGIN;
INSERT INTO `T_BASE_USER` VALUES ('1', 'yy', '342', null, null, null, null, null, null, '2'), ('14', 'aaawew', 'aawe', null, null, null, null, null, null, '7'), ('15', 'zzzzwe', 'zz', null, null, null, null, null, null, '7'), ('16', '122', '222', null, null, null, null, null, null, '11'), ('17', 'we', '34', null, null, null, null, null, null, '12'), ('18', 'er', '45', null, null, null, null, null, null, '12'), ('19', 'oooo', '5656', null, null, null, null, null, null, '13'), ('20', 'ttt', 'tt', null, null, null, null, null, null, '14'), ('21', 'yy', '44', null, null, null, null, null, null, '14'), ('22', 'rrrrr', '6666', null, null, null, null, null, null, '15'), ('23', 'uuu', 'iiii', null, null, null, null, null, null, '15'), ('24', 'we', 'ewwe', null, null, null, null, null, null, '16'), ('3', 'uu', '78', null, null, null, null, null, null, '3'), ('4', 'oo', 'aa', null, null, null, null, null, null, '4'), ('5', 'pp', '34', null, null, null, null, null, null, '5'), ('6', 'sd', '3434', null, null, null, null, null, null, '6'), ('9', 'xx', '56', null, null, null, null, null, null, '9');
COMMIT;

-- ----------------------------
--  Table structure for `T_BASE_USER_ROLE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BASE_USER_ROLE`;
CREATE TABLE `T_BASE_USER_ROLE` (
  `AUTHORITY_ID` varchar(32) NOT NULL DEFAULT '' COMMENT 'PK',
  `USER_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '用户ID',
  `ROLE_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '角色ID',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `T_BUSINESS_DTU`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_DTU`;
CREATE TABLE `T_BUSINESS_DTU` (
  `DTUID` int(8) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `DTUNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'DTU终端号',
  `ProjectID` int(8) DEFAULT NULL COMMENT 'projectinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`DTUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_DTU_CONFIG`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_DTU_CONFIG`;
CREATE TABLE `T_BUSINESS_DTU_CONFIG` (
  `TerminalConfigID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `DTUNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'dtu号',
  `Logondate` datetime DEFAULT NULL COMMENT '登录时间',
  `Updatetime` datetime DEFAULT NULL COMMENT '修改时间',
  `Sinaddr` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '终端IP地址',
  `Sinport` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '终端端口',
  `Localaddr` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '网关IP地址',
  `Localport` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '网关终端',
  PRIMARY KEY (`TerminalConfigID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_FORMULA`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_FORMULA`;
CREATE TABLE `T_BUSINESS_FORMULA` (
  `FormulaID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `FormulaContent` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '公式',
  `Formulatype` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '公式类型',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`FormulaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_IMG`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_IMG`;
CREATE TABLE `T_BUSINESS_IMG` (
  `image_id` int(8) NOT NULL AUTO_INCREMENT,
  `projectdoc_id` int(8) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BUSINESS_IMG`
-- ----------------------------
BEGIN;
INSERT INTO `T_BUSINESS_IMG` VALUES ('4', '52', '2015-01-04 00:00:00'), ('5', '50', '2015-01-04 00:00:00'), ('6', '51', '2015-01-04 00:00:00'), ('7', '59', '2015-01-06 00:00:00'), ('8', '58', '2015-01-06 00:00:00'), ('9', '61', '2015-01-07 00:00:00');
COMMIT;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_ELEVATION`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_ELEVATION`;
CREATE TABLE `T_BUSINESS_INCLI_ELEVATION` (
  `ElevationID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `Elevation` double DEFAULT NULL COMMENT '标高',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  PRIMARY KEY (`ElevationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_EXCUTE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_EXCUTE`;
CREATE TABLE `T_BUSINESS_INCLI_EXCUTE` (
  `IncliExcuteDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `h` double DEFAULT NULL COMMENT '深度',
  `x` double DEFAULT NULL COMMENT 'x位移',
  `y` double DEFAULT NULL COMMENT 'y位移',
  `TotalDisplace` double DEFAULT NULL COMMENT '总位移',
  `Accu_x` double DEFAULT NULL COMMENT '累积x',
  `Accu_y` double DEFAULT NULL COMMENT '累积y',
  `Dx` double DEFAULT NULL COMMENT 'x变化量',
  `Dy` double DEFAULT NULL COMMENT 'y变化量',
  `Status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态',
  `IncliOriginData_id` int(11) DEFAULT NULL COMMENT 'IncliOriginData表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`IncliExcuteDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_INIT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_INIT`;
CREATE TABLE `T_BUSINESS_INCLI_INIT` (
  `IncliInitDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `h` double DEFAULT NULL COMMENT '深度',
  `x0` double DEFAULT NULL COMMENT 'x初始数据',
  `y0` double DEFAULT NULL COMMENT 'y初始数据',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`IncliInitDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_ORI`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_ORI`;
CREATE TABLE `T_BUSINESS_INCLI_ORI` (
  `IncliOriginData_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `Height` double DEFAULT NULL COMMENT '最大深度',
  `Status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器状态',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`IncliOriginData_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_ORI_DISPLACE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_ORI_DISPLACE`;
CREATE TABLE `T_BUSINESS_INCLI_ORI_DISPLACE` (
  `IncliOriginData_DisplaceID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `h` double DEFAULT NULL COMMENT '所在深度',
  `x` double DEFAULT NULL COMMENT 'x轴数据',
  `y` double DEFAULT NULL COMMENT 'y轴数据',
  `IncliOriginData_id` int(11) DEFAULT NULL COMMENT 'IncliOriginData表编号',
  PRIMARY KEY (`IncliOriginData_DisplaceID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_ORI_HEIGHT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_ORI_HEIGHT`;
CREATE TABLE `T_BUSINESS_INCLI_ORI_HEIGHT` (
  `IncliOriginData_HeightID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器编号',
  `Height` double DEFAULT NULL COMMENT '最大深度',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`IncliOriginData_HeightID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_ORI_PARAIN`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_ORI_PARAIN`;
CREATE TABLE `T_BUSINESS_INCLI_ORI_PARAIN` (
  `IncliOriginData_Para_InID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器编号',
  `Temperature_In` double DEFAULT NULL COMMENT '外部温度',
  `Voltage_In` double DEFAULT NULL COMMENT '外部电压',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`IncliOriginData_Para_InID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_ORI_PARAOUT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_ORI_PARAOUT`;
CREATE TABLE `T_BUSINESS_INCLI_ORI_PARAOUT` (
  `IncliOriginData_Para_OutID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器编号',
  `Temperature_Out` double DEFAULT NULL COMMENT '内部温度',
  `Voltage_Out` double DEFAULT NULL COMMENT '内部电压',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`IncliOriginData_Para_OutID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_PACK`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_PACK`;
CREATE TABLE `T_BUSINESS_INCLI_PACK` (
  `TerminalPackID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `DTUNO` varchar(20) DEFAULT NULL COMMENT 'DTU终端号',
  `DataPack` bit(1) DEFAULT NULL COMMENT '数据包',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`TerminalPackID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `T_BUSINESS_INCLI_UNPACK`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_INCLI_UNPACK`;
CREATE TABLE `T_BUSINESS_INCLI_UNPACK` (
  `UnpackDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `Displace` double DEFAULT NULL COMMENT '位移',
  `Temperature` double DEFAULT NULL COMMENT '温度',
  `BatteryStatus` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电池状态',
  `Status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器报警状态',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`UnpackDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_MICRO_STRAIN`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_MICRO_STRAIN`;
CREATE TABLE `T_BUSINESS_MICRO_STRAIN` (
  `MicroStrainDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `MicroStrain` double DEFAULT NULL COMMENT '微应变',
  `AccuStrain` double DEFAULT NULL COMMENT '累积应变',
  `SensorStatus` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器状态',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`MicroStrainDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_PARAM`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_PARAM`;
CREATE TABLE `T_BUSINESS_PARAM` (
  `ParameterID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `Modulus` double DEFAULT NULL COMMENT '系数',
  `Constant` double DEFAULT NULL COMMENT '常量',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`ParameterID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_SENSOR`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_SENSOR`;
CREATE TABLE `T_BUSINESS_SENSOR` (
  `SensorID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`SensorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_SENSOR_INIT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_SENSOR_INIT`;
CREATE TABLE `T_BUSINESS_SENSOR_INIT` (
  `SensorInitID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `SensorWorkMaxLimit` double DEFAULT NULL COMMENT '工作上限',
  `SensorWorkMinLimit` double DEFAULT NULL COMMENT '工作下限',
  `SensorType` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器类型',
  `ProjectID` int(11) DEFAULT NULL COMMENT 'projectinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`SensorInitID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_SENSOR_LOCATION`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_SENSOR_LOCATION`;
CREATE TABLE `T_BUSINESS_SENSOR_LOCATION` (
  `SensorLocationID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorLocation` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '工字钢位置',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`SensorLocationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION`;
CREATE TABLE `T_BUSINESS_STATION` (
  `StationID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `StationName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '检测点名称',
  `CoordinateX` double DEFAULT NULL COMMENT '所在底图坐标X',
  `CoordinateY` double DEFAULT NULL COMMENT '所在底图坐标Y',
  `DTUID` int(11) DEFAULT NULL COMMENT 'DTU表编号',
  `ImageID` int(11) DEFAULT NULL COMMENT 'Image表编号',
  `StationType` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '检测点类型',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`StationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION_ALERT`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION_ALERT`;
CREATE TABLE `T_BUSINESS_STATION_ALERT` (
  `StationAlertID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `StationAlertMax` double DEFAULT NULL COMMENT '报警上限',
  `StationAlertMin` double DEFAULT NULL COMMENT '报警下限',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '监测点类型',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`StationAlertID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION_CONCEN`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION_CONCEN`;
CREATE TABLE `T_BUSINESS_STATION_CONCEN` (
  `StationConcenDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `Temperature` double DEFAULT NULL COMMENT '温度',
  `ConcenForce` double DEFAULT NULL COMMENT '集中力',
  `StationStatus` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`StationConcenDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION_DATA`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION_DATA`;
CREATE TABLE `T_BUSINESS_STATION_DATA` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `temperature` double DEFAULT NULL,
  `data` double DEFAULT NULL,
  `status` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `stationid` int(4) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Records of `T_BUSINESS_STATION_DATA`
-- ----------------------------
BEGIN;
INSERT INTO `T_BUSINESS_STATION_DATA` VALUES ('1', '26', '11', '安全', '集中力', '1', '2014-11-10 11:29:18'), ('2', '26.3', '15', '安全', '集中力', '1', '2014-11-10 12:29:18'), ('3', '27', '10', '安全', '集中力', '1', '2014-11-10 13:29:18');
COMMIT;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION_INITDATA`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION_INITDATA`;
CREATE TABLE `T_BUSINESS_STATION_INITDATA` (
  `StationInitDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `Displace` double DEFAULT NULL COMMENT '位移',
  `Temperature` double DEFAULT NULL COMMENT '温度',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`StationInitDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION_SETTLE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION_SETTLE`;
CREATE TABLE `T_BUSINESS_STATION_SETTLE` (
  `StationSettleDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `Temperature` double DEFAULT NULL COMMENT '温度',
  `Settle` double DEFAULT NULL COMMENT '沉降',
  `StationStatus` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`StationSettleDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION_STRAIN`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION_STRAIN`;
CREATE TABLE `T_BUSINESS_STATION_STRAIN` (
  `StationStrainDataID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `AveTemperature` double DEFAULT NULL COMMENT '平均温度',
  `AxialForce` double DEFAULT NULL COMMENT '轴向力',
  `AccuAxialForce` double DEFAULT NULL COMMENT '累积轴向力',
  `BendForce` double DEFAULT NULL COMMENT '累积轴向力',
  `AccumBendForce` double DEFAULT NULL COMMENT '累积弯曲力',
  `AxialStatus` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '轴向力状态',
  `BendStatus` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '弯曲力状态',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`StationStrainDataID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_BUSINESS_STATION_STRAINTYPE`
-- ----------------------------
DROP TABLE IF EXISTS `T_BUSINESS_STATION_STRAINTYPE`;
CREATE TABLE `T_BUSINESS_STATION_STRAINTYPE` (
  `StrainTypeID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `straintype` varchar(10) DEFAULT NULL COMMENT '应变检测点类型（轴向力、弯曲力）',
  `stationid` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  PRIMARY KEY (`StrainTypeID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `T_LOG_ALARM`
-- ----------------------------
DROP TABLE IF EXISTS `T_LOG_ALARM`;
CREATE TABLE `T_LOG_ALARM` (
  `AlartID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `AlartType` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报警类型',
  `AlartInfo` text COLLATE utf8_unicode_ci COMMENT '报警内容',
  `AlartSource` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '报警源',
  `AlartLevel` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '预警级别',
  `ImageName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '底图名称',
  `ProjectName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '项目名称',
  `CompanyName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '单位名称',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`AlartID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
--  Table structure for `T_LOG_LOGIN`
-- ----------------------------
DROP TABLE IF EXISTS `T_LOG_LOGIN`;
CREATE TABLE `T_LOG_LOGIN` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `login_record` varchar(255) DEFAULT NULL COMMENT '登录信息记录文本（自定义规则）',
  `operator_person` varchar(10) DEFAULT NULL,
  `login_role` varchar(10) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `T_LOG_OPER`
-- ----------------------------
DROP TABLE IF EXISTS `T_LOG_OPER`;
CREATE TABLE `T_LOG_OPER` (
  `OPERATE_ID` int(8) NOT NULL COMMENT 'PK',
  `BeforeContent` varbinary(255) NOT NULL COMMENT '操作前内容',
  `AfterContent` varbinary(255) DEFAULT NULL COMMENT '操作后内容',
  `OperateType` varchar(20) DEFAULT NULL COMMENT '日志类型',
  `DataType` varchar(20) NOT NULL COMMENT '数据字段',
  `OperateLocation` varchar(200) DEFAULT NULL COMMENT '操作路径',
  `ProjectName` varchar(50) DEFAULT NULL COMMENT '工程名称',
  `CompanyName` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `OperatePerson` varchar(10) DEFAULT NULL COMMENT '操作人',
  `Time` datetime(6) DEFAULT CURRENT_TIMESTAMP(6) COMMENT '时间',
  PRIMARY KEY (`OPERATE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='操作日志表-添加、修改、删除、查看';

-- ----------------------------
--  Function structure for `currval`
-- ----------------------------
DROP FUNCTION IF EXISTS `currval`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `currval`(seq_name VARCHAR(50)) RETURNS bigint(20)
BEGIN  
         DECLARE value BIGINT;  
         SELECT current_value INTO value  
         FROM sequence  
         WHERE upper(name) = upper(seq_name); -- 大小写不区分.  
         RETURN value;  
END
 ;;
delimiter ;

-- ----------------------------
--  Function structure for `nextval`
-- ----------------------------
DROP FUNCTION IF EXISTS `nextval`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `nextval`(seq_name VARCHAR(50)) RETURNS bigint(20)
BEGIN    
         DECLARE value BIGINT;  
         UPDATE sequence    
         SET current_value = current_value + increment    
         WHERE upper(name) = upper(seq_name);  
         RETURN currval(seq_name);    
END
 ;;
delimiter ;

-- ----------------------------
--  Function structure for `setval`
-- ----------------------------
DROP FUNCTION IF EXISTS `setval`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `setval`(seq_name VARCHAR(50), value BIGINT) RETURNS bigint(20)
BEGIN   
         UPDATE sequence    
         SET current_value = value    
         WHERE upper(name) = upper(seq_name);    
         RETURN currval(seq_name);    
END
 ;;
delimiter ;

-- ----------------------------
--  Function structure for `sys_guid`
-- ----------------------------
DROP FUNCTION IF EXISTS `sys_guid`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `sys_guid`() RETURNS varchar(50) CHARSET utf8
BEGIN
     DECLARE result VARCHAR(50);
     SELECT CONCAT(DATE_FORMAT(CURRENT_TIMESTAMP(),'%Y%m%d%H%i%s'),(SELECT nextval('HISOFT_GUID'))) INTO result FROM DUAL;
    RETURN (result);
END
 ;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
