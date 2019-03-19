package com.hudong.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PublicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicInfoExample() {
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

        public Criteria andPublicNameIsNull() {
            addCriterion("public_name is null");
            return (Criteria) this;
        }

        public Criteria andPublicNameIsNotNull() {
            addCriterion("public_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublicNameEqualTo(String value) {
            addCriterion("public_name =", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotEqualTo(String value) {
            addCriterion("public_name <>", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameGreaterThan(String value) {
            addCriterion("public_name >", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameGreaterThanOrEqualTo(String value) {
            addCriterion("public_name >=", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameLessThan(String value) {
            addCriterion("public_name <", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameLessThanOrEqualTo(String value) {
            addCriterion("public_name <=", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameLike(String value) {
            addCriterion("public_name like", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotLike(String value) {
            addCriterion("public_name not like", value, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameIn(List<String> values) {
            addCriterion("public_name in", values, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotIn(List<String> values) {
            addCriterion("public_name not in", values, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameBetween(String value1, String value2) {
            addCriterion("public_name between", value1, value2, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicNameNotBetween(String value1, String value2) {
            addCriterion("public_name not between", value1, value2, "publicName");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeIsNull() {
            addCriterion("public_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeIsNotNull() {
            addCriterion("public_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeEqualTo(Date value) {
            addCriterion("public_start_time =", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeNotEqualTo(Date value) {
            addCriterion("public_start_time <>", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeGreaterThan(Date value) {
            addCriterion("public_start_time >", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("public_start_time >=", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeLessThan(Date value) {
            addCriterion("public_start_time <", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("public_start_time <=", value, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeIn(List<Date> values) {
            addCriterion("public_start_time in", values, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeNotIn(List<Date> values) {
            addCriterion("public_start_time not in", values, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeBetween(Date value1, Date value2) {
            addCriterion("public_start_time between", value1, value2, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("public_start_time not between", value1, value2, "publicStartTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeIsNull() {
            addCriterion("public_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeIsNotNull() {
            addCriterion("public_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeEqualTo(Date value) {
            addCriterion("public_end_time =", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeNotEqualTo(Date value) {
            addCriterion("public_end_time <>", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeGreaterThan(Date value) {
            addCriterion("public_end_time >", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("public_end_time >=", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeLessThan(Date value) {
            addCriterion("public_end_time <", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("public_end_time <=", value, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeIn(List<Date> values) {
            addCriterion("public_end_time in", values, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeNotIn(List<Date> values) {
            addCriterion("public_end_time not in", values, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeBetween(Date value1, Date value2) {
            addCriterion("public_end_time between", value1, value2, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublicEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("public_end_time not between", value1, value2, "publicEndTime");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublicContentIsNull() {
            addCriterion("public_content is null");
            return (Criteria) this;
        }

        public Criteria andPublicContentIsNotNull() {
            addCriterion("public_content is not null");
            return (Criteria) this;
        }

        public Criteria andPublicContentEqualTo(String value) {
            addCriterion("public_content =", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentNotEqualTo(String value) {
            addCriterion("public_content <>", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentGreaterThan(String value) {
            addCriterion("public_content >", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentGreaterThanOrEqualTo(String value) {
            addCriterion("public_content >=", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentLessThan(String value) {
            addCriterion("public_content <", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentLessThanOrEqualTo(String value) {
            addCriterion("public_content <=", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentLike(String value) {
            addCriterion("public_content like", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentNotLike(String value) {
            addCriterion("public_content not like", value, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentIn(List<String> values) {
            addCriterion("public_content in", values, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentNotIn(List<String> values) {
            addCriterion("public_content not in", values, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentBetween(String value1, String value2) {
            addCriterion("public_content between", value1, value2, "publicContent");
            return (Criteria) this;
        }

        public Criteria andPublicContentNotBetween(String value1, String value2) {
            addCriterion("public_content not between", value1, value2, "publicContent");
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