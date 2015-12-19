-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: localhost    Database: fctech
-- ------------------------------------------------------
-- Server version	5.7.10

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `T_BASE_AUTHORITY`
--

DROP TABLE IF EXISTS `T_BASE_AUTHORITY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_AUTHORITY`
--

LOCK TABLES `T_BASE_AUTHORITY` WRITE;
/*!40000 ALTER TABLE `T_BASE_AUTHORITY` DISABLE KEYS */;
INSERT INTO `T_BASE_AUTHORITY` VALUES ('201512051757241230001','可编辑','0001','2015-12-11 17:57:24','2015-12-11 17:57:24','0','0','201409041323341231935',''),('201512091359221230002','可读','0002','2015-12-11 17:57:24','2015-12-11 17:57:24','0','0','201409041323341231935',''),('201512091359441230003','系统权限','0003','2015-12-11 17:57:24','2015-12-11 17:57:24','0','0','201409041323341231935','');
/*!40000 ALTER TABLE `T_BASE_AUTHORITY` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_COMPANY`
--

DROP TABLE IF EXISTS `T_BASE_COMPANY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_COMPANY` (
  `company_id` bigint(8) NOT NULL AUTO_INCREMENT,
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_COMPANY`
--

LOCK TABLES `T_BASE_COMPANY` WRITE;
/*!40000 ALTER TABLE `T_BASE_COMPANY` DISABLE KEYS */;
INSERT INTO `T_BASE_COMPANY` VALUES (40,'富城科技','凯旋路1888弄',NULL,NULL,'','13800138000','裴总','','','','','','已通过','',''),(41,'无垠网络','天山路600弄',NULL,NULL,'','13800138000','张总','','','','','','已通过','','');
/*!40000 ALTER TABLE `T_BASE_COMPANY` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_COMPANY_LICENSE`
--

DROP TABLE IF EXISTS `T_BASE_COMPANY_LICENSE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_COMPANY_LICENSE` (
  `businessLicense_id` int(4) NOT NULL AUTO_INCREMENT,
  `businessLicense_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `businessLicense_dates` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `businessLicense_datee` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`businessLicense_id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_COMPANY_LICENSE`
--

LOCK TABLES `T_BASE_COMPANY_LICENSE` WRITE;
/*!40000 ALTER TABLE `T_BASE_COMPANY_LICENSE` DISABLE KEYS */;
INSERT INTO `T_BASE_COMPANY_LICENSE` VALUES (46,'12','12','12','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\businessLicense','P40618-222025.jpg',40),(47,'1','1','2','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\businessLicense','QQ截图20141109101245.png',41);
/*!40000 ALTER TABLE `T_BASE_COMPANY_LICENSE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_COMPANY_ORG_CODE`
--

DROP TABLE IF EXISTS `T_BASE_COMPANY_ORG_CODE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_COMPANY_ORG_CODE` (
  `organizationCode_id` int(4) NOT NULL AUTO_INCREMENT,
  `organizationCode_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`organizationCode_id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_COMPANY_ORG_CODE`
--

LOCK TABLES `T_BASE_COMPANY_ORG_CODE` WRITE;
/*!40000 ALTER TABLE `T_BASE_COMPANY_ORG_CODE` DISABLE KEYS */;
INSERT INTO `T_BASE_COMPANY_ORG_CODE` VALUES (45,'12','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\organizationCode','P40630-193147.jpg',40),(46,'1','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\organizationCode','QQ截图20141109101245.png',41);
/*!40000 ALTER TABLE `T_BASE_COMPANY_ORG_CODE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_COMPANY_QUALIFICATION`
--

DROP TABLE IF EXISTS `T_BASE_COMPANY_QUALIFICATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_COMPANY_QUALIFICATION` (
  `qualification_id` int(4) NOT NULL AUTO_INCREMENT,
  `qualification_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qualification_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qualification_valperiod` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`qualification_id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_COMPANY_QUALIFICATION`
--

LOCK TABLES `T_BASE_COMPANY_QUALIFICATION` WRITE;
/*!40000 ALTER TABLE `T_BASE_COMPANY_QUALIFICATION` DISABLE KEYS */;
INSERT INTO `T_BASE_COMPANY_QUALIFICATION` VALUES (63,'12','12','12','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\qualification','QQ截图20140804111917.png',40),(64,'1','2','2','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\qualification','QQ截图20141109101245.png',41);
/*!40000 ALTER TABLE `T_BASE_COMPANY_QUALIFICATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_COMPANY_TAXREG`
--

DROP TABLE IF EXISTS `T_BASE_COMPANY_TAXREG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_COMPANY_TAXREG` (
  `taxReg_id` int(4) NOT NULL AUTO_INCREMENT,
  `taxReg_type` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `taxReg_no` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`taxReg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_COMPANY_TAXREG`
--

LOCK TABLES `T_BASE_COMPANY_TAXREG` WRITE;
/*!40000 ALTER TABLE `T_BASE_COMPANY_TAXREG` DISABLE KEYS */;
INSERT INTO `T_BASE_COMPANY_TAXREG` VALUES (45,'国税','12','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\taxReg','P40620-233528.jpg',40),(46,'国税','3','D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\xxxxxx\\taxReg','QQ截图20141109101245.png',41);
/*!40000 ALTER TABLE `T_BASE_COMPANY_TAXREG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_MENU`
--

DROP TABLE IF EXISTS `T_BASE_MENU`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_MENU` (
  `MENU_ID` varchar(32) NOT NULL COMMENT 'PK',
  `LANGUAGE_TYPE` varchar(5) DEFAULT 'zh' COMMENT '语言类型 zh 中文 en英文 默认zh',
  `PARENT_MENU_ID` varchar(32) NOT NULL COMMENT '父级菜单',
  `MENU_NAME` varchar(500) NOT NULL COMMENT '菜单名称',
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
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_MENU`
--

LOCK TABLES `T_BASE_MENU` WRITE;
/*!40000 ALTER TABLE `T_BASE_MENU` DISABLE KEYS */;
INSERT INTO `T_BASE_MENU` VALUES ('201512051757241230001','zh_cn','0','基本信息',NULL,NULL,'1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,1,'0','0','0'),('201512051757241230002','zh_cn','0','权限管理',NULL,NULL,'1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,2,'0','0','0'),('201512051757241230003','zh_cn','0','项目监测',NULL,NULL,'1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,3,'0','0','0'),('201512051757241230004','zh_cn','0','项目报表',NULL,NULL,'1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,4,'0','0','0'),('201512051757241230005','zh_cn','201512051757241230001','用户管理',NULL,'/company/list','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,1,'1','0','0'),('201512051757241230006','zh_cn','201512051757241230001','公司管理',NULL,'/project/list','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,2,'1','0','0'),('201512051757241230007','zh_cn','201512051757241230001','项目管理',NULL,'/user/list','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,3,'1','0','0'),('201512051757241230008','zh_cn','201512051757241230002','菜单管理',NULL,'user/menu','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,1,'1','0','0'),('201512051757241230009','zh_cn','201512051757241230002','角色管理',NULL,'/user/role','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,2,'1','0','0'),('201512051757241230010','zh_cn','201512051757241230002','权限菜单配置',NULL,'user/authorMenu','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,3,'1','0','0'),('201512051757241230011','zh_cn','201512051757241230002','角色权限配置',NULL,'/user/roleAuthor','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,4,'1','0','0'),('201512051757241230012','zh_cn','201512051757241230002','用户角色配置',NULL,'/user/roleAuthor','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,5,'1','0','0'),('201512051757241230013','zh_cn','201512051757241230003','数据采集',NULL,'/business/collectData','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,1,'1','0','0'),('201512051757241230014','zh_cn','201512051757241230003','项目配置',NULL,'/business/projectConfig','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,2,'1','0','0'),('201512051757241230015','zh_cn','201512051757241230003','项目信息',NULL,'/business/projectManager','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,3,'1','0','0'),('201512051757241230016','zh_cn','201512051757241230004','项目报表',NULL,'/report/demo','1',NULL,'2015-12-11 17:57:24','2015-12-11 17:57:24','1','1',NULL,1,'1','0','0');
/*!40000 ALTER TABLE `T_BASE_MENU` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_MENU_AUTHORITY`
--

DROP TABLE IF EXISTS `T_BASE_MENU_AUTHORITY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_MENU_AUTHORITY` (
  `ID` varchar(32) NOT NULL COMMENT 'PK',
  `AUTHORITY_ID` varchar(32) NOT NULL COMMENT '权限ID',
  `MENU_ID` varchar(32) NOT NULL COMMENT '菜单ID',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_MENU_AUTHORITY`
--

LOCK TABLES `T_BASE_MENU_AUTHORITY` WRITE;
/*!40000 ALTER TABLE `T_BASE_MENU_AUTHORITY` DISABLE KEYS */;
INSERT INTO `T_BASE_MENU_AUTHORITY` VALUES ('201512051757241230001','201512091359441230003','201512051757241230002',NULL),('201512051757241230002','201512091359441230003','201512051757241230003',NULL),('201512051757241230003','201512091359441230003','201512051757241230004',NULL),('201512051757241230004','201512091359441230003','201512051757241230005',NULL),('201512051757241230005','201512091359441230003','201512051757241230006',NULL),('201512051757241230006','201512091359441230003','201512051757241230007',NULL),('201512051757241230007','201512091359441230003','201512051757241230001',NULL),('201512051757241230008','201512091359441230003','201512051757241230008',NULL),('201512051757241230009','201512091359441230003','201512051757241230009',NULL),('201512051757241230010','201512091359441230003','201512051757241230010',NULL),('201512051757241230011','201512091359441230003','201512051757241230011',NULL),('201512051757241230012','201512091359441230003','201512051757241230012',NULL),('201512051757241230013','201512091359441230003','201512051757241230013',NULL),('201512051757241230014','201512091359441230003','201512051757241230014',NULL),('201512051757241230015','201512091359441230003','201512051757241230015',NULL),('201512051757241230016','201512091359441230003','201512051757241230016',NULL);
/*!40000 ALTER TABLE `T_BASE_MENU_AUTHORITY` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_PROJECT`
--

DROP TABLE IF EXISTS `T_BASE_PROJECT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_PROJECT` (
  `project_id` int(4) NOT NULL AUTO_INCREMENT COMMENT 'ID',
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
  `company_id` int(4) DEFAULT NULL COMMENT '单位编号',
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_PROJECT`
--

LOCK TABLES `T_BASE_PROJECT` WRITE;
/*!40000 ALTER TABLE `T_BASE_PROJECT` DISABLE KEYS */;
INSERT INTO `T_BASE_PROJECT` VALUES (1,'eeee,,,,',NULL,'eeee','eeee',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(2,'rrrrr',NULL,'rrrrrrr','rr',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(3,'uuuu',NULL,'uu','uu',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(4,'oooo',NULL,'oo','oo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(5,'pppp',NULL,'pp','p',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(6,'sss',NULL,'ss','sss',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,35),(7,'swe',NULL,'ddd','d',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,35),(8,'dddd',NULL,'ff','dfd',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,35),(9,'zzzz',NULL,'zz','z',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,35),(10,'',NULL,'','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,35),(11,'wqre',NULL,'qwer','qwer@qq.com',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(12,'iiiii',NULL,'iiiii','ii@qq.vn',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(13,'ppppp',NULL,'ppp','pp@qq.com',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,35),(14,'rrrrt',NULL,'rrtt','ttt',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,36),(15,'pppppp',NULL,'pppp','we',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,36),(16,'wwee',NULL,'we','ewr','rrt5','6','676','def','ds','aa',NULL,NULL,NULL,NULL,35);
/*!40000 ALTER TABLE `T_BASE_PROJECT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_PROJECT_DOC`
--

DROP TABLE IF EXISTS `T_BASE_PROJECT_DOC`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_PROJECT_DOC` (
  `projectdoc_id` int(4) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `file_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '路径',
  `file_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文件名',
  `projectdoc_type` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '文件类型',
  `project_id` int(4) DEFAULT NULL COMMENT '项目编号',
  PRIMARY KEY (`projectdoc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_PROJECT_DOC`
--

LOCK TABLES `T_BASE_PROJECT_DOC` WRITE;
/*!40000 ALTER TABLE `T_BASE_PROJECT_DOC` DISABLE KEYS */;
INSERT INTO `T_BASE_PROJECT_DOC` VALUES (1,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\projectpppp\\monitorcontract','','监测项目合同',5),(2,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sss\\monitorcontract','需求-原.docx','监测项目合同',6),(3,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sddwe\\monitorcontract','企业信息登记表.docx','监测项目合同',7),(4,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\dddd\\monitorcontract','企业信息登记表.docx','监测项目合同',8),(5,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\dddd\\managerappoint','需求-原.docx','项目经理任命文件',8),(10,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sddwe\\managerappoint','企业信息登记表.docx','项目经理任命文件',7),(11,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\sss\\managerappoint','需求-原.docx','项目经理任命文件',6),(12,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wqre\\monitorcontract','需求-原.docx','监测项目合同',11),(13,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wqre\\managerappoint','需求-原.docx','项目经理任命文件',11),(14,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\iiiii\\monitorcontract','基坑截图.docx','监测项目合同',12),(15,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\iiiii\\managerappoint','复件 富城需求流程.docx','项目经理任命文件',12),(16,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\ppppp\\monitorcontract','需求-原.docx','监测项目合同',13),(17,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\ppppp\\managerappoint','需求-原.docx','项目经理任命文件',13),(18,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\rrrrt\\monitorcontract','企业信息登记表.docx','监测项目合同',14),(19,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\rrrrt\\managerappoint','基坑截图.docx','项目经理任命文件',14),(20,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\pppppp\\monitorcontract','企业信息登记表.docx','监测项目合同',15),(21,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\ttttt\\project\\pppppp\\managerappoint','基坑-代码模块.docx','项目经理任命文件',15),(22,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wwee\\monitorcontract','数据通信协议.doc','监测项目合同',16),(23,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\wwee\\managerappoint','数据通信协议.doc','项目经理任命文件',16),(50,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','Winter.jpg','项目图片',1),(51,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','Water lilies.jpg','项目图片',1),(52,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','Blue hills.jpg','项目图片',1),(58,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','20130620591.jpg','项目图片',1),(59,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','20130620593.jpg','项目图片',1),(60,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','20130620463.jpg','项目图片',1),(61,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','20130620448.jpg','项目图片',1),(62,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','9.jpg','项目图片',1),(63,'D:\\java\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp4\\wtpwebapps\\richcity\\assets\\upload\\qqqqq\\project\\test\\projectimage','3.jpg','项目图片',1);
/*!40000 ALTER TABLE `T_BASE_PROJECT_DOC` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_ROLE`
--

DROP TABLE IF EXISTS `T_BASE_ROLE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_ROLE` (
  `ROLE_ID` varchar(32) NOT NULL COMMENT 'PK',
  `ROLE_NAME` varchar(50) NOT NULL COMMENT '角色名称',
  `ROLE_NO` varchar(50) DEFAULT NULL COMMENT '角色编号',
  `CREATE_TIME` varchar(50) NOT NULL COMMENT '创建时间',
  `LAST_MODIFY_TIME` varchar(50) NOT NULL COMMENT '最后修改时间',
  `LOCKED` char(1) DEFAULT '0' COMMENT '1:锁定;0:激活',
  `COMPANY_ID` varchar(32) DEFAULT NULL COMMENT '公司ID',
  `OP_USER` varchar(32) NOT NULL COMMENT '操作人',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  `ROLE_TYPE` char(1) DEFAULT '1' COMMENT '角色类型:1:业务角色,角色类型:2:管理角色 3系统内置角色 默认：1',
  `ROLE_FLAG` char(2) DEFAULT '1' COMMENT ' 1 内部角色 2 企业角色  3 银行角色，默认1',
  `AUDIT_FLAG` char(1) DEFAULT '0' COMMENT '1审核 0 不审核',
  `DELETE_FLAG` char(1) DEFAULT '0' COMMENT '0 未删除 1已删除  默认 0',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_ROLE`
--

LOCK TABLES `T_BASE_ROLE` WRITE;
/*!40000 ALTER TABLE `T_BASE_ROLE` DISABLE KEYS */;
INSERT INTO `T_BASE_ROLE` VALUES ('0521202b43ef4c97bee97adbeff1da52','系统超级管理员','','2015-12-11 10:58:37','2015-12-11 10:58:37','0','','1','','1','4','0','0'),('18792b26423b45faa02790fb2cecf1ad','项目访问者','','2015-12-11 10:55:22','2015-12-11 10:55:22','0','','1','','1','5','0','0'),('51e608eafe16497c8cf437a7a84aa692','项目管理员','','2015-12-11 10:05:57','2015-12-11 10:05:57','0','','1','','1','1','0','0');
/*!40000 ALTER TABLE `T_BASE_ROLE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_ROLE_AUTHORITY`
--

DROP TABLE IF EXISTS `T_BASE_ROLE_AUTHORITY`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_ROLE_AUTHORITY`
--

LOCK TABLES `T_BASE_ROLE_AUTHORITY` WRITE;
/*!40000 ALTER TABLE `T_BASE_ROLE_AUTHORITY` DISABLE KEYS */;
INSERT INTO `T_BASE_ROLE_AUTHORITY` VALUES ('201512091359441230003','201512091359441230003','0521202b43ef4c97bee97adbeff1da52',NULL,'1','2015-12-12 00:00:00','2015-12-12 00:00:00','1',NULL);
/*!40000 ALTER TABLE `T_BASE_ROLE_AUTHORITY` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_USER`
--

DROP TABLE IF EXISTS `T_BASE_USER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_USER` (
  `userid` int(4) NOT NULL AUTO_INCREMENT,
  `truename` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `idcard` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `username` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `password` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `useremail` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `validtime` int(4) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `project_id` int(4) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_USER`
--

LOCK TABLES `T_BASE_USER` WRITE;
/*!40000 ALTER TABLE `T_BASE_USER` DISABLE KEYS */;
INSERT INTO `T_BASE_USER` VALUES (1,'yy','342',NULL,NULL,NULL,NULL,NULL,NULL,2),(3,'uu','78',NULL,NULL,NULL,NULL,NULL,NULL,3),(4,'oo','aa',NULL,NULL,NULL,NULL,NULL,NULL,4),(5,'pp','34',NULL,NULL,NULL,NULL,NULL,NULL,5),(6,'sd','3434',NULL,NULL,NULL,NULL,NULL,NULL,6),(9,'xx','56',NULL,NULL,NULL,NULL,NULL,NULL,9),(14,'aaawew','aawe',NULL,NULL,NULL,NULL,NULL,NULL,7),(15,'zzzzwe','zz',NULL,NULL,NULL,NULL,NULL,NULL,7),(16,'122','222',NULL,NULL,NULL,NULL,NULL,NULL,11),(17,'we','34',NULL,NULL,NULL,NULL,NULL,NULL,12),(18,'er','45',NULL,NULL,NULL,NULL,NULL,NULL,12),(19,'oooo','5656',NULL,NULL,NULL,NULL,NULL,NULL,13),(20,'ttt','tt',NULL,NULL,NULL,NULL,NULL,NULL,14),(21,'yy','44',NULL,NULL,NULL,NULL,NULL,NULL,14),(22,'rrrrr','6666',NULL,NULL,NULL,NULL,NULL,NULL,15),(23,'uuu','iiii',NULL,NULL,NULL,NULL,NULL,NULL,15),(24,'we','ewwe',NULL,NULL,NULL,NULL,NULL,NULL,16);
/*!40000 ALTER TABLE `T_BASE_USER` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BASE_USER_ROLE`
--

DROP TABLE IF EXISTS `T_BASE_USER_ROLE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BASE_USER_ROLE` (
  `ID` varchar(32) NOT NULL DEFAULT '' COMMENT 'PK',
  `USER_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '用户ID',
  `ROLE_ID` varchar(32) NOT NULL DEFAULT '' COMMENT '角色ID',
  `MEMO` varchar(60) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BASE_USER_ROLE`
--

LOCK TABLES `T_BASE_USER_ROLE` WRITE;
/*!40000 ALTER TABLE `T_BASE_USER_ROLE` DISABLE KEYS */;
INSERT INTO `T_BASE_USER_ROLE` VALUES ('0521202b43ef4c97bee97adbeff1da52','yoursuserid','0521202b43ef4c97bee97adbeff1da52',NULL);
/*!40000 ALTER TABLE `T_BASE_USER_ROLE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BUSINESS_DTU`
--

DROP TABLE IF EXISTS `T_BUSINESS_DTU`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BUSINESS_DTU` (
  `DTUID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `DTUNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT 'DTU终端号',
  `ProjectID` int(11) DEFAULT NULL COMMENT 'projectinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`DTUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BUSINESS_DTU`
--

LOCK TABLES `T_BUSINESS_DTU` WRITE;
/*!40000 ALTER TABLE `T_BUSINESS_DTU` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_BUSINESS_DTU` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BUSINESS_DTU_CONFIG`
--

DROP TABLE IF EXISTS `T_BUSINESS_DTU_CONFIG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BUSINESS_DTU_CONFIG`
--

LOCK TABLES `T_BUSINESS_DTU_CONFIG` WRITE;
/*!40000 ALTER TABLE `T_BUSINESS_DTU_CONFIG` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_BUSINESS_DTU_CONFIG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BUSINESS_FORMULA`
--

DROP TABLE IF EXISTS `T_BUSINESS_FORMULA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BUSINESS_FORMULA` (
  `FormulaID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `FormulaContent` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '公式',
  `Formulatype` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '公式类型',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`FormulaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BUSINESS_FORMULA`
--

LOCK TABLES `T_BUSINESS_FORMULA` WRITE;
/*!40000 ALTER TABLE `T_BUSINESS_FORMULA` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_BUSINESS_FORMULA` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BUSINESS_IMG`
--

DROP TABLE IF EXISTS `T_BUSINESS_IMG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BUSINESS_IMG` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `projectdoc_id` int(11) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `image_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片名称',
  `image_path` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片路径',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BUSINESS_IMG`
--

LOCK TABLES `T_BUSINESS_IMG` WRITE;
/*!40000 ALTER TABLE `T_BUSINESS_IMG` DISABLE KEYS */;
INSERT INTO `T_BUSINESS_IMG` VALUES (4,52,'2015-01-04 00:00:00',NULL,NULL),(5,50,'2015-01-04 00:00:00',NULL,NULL),(6,51,'2015-01-04 00:00:00',NULL,NULL),(7,59,'2015-01-06 00:00:00',NULL,NULL),(8,58,'2015-01-06 00:00:00',NULL,NULL),(9,61,'2015-01-07 00:00:00',NULL,NULL);
/*!40000 ALTER TABLE `T_BUSINESS_IMG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BUSINESS_PARAM`
--

DROP TABLE IF EXISTS `T_BUSINESS_PARAM`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BUSINESS_PARAM` (
  `ParameterID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `Modulus` double DEFAULT NULL COMMENT '系数',
  `Constant` double DEFAULT NULL COMMENT '常量',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`ParameterID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BUSINESS_PARAM`
--

LOCK TABLES `T_BUSINESS_PARAM` WRITE;
/*!40000 ALTER TABLE `T_BUSINESS_PARAM` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_BUSINESS_PARAM` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BUSINESS_SENSOR`
--

DROP TABLE IF EXISTS `T_BUSINESS_SENSOR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_BUSINESS_SENSOR` (
  `SensorID` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `SensorNO` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传感器号',
  `StationID` int(11) DEFAULT NULL COMMENT 'stationinfo表编号',
  `Time` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`SensorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BUSINESS_SENSOR`
--

LOCK TABLES `T_BUSINESS_SENSOR` WRITE;
/*!40000 ALTER TABLE `T_BUSINESS_SENSOR` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_BUSINESS_SENSOR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_BUSINESS_STATION`
--

DROP TABLE IF EXISTS `T_BUSINESS_STATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_BUSINESS_STATION`
--

LOCK TABLES `T_BUSINESS_STATION` WRITE;
/*!40000 ALTER TABLE `T_BUSINESS_STATION` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_BUSINESS_STATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_LOG_ALARM`
--

DROP TABLE IF EXISTS `T_LOG_ALARM`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_LOG_ALARM`
--

LOCK TABLES `T_LOG_ALARM` WRITE;
/*!40000 ALTER TABLE `T_LOG_ALARM` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_LOG_ALARM` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_LOG_LOGIN`
--

DROP TABLE IF EXISTS `T_LOG_LOGIN`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_LOG_LOGIN` (
  `id` bigint(8) NOT NULL,
  `login_record` varchar(255) DEFAULT NULL COMMENT '登录信息记录文本（自定义规则）',
  `operator_person` varchar(10) DEFAULT NULL,
  `login_role` varchar(10) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_LOG_LOGIN`
--

LOCK TABLES `T_LOG_LOGIN` WRITE;
/*!40000 ALTER TABLE `T_LOG_LOGIN` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_LOG_LOGIN` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `T_LOG_OPER`
--

DROP TABLE IF EXISTS `T_LOG_OPER`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `T_LOG_OPER` (
  `OPERATE_ID` bigint(8) NOT NULL COMMENT 'PK',
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `T_LOG_OPER`
--

LOCK TABLES `T_LOG_OPER` WRITE;
/*!40000 ALTER TABLE `T_LOG_OPER` DISABLE KEYS */;
/*!40000 ALTER TABLE `T_LOG_OPER` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-18  1:28:40
