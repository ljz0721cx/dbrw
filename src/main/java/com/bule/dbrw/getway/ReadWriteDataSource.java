package com.bule.dbrw.getway;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 处理读写的问题
 * Created by lijianzhen1 on 2019/1/30.
 */
public class ReadWriteDataSource extends AbstractRoutingDataSource {
    /**
     * 这里获得配置中拿到的值得连接dataSource的配置
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return null;
    }
}
