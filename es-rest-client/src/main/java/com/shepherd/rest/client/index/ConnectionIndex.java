package com.shepherd.rest.client.index;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @author fjzheng
 * @version 1.0
 * @date 2021/12/6 17:15
 */
public class ConnectionIndex {

    public static void main(String[] args) throws Exception {

        // 创建ES客户端
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("127.0.0.1", 9200, "http"))
        );

        // 关闭ES客户端
        esClient.close();
    }
}
