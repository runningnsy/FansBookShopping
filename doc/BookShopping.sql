# MySQL-Front 5.1  (Build 4.2)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: shopping
# ------------------------------------------------------
# Server version 5.5.17

DROP DATABASE IF EXISTS `shopping`;
CREATE DATABASE `shopping` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `shopping`;

#
# Source for table book
#

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `book_id` int(11) NOT NULL DEFAULT '0' COMMENT '书的ID',
  `book_category_id` int(11) DEFAULT NULL COMMENT '书的分类ID',
  `name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '书名',
  `current_price` float DEFAULT NULL COMMENT '当前价格',
  `full_price` float DEFAULT NULL COMMENT '定价',
  `description` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '描述',
  `author` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '作者',
  `press` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '出版社',
  `press_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '出版日期',
  `isbn` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '国际图书编号',
  `stock` bigint(20) DEFAULT NULL COMMENT '库存',
  `image` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片名字',
  PRIMARY KEY (`book_id`),
  KEY `FK_book_bookcategory` (`book_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT COMMENT='书';

#
# Dumping data for table book
#

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,1,'中国象棋',100,102,NULL,'司马迁','军事谊文出版社','2011-12-05 20:55:07',NULL,NULL,'chess1.jpg');
INSERT INTO `book` VALUES (2,1,'世界因你不同',32,33,NULL,'李开复','中信出版社','2011-12-05 20:48:54',NULL,NULL,'kaifu.jpg');
INSERT INTO `book` VALUES (3,1,'人生可以走直线',24,29,NULL,'百度','中信出版社','2011-12-05 20:48:58',NULL,NULL,'liyanhong.jpg');
INSERT INTO `book` VALUES (4,1,'我的成功不是偶然',43,49,NULL,'阿里巴巴','中信出版社','2011-12-05 20:49:00',NULL,NULL,'mayun.jpg');
INSERT INTO `book` VALUES (5,1,'影响力',34,45,NULL,'Anderson','军事谊文出版社','2011-12-05 20:49:10',NULL,NULL,'yingxiangli.jpg');
INSERT INTO `book` VALUES (6,1,'穷爸爸富爸爸',24,27,NULL,'清奇','人民教育出版社','2011-12-05 20:49:25',NULL,NULL,'baba.jpg');
INSERT INTO `book` VALUES (8,1,'金字塔原理',35,38,NULL,'美国的','人民教育出版社','2011-12-05 20:48:51',NULL,NULL,'jinzita.jpg');
INSERT INTO `book` VALUES (9,1,'世界上最伟大的推销员',54,58,NULL,'Anderson','人民教育出版社','2011-12-05 20:49:09',NULL,NULL,'tuixiaoyuan.jpg');
INSERT INTO `book` VALUES (10,5,'Android应用开发揭秘',23,28,NULL,'阿里巴巴','中信出版社','2011-12-05 20:49:23',NULL,NULL,'android.jpg');
INSERT INTO `book` VALUES (11,2,'卡耐基沟通与人际关系',34,45,NULL,'编程大师','人民教育出版社','2011-12-05 20:48:38',NULL,NULL,'gotong.jpg');
INSERT INTO `book` VALUES (12,2,'你能行',21,26,NULL,'编程高手','人民教育出版社','2011-12-05 20:49:03',NULL,NULL,'ninengxing.jpg');
INSERT INTO `book` VALUES (13,2,'从零开始做人脉',43,46,NULL,'编程高手','人民教育出版社','2011-12-05 20:49:04',NULL,NULL,'renmai.jpg');
INSERT INTO `book` VALUES (14,2,'人生可以走直线',21,26,NULL,'编程高手','吉林教育出版社','2011-12-05 20:48:59',NULL,NULL,'liyanhong.jpg');
INSERT INTO `book` VALUES (18,3,'货币战争',40,50,NULL,'宋鸿兵','中信出版社','2011-12-05 20:48:41',NULL,NULL,'huobi1.jpg');
INSERT INTO `book` VALUES (19,3,'金权天下',40,54,NULL,'宋鸿兵','中信出版社','2011-12-05 20:48:42',NULL,NULL,'huobi2.jpg');
INSERT INTO `book` VALUES (20,3,'金融无疆',40,54,NULL,'宋鸿兵','中信出版社','2011-12-05 20:48:45',NULL,NULL,'huobi3.jpg');
INSERT INTO `book` VALUES (21,1,'三国演义',70,78,NULL,'中国人','电子工业出版社','2011-12-05 20:49:07',NULL,NULL,'sanguoyanyi.jpg');
INSERT INTO `book` VALUES (22,1,'红楼梦',23,25,NULL,'chinaman','电子工业出版社','2011-12-05 20:48:40',NULL,NULL,'hongloumeng.jpg');
INSERT INTO `book` VALUES (23,4,'管理十戒',37,47,NULL,'编程大师','电子工业出版社','2011-12-05 20:48:39',NULL,NULL,'guanlishijie.jpg');
INSERT INTO `book` VALUES (24,4,'基业长青',37,40,NULL,'编程高手','电子工业出版社','2011-12-05 20:48:53',NULL,NULL,'jiyechangqing.jpg');
INSERT INTO `book` VALUES (25,4,'从优秀到卓越',37,40,NULL,'编程高手','电子工业出版社','2011-12-05 20:49:11',NULL,NULL,'youxiuzhuoyue.jpg');
INSERT INTO `book` VALUES (26,1,'将才',37,41,NULL,'台湾的','电子工业出版社','2011-12-05 20:48:50',NULL,NULL,'jiangcai.jpg');
INSERT INTO `book` VALUES (27,5,'软件工程',25,30,NULL,'编程高手','机械工业出版社','2011-12-05 20:49:05',NULL,NULL,'ruanjiangongcheng.jpg');
INSERT INTO `book` VALUES (28,5,'数据结构',23,34,NULL,'编程高手','机械工业出版社','2011-12-05 20:49:22',NULL,NULL,'algotithm.jpg');
INSERT INTO `book` VALUES (29,5,'计算机网络',34,45,NULL,'编程高手','机械工业出版社','2011-12-05 20:49:01',NULL,NULL,'network.jpg');
INSERT INTO `book` VALUES (30,5,'算法导论',43,56,NULL,'编程大师','机械工业出版社','2011-12-05 20:48:17',NULL,NULL,'daolun.jpg');
INSERT INTO `book` VALUES (31,5,'编译原理',70,78,NULL,'编程大师','机械工业出版社','2011-12-05 20:48:13',NULL,NULL,'compiler.jpg');
INSERT INTO `book` VALUES (32,5,'人工智能',40,50,NULL,'fans','机械工业出版社','2011-12-05 20:49:20',NULL,NULL,'ai.jpg');
INSERT INTO `book` VALUES (33,5,'Java编程思想',40,50,NULL,'Java高手','机械工业出版社','2011-12-05 20:48:48',NULL,NULL,'javathinking.jpg');
INSERT INTO `book` VALUES (34,5,'计算机科学概论',57,67,NULL,'fans','机械工业出版社','2011-12-05 20:48:52',NULL,NULL,'jisuanji.jpg');
INSERT INTO `book` VALUES (35,5,'中国象棋入门与提高',24,27,NULL,'小明哥','人民邮电出版社','2011-12-05 20:49:27',NULL,NULL,'chinesechess.jpg');
INSERT INTO `book` VALUES (36,5,'鸟哥的Linux私房菜服务器架设篇',60,69,NULL,'鸟哥','人民邮电出版社','2011-12-05 20:48:55',NULL,NULL,'linux1.jpg');
INSERT INTO `book` VALUES (37,5,'鸟哥的Linux私房菜基础学习篇',60,67,NULL,'鸟哥','人民邮电出版社','2011-12-05 20:48:57',NULL,NULL,'linux2.jpg');
INSERT INTO `book` VALUES (38,5,'大话设计模式',34,46,NULL,'程杰','清华大学出版社','2011-12-05 20:48:36',NULL,NULL,'designpattern.jpg');
INSERT INTO `book` VALUES (39,5,'经典JavaEE企业应用实战',80,100,NULL,'李刚','电子工业出版社','2011-12-05 20:48:47',NULL,NULL,'javaee2.jpg');
INSERT INTO `book` VALUES (40,5,'轻量级JavaEE企业应用实战',67,70,NULL,'李刚','电子工业出版社','2011-12-05 20:48:46',NULL,NULL,'javaee1.jpg');
INSERT INTO `book` VALUES (41,1,'java',NULL,NULL,NULL,'fans','中信出版社','2011-12-08 09:38:25',NULL,NULL,NULL);
INSERT INTO `book` VALUES (42,1,'java',NULL,NULL,NULL,'fans','中信出版社','2011-12-08 13:28:17',NULL,NULL,NULL);
INSERT INTO `book` VALUES (43,1,'java',NULL,NULL,NULL,'fans','11','2012-11-03 15:37:31',NULL,NULL,NULL);
INSERT INTO `book` VALUES (44,1,'java',NULL,NULL,NULL,'fans','AWD萨顶顶','2012-11-03 15:37:37',NULL,NULL,NULL);
INSERT INTO `book` VALUES (45,1,'java',NULL,NULL,NULL,'fans','?????','2012-11-03 15:33:55',NULL,NULL,NULL);
INSERT INTO `book` VALUES (46,1,'java',NULL,NULL,NULL,'fans','?????','2012-11-03 15:37:14',NULL,NULL,NULL);
INSERT INTO `book` VALUES (47,1,'java',NULL,NULL,NULL,'fans','?????','2012-11-03 15:52:17',NULL,NULL,NULL);
INSERT INTO `book` VALUES (48,1,'java',NULL,NULL,NULL,'fans','中信出版社','2012-11-03 15:56:08',NULL,NULL,NULL);
INSERT INTO `book` VALUES (49,1,'java',NULL,NULL,NULL,'fans','中信出版社','2012-11-03 15:57:56',NULL,NULL,NULL);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table bookcategory
#

DROP TABLE IF EXISTS `bookcategory`;
CREATE TABLE `bookcategory` (
  `book_category_id` int(11) NOT NULL DEFAULT '0' COMMENT '书的分类ID',
  `name` varchar(40) DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`book_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='书的分类';

#
# Dumping data for table bookcategory
#

LOCK TABLES `bookcategory` WRITE;
/*!40000 ALTER TABLE `bookcategory` DISABLE KEYS */;
INSERT INTO `bookcategory` VALUES (1,'文学');
INSERT INTO `bookcategory` VALUES (2,'社科');
INSERT INTO `bookcategory` VALUES (3,'经济');
INSERT INTO `bookcategory` VALUES (4,'管理');
INSERT INTO `bookcategory` VALUES (5,'计算机');
/*!40000 ALTER TABLE `bookcategory` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table bookcomment
#

DROP TABLE IF EXISTS `bookcomment`;
CREATE TABLE `bookcomment` (
  `book_comment_id` int(11) NOT NULL DEFAULT '0',
  `user_id` int(11) DEFAULT NULL,
  `book_id` int(11) DEFAULT NULL,
  `title` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `content` varchar(2000) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `grade` tinyint(4) DEFAULT NULL,
  `read_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `mood` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`book_comment_id`),
  KEY `FK_book_bookcomment` (`book_id`),
  KEY `FK_user_book_comment` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='买书的用户对书的评论';

#
# Dumping data for table bookcomment
#

LOCK TABLES `bookcomment` WRITE;
/*!40000 ALTER TABLE `bookcomment` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookcomment` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table order2
#

DROP TABLE IF EXISTS `order2`;
CREATE TABLE `order2` (
  `order_id` int(11) NOT NULL DEFAULT '0' COMMENT '订单号',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `receiver` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收货人姓名',
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '下单时间',
  `status` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '订单状态',
  `pay_style` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '支付方式',
  `total_money` float DEFAULT NULL COMMENT '订单总金额',
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FK_user_order` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='订单';

#
# Dumping data for table order2
#

LOCK TABLES `order2` WRITE;
/*!40000 ALTER TABLE `order2` DISABLE KEYS */;
INSERT INTO `order2` VALUES (1,1,NULL,'2011-11-28 20:46:07',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (2,NULL,NULL,'2011-11-28 21:54:35',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (3,NULL,NULL,'2011-12-05 21:02:41',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (4,NULL,NULL,'2011-12-05 21:03:09',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (5,NULL,NULL,'2011-12-06 21:15:48',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (6,NULL,NULL,'2011-12-07 17:46:52',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (7,NULL,NULL,'2011-12-07 21:37:11',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (8,NULL,NULL,'2011-12-07 21:37:50',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (9,NULL,NULL,'2011-12-07 21:39:49',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (10,NULL,NULL,'2011-12-07 22:05:22',NULL,NULL,NULL,NULL);
INSERT INTO `order2` VALUES (11,NULL,'??','2012-11-03 15:47:36','???','????',NULL,NULL);
INSERT INTO `order2` VALUES (12,NULL,'??','2012-11-03 15:49:00','???','????',NULL,NULL);
/*!40000 ALTER TABLE `order2` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table orderitem
#

DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `order_item_id` int(11) NOT NULL DEFAULT '0' COMMENT '订单项ID',
  `order_id` int(11) DEFAULT NULL COMMENT '订单ID',
  `book_id` int(11) DEFAULT NULL COMMENT '书ID',
  `amount` int(11) DEFAULT NULL COMMENT '数量',
  `price` float DEFAULT NULL COMMENT '总价',
  PRIMARY KEY (`order_item_id`),
  KEY `FK_book_orderitem` (`book_id`),
  KEY `FK_order_orderitem` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='订单项';

#
# Dumping data for table orderitem
#

LOCK TABLES `orderitem` WRITE;
/*!40000 ALTER TABLE `orderitem` DISABLE KEYS */;
INSERT INTO `orderitem` VALUES (1,1,2,NULL,NULL);
INSERT INTO `orderitem` VALUES (2,1,1,NULL,NULL);
INSERT INTO `orderitem` VALUES (3,2,1,NULL,NULL);
INSERT INTO `orderitem` VALUES (4,3,18,NULL,NULL);
INSERT INTO `orderitem` VALUES (5,4,20,NULL,NULL);
INSERT INTO `orderitem` VALUES (6,4,18,NULL,NULL);
INSERT INTO `orderitem` VALUES (7,4,19,NULL,NULL);
INSERT INTO `orderitem` VALUES (8,5,32,NULL,NULL);
INSERT INTO `orderitem` VALUES (9,5,33,NULL,NULL);
INSERT INTO `orderitem` VALUES (10,6,29,NULL,NULL);
INSERT INTO `orderitem` VALUES (13,9,29,NULL,NULL);
INSERT INTO `orderitem` VALUES (14,9,30,NULL,NULL);
INSERT INTO `orderitem` VALUES (15,10,29,NULL,NULL);
INSERT INTO `orderitem` VALUES (16,10,30,NULL,NULL);
INSERT INTO `orderitem` VALUES (17,10,12,NULL,NULL);
INSERT INTO `orderitem` VALUES (18,11,1,NULL,NULL);
INSERT INTO `orderitem` VALUES (19,11,2,NULL,NULL);
INSERT INTO `orderitem` VALUES (20,12,1,NULL,NULL);
INSERT INTO `orderitem` VALUES (21,12,2,NULL,NULL);
/*!40000 ALTER TABLE `orderitem` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table user
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户ID',
  `user_role_id` int(11) DEFAULT NULL COMMENT '用户角色ID',
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色名',
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `address` varchar(400) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '收获地址',
  `mobile` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FK_user_userrole` (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户';

#
# Dumping data for table user
#

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,1,'fans','123',NULL,NULL,NULL,NULL);
INSERT INTO `user` VALUES (2,1,'fans','222',NULL,NULL,NULL,NULL);
INSERT INTO `user` VALUES (3,1,'zfq','123',NULL,NULL,NULL,NULL);
INSERT INTO `user` VALUES (4,1,'11','11',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table userrole
#

DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `user_role_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户角色ID',
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '角色名',
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户角色';

#
# Dumping data for table userrole
#

LOCK TABLES `userrole` WRITE;
/*!40000 ALTER TABLE `userrole` DISABLE KEYS */;
INSERT INTO `userrole` VALUES (1,'普通用户');
INSERT INTO `userrole` VALUES (2,'银卡用户');
INSERT INTO `userrole` VALUES (3,'金卡用户');
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
