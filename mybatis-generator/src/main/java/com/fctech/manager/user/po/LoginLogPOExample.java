package com.fctech.manager.user.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginLogPOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginRecordIsNull() {
            addCriterion("login_record is null");
            return (Criteria) this;
        }

        public Criteria andLoginRecordIsNotNull() {
            addCriterion("login_record is not null");
            return (Criteria) this;
        }

        public Criteria andLoginRecordEqualTo(String value) {
            addCriterion("login_record =", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordNotEqualTo(String value) {
            addCriterion("login_record <>", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordGreaterThan(String value) {
            addCriterion("login_record >", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordGreaterThanOrEqualTo(String value) {
            addCriterion("login_record >=", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordLessThan(String value) {
            addCriterion("login_record <", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordLessThanOrEqualTo(String value) {
            addCriterion("login_record <=", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordLike(String value) {
            addCriterion("login_record like", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordNotLike(String value) {
            addCriterion("login_record not like", value, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordIn(List<String> values) {
            addCriterion("login_record in", values, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordNotIn(List<String> values) {
            addCriterion("login_record not in", values, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordBetween(String value1, String value2) {
            addCriterion("login_record between", value1, value2, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andLoginRecordNotBetween(String value1, String value2) {
            addCriterion("login_record not between", value1, value2, "loginRecord");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonIsNull() {
            addCriterion("operator_person is null");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonIsNotNull() {
            addCriterion("operator_person is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonEqualTo(String value) {
            addCriterion("operator_person =", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonNotEqualTo(String value) {
            addCriterion("operator_person <>", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonGreaterThan(String value) {
            addCriterion("operator_person >", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonGreaterThanOrEqualTo(String value) {
            addCriterion("operator_person >=", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonLessThan(String value) {
            addCriterion("operator_person <", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonLessThanOrEqualTo(String value) {
            addCriterion("operator_person <=", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonLike(String value) {
            addCriterion("operator_person like", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonNotLike(String value) {
            addCriterion("operator_person not like", value, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonIn(List<String> values) {
            addCriterion("operator_person in", values, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonNotIn(List<String> values) {
            addCriterion("operator_person not in", values, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonBetween(String value1, String value2) {
            addCriterion("operator_person between", value1, value2, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andOperatorPersonNotBetween(String value1, String value2) {
            addCriterion("operator_person not between", value1, value2, "operatorPerson");
            return (Criteria) this;
        }

        public Criteria andLoginRoleIsNull() {
            addCriterion("login_role is null");
            return (Criteria) this;
        }

        public Criteria andLoginRoleIsNotNull() {
            addCriterion("login_role is not null");
            return (Criteria) this;
        }

        public Criteria andLoginRoleEqualTo(String value) {
            addCriterion("login_role =", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleNotEqualTo(String value) {
            addCriterion("login_role <>", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleGreaterThan(String value) {
            addCriterion("login_role >", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleGreaterThanOrEqualTo(String value) {
            addCriterion("login_role >=", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleLessThan(String value) {
            addCriterion("login_role <", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleLessThanOrEqualTo(String value) {
            addCriterion("login_role <=", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleLike(String value) {
            addCriterion("login_role like", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleNotLike(String value) {
            addCriterion("login_role not like", value, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleIn(List<String> values) {
            addCriterion("login_role in", values, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleNotIn(List<String> values) {
            addCriterion("login_role not in", values, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleBetween(String value1, String value2) {
            addCriterion("login_role between", value1, value2, "loginRole");
            return (Criteria) this;
        }

        public Criteria andLoginRoleNotBetween(String value1, String value2) {
            addCriterion("login_role not between", value1, value2, "loginRole");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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