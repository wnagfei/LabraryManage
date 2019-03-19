package com.hudong.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialRepairInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialRepairInfoExample() {
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

        public Criteria andRepairReasonIsNull() {
            addCriterion("repair_reason is null");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIsNotNull() {
            addCriterion("repair_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRepairReasonEqualTo(String value) {
            addCriterion("repair_reason =", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotEqualTo(String value) {
            addCriterion("repair_reason <>", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonGreaterThan(String value) {
            addCriterion("repair_reason >", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonGreaterThanOrEqualTo(String value) {
            addCriterion("repair_reason >=", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLessThan(String value) {
            addCriterion("repair_reason <", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLessThanOrEqualTo(String value) {
            addCriterion("repair_reason <=", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonLike(String value) {
            addCriterion("repair_reason like", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotLike(String value) {
            addCriterion("repair_reason not like", value, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonIn(List<String> values) {
            addCriterion("repair_reason in", values, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotIn(List<String> values) {
            addCriterion("repair_reason not in", values, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonBetween(String value1, String value2) {
            addCriterion("repair_reason between", value1, value2, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReasonNotBetween(String value1, String value2) {
            addCriterion("repair_reason not between", value1, value2, "repairReason");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateIsNull() {
            addCriterion("repair_return_date is null");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateIsNotNull() {
            addCriterion("repair_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateEqualTo(String value) {
            addCriterion("repair_return_date =", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateNotEqualTo(String value) {
            addCriterion("repair_return_date <>", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateGreaterThan(String value) {
            addCriterion("repair_return_date >", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("repair_return_date >=", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateLessThan(String value) {
            addCriterion("repair_return_date <", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateLessThanOrEqualTo(String value) {
            addCriterion("repair_return_date <=", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateLike(String value) {
            addCriterion("repair_return_date like", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateNotLike(String value) {
            addCriterion("repair_return_date not like", value, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateIn(List<String> values) {
            addCriterion("repair_return_date in", values, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateNotIn(List<String> values) {
            addCriterion("repair_return_date not in", values, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateBetween(String value1, String value2) {
            addCriterion("repair_return_date between", value1, value2, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairReturnDateNotBetween(String value1, String value2) {
            addCriterion("repair_return_date not between", value1, value2, "repairReturnDate");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkIsNull() {
            addCriterion("repair_remark is null");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkIsNotNull() {
            addCriterion("repair_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkEqualTo(String value) {
            addCriterion("repair_remark =", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkNotEqualTo(String value) {
            addCriterion("repair_remark <>", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkGreaterThan(String value) {
            addCriterion("repair_remark >", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("repair_remark >=", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkLessThan(String value) {
            addCriterion("repair_remark <", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkLessThanOrEqualTo(String value) {
            addCriterion("repair_remark <=", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkLike(String value) {
            addCriterion("repair_remark like", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkNotLike(String value) {
            addCriterion("repair_remark not like", value, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkIn(List<String> values) {
            addCriterion("repair_remark in", values, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkNotIn(List<String> values) {
            addCriterion("repair_remark not in", values, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkBetween(String value1, String value2) {
            addCriterion("repair_remark between", value1, value2, "repairRemark");
            return (Criteria) this;
        }

        public Criteria andRepairRemarkNotBetween(String value1, String value2) {
            addCriterion("repair_remark not between", value1, value2, "repairRemark");
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