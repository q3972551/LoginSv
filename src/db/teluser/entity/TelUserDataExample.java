package db.teluser.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelUserDataExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public TelUserDataExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    protected TelUserDataExample(TelUserDataExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table user_tel
     *
     * @abatorgenerated Wed Oct 25 17:50:18 CST 2017
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return this;
        }

        public Criteria andTelIn(List values) {
            addCriterion("tel in", values, "tel");
            return this;
        }

        public Criteria andTelNotIn(List values) {
            addCriterion("tel not in", values, "tel");
            return this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return this;
        }

        public Criteria andPasswdIn(List values) {
            addCriterion("passwd in", values, "passwd");
            return this;
        }

        public Criteria andPasswdNotIn(List values) {
            addCriterion("passwd not in", values, "passwd");
            return this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regtime is null");
            return this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regtime is not null");
            return this;
        }

        public Criteria andRegtimeEqualTo(Long value) {
            addCriterion("regtime =", value, "regtime");
            return this;
        }

        public Criteria andRegtimeNotEqualTo(Long value) {
            addCriterion("regtime <>", value, "regtime");
            return this;
        }

        public Criteria andRegtimeGreaterThan(Long value) {
            addCriterion("regtime >", value, "regtime");
            return this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("regtime >=", value, "regtime");
            return this;
        }

        public Criteria andRegtimeLessThan(Long value) {
            addCriterion("regtime <", value, "regtime");
            return this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Long value) {
            addCriterion("regtime <=", value, "regtime");
            return this;
        }

        public Criteria andRegtimeIn(List values) {
            addCriterion("regtime in", values, "regtime");
            return this;
        }

        public Criteria andRegtimeNotIn(List values) {
            addCriterion("regtime not in", values, "regtime");
            return this;
        }

        public Criteria andRegtimeBetween(Long value1, Long value2) {
            addCriterion("regtime between", value1, value2, "regtime");
            return this;
        }

        public Criteria andRegtimeNotBetween(Long value1, Long value2) {
            addCriterion("regtime not between", value1, value2, "regtime");
            return this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("logintime is null");
            return this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("logintime is not null");
            return this;
        }

        public Criteria andLogintimeEqualTo(Long value) {
            addCriterion("logintime =", value, "logintime");
            return this;
        }

        public Criteria andLogintimeNotEqualTo(Long value) {
            addCriterion("logintime <>", value, "logintime");
            return this;
        }

        public Criteria andLogintimeGreaterThan(Long value) {
            addCriterion("logintime >", value, "logintime");
            return this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Long value) {
            addCriterion("logintime >=", value, "logintime");
            return this;
        }

        public Criteria andLogintimeLessThan(Long value) {
            addCriterion("logintime <", value, "logintime");
            return this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Long value) {
            addCriterion("logintime <=", value, "logintime");
            return this;
        }

        public Criteria andLogintimeIn(List values) {
            addCriterion("logintime in", values, "logintime");
            return this;
        }

        public Criteria andLogintimeNotIn(List values) {
            addCriterion("logintime not in", values, "logintime");
            return this;
        }

        public Criteria andLogintimeBetween(Long value1, Long value2) {
            addCriterion("logintime between", value1, value2, "logintime");
            return this;
        }

        public Criteria andLogintimeNotBetween(Long value1, Long value2) {
            addCriterion("logintime not between", value1, value2, "logintime");
            return this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return this;
        }

        public Criteria andTokenIn(List values) {
            addCriterion("token in", values, "token");
            return this;
        }

        public Criteria andTokenNotIn(List values) {
            addCriterion("token not in", values, "token");
            return this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return this;
        }
    }
}