package com.fctech.manager.user.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperLogPOExample() {
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

        public Criteria andOperateIdIsNull() {
            addCriterion("OPERATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperateIdIsNotNull() {
            addCriterion("OPERATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperateIdEqualTo(Long value) {
            addCriterion("OPERATE_ID =", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotEqualTo(Long value) {
            addCriterion("OPERATE_ID <>", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdGreaterThan(Long value) {
            addCriterion("OPERATE_ID >", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATE_ID >=", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdLessThan(Long value) {
            addCriterion("OPERATE_ID <", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdLessThanOrEqualTo(Long value) {
            addCriterion("OPERATE_ID <=", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdIn(List<Long> values) {
            addCriterion("OPERATE_ID in", values, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotIn(List<Long> values) {
            addCriterion("OPERATE_ID not in", values, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdBetween(Long value1, Long value2) {
            addCriterion("OPERATE_ID between", value1, value2, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotBetween(Long value1, Long value2) {
            addCriterion("OPERATE_ID not between", value1, value2, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNull() {
            addCriterion("OperateType is null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNotNull() {
            addCriterion("OperateType is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeEqualTo(String value) {
            addCriterion("OperateType =", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotEqualTo(String value) {
            addCriterion("OperateType <>", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThan(String value) {
            addCriterion("OperateType >", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("OperateType >=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThan(String value) {
            addCriterion("OperateType <", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThanOrEqualTo(String value) {
            addCriterion("OperateType <=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLike(String value) {
            addCriterion("OperateType like", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotLike(String value) {
            addCriterion("OperateType not like", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIn(List<String> values) {
            addCriterion("OperateType in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotIn(List<String> values) {
            addCriterion("OperateType not in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeBetween(String value1, String value2) {
            addCriterion("OperateType between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotBetween(String value1, String value2) {
            addCriterion("OperateType not between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNull() {
            addCriterion("DataType is null");
            return (Criteria) this;
        }

        public Criteria andDatatypeIsNotNull() {
            addCriterion("DataType is not null");
            return (Criteria) this;
        }

        public Criteria andDatatypeEqualTo(String value) {
            addCriterion("DataType =", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotEqualTo(String value) {
            addCriterion("DataType <>", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThan(String value) {
            addCriterion("DataType >", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeGreaterThanOrEqualTo(String value) {
            addCriterion("DataType >=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThan(String value) {
            addCriterion("DataType <", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLessThanOrEqualTo(String value) {
            addCriterion("DataType <=", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeLike(String value) {
            addCriterion("DataType like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotLike(String value) {
            addCriterion("DataType not like", value, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeIn(List<String> values) {
            addCriterion("DataType in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotIn(List<String> values) {
            addCriterion("DataType not in", values, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeBetween(String value1, String value2) {
            addCriterion("DataType between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andDatatypeNotBetween(String value1, String value2) {
            addCriterion("DataType not between", value1, value2, "datatype");
            return (Criteria) this;
        }

        public Criteria andOperatelocationIsNull() {
            addCriterion("OperateLocation is null");
            return (Criteria) this;
        }

        public Criteria andOperatelocationIsNotNull() {
            addCriterion("OperateLocation is not null");
            return (Criteria) this;
        }

        public Criteria andOperatelocationEqualTo(String value) {
            addCriterion("OperateLocation =", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationNotEqualTo(String value) {
            addCriterion("OperateLocation <>", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationGreaterThan(String value) {
            addCriterion("OperateLocation >", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationGreaterThanOrEqualTo(String value) {
            addCriterion("OperateLocation >=", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationLessThan(String value) {
            addCriterion("OperateLocation <", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationLessThanOrEqualTo(String value) {
            addCriterion("OperateLocation <=", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationLike(String value) {
            addCriterion("OperateLocation like", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationNotLike(String value) {
            addCriterion("OperateLocation not like", value, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationIn(List<String> values) {
            addCriterion("OperateLocation in", values, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationNotIn(List<String> values) {
            addCriterion("OperateLocation not in", values, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationBetween(String value1, String value2) {
            addCriterion("OperateLocation between", value1, value2, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andOperatelocationNotBetween(String value1, String value2) {
            addCriterion("OperateLocation not between", value1, value2, "operatelocation");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("ProjectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("ProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("ProjectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("ProjectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("ProjectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("ProjectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ProjectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("ProjectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("ProjectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("ProjectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("ProjectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("ProjectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("ProjectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andOperatepersonIsNull() {
            addCriterion("OperatePerson is null");
            return (Criteria) this;
        }

        public Criteria andOperatepersonIsNotNull() {
            addCriterion("OperatePerson is not null");
            return (Criteria) this;
        }

        public Criteria andOperatepersonEqualTo(String value) {
            addCriterion("OperatePerson =", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonNotEqualTo(String value) {
            addCriterion("OperatePerson <>", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonGreaterThan(String value) {
            addCriterion("OperatePerson >", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("OperatePerson >=", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonLessThan(String value) {
            addCriterion("OperatePerson <", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonLessThanOrEqualTo(String value) {
            addCriterion("OperatePerson <=", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonLike(String value) {
            addCriterion("OperatePerson like", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonNotLike(String value) {
            addCriterion("OperatePerson not like", value, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonIn(List<String> values) {
            addCriterion("OperatePerson in", values, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonNotIn(List<String> values) {
            addCriterion("OperatePerson not in", values, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonBetween(String value1, String value2) {
            addCriterion("OperatePerson between", value1, value2, "operateperson");
            return (Criteria) this;
        }

        public Criteria andOperatepersonNotBetween(String value1, String value2) {
            addCriterion("OperatePerson not between", value1, value2, "operateperson");
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