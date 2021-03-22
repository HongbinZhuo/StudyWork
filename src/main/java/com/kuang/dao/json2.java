package com.kuang.dao;

/**
 * @Author Zhuohongbin
 * @Description TODO
 * @Date 2021/3/17 19:31
 */
public class json2 {
    public static void main(String[] args) {
        String a="{\n" +
                "    \"message_header\":{\n" +
                "        \"client_id\":\"120301\",\n" +
                "        \"exchange_id\":\"120301202101141656562163\",\n" +
                "        \"service_code\":\"RES_ResRelease\",\n" +
                "        \"response_time\":\"1610614616810\",\n" +
                "        \"service_id\":\"101002\",\n" +
                "        \"state\":\"0\",\n" +
                "        \"desc\":\"success\"\n" +
                "    },\n" +
                "    \"message_body\":[\n" +
                "        {\n" +
                "            \"resp_desc\":\"资源接收报文成功！\",\n" +
                "            \"resp_code\":\"1\",\n" +
                "            \"order_id\":\"120021011295099855\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        System.out.println();
        System.out.println(a);
//        System.out.println("_+++++++++");


     /*   JSONObject jsonObject = JSONObject.parseObject(a);
        System.out.println(jsonObject);

        System.out.println("+++++++++++++++++");

        JSONArray message_body = jsonObject.getJSONArray("message_body");


        System.out.println(  message_body.getJSONObject(0).getString("resp_code"));*/





    }

}
