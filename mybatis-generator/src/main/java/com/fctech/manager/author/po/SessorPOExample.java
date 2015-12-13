package com.fctech.manager.author.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SessorPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SessorPOExample() {
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

        public Criteria andSensoridIsNull() {
            addCriterion("SensorID is null");
            return (Criteria) this;
        }

        public Criteria andSensoridIsNotNull() {
            addCriterion("SensorID is not null");
            return (Criteria) this;
        }

        public Criteria andSensoridEqualTo(Integer value) {
            addCriterion("SensorID =", value, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridNotEqualTo(Integer value) {
            addCriterion("SensorID <>", value, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridGreaterThan(Integer value) {
            addCriterion("SensorID >", value, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SensorID >=", value, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridLessThan(Integer value) {
            addCriterion("SensorID <", value, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridLessThanOrEqualTo(Integer value) {
            addCriterion("SensorID <=", value, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridIn(List<Integer> values) {
            addCriterion("SensorID in", values, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridNotIn(List<Integer> values) {
            addCriterion("SensorID not in", values, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridBetween(Integer value1, Integer value2) {
            addCriterion("SensorID between", value1, value2, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensoridNotBetween(Integer value1, Integer value2) {
            addCriterion("SensorID not between", value1, value2, "sensorid");
            return (Criteria) this;
        }

        public Criteria andSensornoIsNull() {
            addCriterion("SensorNO is null");
            return (Criteria) this;
        }

        public Criteria andSensornoIsNotNull() {
            addCriterion("SensorNO is not null");
            return (Criteria) this;
        }

        public Criteria andSensornoEqualTo(String value) {
            addCriterion("SensorNO =", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotEqualTo(String value) {
            addCriterion("SensorNO <>", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoGreaterThan(String value) {
            addCriterion("SensorNO >", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoGreaterThanOrEqualTo(String value) {
            addCriterion("SensorNO >=", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoLessThan(String value) {
            addCriterion("SensorNO <", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoLessThanOrEqualTo(String value) {
            addCriterion("SensorNO <=", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoLike(String value) {
            addCriterion("SensorNO like", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotLike(String value) {
            addCriterion("SensorNO not like", value, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoIn(List<String> values) {
            addCriterion("SensorNO in", values, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotIn(List<String> values) {
            addCriterion("SensorNO not in", values, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoBetween(String value1, String value2) {
            addCriterion("SensorNO between", value1, value2, "sensorno");
            return (Criteria) this;
        }

        public Criteria andSensornoNotBetween(String value1, String value2) {
            addCriterion("SensorNO not between", value1, value2, "sensorno");
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