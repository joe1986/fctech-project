package com.fctech.manager.po;

import java.util.ArrayList;
import java.util.List;

public class ProjectPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectPOExample() {
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNull() {
            addCriterion("project_code is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("project_code is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("project_code =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("project_code <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("project_code >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("project_code >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("project_code <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("project_code <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("project_code like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("project_code not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("project_code in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("project_code not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("project_code between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("project_code not between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNull() {
            addCriterion("project_address is null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIsNotNull() {
            addCriterion("project_address is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAddressEqualTo(String value) {
            addCriterion("project_address =", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotEqualTo(String value) {
            addCriterion("project_address <>", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThan(String value) {
            addCriterion("project_address >", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressGreaterThanOrEqualTo(String value) {
            addCriterion("project_address >=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThan(String value) {
            addCriterion("project_address <", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLessThanOrEqualTo(String value) {
            addCriterion("project_address <=", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressLike(String value) {
            addCriterion("project_address like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotLike(String value) {
            addCriterion("project_address not like", value, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressIn(List<String> values) {
            addCriterion("project_address in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotIn(List<String> values) {
            addCriterion("project_address not in", values, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressBetween(String value1, String value2) {
            addCriterion("project_address between", value1, value2, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectAddressNotBetween(String value1, String value2) {
            addCriterion("project_address not between", value1, value2, "projectAddress");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerIsNull() {
            addCriterion("project_owner is null");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerIsNotNull() {
            addCriterion("project_owner is not null");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerEqualTo(String value) {
            addCriterion("project_owner =", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotEqualTo(String value) {
            addCriterion("project_owner <>", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerGreaterThan(String value) {
            addCriterion("project_owner >", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("project_owner >=", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerLessThan(String value) {
            addCriterion("project_owner <", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerLessThanOrEqualTo(String value) {
            addCriterion("project_owner <=", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerLike(String value) {
            addCriterion("project_owner like", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotLike(String value) {
            addCriterion("project_owner not like", value, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerIn(List<String> values) {
            addCriterion("project_owner in", values, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotIn(List<String> values) {
            addCriterion("project_owner not in", values, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerBetween(String value1, String value2) {
            addCriterion("project_owner between", value1, value2, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectOwnerNotBetween(String value1, String value2) {
            addCriterion("project_owner not between", value1, value2, "projectOwner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerIsNull() {
            addCriterion("project_mainDesigner is null");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerIsNotNull() {
            addCriterion("project_mainDesigner is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerEqualTo(String value) {
            addCriterion("project_mainDesigner =", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerNotEqualTo(String value) {
            addCriterion("project_mainDesigner <>", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerGreaterThan(String value) {
            addCriterion("project_mainDesigner >", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerGreaterThanOrEqualTo(String value) {
            addCriterion("project_mainDesigner >=", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerLessThan(String value) {
            addCriterion("project_mainDesigner <", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerLessThanOrEqualTo(String value) {
            addCriterion("project_mainDesigner <=", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerLike(String value) {
            addCriterion("project_mainDesigner like", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerNotLike(String value) {
            addCriterion("project_mainDesigner not like", value, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerIn(List<String> values) {
            addCriterion("project_mainDesigner in", values, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerNotIn(List<String> values) {
            addCriterion("project_mainDesigner not in", values, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerBetween(String value1, String value2) {
            addCriterion("project_mainDesigner between", value1, value2, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectMaindesignerNotBetween(String value1, String value2) {
            addCriterion("project_mainDesigner not between", value1, value2, "projectMaindesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerIsNull() {
            addCriterion("project_pitDesigner is null");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerIsNotNull() {
            addCriterion("project_pitDesigner is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerEqualTo(String value) {
            addCriterion("project_pitDesigner =", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerNotEqualTo(String value) {
            addCriterion("project_pitDesigner <>", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerGreaterThan(String value) {
            addCriterion("project_pitDesigner >", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerGreaterThanOrEqualTo(String value) {
            addCriterion("project_pitDesigner >=", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerLessThan(String value) {
            addCriterion("project_pitDesigner <", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerLessThanOrEqualTo(String value) {
            addCriterion("project_pitDesigner <=", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerLike(String value) {
            addCriterion("project_pitDesigner like", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerNotLike(String value) {
            addCriterion("project_pitDesigner not like", value, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerIn(List<String> values) {
            addCriterion("project_pitDesigner in", values, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerNotIn(List<String> values) {
            addCriterion("project_pitDesigner not in", values, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerBetween(String value1, String value2) {
            addCriterion("project_pitDesigner between", value1, value2, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectPitdesignerNotBetween(String value1, String value2) {
            addCriterion("project_pitDesigner not between", value1, value2, "projectPitdesigner");
            return (Criteria) this;
        }

        public Criteria andProjectContractorIsNull() {
            addCriterion("project_Contractor is null");
            return (Criteria) this;
        }

        public Criteria andProjectContractorIsNotNull() {
            addCriterion("project_Contractor is not null");
            return (Criteria) this;
        }

        public Criteria andProjectContractorEqualTo(String value) {
            addCriterion("project_Contractor =", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorNotEqualTo(String value) {
            addCriterion("project_Contractor <>", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorGreaterThan(String value) {
            addCriterion("project_Contractor >", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorGreaterThanOrEqualTo(String value) {
            addCriterion("project_Contractor >=", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorLessThan(String value) {
            addCriterion("project_Contractor <", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorLessThanOrEqualTo(String value) {
            addCriterion("project_Contractor <=", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorLike(String value) {
            addCriterion("project_Contractor like", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorNotLike(String value) {
            addCriterion("project_Contractor not like", value, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorIn(List<String> values) {
            addCriterion("project_Contractor in", values, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorNotIn(List<String> values) {
            addCriterion("project_Contractor not in", values, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorBetween(String value1, String value2) {
            addCriterion("project_Contractor between", value1, value2, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectContractorNotBetween(String value1, String value2) {
            addCriterion("project_Contractor not between", value1, value2, "projectContractor");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractIsNull() {
            addCriterion("project_pitSubcontract is null");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractIsNotNull() {
            addCriterion("project_pitSubcontract is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractEqualTo(String value) {
            addCriterion("project_pitSubcontract =", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractNotEqualTo(String value) {
            addCriterion("project_pitSubcontract <>", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractGreaterThan(String value) {
            addCriterion("project_pitSubcontract >", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractGreaterThanOrEqualTo(String value) {
            addCriterion("project_pitSubcontract >=", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractLessThan(String value) {
            addCriterion("project_pitSubcontract <", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractLessThanOrEqualTo(String value) {
            addCriterion("project_pitSubcontract <=", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractLike(String value) {
            addCriterion("project_pitSubcontract like", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractNotLike(String value) {
            addCriterion("project_pitSubcontract not like", value, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractIn(List<String> values) {
            addCriterion("project_pitSubcontract in", values, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractNotIn(List<String> values) {
            addCriterion("project_pitSubcontract not in", values, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractBetween(String value1, String value2) {
            addCriterion("project_pitSubcontract between", value1, value2, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectPitsubcontractNotBetween(String value1, String value2) {
            addCriterion("project_pitSubcontract not between", value1, value2, "projectPitsubcontract");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionIsNull() {
            addCriterion("project_supervision is null");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionIsNotNull() {
            addCriterion("project_supervision is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionEqualTo(String value) {
            addCriterion("project_supervision =", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionNotEqualTo(String value) {
            addCriterion("project_supervision <>", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionGreaterThan(String value) {
            addCriterion("project_supervision >", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionGreaterThanOrEqualTo(String value) {
            addCriterion("project_supervision >=", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionLessThan(String value) {
            addCriterion("project_supervision <", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionLessThanOrEqualTo(String value) {
            addCriterion("project_supervision <=", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionLike(String value) {
            addCriterion("project_supervision like", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionNotLike(String value) {
            addCriterion("project_supervision not like", value, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionIn(List<String> values) {
            addCriterion("project_supervision in", values, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionNotIn(List<String> values) {
            addCriterion("project_supervision not in", values, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionBetween(String value1, String value2) {
            addCriterion("project_supervision between", value1, value2, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectSupervisionNotBetween(String value1, String value2) {
            addCriterion("project_supervision not between", value1, value2, "projectSupervision");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorIsNull() {
            addCriterion("project_monitor is null");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorIsNotNull() {
            addCriterion("project_monitor is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorEqualTo(String value) {
            addCriterion("project_monitor =", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorNotEqualTo(String value) {
            addCriterion("project_monitor <>", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorGreaterThan(String value) {
            addCriterion("project_monitor >", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorGreaterThanOrEqualTo(String value) {
            addCriterion("project_monitor >=", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorLessThan(String value) {
            addCriterion("project_monitor <", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorLessThanOrEqualTo(String value) {
            addCriterion("project_monitor <=", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorLike(String value) {
            addCriterion("project_monitor like", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorNotLike(String value) {
            addCriterion("project_monitor not like", value, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorIn(List<String> values) {
            addCriterion("project_monitor in", values, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorNotIn(List<String> values) {
            addCriterion("project_monitor not in", values, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorBetween(String value1, String value2) {
            addCriterion("project_monitor between", value1, value2, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectMonitorNotBetween(String value1, String value2) {
            addCriterion("project_monitor not between", value1, value2, "projectMonitor");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaIsNull() {
            addCriterion("project_pitArea is null");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaIsNotNull() {
            addCriterion("project_pitArea is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaEqualTo(Double value) {
            addCriterion("project_pitArea =", value, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaNotEqualTo(Double value) {
            addCriterion("project_pitArea <>", value, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaGreaterThan(Double value) {
            addCriterion("project_pitArea >", value, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaGreaterThanOrEqualTo(Double value) {
            addCriterion("project_pitArea >=", value, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaLessThan(Double value) {
            addCriterion("project_pitArea <", value, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaLessThanOrEqualTo(Double value) {
            addCriterion("project_pitArea <=", value, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaIn(List<Double> values) {
            addCriterion("project_pitArea in", values, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaNotIn(List<Double> values) {
            addCriterion("project_pitArea not in", values, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaBetween(Double value1, Double value2) {
            addCriterion("project_pitArea between", value1, value2, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectPitareaNotBetween(Double value1, Double value2) {
            addCriterion("project_pitArea not between", value1, value2, "projectPitarea");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthIsNull() {
            addCriterion("project_commonDepth is null");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthIsNotNull() {
            addCriterion("project_commonDepth is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthEqualTo(Double value) {
            addCriterion("project_commonDepth =", value, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthNotEqualTo(Double value) {
            addCriterion("project_commonDepth <>", value, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthGreaterThan(Double value) {
            addCriterion("project_commonDepth >", value, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthGreaterThanOrEqualTo(Double value) {
            addCriterion("project_commonDepth >=", value, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthLessThan(Double value) {
            addCriterion("project_commonDepth <", value, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthLessThanOrEqualTo(Double value) {
            addCriterion("project_commonDepth <=", value, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthIn(List<Double> values) {
            addCriterion("project_commonDepth in", values, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthNotIn(List<Double> values) {
            addCriterion("project_commonDepth not in", values, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthBetween(Double value1, Double value2) {
            addCriterion("project_commonDepth between", value1, value2, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectCommondepthNotBetween(Double value1, Double value2) {
            addCriterion("project_commonDepth not between", value1, value2, "projectCommondepth");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongIsNull() {
            addCriterion("project_aroundLong is null");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongIsNotNull() {
            addCriterion("project_aroundLong is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongEqualTo(Double value) {
            addCriterion("project_aroundLong =", value, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongNotEqualTo(Double value) {
            addCriterion("project_aroundLong <>", value, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongGreaterThan(Double value) {
            addCriterion("project_aroundLong >", value, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongGreaterThanOrEqualTo(Double value) {
            addCriterion("project_aroundLong >=", value, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongLessThan(Double value) {
            addCriterion("project_aroundLong <", value, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongLessThanOrEqualTo(Double value) {
            addCriterion("project_aroundLong <=", value, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongIn(List<Double> values) {
            addCriterion("project_aroundLong in", values, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongNotIn(List<Double> values) {
            addCriterion("project_aroundLong not in", values, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongBetween(Double value1, Double value2) {
            addCriterion("project_aroundLong between", value1, value2, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectAroundlongNotBetween(Double value1, Double value2) {
            addCriterion("project_aroundLong not between", value1, value2, "projectAroundlong");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthIsNull() {
            addCriterion("project_deepestDepth is null");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthIsNotNull() {
            addCriterion("project_deepestDepth is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthEqualTo(Double value) {
            addCriterion("project_deepestDepth =", value, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthNotEqualTo(Double value) {
            addCriterion("project_deepestDepth <>", value, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthGreaterThan(Double value) {
            addCriterion("project_deepestDepth >", value, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthGreaterThanOrEqualTo(Double value) {
            addCriterion("project_deepestDepth >=", value, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthLessThan(Double value) {
            addCriterion("project_deepestDepth <", value, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthLessThanOrEqualTo(Double value) {
            addCriterion("project_deepestDepth <=", value, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthIn(List<Double> values) {
            addCriterion("project_deepestDepth in", values, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthNotIn(List<Double> values) {
            addCriterion("project_deepestDepth not in", values, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthBetween(Double value1, Double value2) {
            addCriterion("project_deepestDepth between", value1, value2, "projectDeepestdepth");
            return (Criteria) this;
        }

        public Criteria andProjectDeepestdepthNotBetween(Double value1, Double value2) {
            addCriterion("project_deepestDepth not between", value1, value2, "projectDeepestdepth");
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