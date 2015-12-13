package com.fctech.manager.author.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParamPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParamPOExample() {
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

        public Criteria andParameteridIsNull() {
            addCriterion("ParameterID is null");
            return (Criteria) this;
        }

        public Criteria andParameteridIsNotNull() {
            addCriterion("ParameterID is not null");
            return (Criteria) this;
        }

        public Criteria andParameteridEqualTo(Integer value) {
            addCriterion("ParameterID =", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridNotEqualTo(Integer value) {
            addCriterion("ParameterID <>", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridGreaterThan(Integer value) {
            addCriterion("ParameterID >", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParameterID >=", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridLessThan(Integer value) {
            addCriterion("ParameterID <", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridLessThanOrEqualTo(Integer value) {
            addCriterion("ParameterID <=", value, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridIn(List<Integer> values) {
            addCriterion("ParameterID in", values, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridNotIn(List<Integer> values) {
            addCriterion("ParameterID not in", values, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridBetween(Integer value1, Integer value2) {
            addCriterion("ParameterID between", value1, value2, "parameterid");
            return (Criteria) this;
        }

        public Criteria andParameteridNotBetween(Integer value1, Integer value2) {
            addCriterion("ParameterID not between", value1, value2, "parameterid");
            return (Criteria) this;
        }

        public Criteria andModulusIsNull() {
            addCriterion("Modulus is null");
            return (Criteria) this;
        }

        public Criteria andModulusIsNotNull() {
            addCriterion("Modulus is not null");
            return (Criteria) this;
        }

        public Criteria andModulusEqualTo(Double value) {
            addCriterion("Modulus =", value, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusNotEqualTo(Double value) {
            addCriterion("Modulus <>", value, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusGreaterThan(Double value) {
            addCriterion("Modulus >", value, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusGreaterThanOrEqualTo(Double value) {
            addCriterion("Modulus >=", value, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusLessThan(Double value) {
            addCriterion("Modulus <", value, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusLessThanOrEqualTo(Double value) {
            addCriterion("Modulus <=", value, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusIn(List<Double> values) {
            addCriterion("Modulus in", values, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusNotIn(List<Double> values) {
            addCriterion("Modulus not in", values, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusBetween(Double value1, Double value2) {
            addCriterion("Modulus between", value1, value2, "modulus");
            return (Criteria) this;
        }

        public Criteria andModulusNotBetween(Double value1, Double value2) {
            addCriterion("Modulus not between", value1, value2, "modulus");
            return (Criteria) this;
        }

        public Criteria andConstantIsNull() {
            addCriterion("Constant is null");
            return (Criteria) this;
        }

        public Criteria andConstantIsNotNull() {
            addCriterion("Constant is not null");
            return (Criteria) this;
        }

        public Criteria andConstantEqualTo(Double value) {
            addCriterion("Constant =", value, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantNotEqualTo(Double value) {
            addCriterion("Constant <>", value, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantGreaterThan(Double value) {
            addCriterion("Constant >", value, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantGreaterThanOrEqualTo(Double value) {
            addCriterion("Constant >=", value, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantLessThan(Double value) {
            addCriterion("Constant <", value, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantLessThanOrEqualTo(Double value) {
            addCriterion("Constant <=", value, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantIn(List<Double> values) {
            addCriterion("Constant in", values, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantNotIn(List<Double> values) {
            addCriterion("Constant not in", values, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantBetween(Double value1, Double value2) {
            addCriterion("Constant between", value1, value2, "constant");
            return (Criteria) this;
        }

        public Criteria andConstantNotBetween(Double value1, Double value2) {
            addCriterion("Constant not between", value1, value2, "constant");
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