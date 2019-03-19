package com.hudong.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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

        public Criteria andOrderPurposeIsNull() {
            addCriterion("order_purpose is null");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeIsNotNull() {
            addCriterion("order_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeEqualTo(String value) {
            addCriterion("order_purpose =", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeNotEqualTo(String value) {
            addCriterion("order_purpose <>", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeGreaterThan(String value) {
            addCriterion("order_purpose >", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("order_purpose >=", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeLessThan(String value) {
            addCriterion("order_purpose <", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeLessThanOrEqualTo(String value) {
            addCriterion("order_purpose <=", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeLike(String value) {
            addCriterion("order_purpose like", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeNotLike(String value) {
            addCriterion("order_purpose not like", value, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeIn(List<String> values) {
            addCriterion("order_purpose in", values, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeNotIn(List<String> values) {
            addCriterion("order_purpose not in", values, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeBetween(String value1, String value2) {
            addCriterion("order_purpose between", value1, value2, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderPurposeNotBetween(String value1, String value2) {
            addCriterion("order_purpose not between", value1, value2, "orderPurpose");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateIsNull() {
            addCriterion("order_startdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateIsNotNull() {
            addCriterion("order_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateEqualTo(Date value) {
            addCriterion("order_startdate =", value, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateNotEqualTo(Date value) {
            addCriterion("order_startdate <>", value, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateGreaterThan(Date value) {
            addCriterion("order_startdate >", value, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_startdate >=", value, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateLessThan(Date value) {
            addCriterion("order_startdate <", value, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateLessThanOrEqualTo(Date value) {
            addCriterion("order_startdate <=", value, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateIn(List<Date> values) {
            addCriterion("order_startdate in", values, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateNotIn(List<Date> values) {
            addCriterion("order_startdate not in", values, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateBetween(Date value1, Date value2) {
            addCriterion("order_startdate between", value1, value2, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderStartdateNotBetween(Date value1, Date value2) {
            addCriterion("order_startdate not between", value1, value2, "orderStartdate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateIsNull() {
            addCriterion("order_enddate is null");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateIsNotNull() {
            addCriterion("order_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateEqualTo(Date value) {
            addCriterion("order_enddate =", value, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateNotEqualTo(Date value) {
            addCriterion("order_enddate <>", value, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateGreaterThan(Date value) {
            addCriterion("order_enddate >", value, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_enddate >=", value, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateLessThan(Date value) {
            addCriterion("order_enddate <", value, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateLessThanOrEqualTo(Date value) {
            addCriterion("order_enddate <=", value, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateIn(List<Date> values) {
            addCriterion("order_enddate in", values, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateNotIn(List<Date> values) {
            addCriterion("order_enddate not in", values, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateBetween(Date value1, Date value2) {
            addCriterion("order_enddate between", value1, value2, "orderEnddate");
            return (Criteria) this;
        }

        public Criteria andOrderEnddateNotBetween(Date value1, Date value2) {
            addCriterion("order_enddate not between", value1, value2, "orderEnddate");
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