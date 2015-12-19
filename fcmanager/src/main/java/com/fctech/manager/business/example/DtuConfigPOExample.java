package com.fctech.manager.business.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtuConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtuConfigPOExample() {
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

        public Criteria andTerminalconfigidIsNull() {
            addCriterion("TerminalConfigID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidIsNotNull() {
            addCriterion("TerminalConfigID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidEqualTo(Integer value) {
            addCriterion("TerminalConfigID =", value, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidNotEqualTo(Integer value) {
            addCriterion("TerminalConfigID <>", value, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidGreaterThan(Integer value) {
            addCriterion("TerminalConfigID >", value, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TerminalConfigID >=", value, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidLessThan(Integer value) {
            addCriterion("TerminalConfigID <", value, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidLessThanOrEqualTo(Integer value) {
            addCriterion("TerminalConfigID <=", value, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidIn(List<Integer> values) {
            addCriterion("TerminalConfigID in", values, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidNotIn(List<Integer> values) {
            addCriterion("TerminalConfigID not in", values, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidBetween(Integer value1, Integer value2) {
            addCriterion("TerminalConfigID between", value1, value2, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andTerminalconfigidNotBetween(Integer value1, Integer value2) {
            addCriterion("TerminalConfigID not between", value1, value2, "terminalconfigid");
            return (Criteria) this;
        }

        public Criteria andDtunoIsNull() {
            addCriterion("DTUNO is null");
            return (Criteria) this;
        }

        public Criteria andDtunoIsNotNull() {
            addCriterion("DTUNO is not null");
            return (Criteria) this;
        }

        public Criteria andDtunoEqualTo(String value) {
            addCriterion("DTUNO =", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotEqualTo(String value) {
            addCriterion("DTUNO <>", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoGreaterThan(String value) {
            addCriterion("DTUNO >", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoGreaterThanOrEqualTo(String value) {
            addCriterion("DTUNO >=", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoLessThan(String value) {
            addCriterion("DTUNO <", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoLessThanOrEqualTo(String value) {
            addCriterion("DTUNO <=", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoLike(String value) {
            addCriterion("DTUNO like", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotLike(String value) {
            addCriterion("DTUNO not like", value, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoIn(List<String> values) {
            addCriterion("DTUNO in", values, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotIn(List<String> values) {
            addCriterion("DTUNO not in", values, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoBetween(String value1, String value2) {
            addCriterion("DTUNO between", value1, value2, "dtuno");
            return (Criteria) this;
        }

        public Criteria andDtunoNotBetween(String value1, String value2) {
            addCriterion("DTUNO not between", value1, value2, "dtuno");
            return (Criteria) this;
        }

        public Criteria andLogondateIsNull() {
            addCriterion("Logondate is null");
            return (Criteria) this;
        }

        public Criteria andLogondateIsNotNull() {
            addCriterion("Logondate is not null");
            return (Criteria) this;
        }

        public Criteria andLogondateEqualTo(Date value) {
            addCriterion("Logondate =", value, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateNotEqualTo(Date value) {
            addCriterion("Logondate <>", value, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateGreaterThan(Date value) {
            addCriterion("Logondate >", value, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateGreaterThanOrEqualTo(Date value) {
            addCriterion("Logondate >=", value, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateLessThan(Date value) {
            addCriterion("Logondate <", value, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateLessThanOrEqualTo(Date value) {
            addCriterion("Logondate <=", value, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateIn(List<Date> values) {
            addCriterion("Logondate in", values, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateNotIn(List<Date> values) {
            addCriterion("Logondate not in", values, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateBetween(Date value1, Date value2) {
            addCriterion("Logondate between", value1, value2, "logondate");
            return (Criteria) this;
        }

        public Criteria andLogondateNotBetween(Date value1, Date value2) {
            addCriterion("Logondate not between", value1, value2, "logondate");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("Updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("Updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("Updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("Updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("Updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("Updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("Updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("Updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("Updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andSinaddrIsNull() {
            addCriterion("Sinaddr is null");
            return (Criteria) this;
        }

        public Criteria andSinaddrIsNotNull() {
            addCriterion("Sinaddr is not null");
            return (Criteria) this;
        }

        public Criteria andSinaddrEqualTo(String value) {
            addCriterion("Sinaddr =", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrNotEqualTo(String value) {
            addCriterion("Sinaddr <>", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrGreaterThan(String value) {
            addCriterion("Sinaddr >", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrGreaterThanOrEqualTo(String value) {
            addCriterion("Sinaddr >=", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrLessThan(String value) {
            addCriterion("Sinaddr <", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrLessThanOrEqualTo(String value) {
            addCriterion("Sinaddr <=", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrLike(String value) {
            addCriterion("Sinaddr like", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrNotLike(String value) {
            addCriterion("Sinaddr not like", value, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrIn(List<String> values) {
            addCriterion("Sinaddr in", values, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrNotIn(List<String> values) {
            addCriterion("Sinaddr not in", values, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrBetween(String value1, String value2) {
            addCriterion("Sinaddr between", value1, value2, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinaddrNotBetween(String value1, String value2) {
            addCriterion("Sinaddr not between", value1, value2, "sinaddr");
            return (Criteria) this;
        }

        public Criteria andSinportIsNull() {
            addCriterion("Sinport is null");
            return (Criteria) this;
        }

        public Criteria andSinportIsNotNull() {
            addCriterion("Sinport is not null");
            return (Criteria) this;
        }

        public Criteria andSinportEqualTo(String value) {
            addCriterion("Sinport =", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportNotEqualTo(String value) {
            addCriterion("Sinport <>", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportGreaterThan(String value) {
            addCriterion("Sinport >", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportGreaterThanOrEqualTo(String value) {
            addCriterion("Sinport >=", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportLessThan(String value) {
            addCriterion("Sinport <", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportLessThanOrEqualTo(String value) {
            addCriterion("Sinport <=", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportLike(String value) {
            addCriterion("Sinport like", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportNotLike(String value) {
            addCriterion("Sinport not like", value, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportIn(List<String> values) {
            addCriterion("Sinport in", values, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportNotIn(List<String> values) {
            addCriterion("Sinport not in", values, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportBetween(String value1, String value2) {
            addCriterion("Sinport between", value1, value2, "sinport");
            return (Criteria) this;
        }

        public Criteria andSinportNotBetween(String value1, String value2) {
            addCriterion("Sinport not between", value1, value2, "sinport");
            return (Criteria) this;
        }

        public Criteria andLocaladdrIsNull() {
            addCriterion("Localaddr is null");
            return (Criteria) this;
        }

        public Criteria andLocaladdrIsNotNull() {
            addCriterion("Localaddr is not null");
            return (Criteria) this;
        }

        public Criteria andLocaladdrEqualTo(String value) {
            addCriterion("Localaddr =", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrNotEqualTo(String value) {
            addCriterion("Localaddr <>", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrGreaterThan(String value) {
            addCriterion("Localaddr >", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrGreaterThanOrEqualTo(String value) {
            addCriterion("Localaddr >=", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrLessThan(String value) {
            addCriterion("Localaddr <", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrLessThanOrEqualTo(String value) {
            addCriterion("Localaddr <=", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrLike(String value) {
            addCriterion("Localaddr like", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrNotLike(String value) {
            addCriterion("Localaddr not like", value, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrIn(List<String> values) {
            addCriterion("Localaddr in", values, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrNotIn(List<String> values) {
            addCriterion("Localaddr not in", values, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrBetween(String value1, String value2) {
            addCriterion("Localaddr between", value1, value2, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocaladdrNotBetween(String value1, String value2) {
            addCriterion("Localaddr not between", value1, value2, "localaddr");
            return (Criteria) this;
        }

        public Criteria andLocalportIsNull() {
            addCriterion("Localport is null");
            return (Criteria) this;
        }

        public Criteria andLocalportIsNotNull() {
            addCriterion("Localport is not null");
            return (Criteria) this;
        }

        public Criteria andLocalportEqualTo(String value) {
            addCriterion("Localport =", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportNotEqualTo(String value) {
            addCriterion("Localport <>", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportGreaterThan(String value) {
            addCriterion("Localport >", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportGreaterThanOrEqualTo(String value) {
            addCriterion("Localport >=", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportLessThan(String value) {
            addCriterion("Localport <", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportLessThanOrEqualTo(String value) {
            addCriterion("Localport <=", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportLike(String value) {
            addCriterion("Localport like", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportNotLike(String value) {
            addCriterion("Localport not like", value, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportIn(List<String> values) {
            addCriterion("Localport in", values, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportNotIn(List<String> values) {
            addCriterion("Localport not in", values, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportBetween(String value1, String value2) {
            addCriterion("Localport between", value1, value2, "localport");
            return (Criteria) this;
        }

        public Criteria andLocalportNotBetween(String value1, String value2) {
            addCriterion("Localport not between", value1, value2, "localport");
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