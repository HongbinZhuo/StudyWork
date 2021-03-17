package com.kuang.dao;

import net.sf.json.xml.XMLSerializer;

/**
 * @Author Zhuohongbin
 * @Description TODO
 * @Date 2021/3/17 19:18
 */
public class JSON {
    public static void main(String[] args) {
        String result =" <root>\n" +
                "                  <message_header>\n" +
                "                    <client_id>120301</client_id>\n" +
                "                    <exchange_id>120301202101141656562163</exchange_id>\n" +
                "                    <service_code>RES_ResRelease</service_code>\n" +
                "                    <response_time>1610614616810</response_time>\n" +
                "                    <service_id>101002</service_id>\n" +
                "                    <state>0</state>\n" +
                "                    <desc>success</desc>\n" +
                "                  </message_header>\n" +
                "                  <message_body>\n" +
                "                    <response>\n" +
                "                      <resp_desc>资源接收报文成功！</resp_desc>\n" +
                "                      <resp_code>1</resp_code>\n" +
                "                      <order_id>120021011295099855</order_id>\n" +
                "                    </response>\n" +
                "                  </message_body>\n" +
                "                </root>";
        System.out.println(XmlTool.documentToJSONObject(result).toJSONString());
        String xml3 = "<?xml version=\"1.0\" encoding=\"utf-8\"?><REQUEST_XML><ID>0001</ID><NAME>零零幺</NAME><AGE>100</AGE><LIKE><FOOD>香蕉</FOOD><FOOD>苹果</FOOD></LIKE></REQUEST_XML>";


        System.out.println(xml2JSON(result));
    }

    public static String xml2JSON(String xml){
        return new XMLSerializer().read(xml).toString();
    }

}
