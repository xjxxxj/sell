package com.xinyan.sell.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xinyan.sell.enums.OrderStatus;
import com.xinyan.sell.enums.PayStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResultVoTest {
    //    @Test
//    public void test() throws JsonProcessingException {
//        ProductInfoVo productInfoVo = new ProductInfoVo(610,"皮蛋粥",5,"正宗松花皮蛋粥","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542382519745&di=ad488e7be3ef6279e25c3b68700a3d27&imgtype=0&src=http%3A%2F%2Fcp2.douguo.net%2Fupload%2Fcaiku%2F0%2F5%2Fc%2Fyuan_054b26528d523585867ddf9f5295f36c.jpg");
//        ResultVo resultVo = new ResultVo(0, "成功", productInfoVo);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String s = objectMapper.writeValueAsString(resultVo);
//        System.out.println(s);
//
//    }
    @Test
    public void testProductList() throws JsonProcessingException {
        //传入productInfoVo商品信息数据
        ProductInfoVo productInfoVo = new ProductInfoVo(610, "皮蛋粥", 5, "正宗松花皮蛋粥", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542382519745&di=ad488e7be3ef6279e25c3b68700a3d27&imgtype=0&src=http%3A%2F%2Fcp2.douguo.net%2Fupload%2Fcaiku%2F0%2F5%2Fc%2Fyuan_054b26528d523585867ddf9f5295f36c.jpg");
        //创建productVo对象
        ProductVo productVo = new ProductVo();
        //将productInfoVo商品信息传入Foods中
        productVo.setFoods(productInfoVo);
        //创建ProductCategoryVo 商品类目对象
        ProductCategoryVo category = new ProductCategoryVo();
        //设置类目表中的Name，Type属性
        category.setName("xjx");
        category.setType(1);
        //将ProductCategoryVo商品类目信息传入productVo
        productVo.setCategory(category);
        //创建ResultVo分别传入code,msg,data,
        ResultVo resultVo = new ResultVo(0, "成功", productVo);
        //创建objectMapper对象
        ObjectMapper objectMapper = new ObjectMapper();
        //调用writeValueAsString方法，将resultVo Json数据转换为字符串输出，
        String s = objectMapper.writeValueAsString(resultVo);
        System.out.println(s);


    }

    @Test
    public void testCreateOrder() throws JsonProcessingException {
        OrderMainListVo orderMainList = new OrderMainListVo("6554161321");
        ResultVo resultVo = new ResultVo(0, "成功", orderMainList);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(resultVo);
        System.out.println(s);
    }

    @Test
    public void testOrderList() throws JsonProcessingException {
        OrderMainListVo orderMainList = new OrderMainListVo
                ("653123165", "王小二", "13888888888"
                        , "宝安区", "a46s5d46a5s4d6", 28
                        , OrderStatus.SUCCESS, PayStatus.FINISHED, 1654949849L, 1654196493L, null);
        ResultVo resultVo = new ResultVo(0, "成功", orderMainList);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(resultVo);
        System.out.println(s);
    }

    @Test
    public void testQueryOderList() throws JsonProcessingException {
        OrderDetailListVo orderDetailList = new OrderDetailListVo("16541613216841", "653123165",
                132131321, "干锅土豆",
                12, 2, "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3859415049,3794064123&fm=26&gp=0.jpg", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542435832946&di=e0ae1fcceb060de1ab627b6540e2d6aa&imgtype=0&src=http%3A%2F%2Fls.csc86.com%2Fuploadfile%2F2015%2F0908%2F20150908104910776.jpg");
        OrderMainListVo orderMainList = new OrderMainListVo
                ("653123165", "王小二", "13888888888"
                        , "宝安区", "a46s5d46a5s4d6", 28
                        , OrderStatus.SUCCESS, PayStatus.FINISHED, 1654949849L, 1654196493L, orderDetailList);
        ResultVo resultVo = new ResultVo(0, "成功", orderMainList);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(resultVo);
        System.out.println(s);
    }

    @Test
    public void testCancelOrder() throws JsonProcessingException {
        ResultVo resultVo = new ResultVo(0, "成功", null);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(resultVo);
        System.out.println(s);
    }
}