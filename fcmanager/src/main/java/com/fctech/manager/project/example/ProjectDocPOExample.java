package com.fctech.manager.project.example;

import java.util.ArrayList;
import java.util.List;

public class ProjectDocPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectDocPOExample() {
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

        public Criteria andProjectdocIdIsNull() {
            addCriterion("projectdoc_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdIsNotNull() {
            addCriterion("projectdoc_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdEqualTo(Integer value) {
            addCriterion("projectdoc_id =", value, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdNotEqualTo(Integer value) {
            addCriterion("projectdoc_id <>", value, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdGreaterThan(Integer value) {
            addCriterion("projectdoc_id >", value, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectdoc_id >=", value, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdLessThan(Integer value) {
            addCriterion("projectdoc_id <", value, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdLessThanOrEqualTo(Integer value) {
            addCriterion("projectdoc_id <=", value, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdIn(List<Integer> values) {
            addCriterion("projectdoc_id in", values, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdNotIn(List<Integer> values) {
            addCriterion("projectdoc_id not in", values, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdBetween(Integer value1, Integer value2) {
            addCriterion("projectdoc_id between", value1, value2, "projectdocId");
            return (Criteria) this;
        }

        public Criteria andProjectdocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("projectdoc_id not between", value1, value2, "projectdocId");
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

        public Criteria andProjectdocTypeIsNull() {
            addCriterion("projectdoc_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeIsNotNull() {
            addCriterion("projectdoc_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeEqualTo(String value) {
            addCriterion("projectdoc_type =", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeNotEqualTo(String value) {
            addCriterion("projectdoc_type <>", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeGreaterThan(String value) {
            addCriterion("projectdoc_type >", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("projectdoc_type >=", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeLessThan(String value) {
            addCriterion("projectdoc_type <", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeLessThanOrEqualTo(String value) {
            addCriterion("projectdoc_type <=", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeLike(String value) {
            addCriterion("projectdoc_type like", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeNotLike(String value) {
            addCriterion("projectdoc_type not like", value, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeIn(List<String> values) {
            addCriterion("projectdoc_type in", values, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeNotIn(List<String> values) {
            addCriterion("projectdoc_type not in", values, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeBetween(String value1, String value2) {
            addCriterion("projectdoc_type between", value1, value2, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectdocTypeNotBetween(String value1, String value2) {
            addCriterion("projectdoc_type not between", value1, value2, "projectdocType");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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