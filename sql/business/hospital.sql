/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.32 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

CREATE TABLE `t_hospital` (
   `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
   `name` varchar(50) DEFAULT NULL COMMENT '医院名称',
   `address` varchar(50) NOT NULL COMMENT '医院地址',
   `logo` varchar(255) DEFAULT NULL COMMENT 'logo',
   `phone` varchar(12) DEFAULT NULL COMMENT '手机号码',
   `remark` varchar(500) DEFAULT '' COMMENT '医院介绍',
   `contactor` varchar(100) DEFAULT NULL COMMENT '联系人',
   `update_id` bigint(20) DEFAULT NULL COMMENT '更新者id',
   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
   `create_id` bigint(20) DEFAULT NULL COMMENT '创建者Id',
   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='医院表'
 
INSERT INTO `t_hospital` (`id`, `name`, `address`, `logo`, `phone`, `remark`, `contactor`, `update_id`, `update_time`, `create_id`, `create_time`) VALUES('1','广州南方医院','广州市广州大道北1838号','logo','13800138000','南方医院系南方医科大学（原第一军医大学）第一附属医院、第一临床医学院，是一所集医疗、教学、科研和预防保健为一体的大型综合性三级甲等医院，全国百佳医院。医院创建于1941年，2004年8月随大学由军队移交广东省。','李院长',NULL,NULL,NULL,'2019-08-01 22:46:18');
