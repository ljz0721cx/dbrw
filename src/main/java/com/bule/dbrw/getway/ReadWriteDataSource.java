package com.bule.dbrw.getway;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 简单的使用获取数据源
 * <p>
 * IsolationLevelDataSourceRouter
 * <p>
 * <p>
 * Created by lijianzhen1 on 2019/1/30.
 */
public class ReadWriteDataSource extends AbstractRoutingDataSource {
    /**
     * 这里获得配置中拿到的值得连接dataSource的配置
     *
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println("命中数据库的" + DataSourceHandler.getDataSource() + "库");
        return DataSourceHandler.getDataSource();
    }
}
