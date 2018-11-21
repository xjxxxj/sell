/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50711
 Source Host           : localhost:3306
 Source Schema         : sell

 Target Server Type    : MySQL
 Target Server Version : 50711
 File Encoding         : 65001

 Date: 21/11/2018 10:41:37
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
-- Records of tb_buyer
-- ----------------------------
INSERT INTO `tb_buyer` VALUES ('ph', '15634284328', '宝安', '431gwdfwfsa');
INSERT INTO `tb_buyer` VALUES ('xjx', '15626157232', '深圳', 'xjiafjfdsaofjlsafj43214jl');

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `orderId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单id，订单的唯一标识',
  `orderAmount` double(15, 2) NULL DEFAULT NULL COMMENT '订单总金额，单位元',
  `orderStatus` int(11) NULL DEFAULT NULL COMMENT '订单状态，0：已完成，1：未完成',
  `payStatus` int(11) NULL DEFAULT NULL COMMENT '支付状态，0：已支付，0：未支付',
  `createTime` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updateTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `buyerOpenId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家id',
  `buyerName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家名字',
  `buyerPhone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家电话',
  `buyerAddress` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '买家地址',
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES ('0d3d016a8fd84898a168280e9678a55c', 140.00, 1, 0, '2018-11-21 10:01:23', '2018-11-21 10:01:23', 'xjiafjfdsaofjlsafj43214jl', '彭', '13827328131', '资信达大厦');
INSERT INTO `tb_order` VALUES ('ba07079d2a1e40b6b30d11257dca0ab5', 158.64, 1, 0, '2018-11-21 10:34:24', '2018-11-21 10:34:24', 'xjiafjfdsaofjlsafj43214jl', 'xjx', '13847836758', '金源商务大厦');
INSERT INTO `tb_order` VALUES ('ed21ff5281414a898366df5b15eeff77', 148.76, 1, 0, '2018-11-21 09:56:25', '2018-11-21 09:56:25', 'xjiafjfdsaofjlsafj43214jl', '谢', '15626157232', '宝安');

-- ----------------------------
-- Table structure for tb_orderitem_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_orderitem_detail`;
CREATE TABLE `tb_orderitem_detail`  (
  `detailId` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '订单项id，订单项唯一标识',
  `productId` int(10) NULL DEFAULT NULL COMMENT '订单项中的商品id',
  `orderId` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项所属订单的id',
  `productName` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项中商品的名字',
  `productPrice` double(15, 2) NULL DEFAULT NULL COMMENT '订单项中商品的价格，单位：元',
  `productQuantity` int(11) NULL DEFAULT NULL COMMENT '订单项中商品的数量',
  `productIcon` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项中商品的图标，商品列表时使用',
  `productImage` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '订单项中商品的图片，商品详情时的图片',
  PRIMARY KEY (`detailId`) USING BTREE,
  INDEX `FK_Reference_4`(`orderId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_orderitem_detail
-- ----------------------------
INSERT INTO `tb_orderitem_detail` VALUES ('0b4460549351467c820be6644f95ce95', 2, '0d3d016a8fd84898a168280e9678a55c', '草莓咕噜肉', 43.00, 2, NULL, NULL);
INSERT INTO `tb_orderitem_detail` VALUES ('417a6b14a1184e49a750669f1df130c8', 1, 'ba07079d2a1e40b6b30d11257dca0ab5', '美食甜点', 9.88, 1, 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=607745733,2963223535&fm=26&gp=0.jpg', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=607745733,2963223535&fm=26&gp=0.jpg');
INSERT INTO `tb_orderitem_detail` VALUES ('77eb9e3839d8433fb89072e18548087c', 4, 'ed21ff5281414a898366df5b15eeff77', '乌江鱼', 52.88, 2, NULL, NULL);
INSERT INTO `tb_orderitem_detail` VALUES ('81b52815ff2c40c4aa1805a74c508d28', 2, 'ed21ff5281414a898366df5b15eeff77', '草莓咕噜肉', 43.00, 1, NULL, NULL);
INSERT INTO `tb_orderitem_detail` VALUES ('a9844edad8e14162ac2573425dca02f8', 2, 'ba07079d2a1e40b6b30d11257dca0ab5', '草莓咕噜肉', 43.00, 1, 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543302233&di=208e8f0e323143978304ea435e78bd17&imgtype=jpg&er=1&src=http%3A%2F%2Fpic39.photophoto.cn%2F20160602%2F1155115768092069_b.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543302233&di=208e8f0e323143978304ea435e78bd17&imgtype=jpg&er=1&src=http%3A%2F%2Fpic39.photophoto.cn%2F20160602%2F1155115768092069_b.jpg');
INSERT INTO `tb_orderitem_detail` VALUES ('aeffb37883d5461692da07b7943c69a9', 4, 'ba07079d2a1e40b6b30d11257dca0ab5', '乌江鱼', 52.88, 2, 'http://pic28.photophoto.cn/20130916/0042040205226046_b.jpg', 'http://pic28.photophoto.cn/20130916/0042040205226046_b.jpg');
INSERT INTO `tb_orderitem_detail` VALUES ('fae152eb31ac4f649a2a987456827f5b', 3, '0d3d016a8fd84898a168280e9678a55c', '豉油皇煎鲈鱼球', 54.00, 1, NULL, NULL);

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
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_product_category
-- ----------------------------
INSERT INTO `tb_product_category` VALUES (1, '粤菜', '广东人的菜', 0);
INSERT INTO `tb_product_category` VALUES (2, '川菜', '辣', 1);
INSERT INTO `tb_product_category` VALUES (3, '西餐', '尝试西方的风味', 0);

-- ----------------------------
-- Table structure for tb_product_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_info`;
CREATE TABLE `tb_product_info`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品的id，商品唯一标识',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品名字',
  `price` double(15, 2) NULL DEFAULT NULL COMMENT '商品价格，单位：元',
  `description` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品的描述',
  `icon` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品的图标url',
  `categoryType` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '商品所属类别的名字',
  `status` smallint(1) NULL DEFAULT NULL COMMENT '0、已上架  1、已下架',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_product_info
-- ----------------------------
INSERT INTO `tb_product_info` VALUES (1, '美食甜点', 9.88, '好吃，', 'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=607745733,2963223535&fm=26&gp=0.jpg', '3', 0);
INSERT INTO `tb_product_info` VALUES (2, '草莓咕噜肉', 43.00, '广东菜 粤菜 香港菜 特色菜 精美菜肴', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543302233&di=208e8f0e323143978304ea435e78bd17&imgtype=jpg&er=1&src=http%3A%2F%2Fpic39.photophoto.cn%2F20160602%2F1155115768092069_b.jpg', '1', 0);
INSERT INTO `tb_product_info` VALUES (3, '豉油皇煎鲈鱼球', 54.00, '精美菜肴 传统美食', 'http://pic30.photophoto.cn/20140318/0042040283347217_b.jpg', '1', 0);
INSERT INTO `tb_product_info` VALUES (4, '乌江鱼', 52.88, '特色餐饮 餐饮美食', 'http://pic28.photophoto.cn/20130916/0042040205226046_b.jpg', '2', 0);

SET FOREIGN_KEY_CHECKS = 1;
