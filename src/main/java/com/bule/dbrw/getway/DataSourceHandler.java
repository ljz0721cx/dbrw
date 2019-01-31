package com.bule.dbrw.getway;

/**
 * Created by lijianzhen1 on 2019/1/31.
 */
public class DataSourceHandler {
    private static final ThreadLocal<DbSource> localLookupKey = new ThreadLocal<>();


    /**
     * 绑定当前线程数据源的key
     *
     * @param lookupKey
     */
    public static void putDataSource(DbSource lookupKey) {
        localLookupKey.set(lookupKey);
    }

    /**
     * 获取当前线程的数据源的key
     *
     * @return
     */
    public static DbSource getDataSource() {
        return localLookupKey.get();
    }


    /**
     * 移除当前线程的执行key
     */
    public static void remove() {
        localLookupKey.remove();
    }
}
