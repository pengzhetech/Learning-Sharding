CREATE DATABASE database3;
USE database3;
DROP TABLE IF EXISTS `goods_0`;
CREATE TABLE `goods_0` (
  `goods_id` bigint(20) NOT NULL,
  `goods_name` varchar(100) COLLATE utf8_bin NOT NULL,
  `goods_type` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
DROP TABLE IF EXISTS `goods_1`;
CREATE TABLE `goods_1` (
  `goods_id` bigint(20) NOT NULL,
  `goods_name` varchar(100) COLLATE utf8_bin NOT NULL,
  `goods_type` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
CREATE DATABASE database4;
USE database4;
DROP TABLE IF EXISTS `goods_0`;
CREATE TABLE `goods_0` (
  `goods_id` bigint(20) NOT NULL,
  `goods_name` varchar(100) COLLATE utf8_bin NOT NULL,
  `goods_type` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

DROP TABLE IF EXISTS `goods_1`;
CREATE TABLE `goods_1` (
  `goods_id` bigint(20) NOT NULL,
  `goods_name` varchar(100) COLLATE utf8_bin NOT NULL,
  `goods_type` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
