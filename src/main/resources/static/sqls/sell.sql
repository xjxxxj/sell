/*
 Navicat Premium Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 50622
 Source Host           : 47.105.47.141:3306
 Source Schema         : sell

 Target Server Type    : MySQL
 Target Server Version : 50622
 File Encoding         : 65001

 Date: 20/11/2018 09:47:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_buyer
-- ----------------------------
DROP TABLE IF EXISTS `tb_buyer`;
CREATE TABLE `tb_buyer`  (
  `buyerName` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家姓名',
  `buyerPhone` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家电话',
  `buyerAddress` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家地址',
  `buyerOpenId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '买家id，买家唯一标识',
  PRIMARY KEY (`buyerOpenId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `orderId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单id，订单的唯一标识',
  `orderAmount` int(15) NULL DEFAULT NULL COMMENT '订单总金额，单位分',
  `orderStatus` int(11) NULL DEFAULT NULL COMMENT '订单状态，0：已完成，1：未完成',
  `payStatus` int(11) NULL DEFAULT NULL COMMENT '支付状态，0：已支付，0：未支付',
  `createTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updateTime` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `buyerOpenId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家id',
  `buyerName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家名字',
  `buyerPhone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家电话',
  `buyerAddress` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家地址',
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_orderitem_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_orderitem_detail`;
CREATE TABLE `tb_orderitem_detail`  (
  `detailId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单项id，订单项唯一标识',
  `productId` varbinary(10) NULL DEFAULT NULL COMMENT '订单项中的商品id',
  `orderId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项所属订单的id',
  `productName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项中商品的名字',
  `productPrice` double NULL DEFAULT NULL COMMENT '订单项中商品的价格',
  `productQuantity` int(11) NULL DEFAULT NULL COMMENT '订单项中商品的数量',
  `productIcon` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项中商品的图标，商品列表时使用',
  `productImage` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项中商品的图片，商品详情时的图片',
  PRIMARY KEY (`detailId`) USING BTREE,
  INDEX `FK_Reference_4`(`orderId`) USING BTREE,
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`orderId`) REFERENCES `tb_order` (`orderId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_product_category
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_category`;
CREATE TABLE `tb_product_category`  (
  `type` int(4) NOT NULL AUTO_INCREMENT COMMENT '商品类别id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品类别名字',
  `description` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '关于该商品类别的描述',
  `priority` int(2) NULL DEFAULT NULL COMMENT '商品类别优先级，级别越高越靠前',
  PRIMARY KEY (`type`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_product_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_info`;
CREATE TABLE `tb_product_info`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品的id，商品唯一标识',
  `name` varbinary(100) NULL DEFAULT NULL COMMENT '商品名字',
  `price` int(15) NULL DEFAULT NULL COMMENT '商品价格，单位：分',
  `description` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品的描述',
  `icon` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品的图标url',
  `categoryType` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品所属类别的名字',
  `status` smallint(1) NULL DEFAULT NULL COMMENT '0、已上架  1、已下架',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
