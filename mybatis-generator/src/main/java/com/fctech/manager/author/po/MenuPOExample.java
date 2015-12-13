package com.fctech.manager.author.po;

import java.util.ArrayList;
import java.util.List;

public class MenuPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuPOExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("MENU_ID like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("MENU_ID not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeIsNull() {
            addCriterion("LANGUAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeIsNotNull() {
            addCriterion("LANGUAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeEqualTo(String value) {
            addCriterion("LANGUAGE_TYPE =", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotEqualTo(String value) {
            addCriterion("LANGUAGE_TYPE <>", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeGreaterThan(String value) {
            addCriterion("LANGUAGE_TYPE >", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE_TYPE >=", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeLessThan(String value) {
            addCriterion("LANGUAGE_TYPE <", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE_TYPE <=", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeLike(String value) {
            addCriterion("LANGUAGE_TYPE like", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotLike(String value) {
            addCriterion("LANGUAGE_TYPE not like", value, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeIn(List<String> values) {
            addCriterion("LANGUAGE_TYPE in", values, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotIn(List<String> values) {
            addCriterion("LANGUAGE_TYPE not in", values, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeBetween(String value1, String value2) {
            addCriterion("LANGUAGE_TYPE between", value1, value2, "languageType");
            return (Criteria) this;
        }

        public Criteria andLanguageTypeNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE_TYPE not between", value1, value2, "languageType");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNull() {
            addCriterion("PARENT_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNotNull() {
            addCriterion("PARENT_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdEqualTo(String value) {
            addCriterion("PARENT_MENU_ID =", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotEqualTo(String value) {
            addCriterion("PARENT_MENU_ID <>", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThan(String value) {
            addCriterion("PARENT_MENU_ID >", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_MENU_ID >=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThan(String value) {
            addCriterion("PARENT_MENU_ID <", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_MENU_ID <=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLike(String value) {
            addCriterion("PARENT_MENU_ID like", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotLike(String value) {
            addCriterion("PARENT_MENU_ID not like", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIn(List<String> values) {
            addCriterion("PARENT_MENU_ID in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotIn(List<String> values) {
            addCriterion("PARENT_MENU_ID not in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdBetween(String value1, String value2) {
            addCriterion("PARENT_MENU_ID between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_MENU_ID not between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNull() {
            addCriterion("MENU_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconIsNotNull() {
            addCriterion("MENU_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconEqualTo(String value) {
            addCriterion("MENU_ICON =", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotEqualTo(String value) {
            addCriterion("MENU_ICON <>", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThan(String value) {
            addCriterion("MENU_ICON >", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ICON >=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThan(String value) {
            addCriterion("MENU_ICON <", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLessThanOrEqualTo(String value) {
            addCriterion("MENU_ICON <=", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconLike(String value) {
            addCriterion("MENU_ICON like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotLike(String value) {
            addCriterion("MENU_ICON not like", value, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconIn(List<String> values) {
            addCriterion("MENU_ICON in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotIn(List<String> values) {
            addCriterion("MENU_ICON not in", values, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconBetween(String value1, String value2) {
            addCriterion("MENU_ICON between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuIconNotBetween(String value1, String value2) {
            addCriterion("MENU_ICON not between", value1, value2, "menuIcon");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNull() {
            addCriterion("OPEN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNotNull() {
            addCriterion("OPEN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagEqualTo(String value) {
            addCriterion("OPEN_FLAG =", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotEqualTo(String value) {
            addCriterion("OPEN_FLAG <>", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThan(String value) {
            addCriterion("OPEN_FLAG >", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_FLAG >=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThan(String value) {
            addCriterion("OPEN_FLAG <", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThanOrEqualTo(String value) {
            addCriterion("OPEN_FLAG <=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLike(String value) {
            addCriterion("OPEN_FLAG like", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotLike(String value) {
            addCriterion("OPEN_FLAG not like", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIn(List<String> values) {
            addCriterion("OPEN_FLAG in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotIn(List<String> values) {
            addCriterion("OPEN_FLAG not in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagBetween(String value1, String value2) {
            addCriterion("OPEN_FLAG between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotBetween(String value1, String value2) {
            addCriterion("OPEN_FLAG not between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andMenuNoIsNull() {
            addCriterion("MENU_NO is null");
            return (Criteria) this;
        }

        public Criteria andMenuNoIsNotNull() {
            addCriterion("MENU_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNoEqualTo(String value) {
            addCriterion("MENU_NO =", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoNotEqualTo(String value) {
            addCriterion("MENU_NO <>", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoGreaterThan(String value) {
            addCriterion("MENU_NO >", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NO >=", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoLessThan(String value) {
            addCriterion("MENU_NO <", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoLessThanOrEqualTo(String value) {
            addCriterion("MENU_NO <=", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoLike(String value) {
            addCriterion("MENU_NO like", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoNotLike(String value) {
            addCriterion("MENU_NO not like", value, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoIn(List<String> values) {
            addCriterion("MENU_NO in", values, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoNotIn(List<String> values) {
            addCriterion("MENU_NO not in", values, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoBetween(String value1, String value2) {
            addCriterion("MENU_NO between", value1, value2, "menuNo");
            return (Criteria) this;
        }

        public Criteria andMenuNoNotBetween(String value1, String value2) {
            addCriterion("MENU_NO not between", value1, value2, "menuNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(String value) {
            addCriterion("LAST_MODIFY_TIME >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(String value) {
            addCriterion("LAST_MODIFY_TIME <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_TIME <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLike(String value) {
            addCriterion("LAST_MODIFY_TIME like", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotLike(String value) {
            addCriterion("LAST_MODIFY_TIME not like", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<String> values) {
            addCriterion("LAST_MODIFY_TIME in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<String> values) {
            addCriterion("LAST_MODIFY_TIME not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_TIME between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_TIME not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andSysTypeIsNull() {
            addCriterion("SYS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSysTypeIsNotNull() {
            addCriterion("SYS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSysTypeEqualTo(String value) {
            addCriterion("SYS_TYPE =", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotEqualTo(String value) {
            addCriterion("SYS_TYPE <>", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThan(String value) {
            addCriterion("SYS_TYPE >", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_TYPE >=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThan(String value) {
            addCriterion("SYS_TYPE <", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_TYPE <=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLike(String value) {
            addCriterion("SYS_TYPE like", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotLike(String value) {
            addCriterion("SYS_TYPE not like", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeIn(List<String> values) {
            addCriterion("SYS_TYPE in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotIn(List<String> values) {
            addCriterion("SYS_TYPE not in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeBetween(String value1, String value2) {
            addCriterion("SYS_TYPE between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotBetween(String value1, String value2) {
            addCriterion("SYS_TYPE not between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNull() {
            addCriterion("OP_USER is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNotNull() {
            addCriterion("OP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserEqualTo(String value) {
            addCriterion("OP_USER =", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotEqualTo(String value) {
            addCriterion("OP_USER <>", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThan(String value) {
            addCriterion("OP_USER >", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThanOrEqualTo(String value) {
            addCriterion("OP_USER >=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThan(String value) {
            addCriterion("OP_USER <", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThanOrEqualTo(String value) {
            addCriterion("OP_USER <=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLike(String value) {
            addCriterion("OP_USER like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotLike(String value) {
            addCriterion("OP_USER not like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserIn(List<String> values) {
            addCriterion("OP_USER in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotIn(List<String> values) {
            addCriterion("OP_USER not in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserBetween(String value1, String value2) {
            addCriterion("OP_USER between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotBetween(String value1, String value2) {
            addCriterion("OP_USER not between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNull() {
            addCriterion("SORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("SORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Integer value) {
            addCriterion("SORT_NO =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Integer value) {
            addCriterion("SORT_NO <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Integer value) {
            addCriterion("SORT_NO >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_NO >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Integer value) {
            addCriterion("SORT_NO <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_NO <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Integer> values) {
            addCriterion("SORT_NO in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Integer> values) {
            addCriterion("SORT_NO not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Integer value1, Integer value2) {
            addCriterion("SORT_NO between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_NO not between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andLeafIsNull() {
            addCriterion("LEAF is null");
            return (Criteria) this;
        }

        public Criteria andLeafIsNotNull() {
            addCriterion("LEAF is not null");
            return (Criteria) this;
        }

        public Criteria andLeafEqualTo(String value) {
            addCriterion("LEAF =", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotEqualTo(String value) {
            addCriterion("LEAF <>", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThan(String value) {
            addCriterion("LEAF >", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafGreaterThanOrEqualTo(String value) {
            addCriterion("LEAF >=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThan(String value) {
            addCriterion("LEAF <", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLessThanOrEqualTo(String value) {
            addCriterion("LEAF <=", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafLike(String value) {
            addCriterion("LEAF like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotLike(String value) {
            addCriterion("LEAF not like", value, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafIn(List<String> values) {
            addCriterion("LEAF in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotIn(List<String> values) {
            addCriterion("LEAF not in", values, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafBetween(String value1, String value2) {
            addCriterion("LEAF between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andLeafNotBetween(String value1, String value2) {
            addCriterion("LEAF not between", value1, value2, "leaf");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("MENU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("MENU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("MENU_TYPE =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("MENU_TYPE <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("MENU_TYPE >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("MENU_TYPE <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("MENU_TYPE like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("MENU_TYPE not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("MENU_TYPE in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("MENU_TYPE not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("MENU_TYPE between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("MENU_TYPE not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("DELETE_FLAG like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("DELETE_FLAG not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
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