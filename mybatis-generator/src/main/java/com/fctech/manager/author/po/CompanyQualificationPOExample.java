package com.fctech.manager.author.po;

import java.util.ArrayList;
import java.util.List;

public class CompanyQualificationPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyQualificationPOExample() {
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

        public Criteria andQualificationIdIsNull() {
            addCriterion("qualification_id is null");
            return (Criteria) this;
        }

        public Criteria andQualificationIdIsNotNull() {
            addCriterion("qualification_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationIdEqualTo(Integer value) {
            addCriterion("qualification_id =", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotEqualTo(Integer value) {
            addCriterion("qualification_id <>", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdGreaterThan(Integer value) {
            addCriterion("qualification_id >", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualification_id >=", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdLessThan(Integer value) {
            addCriterion("qualification_id <", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdLessThanOrEqualTo(Integer value) {
            addCriterion("qualification_id <=", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdIn(List<Integer> values) {
            addCriterion("qualification_id in", values, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotIn(List<Integer> values) {
            addCriterion("qualification_id not in", values, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdBetween(Integer value1, Integer value2) {
            addCriterion("qualification_id between", value1, value2, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qualification_id not between", value1, value2, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationNameIsNull() {
            addCriterion("qualification_name is null");
            return (Criteria) this;
        }

        public Criteria andQualificationNameIsNotNull() {
            addCriterion("qualification_name is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationNameEqualTo(String value) {
            addCriterion("qualification_name =", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotEqualTo(String value) {
            addCriterion("qualification_name <>", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameGreaterThan(String value) {
            addCriterion("qualification_name >", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_name >=", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameLessThan(String value) {
            addCriterion("qualification_name <", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameLessThanOrEqualTo(String value) {
            addCriterion("qualification_name <=", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameLike(String value) {
            addCriterion("qualification_name like", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotLike(String value) {
            addCriterion("qualification_name not like", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameIn(List<String> values) {
            addCriterion("qualification_name in", values, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotIn(List<String> values) {
            addCriterion("qualification_name not in", values, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameBetween(String value1, String value2) {
            addCriterion("qualification_name between", value1, value2, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotBetween(String value1, String value2) {
            addCriterion("qualification_name not between", value1, value2, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNoIsNull() {
            addCriterion("qualification_no is null");
            return (Criteria) this;
        }

        public Criteria andQualificationNoIsNotNull() {
            addCriterion("qualification_no is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationNoEqualTo(String value) {
            addCriterion("qualification_no =", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoNotEqualTo(String value) {
            addCriterion("qualification_no <>", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoGreaterThan(String value) {
            addCriterion("qualification_no >", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_no >=", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoLessThan(String value) {
            addCriterion("qualification_no <", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoLessThanOrEqualTo(String value) {
            addCriterion("qualification_no <=", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoLike(String value) {
            addCriterion("qualification_no like", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoNotLike(String value) {
            addCriterion("qualification_no not like", value, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoIn(List<String> values) {
            addCriterion("qualification_no in", values, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoNotIn(List<String> values) {
            addCriterion("qualification_no not in", values, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoBetween(String value1, String value2) {
            addCriterion("qualification_no between", value1, value2, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationNoNotBetween(String value1, String value2) {
            addCriterion("qualification_no not between", value1, value2, "qualificationNo");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodIsNull() {
            addCriterion("qualification_valperiod is null");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodIsNotNull() {
            addCriterion("qualification_valperiod is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodEqualTo(String value) {
            addCriterion("qualification_valperiod =", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodNotEqualTo(String value) {
            addCriterion("qualification_valperiod <>", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodGreaterThan(String value) {
            addCriterion("qualification_valperiod >", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_valperiod >=", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodLessThan(String value) {
            addCriterion("qualification_valperiod <", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodLessThanOrEqualTo(String value) {
            addCriterion("qualification_valperiod <=", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodLike(String value) {
            addCriterion("qualification_valperiod like", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodNotLike(String value) {
            addCriterion("qualification_valperiod not like", value, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodIn(List<String> values) {
            addCriterion("qualification_valperiod in", values, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodNotIn(List<String> values) {
            addCriterion("qualification_valperiod not in", values, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodBetween(String value1, String value2) {
            addCriterion("qualification_valperiod between", value1, value2, "qualificationValperiod");
            return (Criteria) this;
        }

        public Criteria andQualificationValperiodNotBetween(String value1, String value2) {
            addCriterion("qualification_valperiod not between", value1, value2, "qualificationValperiod");
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