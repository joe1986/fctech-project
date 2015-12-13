package com.fctech.manager.author.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FormulaPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormulaPOExample() {
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

        public Criteria andFormulaidIsNull() {
            addCriterion("FormulaID is null");
            return (Criteria) this;
        }

        public Criteria andFormulaidIsNotNull() {
            addCriterion("FormulaID is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaidEqualTo(Integer value) {
            addCriterion("FormulaID =", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotEqualTo(Integer value) {
            addCriterion("FormulaID <>", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidGreaterThan(Integer value) {
            addCriterion("FormulaID >", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FormulaID >=", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidLessThan(Integer value) {
            addCriterion("FormulaID <", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidLessThanOrEqualTo(Integer value) {
            addCriterion("FormulaID <=", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidIn(List<Integer> values) {
            addCriterion("FormulaID in", values, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotIn(List<Integer> values) {
            addCriterion("FormulaID not in", values, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidBetween(Integer value1, Integer value2) {
            addCriterion("FormulaID between", value1, value2, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotBetween(Integer value1, Integer value2) {
            addCriterion("FormulaID not between", value1, value2, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulacontentIsNull() {
            addCriterion("FormulaContent is null");
            return (Criteria) this;
        }

        public Criteria andFormulacontentIsNotNull() {
            addCriterion("FormulaContent is not null");
            return (Criteria) this;
        }

        public Criteria andFormulacontentEqualTo(String value) {
            addCriterion("FormulaContent =", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentNotEqualTo(String value) {
            addCriterion("FormulaContent <>", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentGreaterThan(String value) {
            addCriterion("FormulaContent >", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentGreaterThanOrEqualTo(String value) {
            addCriterion("FormulaContent >=", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentLessThan(String value) {
            addCriterion("FormulaContent <", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentLessThanOrEqualTo(String value) {
            addCriterion("FormulaContent <=", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentLike(String value) {
            addCriterion("FormulaContent like", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentNotLike(String value) {
            addCriterion("FormulaContent not like", value, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentIn(List<String> values) {
            addCriterion("FormulaContent in", values, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentNotIn(List<String> values) {
            addCriterion("FormulaContent not in", values, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentBetween(String value1, String value2) {
            addCriterion("FormulaContent between", value1, value2, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulacontentNotBetween(String value1, String value2) {
            addCriterion("FormulaContent not between", value1, value2, "formulacontent");
            return (Criteria) this;
        }

        public Criteria andFormulatypeIsNull() {
            addCriterion("Formulatype is null");
            return (Criteria) this;
        }

        public Criteria andFormulatypeIsNotNull() {
            addCriterion("Formulatype is not null");
            return (Criteria) this;
        }

        public Criteria andFormulatypeEqualTo(String value) {
            addCriterion("Formulatype =", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeNotEqualTo(String value) {
            addCriterion("Formulatype <>", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeGreaterThan(String value) {
            addCriterion("Formulatype >", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeGreaterThanOrEqualTo(String value) {
            addCriterion("Formulatype >=", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeLessThan(String value) {
            addCriterion("Formulatype <", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeLessThanOrEqualTo(String value) {
            addCriterion("Formulatype <=", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeLike(String value) {
            addCriterion("Formulatype like", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeNotLike(String value) {
            addCriterion("Formulatype not like", value, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeIn(List<String> values) {
            addCriterion("Formulatype in", values, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeNotIn(List<String> values) {
            addCriterion("Formulatype not in", values, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeBetween(String value1, String value2) {
            addCriterion("Formulatype between", value1, value2, "formulatype");
            return (Criteria) this;
        }

        public Criteria andFormulatypeNotBetween(String value1, String value2) {
            addCriterion("Formulatype not between", value1, value2, "formulatype");
            return (Criteria) this;
        }

        public Criteria andStationidIsNull() {
            addCriterion("StationID is null");
            return (Criteria) this;
        }

        public Criteria andStationidIsNotNull() {
            addCriterion("StationID is not null");
            return (Criteria) this;
        }

        public Criteria andStationidEqualTo(Integer value) {
            addCriterion("StationID =", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotEqualTo(Integer value) {
            addCriterion("StationID <>", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThan(Integer value) {
            addCriterion("StationID >", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StationID >=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThan(Integer value) {
            addCriterion("StationID <", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThanOrEqualTo(Integer value) {
            addCriterion("StationID <=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidIn(List<Integer> values) {
            addCriterion("StationID in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotIn(List<Integer> values) {
            addCriterion("StationID not in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidBetween(Integer value1, Integer value2) {
            addCriterion("StationID between", value1, value2, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotBetween(Integer value1, Integer value2) {
            addCriterion("StationID not between", value1, value2, "stationid");
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