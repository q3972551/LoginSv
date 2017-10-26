package db.wxuser.dao;

import db.wxuser.entity.WXUserData;
import db.wxuser.entity.WXUserDataExample;
import java.sql.SQLException;
import java.util.List;

public interface WXUserDataDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    void insert(WXUserData record) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    int updateByPrimaryKey(WXUserData record) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    int updateByPrimaryKeySelective(WXUserData record) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    List selectByExample(WXUserDataExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    WXUserData selectByPrimaryKey(String id) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    int deleteByExample(WXUserDataExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    int deleteByPrimaryKey(String id) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    int countByExample(WXUserDataExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    int updateByExampleSelective(WXUserData record, WXUserDataExample example) throws SQLException;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_wx
     *
     * @abatorgenerated Wed Oct 25 17:47:27 CST 2017
     */
    int updateByExample(WXUserData record, WXUserDataExample example) throws SQLException;
}