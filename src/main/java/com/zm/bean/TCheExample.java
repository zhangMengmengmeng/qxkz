package com.zm.bean;

import java.util.ArrayList;
import java.util.List;

public class TCheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCheExample() {
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

        public Criteria andChexingIsNull() {
            addCriterion("chexing is null");
            return (Criteria) this;
        }

        public Criteria andChexingIsNotNull() {
            addCriterion("chexing is not null");
            return (Criteria) this;
        }

        public Criteria andChexingEqualTo(String value) {
            addCriterion("chexing =", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotEqualTo(String value) {
            addCriterion("chexing <>", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingGreaterThan(String value) {
            addCriterion("chexing >", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingGreaterThanOrEqualTo(String value) {
            addCriterion("chexing >=", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLessThan(String value) {
            addCriterion("chexing <", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLessThanOrEqualTo(String value) {
            addCriterion("chexing <=", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingLike(String value) {
            addCriterion("chexing like", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotLike(String value) {
            addCriterion("chexing not like", value, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingIn(List<String> values) {
            addCriterion("chexing in", values, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotIn(List<String> values) {
            addCriterion("chexing not in", values, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingBetween(String value1, String value2) {
            addCriterion("chexing between", value1, value2, "chexing");
            return (Criteria) this;
        }

        public Criteria andChexingNotBetween(String value1, String value2) {
            addCriterion("chexing not between", value1, value2, "chexing");
            return (Criteria) this;
        }

        public Criteria andPinpaiIsNull() {
            addCriterion("pinpai is null");
            return (Criteria) this;
        }

        public Criteria andPinpaiIsNotNull() {
            addCriterion("pinpai is not null");
            return (Criteria) this;
        }

        public Criteria andPinpaiEqualTo(String value) {
            addCriterion("pinpai =", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotEqualTo(String value) {
            addCriterion("pinpai <>", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiGreaterThan(String value) {
            addCriterion("pinpai >", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiGreaterThanOrEqualTo(String value) {
            addCriterion("pinpai >=", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiLessThan(String value) {
            addCriterion("pinpai <", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiLessThanOrEqualTo(String value) {
            addCriterion("pinpai <=", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiLike(String value) {
            addCriterion("pinpai like", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotLike(String value) {
            addCriterion("pinpai not like", value, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiIn(List<String> values) {
            addCriterion("pinpai in", values, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotIn(List<String> values) {
            addCriterion("pinpai not in", values, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiBetween(String value1, String value2) {
            addCriterion("pinpai between", value1, value2, "pinpai");
            return (Criteria) this;
        }

        public Criteria andPinpaiNotBetween(String value1, String value2) {
            addCriterion("pinpai not between", value1, value2, "pinpai");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andFujianIsNull() {
            addCriterion("fujian is null");
            return (Criteria) this;
        }

        public Criteria andFujianIsNotNull() {
            addCriterion("fujian is not null");
            return (Criteria) this;
        }

        public Criteria andFujianEqualTo(String value) {
            addCriterion("fujian =", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotEqualTo(String value) {
            addCriterion("fujian <>", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianGreaterThan(String value) {
            addCriterion("fujian >", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianGreaterThanOrEqualTo(String value) {
            addCriterion("fujian >=", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianLessThan(String value) {
            addCriterion("fujian <", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianLessThanOrEqualTo(String value) {
            addCriterion("fujian <=", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianLike(String value) {
            addCriterion("fujian like", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotLike(String value) {
            addCriterion("fujian not like", value, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianIn(List<String> values) {
            addCriterion("fujian in", values, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotIn(List<String> values) {
            addCriterion("fujian not in", values, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianBetween(String value1, String value2) {
            addCriterion("fujian between", value1, value2, "fujian");
            return (Criteria) this;
        }

        public Criteria andFujianNotBetween(String value1, String value2) {
            addCriterion("fujian not between", value1, value2, "fujian");
            return (Criteria) this;
        }

        public Criteria andRizuIsNull() {
            addCriterion("rizu is null");
            return (Criteria) this;
        }

        public Criteria andRizuIsNotNull() {
            addCriterion("rizu is not null");
            return (Criteria) this;
        }

        public Criteria andRizuEqualTo(Integer value) {
            addCriterion("rizu =", value, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuNotEqualTo(Integer value) {
            addCriterion("rizu <>", value, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuGreaterThan(Integer value) {
            addCriterion("rizu >", value, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuGreaterThanOrEqualTo(Integer value) {
            addCriterion("rizu >=", value, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuLessThan(Integer value) {
            addCriterion("rizu <", value, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuLessThanOrEqualTo(Integer value) {
            addCriterion("rizu <=", value, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuIn(List<Integer> values) {
            addCriterion("rizu in", values, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuNotIn(List<Integer> values) {
            addCriterion("rizu not in", values, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuBetween(Integer value1, Integer value2) {
            addCriterion("rizu between", value1, value2, "rizu");
            return (Criteria) this;
        }

        public Criteria andRizuNotBetween(Integer value1, Integer value2) {
            addCriterion("rizu not between", value1, value2, "rizu");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("zt is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("zt is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("zt =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("zt <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("zt >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("zt >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("zt <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("zt <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("zt like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("zt not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("zt in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("zt not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("zt between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("zt not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(String value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(String value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(String value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(String value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(String value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(String value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLike(String value) {
            addCriterion("del like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotLike(String value) {
            addCriterion("del not like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<String> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<String> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(String value1, String value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(String value1, String value2) {
            addCriterion("del not between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andCphIsNull() {
            addCriterion("cph is null");
            return (Criteria) this;
        }

        public Criteria andCphIsNotNull() {
            addCriterion("cph is not null");
            return (Criteria) this;
        }

        public Criteria andCphEqualTo(String value) {
            addCriterion("cph =", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotEqualTo(String value) {
            addCriterion("cph <>", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphGreaterThan(String value) {
            addCriterion("cph >", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphGreaterThanOrEqualTo(String value) {
            addCriterion("cph >=", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphLessThan(String value) {
            addCriterion("cph <", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphLessThanOrEqualTo(String value) {
            addCriterion("cph <=", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphLike(String value) {
            addCriterion("cph like", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotLike(String value) {
            addCriterion("cph not like", value, "cph");
            return (Criteria) this;
        }

        public Criteria andCphIn(List<String> values) {
            addCriterion("cph in", values, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotIn(List<String> values) {
            addCriterion("cph not in", values, "cph");
            return (Criteria) this;
        }

        public Criteria andCphBetween(String value1, String value2) {
            addCriterion("cph between", value1, value2, "cph");
            return (Criteria) this;
        }

        public Criteria andCphNotBetween(String value1, String value2) {
            addCriterion("cph not between", value1, value2, "cph");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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