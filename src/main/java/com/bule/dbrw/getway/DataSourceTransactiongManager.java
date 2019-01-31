package com.bule.dbrw.getway;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;

/**
 * Created by lijianzhen1 on 2019/1/31.
 */
public class DataSourceTransactiongManager extends DataSourceTransactionManager {

    /**
     * 基于Spring的事务声明做的读写分离
     *
     * @param transaction
     * @param definition
     */
    @Override
    protected void doBegin(Object transaction, TransactionDefinition definition) {
        //设置数据源
        boolean readOnly = definition.isReadOnly();
        if (readOnly) {
            DataSourceHandler.putDataSource(DbSource.READ);
        } else {
            DataSourceHandler.putDataSource(DbSource.WRITE);
        }
        super.doBegin(transaction, definition);
    }

    /**
     * 清除当前线程内的数据源
     *
     * @param transaction
     */
    @Override
    protected void doCleanupAfterCompletion(Object transaction) {
        super.doCleanupAfterCompletion(transaction);
        DataSourceHandler.remove();
    }
}
