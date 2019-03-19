package com.hudong.model;

import java.util.ArrayList;
import java.util.List;

public class LabrayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabrayInfoExample() {
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

        public Criteria andLabrayNameIsNull() {
            addCriterion("labray_name is null");
            return (Criteria) this;
        }

        public Criteria andLabrayNameIsNotNull() {
            addCriterion("labray_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabrayNameEqualTo(String value) {
            addCriterion("labray_name =", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameNotEqualTo(String value) {
            addCriterion("labray_name <>", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameGreaterThan(String value) {
            addCriterion("labray_name >", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameGreaterThanOrEqualTo(String value) {
            addCriterion("labray_name >=", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameLessThan(String value) {
            addCriterion("labray_name <", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameLessThanOrEqualTo(String value) {
            addCriterion("labray_name <=", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameLike(String value) {
            addCriterion("labray_name like", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameNotLike(String value) {
            addCriterion("labray_name not like", value, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameIn(List<String> values) {
            addCriterion("labray_name in", values, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameNotIn(List<String> values) {
            addCriterion("labray_name not in", values, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameBetween(String value1, String value2) {
            addCriterion("labray_name between", value1, value2, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayNameNotBetween(String value1, String value2) {
            addCriterion("labray_name not between", value1, value2, "labrayName");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressIsNull() {
            addCriterion("labray_adress is null");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressIsNotNull() {
            addCriterion("labray_adress is not null");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressEqualTo(String value) {
            addCriterion("labray_adress =", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressNotEqualTo(String value) {
            addCriterion("labray_adress <>", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressGreaterThan(String value) {
            addCriterion("labray_adress >", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressGreaterThanOrEqualTo(String value) {
            addCriterion("labray_adress >=", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressLessThan(String value) {
            addCriterion("labray_adress <", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressLessThanOrEqualTo(String value) {
            addCriterion("labray_adress <=", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressLike(String value) {
            addCriterion("labray_adress like", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressNotLike(String value) {
            addCriterion("labray_adress not like", value, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressIn(List<String> values) {
            addCriterion("labray_adress in", values, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressNotIn(List<String> values) {
            addCriterion("labray_adress not in", values, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressBetween(String value1, String value2) {
            addCriterion("labray_adress between", value1, value2, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayAdressNotBetween(String value1, String value2) {
            addCriterion("labray_adress not between", value1, value2, "labrayAdress");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusIsNull() {
            addCriterion("labray_status is null");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusIsNotNull() {
            addCriterion("labray_status is not null");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusEqualTo(String value) {
            addCriterion("labray_status =", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusNotEqualTo(String value) {
            addCriterion("labray_status <>", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusGreaterThan(String value) {
            addCriterion("labray_status >", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("labray_status >=", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusLessThan(String value) {
            addCriterion("labray_status <", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusLessThanOrEqualTo(String value) {
            addCriterion("labray_status <=", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusLike(String value) {
            addCriterion("labray_status like", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusNotLike(String value) {
            addCriterion("labray_status not like", value, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusIn(List<String> values) {
            addCriterion("labray_status in", values, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusNotIn(List<String> values) {
            addCriterion("labray_status not in", values, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusBetween(String value1, String value2) {
            addCriterion("labray_status between", value1, value2, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayStatusNotBetween(String value1, String value2) {
            addCriterion("labray_status not between", value1, value2, "labrayStatus");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkIsNull() {
            addCriterion("labray_remark is null");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkIsNotNull() {
            addCriterion("labray_remark is not null");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkEqualTo(String value) {
            addCriterion("labray_remark =", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkNotEqualTo(String value) {
            addCriterion("labray_remark <>", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkGreaterThan(String value) {
            addCriterion("labray_remark >", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("labray_remark >=", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkLessThan(String value) {
            addCriterion("labray_remark <", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkLessThanOrEqualTo(String value) {
            addCriterion("labray_remark <=", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkLike(String value) {
            addCriterion("labray_remark like", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkNotLike(String value) {
            addCriterion("labray_remark not like", value, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkIn(List<String> values) {
            addCriterion("labray_remark in", values, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkNotIn(List<String> values) {
            addCriterion("labray_remark not in", values, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkBetween(String value1, String value2) {
            addCriterion("labray_remark between", value1, value2, "labrayRemark");
            return (Criteria) this;
        }

        public Criteria andLabrayRemarkNotBetween(String value1, String value2) {
            addCriterion("labray_remark not between", value1, value2, "labrayRemark");
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