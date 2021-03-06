package db.wxuser.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import db.wxuser.entity.WXUserData;
import db.wxuser.entity.WXUserDataExample;
import java.sql.SQLException;
import java.util.List;

public class WXUserDataDAOImpl implements WXUserDataDAO {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public WXUserDataDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public void insert(WXUserData record) throws SQLException {
        sqlMapClient.insert("user_wx.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public int updateByPrimaryKey(WXUserData record) throws SQLException {
        int rows = sqlMapClient.update("user_wx.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public int updateByPrimaryKeySelective(WXUserData record) throws SQLException {
        int rows = sqlMapClient.update("user_wx.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public List selectByExample(WXUserDataExample example) throws SQLException {
        List list = sqlMapClient.queryForList("user_wx.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public WXUserData selectByPrimaryKey(String id) throws SQLException {
        WXUserData key = new WXUserData();
        key.setId(id);
        WXUserData record = (WXUserData) sqlMapClient.queryForObject("user_wx.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public int deleteByExample(WXUserDataExample example) throws SQLException {
        int rows = sqlMapClient.delete("user_wx.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public int deleteByPrimaryKey(String id) throws SQLException {
        WXUserData key = new WXUserData();
        key.setId(id);
        int rows = sqlMapClient.delete("user_wx.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public int countByExample(WXUserDataExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("user_wx.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public int updateByExampleSelective(WXUserData record, WXUserDataExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("user_wx.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    public int updateByExample(WXUserData record, WXUserDataExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("user_wx.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    private static class UpdateByExampleParms extends WXUserDataExample {
        private Object record;

        public UpdateByExampleParms(Object record, WXUserDataExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}