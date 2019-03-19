package com.hudong.model;

import java.util.ArrayList;
import java.util.List;

public class MaterialInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaterialInfoExample() {
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

        public Criteria andMaterialCategoryIsNull() {
            addCriterion("material_category is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryIsNotNull() {
            addCriterion("material_category is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryEqualTo(String value) {
            addCriterion("material_category =", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotEqualTo(String value) {
            addCriterion("material_category <>", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryGreaterThan(String value) {
            addCriterion("material_category >", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("material_category >=", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryLessThan(String value) {
            addCriterion("material_category <", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryLessThanOrEqualTo(String value) {
            addCriterion("material_category <=", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryLike(String value) {
            addCriterion("material_category like", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotLike(String value) {
            addCriterion("material_category not like", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryIn(List<String> values) {
            addCriterion("material_category in", values, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotIn(List<String> values) {
            addCriterion("material_category not in", values, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryBetween(String value1, String value2) {
            addCriterion("material_category between", value1, value2, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotBetween(String value1, String value2) {
            addCriterion("material_category not between", value1, value2, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerIsNull() {
            addCriterion("material_owner is null");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerIsNotNull() {
            addCriterion("material_owner is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerEqualTo(String value) {
            addCriterion("material_owner =", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerNotEqualTo(String value) {
            addCriterion("material_owner <>", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerGreaterThan(String value) {
            addCriterion("material_owner >", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("material_owner >=", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerLessThan(String value) {
            addCriterion("material_owner <", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerLessThanOrEqualTo(String value) {
            addCriterion("material_owner <=", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerLike(String value) {
            addCriterion("material_owner like", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerNotLike(String value) {
            addCriterion("material_owner not like", value, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerIn(List<String> values) {
            addCriterion("material_owner in", values, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerNotIn(List<String> values) {
            addCriterion("material_owner not in", values, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerBetween(String value1, String value2) {
            addCriterion("material_owner between", value1, value2, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andMaterialOwnerNotBetween(String value1, String value2) {
            addCriterion("material_owner not between", value1, value2, "materialOwner");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderIsNull() {
            addCriterion("material_order is null");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderIsNotNull() {
            addCriterion("material_order is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderEqualTo(String value) {
            addCriterion("material_order =", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderNotEqualTo(String value) {
            addCriterion("material_order <>", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderGreaterThan(String value) {
            addCriterion("material_order >", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderGreaterThanOrEqualTo(String value) {
            addCriterion("material_order >=", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderLessThan(String value) {
            addCriterion("material_order <", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderLessThanOrEqualTo(String value) {
            addCriterion("material_order <=", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderLike(String value) {
            addCriterion("material_order like", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderNotLike(String value) {
            addCriterion("material_order not like", value, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderIn(List<String> values) {
            addCriterion("material_order in", values, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderNotIn(List<String> values) {
            addCriterion("material_order not in", values, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderBetween(String value1, String value2) {
            addCriterion("material_order between", value1, value2, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialOrderNotBetween(String value1, String value2) {
            addCriterion("material_order not between", value1, value2, "materialOrder");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressIsNull() {
            addCriterion("material_adress is null");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressIsNotNull() {
            addCriterion("material_adress is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressEqualTo(String value) {
            addCriterion("material_adress =", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressNotEqualTo(String value) {
            addCriterion("material_adress <>", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressGreaterThan(String value) {
            addCriterion("material_adress >", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressGreaterThanOrEqualTo(String value) {
            addCriterion("material_adress >=", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressLessThan(String value) {
            addCriterion("material_adress <", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressLessThanOrEqualTo(String value) {
            addCriterion("material_adress <=", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressLike(String value) {
            addCriterion("material_adress like", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressNotLike(String value) {
            addCriterion("material_adress not like", value, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressIn(List<String> values) {
            addCriterion("material_adress in", values, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressNotIn(List<String> values) {
            addCriterion("material_adress not in", values, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressBetween(String value1, String value2) {
            addCriterion("material_adress between", value1, value2, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialAdressNotBetween(String value1, String value2) {
            addCriterion("material_adress not between", value1, value2, "materialAdress");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkIsNull() {
            addCriterion("material_remark is null");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkIsNotNull() {
            addCriterion("material_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkEqualTo(String value) {
            addCriterion("material_remark =", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkNotEqualTo(String value) {
            addCriterion("material_remark <>", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkGreaterThan(String value) {
            addCriterion("material_remark >", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("material_remark >=", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkLessThan(String value) {
            addCriterion("material_remark <", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkLessThanOrEqualTo(String value) {
            addCriterion("material_remark <=", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkLike(String value) {
            addCriterion("material_remark like", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkNotLike(String value) {
            addCriterion("material_remark not like", value, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkIn(List<String> values) {
            addCriterion("material_remark in", values, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkNotIn(List<String> values) {
            addCriterion("material_remark not in", values, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkBetween(String value1, String value2) {
            addCriterion("material_remark between", value1, value2, "materialRemark");
            return (Criteria) this;
        }

        public Criteria andMaterialRemarkNotBetween(String value1, String value2) {
            addCriterion("material_remark not between", value1, value2, "materialRemark");
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