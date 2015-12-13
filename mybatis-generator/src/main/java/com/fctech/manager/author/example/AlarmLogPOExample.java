package com.fctech.manager.author.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlarmLogPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmLogPOExample() {
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

        public Criteria andAlartidIsNull() {
            addCriterion("AlartID is null");
            return (Criteria) this;
        }

        public Criteria andAlartidIsNotNull() {
            addCriterion("AlartID is not null");
            return (Criteria) this;
        }

        public Criteria andAlartidEqualTo(Integer value) {
            addCriterion("AlartID =", value, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidNotEqualTo(Integer value) {
            addCriterion("AlartID <>", value, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidGreaterThan(Integer value) {
            addCriterion("AlartID >", value, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AlartID >=", value, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidLessThan(Integer value) {
            addCriterion("AlartID <", value, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidLessThanOrEqualTo(Integer value) {
            addCriterion("AlartID <=", value, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidIn(List<Integer> values) {
            addCriterion("AlartID in", values, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidNotIn(List<Integer> values) {
            addCriterion("AlartID not in", values, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidBetween(Integer value1, Integer value2) {
            addCriterion("AlartID between", value1, value2, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlartidNotBetween(Integer value1, Integer value2) {
            addCriterion("AlartID not between", value1, value2, "alartid");
            return (Criteria) this;
        }

        public Criteria andAlarttypeIsNull() {
            addCriterion("AlartType is null");
            return (Criteria) this;
        }

        public Criteria andAlarttypeIsNotNull() {
            addCriterion("AlartType is not null");
            return (Criteria) this;
        }

        public Criteria andAlarttypeEqualTo(String value) {
            addCriterion("AlartType =", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeNotEqualTo(String value) {
            addCriterion("AlartType <>", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeGreaterThan(String value) {
            addCriterion("AlartType >", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeGreaterThanOrEqualTo(String value) {
            addCriterion("AlartType >=", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeLessThan(String value) {
            addCriterion("AlartType <", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeLessThanOrEqualTo(String value) {
            addCriterion("AlartType <=", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeLike(String value) {
            addCriterion("AlartType like", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeNotLike(String value) {
            addCriterion("AlartType not like", value, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeIn(List<String> values) {
            addCriterion("AlartType in", values, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeNotIn(List<String> values) {
            addCriterion("AlartType not in", values, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeBetween(String value1, String value2) {
            addCriterion("AlartType between", value1, value2, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlarttypeNotBetween(String value1, String value2) {
            addCriterion("AlartType not between", value1, value2, "alarttype");
            return (Criteria) this;
        }

        public Criteria andAlartsourceIsNull() {
            addCriterion("AlartSource is null");
            return (Criteria) this;
        }

        public Criteria andAlartsourceIsNotNull() {
            addCriterion("AlartSource is not null");
            return (Criteria) this;
        }

        public Criteria andAlartsourceEqualTo(String value) {
            addCriterion("AlartSource =", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceNotEqualTo(String value) {
            addCriterion("AlartSource <>", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceGreaterThan(String value) {
            addCriterion("AlartSource >", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceGreaterThanOrEqualTo(String value) {
            addCriterion("AlartSource >=", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceLessThan(String value) {
            addCriterion("AlartSource <", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceLessThanOrEqualTo(String value) {
            addCriterion("AlartSource <=", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceLike(String value) {
            addCriterion("AlartSource like", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceNotLike(String value) {
            addCriterion("AlartSource not like", value, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceIn(List<String> values) {
            addCriterion("AlartSource in", values, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceNotIn(List<String> values) {
            addCriterion("AlartSource not in", values, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceBetween(String value1, String value2) {
            addCriterion("AlartSource between", value1, value2, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartsourceNotBetween(String value1, String value2) {
            addCriterion("AlartSource not between", value1, value2, "alartsource");
            return (Criteria) this;
        }

        public Criteria andAlartlevelIsNull() {
            addCriterion("AlartLevel is null");
            return (Criteria) this;
        }

        public Criteria andAlartlevelIsNotNull() {
            addCriterion("AlartLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAlartlevelEqualTo(String value) {
            addCriterion("AlartLevel =", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelNotEqualTo(String value) {
            addCriterion("AlartLevel <>", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelGreaterThan(String value) {
            addCriterion("AlartLevel >", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelGreaterThanOrEqualTo(String value) {
            addCriterion("AlartLevel >=", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelLessThan(String value) {
            addCriterion("AlartLevel <", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelLessThanOrEqualTo(String value) {
            addCriterion("AlartLevel <=", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelLike(String value) {
            addCriterion("AlartLevel like", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelNotLike(String value) {
            addCriterion("AlartLevel not like", value, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelIn(List<String> values) {
            addCriterion("AlartLevel in", values, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelNotIn(List<String> values) {
            addCriterion("AlartLevel not in", values, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelBetween(String value1, String value2) {
            addCriterion("AlartLevel between", value1, value2, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andAlartlevelNotBetween(String value1, String value2) {
            addCriterion("AlartLevel not between", value1, value2, "alartlevel");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNull() {
            addCriterion("ImageName is null");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNotNull() {
            addCriterion("ImageName is not null");
            return (Criteria) this;
        }

        public Criteria andImagenameEqualTo(String value) {
            addCriterion("ImageName =", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotEqualTo(String value) {
            addCriterion("ImageName <>", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThan(String value) {
            addCriterion("ImageName >", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThanOrEqualTo(String value) {
            addCriterion("ImageName >=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThan(String value) {
            addCriterion("ImageName <", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThanOrEqualTo(String value) {
            addCriterion("ImageName <=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLike(String value) {
            addCriterion("ImageName like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotLike(String value) {
            addCriterion("ImageName not like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameIn(List<String> values) {
            addCriterion("ImageName in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotIn(List<String> values) {
            addCriterion("ImageName not in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameBetween(String value1, String value2) {
            addCriterion("ImageName between", value1, value2, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotBetween(String value1, String value2) {
            addCriterion("ImageName not between", value1, value2, "imagename");
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