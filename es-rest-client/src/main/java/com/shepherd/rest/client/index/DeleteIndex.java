package com.shepherd.rest.client.index;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @author fjzheng
 * @version 1.0
 * @date 2021/12/7 09:47
 */
public class DeleteIndex {
    public static void main(String[] args) throws Exception {

        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("127.0.0.1", 9200, "http"))
        );

        // 删除所有索引
        DeleteIndexRequest request = new DeleteIndexRequest("hello_index");

        AcknowledgedResponse response = esClient.indices().delete(request, RequestOptions.DEFAULT);

        // 响应状态
        System.out.println(response.isAcknowledged());

        esClient.close();
    }

}
