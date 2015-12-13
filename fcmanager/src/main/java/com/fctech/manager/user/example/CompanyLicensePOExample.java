package com.fctech.manager.user.example;

import java.util.ArrayList;
import java.util.List;

public class CompanyLicensePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyLicensePOExample() {
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

        public Criteria andBusinesslicenseIdIsNull() {
            addCriterion("businessLicense_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdIsNotNull() {
            addCriterion("businessLicense_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdEqualTo(Integer value) {
            addCriterion("businessLicense_id =", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdNotEqualTo(Integer value) {
            addCriterion("businessLicense_id <>", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdGreaterThan(Integer value) {
            addCriterion("businessLicense_id >", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessLicense_id >=", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdLessThan(Integer value) {
            addCriterion("businessLicense_id <", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdLessThanOrEqualTo(Integer value) {
            addCriterion("businessLicense_id <=", value, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdIn(List<Integer> values) {
            addCriterion("businessLicense_id in", values, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdNotIn(List<Integer> values) {
            addCriterion("businessLicense_id not in", values, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdBetween(Integer value1, Integer value2) {
            addCriterion("businessLicense_id between", value1, value2, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("businessLicense_id not between", value1, value2, "businesslicenseId");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoIsNull() {
            addCriterion("businessLicense_no is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoIsNotNull() {
            addCriterion("businessLicense_no is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoEqualTo(String value) {
            addCriterion("businessLicense_no =", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoNotEqualTo(String value) {
            addCriterion("businessLicense_no <>", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoGreaterThan(String value) {
            addCriterion("businessLicense_no >", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicense_no >=", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoLessThan(String value) {
            addCriterion("businessLicense_no <", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoLessThanOrEqualTo(String value) {
            addCriterion("businessLicense_no <=", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoLike(String value) {
            addCriterion("businessLicense_no like", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoNotLike(String value) {
            addCriterion("businessLicense_no not like", value, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoIn(List<String> values) {
            addCriterion("businessLicense_no in", values, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoNotIn(List<String> values) {
            addCriterion("businessLicense_no not in", values, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoBetween(String value1, String value2) {
            addCriterion("businessLicense_no between", value1, value2, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNoNotBetween(String value1, String value2) {
            addCriterion("businessLicense_no not between", value1, value2, "businesslicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesIsNull() {
            addCriterion("businessLicense_dates is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesIsNotNull() {
            addCriterion("businessLicense_dates is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesEqualTo(String value) {
            addCriterion("businessLicense_dates =", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesNotEqualTo(String value) {
            addCriterion("businessLicense_dates <>", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesGreaterThan(String value) {
            addCriterion("businessLicense_dates >", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicense_dates >=", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesLessThan(String value) {
            addCriterion("businessLicense_dates <", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesLessThanOrEqualTo(String value) {
            addCriterion("businessLicense_dates <=", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesLike(String value) {
            addCriterion("businessLicense_dates like", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesNotLike(String value) {
            addCriterion("businessLicense_dates not like", value, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesIn(List<String> values) {
            addCriterion("businessLicense_dates in", values, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesNotIn(List<String> values) {
            addCriterion("businessLicense_dates not in", values, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesBetween(String value1, String value2) {
            addCriterion("businessLicense_dates between", value1, value2, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDatesNotBetween(String value1, String value2) {
            addCriterion("businessLicense_dates not between", value1, value2, "businesslicenseDates");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeIsNull() {
            addCriterion("businessLicense_datee is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeIsNotNull() {
            addCriterion("businessLicense_datee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeEqualTo(String value) {
            addCriterion("businessLicense_datee =", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeNotEqualTo(String value) {
            addCriterion("businessLicense_datee <>", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeGreaterThan(String value) {
            addCriterion("businessLicense_datee >", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicense_datee >=", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeLessThan(String value) {
            addCriterion("businessLicense_datee <", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeLessThanOrEqualTo(String value) {
            addCriterion("businessLicense_datee <=", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeLike(String value) {
            addCriterion("businessLicense_datee like", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeNotLike(String value) {
            addCriterion("businessLicense_datee not like", value, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeIn(List<String> values) {
            addCriterion("businessLicense_datee in", values, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeNotIn(List<String> values) {
            addCriterion("businessLicense_datee not in", values, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeBetween(String value1, String value2) {
            addCriterion("businessLicense_datee between", value1, value2, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseDateeNotBetween(String value1, String value2) {
            addCriterion("businessLicense_datee not between", value1, value2, "businesslicenseDatee");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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