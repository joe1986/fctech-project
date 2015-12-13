package com.fctech.manager.author.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtuPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtuPOExample() {
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

        public Criteria andDtuidIsNull() {
            addCriterion("DTUID is null");
            return (Criteria) this;
        }

        public Criteria andDtuidIsNotNull() {
            addCriterion("DTUID is not null");
            return (Criteria) this;
        }

        public Criteria andDtuidEqualTo(Integer value) {
            addCriterion("DTUID =", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidNotEqualTo(Integer value) {
            addCriterion("DTUID <>", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidGreaterThan(Integer value) {
            addCriterion("DTUID >", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DTUID >=", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidLessThan(Integer value) {
            addCriterion("DTUID <", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidLessThanOrEqualTo(Integer value) {
            addCriterion("DTUID <=", value, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidIn(List<Integer> values) {
            addCriterion("DTUID in", values, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidNotIn(List<Integer> values) {
            addCriterion("DTUID not in", values, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidBetween(Integer value1, Integer value2) {
            addCriterion("DTUID between", value1, value2, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtuidNotBetween(Integer value1, Integer value2) {
            addCriterion("DTUID not between", value1, value2, "dtuid");
            return (Criteria) this;
        }

        public Criteria andDtunoIsNull() {
            addCriterion("DTUNO is null");
            return (Criteria) this;
        }

        public Criteria andDtunoIsNotNull() {
            addCriterion("DTUNO is not null");
            return (Criteria) this;
        }

        public Criteria andDtunoEqualTo(String value) {
            addCriterion("DTUNO =", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotEqualTo(String value) {
            addCriterion("DTUNO <>", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoGreaterThan(String value) {
            addCriterion("DTUNO >", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoGreaterThanOrEqualTo(String value) {
            addCriterion("DTUNO >=", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoLessThan(String value) {
            addCriterion("DTUNO <", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoLessThanOrEqualTo(String value) {
            addCriterion("DTUNO <=", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoLike(String value) {
            addCriterion("DTUNO like", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotLike(String value) {
            addCriterion("DTUNO not like", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoIn(List<String> values) {
            addCriterion("DTUNO in", values, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotIn(List<String> values) {
            addCriterion("DTUNO not in", values, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoBetween(String value1, String value2) {
            addCriterion("DTUNO between", value1, value2, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotBetween(String value1, String value2) {
            addCriterion("DTUNO not between", value1, value2, "dtuno");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("ProjectID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("ProjectID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("ProjectID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("ProjectID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("ProjectID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProjectID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("ProjectID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("ProjectID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("ProjectID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("ProjectID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("ProjectID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProjectID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("Time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("Time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("Time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("Time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("Time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("Time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("Time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("Time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("Time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("Time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("Time not between", value1, value2, "time");
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