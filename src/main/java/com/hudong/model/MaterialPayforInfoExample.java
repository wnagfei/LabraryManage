package com.hudong.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialPayforInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialPayforInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNull() {
            addCriterion("material_no is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNotNull() {
            addCriterion("material_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoEqualTo(String value) {
            addCriterion("material_no =", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotEqualTo(String value) {
            addCriterion("material_no <>", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThan(String value) {
            addCriterion("material_no >", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("material_no >=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThan(String value) {
            addCriterion("material_no <", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("material_no <=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLike(String value) {
            addCriterion("material_no like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotLike(String value) {
            addCriterion("material_no not like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIn(List<String> values) {
            addCriterion("material_no in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotIn(List<String> values) {
            addCriterion("material_no not in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoBetween(String value1, String value2) {
            addCriterion("material_no between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotBetween(String value1, String value2) {
            addCriterion("material_no not between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andPayForReasonIsNull() {
            addCriterion("pay_for_reason is null");
            return (Criteria) this;
        }

        public Criteria andPayForReasonIsNotNull() {
            addCriterion("pay_for_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPayForReasonEqualTo(String value) {
            addCriterion("pay_for_reason =", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonNotEqualTo(String value) {
            addCriterion("pay_for_reason <>", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonGreaterThan(String value) {
            addCriterion("pay_for_reason >", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonGreaterThanOrEqualTo(String value) {
            addCriterion("pay_for_reason >=", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonLessThan(String value) {
            addCriterion("pay_for_reason <", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonLessThanOrEqualTo(String value) {
            addCriterion("pay_for_reason <=", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonLike(String value) {
            addCriterion("pay_for_reason like", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonNotLike(String value) {
            addCriterion("pay_for_reason not like", value, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonIn(List<String> values) {
            addCriterion("pay_for_reason in", values, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonNotIn(List<String> values) {
            addCriterion("pay_for_reason not in", values, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonBetween(String value1, String value2) {
            addCriterion("pay_for_reason between", value1, value2, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForReasonNotBetween(String value1, String value2) {
            addCriterion("pay_for_reason not between", value1, value2, "payForReason");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyIsNull() {
            addCriterion("pay_for_money is null");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyIsNotNull() {
            addCriterion("pay_for_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyEqualTo(String value) {
            addCriterion("pay_for_money =", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyNotEqualTo(String value) {
            addCriterion("pay_for_money <>", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyGreaterThan(String value) {
            addCriterion("pay_for_money >", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("pay_for_money >=", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyLessThan(String value) {
            addCriterion("pay_for_money <", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyLessThanOrEqualTo(String value) {
            addCriterion("pay_for_money <=", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyLike(String value) {
            addCriterion("pay_for_money like", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyNotLike(String value) {
            addCriterion("pay_for_money not like", value, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyIn(List<String> values) {
            addCriterion("pay_for_money in", values, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyNotIn(List<String> values) {
            addCriterion("pay_for_money not in", values, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyBetween(String value1, String value2) {
            addCriterion("pay_for_money between", value1, value2, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForMoneyNotBetween(String value1, String value2) {
            addCriterion("pay_for_money not between", value1, value2, "payForMoney");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerIsNull() {
            addCriterion("pay_for_owner is null");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerIsNotNull() {
            addCriterion("pay_for_owner is not null");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerEqualTo(String value) {
            addCriterion("pay_for_owner =", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerNotEqualTo(String value) {
            addCriterion("pay_for_owner <>", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerGreaterThan(String value) {
            addCriterion("pay_for_owner >", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("pay_for_owner >=", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerLessThan(String value) {
            addCriterion("pay_for_owner <", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerLessThanOrEqualTo(String value) {
            addCriterion("pay_for_owner <=", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerLike(String value) {
            addCriterion("pay_for_owner like", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerNotLike(String value) {
            addCriterion("pay_for_owner not like", value, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerIn(List<String> values) {
            addCriterion("pay_for_owner in", values, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerNotIn(List<String> values) {
            addCriterion("pay_for_owner not in", values, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerBetween(String value1, String value2) {
            addCriterion("pay_for_owner between", value1, value2, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForOwnerNotBetween(String value1, String value2) {
            addCriterion("pay_for_owner not between", value1, value2, "payForOwner");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkIsNull() {
            addCriterion("pay_for_remark is null");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkIsNotNull() {
            addCriterion("pay_for_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkEqualTo(String value) {
            addCriterion("pay_for_remark =", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkNotEqualTo(String value) {
            addCriterion("pay_for_remark <>", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkGreaterThan(String value) {
            addCriterion("pay_for_remark >", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pay_for_remark >=", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkLessThan(String value) {
            addCriterion("pay_for_remark <", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkLessThanOrEqualTo(String value) {
            addCriterion("pay_for_remark <=", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkLike(String value) {
            addCriterion("pay_for_remark like", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkNotLike(String value) {
            addCriterion("pay_for_remark not like", value, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkIn(List<String> values) {
            addCriterion("pay_for_remark in", values, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkNotIn(List<String> values) {
            addCriterion("pay_for_remark not in", values, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkBetween(String value1, String value2) {
            addCriterion("pay_for_remark between", value1, value2, "payForRemark");
            return (Criteria) this;
        }

        public Criteria andPayForRemarkNotBetween(String value1, String value2) {
            addCriterion("pay_for_remark not between", value1, value2, "payForRemark");
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