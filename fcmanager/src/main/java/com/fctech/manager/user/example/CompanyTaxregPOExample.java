package com.fctech.manager.user.example;

import java.util.ArrayList;
import java.util.List;

public class CompanyTaxregPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyTaxregPOExample() {
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

        public Criteria andTaxregIdIsNull() {
            addCriterion("taxReg_id is null");
            return (Criteria) this;
        }

        public Criteria andTaxregIdIsNotNull() {
            addCriterion("taxReg_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregIdEqualTo(Integer value) {
            addCriterion("taxReg_id =", value, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdNotEqualTo(Integer value) {
            addCriterion("taxReg_id <>", value, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdGreaterThan(Integer value) {
            addCriterion("taxReg_id >", value, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("taxReg_id >=", value, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdLessThan(Integer value) {
            addCriterion("taxReg_id <", value, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdLessThanOrEqualTo(Integer value) {
            addCriterion("taxReg_id <=", value, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdIn(List<Integer> values) {
            addCriterion("taxReg_id in", values, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdNotIn(List<Integer> values) {
            addCriterion("taxReg_id not in", values, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdBetween(Integer value1, Integer value2) {
            addCriterion("taxReg_id between", value1, value2, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregIdNotBetween(Integer value1, Integer value2) {
            addCriterion("taxReg_id not between", value1, value2, "taxregId");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeIsNull() {
            addCriterion("taxReg_type is null");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeIsNotNull() {
            addCriterion("taxReg_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeEqualTo(String value) {
            addCriterion("taxReg_type =", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeNotEqualTo(String value) {
            addCriterion("taxReg_type <>", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeGreaterThan(String value) {
            addCriterion("taxReg_type >", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeGreaterThanOrEqualTo(String value) {
            addCriterion("taxReg_type >=", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeLessThan(String value) {
            addCriterion("taxReg_type <", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeLessThanOrEqualTo(String value) {
            addCriterion("taxReg_type <=", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeLike(String value) {
            addCriterion("taxReg_type like", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeNotLike(String value) {
            addCriterion("taxReg_type not like", value, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeIn(List<String> values) {
            addCriterion("taxReg_type in", values, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeNotIn(List<String> values) {
            addCriterion("taxReg_type not in", values, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeBetween(String value1, String value2) {
            addCriterion("taxReg_type between", value1, value2, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregTypeNotBetween(String value1, String value2) {
            addCriterion("taxReg_type not between", value1, value2, "taxregType");
            return (Criteria) this;
        }

        public Criteria andTaxregNoIsNull() {
            addCriterion("taxReg_no is null");
            return (Criteria) this;
        }

        public Criteria andTaxregNoIsNotNull() {
            addCriterion("taxReg_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaxregNoEqualTo(String value) {
            addCriterion("taxReg_no =", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoNotEqualTo(String value) {
            addCriterion("taxReg_no <>", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoGreaterThan(String value) {
            addCriterion("taxReg_no >", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoGreaterThanOrEqualTo(String value) {
            addCriterion("taxReg_no >=", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoLessThan(String value) {
            addCriterion("taxReg_no <", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoLessThanOrEqualTo(String value) {
            addCriterion("taxReg_no <=", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoLike(String value) {
            addCriterion("taxReg_no like", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoNotLike(String value) {
            addCriterion("taxReg_no not like", value, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoIn(List<String> values) {
            addCriterion("taxReg_no in", values, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoNotIn(List<String> values) {
            addCriterion("taxReg_no not in", values, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoBetween(String value1, String value2) {
            addCriterion("taxReg_no between", value1, value2, "taxregNo");
            return (Criteria) this;
        }

        public Criteria andTaxregNoNotBetween(String value1, String value2) {
            addCriterion("taxReg_no not between", value1, value2, "taxregNo");
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