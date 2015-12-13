package com.fctech.manager.author.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StationPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationPOExample() {
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

        public Criteria andStationnameIsNull() {
            addCriterion("StationName is null");
            return (Criteria) this;
        }

        public Criteria andStationnameIsNotNull() {
            addCriterion("StationName is not null");
            return (Criteria) this;
        }

        public Criteria andStationnameEqualTo(String value) {
            addCriterion("StationName =", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotEqualTo(String value) {
            addCriterion("StationName <>", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThan(String value) {
            addCriterion("StationName >", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameGreaterThanOrEqualTo(String value) {
            addCriterion("StationName >=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThan(String value) {
            addCriterion("StationName <", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLessThanOrEqualTo(String value) {
            addCriterion("StationName <=", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameLike(String value) {
            addCriterion("StationName like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotLike(String value) {
            addCriterion("StationName not like", value, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameIn(List<String> values) {
            addCriterion("StationName in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotIn(List<String> values) {
            addCriterion("StationName not in", values, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameBetween(String value1, String value2) {
            addCriterion("StationName between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andStationnameNotBetween(String value1, String value2) {
            addCriterion("StationName not between", value1, value2, "stationname");
            return (Criteria) this;
        }

        public Criteria andCoordinatexIsNull() {
            addCriterion("CoordinateX is null");
            return (Criteria) this;
        }

        public Criteria andCoordinatexIsNotNull() {
            addCriterion("CoordinateX is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinatexEqualTo(Double value) {
            addCriterion("CoordinateX =", value, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexNotEqualTo(Double value) {
            addCriterion("CoordinateX <>", value, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexGreaterThan(Double value) {
            addCriterion("CoordinateX >", value, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexGreaterThanOrEqualTo(Double value) {
            addCriterion("CoordinateX >=", value, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexLessThan(Double value) {
            addCriterion("CoordinateX <", value, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexLessThanOrEqualTo(Double value) {
            addCriterion("CoordinateX <=", value, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexIn(List<Double> values) {
            addCriterion("CoordinateX in", values, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexNotIn(List<Double> values) {
            addCriterion("CoordinateX not in", values, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexBetween(Double value1, Double value2) {
            addCriterion("CoordinateX between", value1, value2, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinatexNotBetween(Double value1, Double value2) {
            addCriterion("CoordinateX not between", value1, value2, "coordinatex");
            return (Criteria) this;
        }

        public Criteria andCoordinateyIsNull() {
            addCriterion("CoordinateY is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateyIsNotNull() {
            addCriterion("CoordinateY is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateyEqualTo(Double value) {
            addCriterion("CoordinateY =", value, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyNotEqualTo(Double value) {
            addCriterion("CoordinateY <>", value, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyGreaterThan(Double value) {
            addCriterion("CoordinateY >", value, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyGreaterThanOrEqualTo(Double value) {
            addCriterion("CoordinateY >=", value, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyLessThan(Double value) {
            addCriterion("CoordinateY <", value, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyLessThanOrEqualTo(Double value) {
            addCriterion("CoordinateY <=", value, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyIn(List<Double> values) {
            addCriterion("CoordinateY in", values, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyNotIn(List<Double> values) {
            addCriterion("CoordinateY not in", values, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyBetween(Double value1, Double value2) {
            addCriterion("CoordinateY between", value1, value2, "coordinatey");
            return (Criteria) this;
        }

        public Criteria andCoordinateyNotBetween(Double value1, Double value2) {
            addCriterion("CoordinateY not between", value1, value2, "coordinatey");
            return (Criteria) this;
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

        public Criteria andImageidIsNull() {
            addCriterion("ImageID is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("ImageID is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(Integer value) {
            addCriterion("ImageID =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(Integer value) {
            addCriterion("ImageID <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(Integer value) {
            addCriterion("ImageID >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ImageID >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(Integer value) {
            addCriterion("ImageID <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(Integer value) {
            addCriterion("ImageID <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<Integer> values) {
            addCriterion("ImageID in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<Integer> values) {
            addCriterion("ImageID not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(Integer value1, Integer value2) {
            addCriterion("ImageID between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(Integer value1, Integer value2) {
            addCriterion("ImageID not between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andStationtypeIsNull() {
            addCriterion("StationType is null");
            return (Criteria) this;
        }

        public Criteria andStationtypeIsNotNull() {
            addCriterion("StationType is not null");
            return (Criteria) this;
        }

        public Criteria andStationtypeEqualTo(String value) {
            addCriterion("StationType =", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeNotEqualTo(String value) {
            addCriterion("StationType <>", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeGreaterThan(String value) {
            addCriterion("StationType >", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("StationType >=", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeLessThan(String value) {
            addCriterion("StationType <", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeLessThanOrEqualTo(String value) {
            addCriterion("StationType <=", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeLike(String value) {
            addCriterion("StationType like", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeNotLike(String value) {
            addCriterion("StationType not like", value, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeIn(List<String> values) {
            addCriterion("StationType in", values, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeNotIn(List<String> values) {
            addCriterion("StationType not in", values, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeBetween(String value1, String value2) {
            addCriterion("StationType between", value1, value2, "stationtype");
            return (Criteria) this;
        }

        public Criteria andStationtypeNotBetween(String value1, String value2) {
            addCriterion("StationType not between", value1, value2, "stationtype");
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