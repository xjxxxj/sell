/*
 Navicat Premium Data Transfer

 Source Server         : Wechatapp
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : wechatapp

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 19/11/2018 14:24:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_buyer
-- ----------------------------
DROP TABLE IF EXISTS `tb_buyer`;
CREATE TABLE `tb_buyer`  (
  `buyerName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `buyerPhone` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `buyerAddress` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `buyerOpenId` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_detail`;
CREATE TABLE `tb_detail`  (
  `detailId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `productId` varbinary(100) NOT NULL,
  `orderId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `productName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `productPrice` double NULL DEFAULT NULL,
  `productQuantity` int(11) NULL DEFAULT NULL,
  `productIcon` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `productImage` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`detailId`) USING BTREE,
  INDEX `FK_Reference_3`(`productId`) USING BTREE,
  INDEX `FK_Reference_4`(`orderId`) USING BTREE,
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`productId`) REFERENCES `tb_productinfo` (`productId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`orderId`) REFERENCES `tb_ordermain` (`orderId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_ordermain
-- ----------------------------
DROP TABLE IF EXISTS `tb_ordermain`;
CREATE TABLE `tb_ordermain`  (
  `orderId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `orderAmount` int(11) NULL DEFAULT NULL,
  `orderStatus` int(11) NULL DEFAULT NULL,
  `payStatus` int(11) NULL DEFAULT NULL,
  `createTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `updateTime` datetime(0) NULL DEFAULT NULL,
  `buyerOpenId` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_productinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_productinfo`;
CREATE TABLE `tb_productinfo`  (
  `productId` varbinary(100) NOT NULL,
  `productName` varbinary(100) NULL DEFAULT NULL,
  `productPrice` double NULL DEFAULT NULL,
  `description` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `productIcon` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `categoryName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `categoryType` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`productId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
