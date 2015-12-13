package com.fctech.manager.user.po;

import java.util.ArrayList;
import java.util.List;

public class AuthorityPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAuthorityIdIsNull() {
            addCriterion("AUTHORITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("AUTHORITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(String value) {
            addCriterion("AUTHORITY_ID =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(String value) {
            addCriterion("AUTHORITY_ID <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(String value) {
            addCriterion("AUTHORITY_ID >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(String value) {
            addCriterion("AUTHORITY_ID <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLike(String value) {
            addCriterion("AUTHORITY_ID like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotLike(String value) {
            addCriterion("AUTHORITY_ID not like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<String> values) {
            addCriterion("AUTHORITY_ID in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<String> values) {
            addCriterion("AUTHORITY_ID not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNull() {
            addCriterion("AUTHORITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNotNull() {
            addCriterion("AUTHORITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameEqualTo(String value) {
            addCriterion("AUTHORITY_NAME =", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotEqualTo(String value) {
            addCriterion("AUTHORITY_NAME <>", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThan(String value) {
            addCriterion("AUTHORITY_NAME >", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NAME >=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThan(String value) {
            addCriterion("AUTHORITY_NAME <", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NAME <=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLike(String value) {
            addCriterion("AUTHORITY_NAME like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotLike(String value) {
            addCriterion("AUTHORITY_NAME not like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIn(List<String> values) {
            addCriterion("AUTHORITY_NAME in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotIn(List<String> values) {
            addCriterion("AUTHORITY_NAME not in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NAME between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NAME not between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoIsNull() {
            addCriterion("AUTHORITY_NO is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoIsNotNull() {
            addCriterion("AUTHORITY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoEqualTo(String value) {
            addCriterion("AUTHORITY_NO =", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoNotEqualTo(String value) {
            addCriterion("AUTHORITY_NO <>", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoGreaterThan(String value) {
            addCriterion("AUTHORITY_NO >", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NO >=", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoLessThan(String value) {
            addCriterion("AUTHORITY_NO <", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_NO <=", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoLike(String value) {
            addCriterion("AUTHORITY_NO like", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoNotLike(String value) {
            addCriterion("AUTHORITY_NO not like", value, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoIn(List<String> values) {
            addCriterion("AUTHORITY_NO in", values, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoNotIn(List<String> values) {
            addCriterion("AUTHORITY_NO not in", values, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NO between", value1, value2, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andAuthorityNoNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_NO not between", value1, value2, "authorityNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(String value) {
            addCriterion("LAST_MODIFY_TIME >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(String value) {
            addCriterion("LAST_MODIFY_TIME <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLike(String value) {
            addCriterion("LAST_MODIFY_TIME like", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotLike(String value) {
            addCriterion("LAST_MODIFY_TIME not like", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<String> values) {
            addCriterion("LAST_MODIFY_TIME in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<String> values) {
            addCriterion("LAST_MODIFY_TIME not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_TIME between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_TIME not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagIsNull() {
            addCriterion("AUTO_AUTHORITY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagIsNotNull() {
            addCriterion("AUTO_AUTHORITY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagEqualTo(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG =", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagNotEqualTo(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG <>", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagGreaterThan(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG >", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG >=", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagLessThan(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG <", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagLessThanOrEqualTo(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG <=", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagLike(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG like", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagNotLike(String value) {
            addCriterion("AUTO_AUTHORITY_FLAG not like", value, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagIn(List<String> values) {
            addCriterion("AUTO_AUTHORITY_FLAG in", values, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagNotIn(List<String> values) {
            addCriterion("AUTO_AUTHORITY_FLAG not in", values, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagBetween(String value1, String value2) {
            addCriterion("AUTO_AUTHORITY_FLAG between", value1, value2, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andAutoAuthorityFlagNotBetween(String value1, String value2) {
            addCriterion("AUTO_AUTHORITY_FLAG not between", value1, value2, "autoAuthorityFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("DELETE_FLAG like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("DELETE_FLAG not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNull() {
            addCriterion("OP_USER is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNotNull() {
            addCriterion("OP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserEqualTo(String value) {
            addCriterion("OP_USER =", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotEqualTo(String value) {
            addCriterion("OP_USER <>", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThan(String value) {
            addCriterion("OP_USER >", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThanOrEqualTo(String value) {
            addCriterion("OP_USER >=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThan(String value) {
            addCriterion("OP_USER <", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThanOrEqualTo(String value) {
            addCriterion("OP_USER <=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLike(String value) {
            addCriterion("OP_USER like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotLike(String value) {
            addCriterion("OP_USER not like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserIn(List<String> values) {
            addCriterion("OP_USER in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotIn(List<String> values) {
            addCriterion("OP_USER not in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserBetween(String value1, String value2) {
            addCriterion("OP_USER between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotBetween(String value1, String value2) {
            addCriterion("OP_USER not between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}