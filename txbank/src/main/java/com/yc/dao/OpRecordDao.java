package com.yc.dao;

import com.yc.bean.OpRecord;

import java.util.List;

public interface OpRecordDao {
    //设计日志的添加接口方法: TODO: 参数
    public void insertOpRecord(  OpRecord opRecord   );

    /**
     * 查询一个用户所有的日志. 根据时间排序
     * @param accountid
     * @return
     */
    public List<OpRecord> findOpRecord(int accountid );

    /**
     * 查询 accountid账户 opType类型 的操作 根据时间排序
     * @param accountid
     * @param opType
     * @return
     */
    public List<OpRecord>  findOpRecord(  int accountid, String opType );

    /**
     * 待开发. 其它特殊查询
     * @param opRecord
     * @return
     */
    public List<OpRecord>  findOpRecord(  OpRecord opRecord );
}

