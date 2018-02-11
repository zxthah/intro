package com.zx.intro.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Ka03Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ka03Example() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAaa027IsNull() {
            addCriterion("AAA027 is null");
            return (Criteria) this;
        }

        public Criteria andAaa027IsNotNull() {
            addCriterion("AAA027 is not null");
            return (Criteria) this;
        }

        public Criteria andAaa027EqualTo(String value) {
            addCriterion("AAA027 =", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotEqualTo(String value) {
            addCriterion("AAA027 <>", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027GreaterThan(String value) {
            addCriterion("AAA027 >", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027GreaterThanOrEqualTo(String value) {
            addCriterion("AAA027 >=", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027LessThan(String value) {
            addCriterion("AAA027 <", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027LessThanOrEqualTo(String value) {
            addCriterion("AAA027 <=", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027Like(String value) {
            addCriterion("AAA027 like", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotLike(String value) {
            addCriterion("AAA027 not like", value, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027In(List<String> values) {
            addCriterion("AAA027 in", values, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotIn(List<String> values) {
            addCriterion("AAA027 not in", values, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027Between(String value1, String value2) {
            addCriterion("AAA027 between", value1, value2, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAaa027NotBetween(String value1, String value2) {
            addCriterion("AAA027 not between", value1, value2, "aaa027");
            return (Criteria) this;
        }

        public Criteria andAke001IsNull() {
            addCriterion("AKE001 is null");
            return (Criteria) this;
        }

        public Criteria andAke001IsNotNull() {
            addCriterion("AKE001 is not null");
            return (Criteria) this;
        }

        public Criteria andAke001EqualTo(String value) {
            addCriterion("AKE001 =", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001NotEqualTo(String value) {
            addCriterion("AKE001 <>", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001GreaterThan(String value) {
            addCriterion("AKE001 >", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001GreaterThanOrEqualTo(String value) {
            addCriterion("AKE001 >=", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001LessThan(String value) {
            addCriterion("AKE001 <", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001LessThanOrEqualTo(String value) {
            addCriterion("AKE001 <=", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001Like(String value) {
            addCriterion("AKE001 like", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001NotLike(String value) {
            addCriterion("AKE001 not like", value, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001In(List<String> values) {
            addCriterion("AKE001 in", values, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001NotIn(List<String> values) {
            addCriterion("AKE001 not in", values, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001Between(String value1, String value2) {
            addCriterion("AKE001 between", value1, value2, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke001NotBetween(String value1, String value2) {
            addCriterion("AKE001 not between", value1, value2, "ake001");
            return (Criteria) this;
        }

        public Criteria andAke002IsNull() {
            addCriterion("AKE002 is null");
            return (Criteria) this;
        }

        public Criteria andAke002IsNotNull() {
            addCriterion("AKE002 is not null");
            return (Criteria) this;
        }

        public Criteria andAke002EqualTo(String value) {
            addCriterion("AKE002 =", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotEqualTo(String value) {
            addCriterion("AKE002 <>", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002GreaterThan(String value) {
            addCriterion("AKE002 >", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002GreaterThanOrEqualTo(String value) {
            addCriterion("AKE002 >=", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002LessThan(String value) {
            addCriterion("AKE002 <", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002LessThanOrEqualTo(String value) {
            addCriterion("AKE002 <=", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002Like(String value) {
            addCriterion("AKE002 like", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotLike(String value) {
            addCriterion("AKE002 not like", value, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002In(List<String> values) {
            addCriterion("AKE002 in", values, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotIn(List<String> values) {
            addCriterion("AKE002 not in", values, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002Between(String value1, String value2) {
            addCriterion("AKE002 between", value1, value2, "ake002");
            return (Criteria) this;
        }

        public Criteria andAke002NotBetween(String value1, String value2) {
            addCriterion("AKE002 not between", value1, value2, "ake002");
            return (Criteria) this;
        }

        public Criteria andAka165IsNull() {
            addCriterion("AKA165 is null");
            return (Criteria) this;
        }

        public Criteria andAka165IsNotNull() {
            addCriterion("AKA165 is not null");
            return (Criteria) this;
        }

        public Criteria andAka165EqualTo(String value) {
            addCriterion("AKA165 =", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165NotEqualTo(String value) {
            addCriterion("AKA165 <>", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165GreaterThan(String value) {
            addCriterion("AKA165 >", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165GreaterThanOrEqualTo(String value) {
            addCriterion("AKA165 >=", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165LessThan(String value) {
            addCriterion("AKA165 <", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165LessThanOrEqualTo(String value) {
            addCriterion("AKA165 <=", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165Like(String value) {
            addCriterion("AKA165 like", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165NotLike(String value) {
            addCriterion("AKA165 not like", value, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165In(List<String> values) {
            addCriterion("AKA165 in", values, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165NotIn(List<String> values) {
            addCriterion("AKA165 not in", values, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165Between(String value1, String value2) {
            addCriterion("AKA165 between", value1, value2, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka165NotBetween(String value1, String value2) {
            addCriterion("AKA165 not between", value1, value2, "aka165");
            return (Criteria) this;
        }

        public Criteria andAka198IsNull() {
            addCriterion("AKA198 is null");
            return (Criteria) this;
        }

        public Criteria andAka198IsNotNull() {
            addCriterion("AKA198 is not null");
            return (Criteria) this;
        }

        public Criteria andAka198EqualTo(String value) {
            addCriterion("AKA198 =", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198NotEqualTo(String value) {
            addCriterion("AKA198 <>", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198GreaterThan(String value) {
            addCriterion("AKA198 >", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198GreaterThanOrEqualTo(String value) {
            addCriterion("AKA198 >=", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198LessThan(String value) {
            addCriterion("AKA198 <", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198LessThanOrEqualTo(String value) {
            addCriterion("AKA198 <=", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198Like(String value) {
            addCriterion("AKA198 like", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198NotLike(String value) {
            addCriterion("AKA198 not like", value, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198In(List<String> values) {
            addCriterion("AKA198 in", values, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198NotIn(List<String> values) {
            addCriterion("AKA198 not in", values, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198Between(String value1, String value2) {
            addCriterion("AKA198 between", value1, value2, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka198NotBetween(String value1, String value2) {
            addCriterion("AKA198 not between", value1, value2, "aka198");
            return (Criteria) this;
        }

        public Criteria andAka096IsNull() {
            addCriterion("AKA096 is null");
            return (Criteria) this;
        }

        public Criteria andAka096IsNotNull() {
            addCriterion("AKA096 is not null");
            return (Criteria) this;
        }

        public Criteria andAka096EqualTo(String value) {
            addCriterion("AKA096 =", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096NotEqualTo(String value) {
            addCriterion("AKA096 <>", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096GreaterThan(String value) {
            addCriterion("AKA096 >", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096GreaterThanOrEqualTo(String value) {
            addCriterion("AKA096 >=", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096LessThan(String value) {
            addCriterion("AKA096 <", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096LessThanOrEqualTo(String value) {
            addCriterion("AKA096 <=", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096Like(String value) {
            addCriterion("AKA096 like", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096NotLike(String value) {
            addCriterion("AKA096 not like", value, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096In(List<String> values) {
            addCriterion("AKA096 in", values, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096NotIn(List<String> values) {
            addCriterion("AKA096 not in", values, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096Between(String value1, String value2) {
            addCriterion("AKA096 between", value1, value2, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka096NotBetween(String value1, String value2) {
            addCriterion("AKA096 not between", value1, value2, "aka096");
            return (Criteria) this;
        }

        public Criteria andAka097IsNull() {
            addCriterion("AKA097 is null");
            return (Criteria) this;
        }

        public Criteria andAka097IsNotNull() {
            addCriterion("AKA097 is not null");
            return (Criteria) this;
        }

        public Criteria andAka097EqualTo(String value) {
            addCriterion("AKA097 =", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097NotEqualTo(String value) {
            addCriterion("AKA097 <>", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097GreaterThan(String value) {
            addCriterion("AKA097 >", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097GreaterThanOrEqualTo(String value) {
            addCriterion("AKA097 >=", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097LessThan(String value) {
            addCriterion("AKA097 <", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097LessThanOrEqualTo(String value) {
            addCriterion("AKA097 <=", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097Like(String value) {
            addCriterion("AKA097 like", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097NotLike(String value) {
            addCriterion("AKA097 not like", value, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097In(List<String> values) {
            addCriterion("AKA097 in", values, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097NotIn(List<String> values) {
            addCriterion("AKA097 not in", values, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097Between(String value1, String value2) {
            addCriterion("AKA097 between", value1, value2, "aka097");
            return (Criteria) this;
        }

        public Criteria andAka097NotBetween(String value1, String value2) {
            addCriterion("AKA097 not between", value1, value2, "aka097");
            return (Criteria) this;
        }

        public Criteria andAke115IsNull() {
            addCriterion("AKE115 is null");
            return (Criteria) this;
        }

        public Criteria andAke115IsNotNull() {
            addCriterion("AKE115 is not null");
            return (Criteria) this;
        }

        public Criteria andAke115EqualTo(String value) {
            addCriterion("AKE115 =", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115NotEqualTo(String value) {
            addCriterion("AKE115 <>", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115GreaterThan(String value) {
            addCriterion("AKE115 >", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115GreaterThanOrEqualTo(String value) {
            addCriterion("AKE115 >=", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115LessThan(String value) {
            addCriterion("AKE115 <", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115LessThanOrEqualTo(String value) {
            addCriterion("AKE115 <=", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115Like(String value) {
            addCriterion("AKE115 like", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115NotLike(String value) {
            addCriterion("AKE115 not like", value, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115In(List<String> values) {
            addCriterion("AKE115 in", values, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115NotIn(List<String> values) {
            addCriterion("AKE115 not in", values, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115Between(String value1, String value2) {
            addCriterion("AKE115 between", value1, value2, "ake115");
            return (Criteria) this;
        }

        public Criteria andAke115NotBetween(String value1, String value2) {
            addCriterion("AKE115 not between", value1, value2, "ake115");
            return (Criteria) this;
        }

        public Criteria andAka173IsNull() {
            addCriterion("AKA173 is null");
            return (Criteria) this;
        }

        public Criteria andAka173IsNotNull() {
            addCriterion("AKA173 is not null");
            return (Criteria) this;
        }

        public Criteria andAka173EqualTo(String value) {
            addCriterion("AKA173 =", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173NotEqualTo(String value) {
            addCriterion("AKA173 <>", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173GreaterThan(String value) {
            addCriterion("AKA173 >", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173GreaterThanOrEqualTo(String value) {
            addCriterion("AKA173 >=", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173LessThan(String value) {
            addCriterion("AKA173 <", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173LessThanOrEqualTo(String value) {
            addCriterion("AKA173 <=", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173Like(String value) {
            addCriterion("AKA173 like", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173NotLike(String value) {
            addCriterion("AKA173 not like", value, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173In(List<String> values) {
            addCriterion("AKA173 in", values, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173NotIn(List<String> values) {
            addCriterion("AKA173 not in", values, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173Between(String value1, String value2) {
            addCriterion("AKA173 between", value1, value2, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka173NotBetween(String value1, String value2) {
            addCriterion("AKA173 not between", value1, value2, "aka173");
            return (Criteria) this;
        }

        public Criteria andAka052IsNull() {
            addCriterion("AKA052 is null");
            return (Criteria) this;
        }

        public Criteria andAka052IsNotNull() {
            addCriterion("AKA052 is not null");
            return (Criteria) this;
        }

        public Criteria andAka052EqualTo(String value) {
            addCriterion("AKA052 =", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052NotEqualTo(String value) {
            addCriterion("AKA052 <>", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052GreaterThan(String value) {
            addCriterion("AKA052 >", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052GreaterThanOrEqualTo(String value) {
            addCriterion("AKA052 >=", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052LessThan(String value) {
            addCriterion("AKA052 <", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052LessThanOrEqualTo(String value) {
            addCriterion("AKA052 <=", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052Like(String value) {
            addCriterion("AKA052 like", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052NotLike(String value) {
            addCriterion("AKA052 not like", value, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052In(List<String> values) {
            addCriterion("AKA052 in", values, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052NotIn(List<String> values) {
            addCriterion("AKA052 not in", values, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052Between(String value1, String value2) {
            addCriterion("AKA052 between", value1, value2, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka052NotBetween(String value1, String value2) {
            addCriterion("AKA052 not between", value1, value2, "aka052");
            return (Criteria) this;
        }

        public Criteria andAka063IsNull() {
            addCriterion("AKA063 is null");
            return (Criteria) this;
        }

        public Criteria andAka063IsNotNull() {
            addCriterion("AKA063 is not null");
            return (Criteria) this;
        }

        public Criteria andAka063EqualTo(String value) {
            addCriterion("AKA063 =", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063NotEqualTo(String value) {
            addCriterion("AKA063 <>", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063GreaterThan(String value) {
            addCriterion("AKA063 >", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063GreaterThanOrEqualTo(String value) {
            addCriterion("AKA063 >=", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063LessThan(String value) {
            addCriterion("AKA063 <", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063LessThanOrEqualTo(String value) {
            addCriterion("AKA063 <=", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063Like(String value) {
            addCriterion("AKA063 like", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063NotLike(String value) {
            addCriterion("AKA063 not like", value, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063In(List<String> values) {
            addCriterion("AKA063 in", values, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063NotIn(List<String> values) {
            addCriterion("AKA063 not in", values, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063Between(String value1, String value2) {
            addCriterion("AKA063 between", value1, value2, "aka063");
            return (Criteria) this;
        }

        public Criteria andAka063NotBetween(String value1, String value2) {
            addCriterion("AKA063 not between", value1, value2, "aka063");
            return (Criteria) this;
        }

        public Criteria andAac004IsNull() {
            addCriterion("AAC004 is null");
            return (Criteria) this;
        }

        public Criteria andAac004IsNotNull() {
            addCriterion("AAC004 is not null");
            return (Criteria) this;
        }

        public Criteria andAac004EqualTo(String value) {
            addCriterion("AAC004 =", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotEqualTo(String value) {
            addCriterion("AAC004 <>", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004GreaterThan(String value) {
            addCriterion("AAC004 >", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004GreaterThanOrEqualTo(String value) {
            addCriterion("AAC004 >=", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004LessThan(String value) {
            addCriterion("AAC004 <", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004LessThanOrEqualTo(String value) {
            addCriterion("AAC004 <=", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004Like(String value) {
            addCriterion("AAC004 like", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotLike(String value) {
            addCriterion("AAC004 not like", value, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004In(List<String> values) {
            addCriterion("AAC004 in", values, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotIn(List<String> values) {
            addCriterion("AAC004 not in", values, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004Between(String value1, String value2) {
            addCriterion("AAC004 between", value1, value2, "aac004");
            return (Criteria) this;
        }

        public Criteria andAac004NotBetween(String value1, String value2) {
            addCriterion("AAC004 not between", value1, value2, "aac004");
            return (Criteria) this;
        }

        public Criteria andAka065IsNull() {
            addCriterion("AKA065 is null");
            return (Criteria) this;
        }

        public Criteria andAka065IsNotNull() {
            addCriterion("AKA065 is not null");
            return (Criteria) this;
        }

        public Criteria andAka065EqualTo(String value) {
            addCriterion("AKA065 =", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotEqualTo(String value) {
            addCriterion("AKA065 <>", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065GreaterThan(String value) {
            addCriterion("AKA065 >", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065GreaterThanOrEqualTo(String value) {
            addCriterion("AKA065 >=", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065LessThan(String value) {
            addCriterion("AKA065 <", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065LessThanOrEqualTo(String value) {
            addCriterion("AKA065 <=", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065Like(String value) {
            addCriterion("AKA065 like", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotLike(String value) {
            addCriterion("AKA065 not like", value, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065In(List<String> values) {
            addCriterion("AKA065 in", values, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotIn(List<String> values) {
            addCriterion("AKA065 not in", values, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065Between(String value1, String value2) {
            addCriterion("AKA065 between", value1, value2, "aka065");
            return (Criteria) this;
        }

        public Criteria andAka065NotBetween(String value1, String value2) {
            addCriterion("AKA065 not between", value1, value2, "aka065");
            return (Criteria) this;
        }

        public Criteria andAke003IsNull() {
            addCriterion("AKE003 is null");
            return (Criteria) this;
        }

        public Criteria andAke003IsNotNull() {
            addCriterion("AKE003 is not null");
            return (Criteria) this;
        }

        public Criteria andAke003EqualTo(String value) {
            addCriterion("AKE003 =", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003NotEqualTo(String value) {
            addCriterion("AKE003 <>", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003GreaterThan(String value) {
            addCriterion("AKE003 >", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003GreaterThanOrEqualTo(String value) {
            addCriterion("AKE003 >=", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003LessThan(String value) {
            addCriterion("AKE003 <", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003LessThanOrEqualTo(String value) {
            addCriterion("AKE003 <=", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003Like(String value) {
            addCriterion("AKE003 like", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003NotLike(String value) {
            addCriterion("AKE003 not like", value, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003In(List<String> values) {
            addCriterion("AKE003 in", values, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003NotIn(List<String> values) {
            addCriterion("AKE003 not in", values, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003Between(String value1, String value2) {
            addCriterion("AKE003 between", value1, value2, "ake003");
            return (Criteria) this;
        }

        public Criteria andAke003NotBetween(String value1, String value2) {
            addCriterion("AKE003 not between", value1, value2, "ake003");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("BATCH_NO =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("BATCH_NO <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("BATCH_NO >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NO >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("BATCH_NO <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NO <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("BATCH_NO like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("BATCH_NO not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("BATCH_NO in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("BATCH_NO not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("BATCH_NO between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("BATCH_NO not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNull() {
            addCriterion("REMOVED is null");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNotNull() {
            addCriterion("REMOVED is not null");
            return (Criteria) this;
        }

        public Criteria andRemovedEqualTo(String value) {
            addCriterion("REMOVED =", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotEqualTo(String value) {
            addCriterion("REMOVED <>", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThan(String value) {
            addCriterion("REMOVED >", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThanOrEqualTo(String value) {
            addCriterion("REMOVED >=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThan(String value) {
            addCriterion("REMOVED <", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThanOrEqualTo(String value) {
            addCriterion("REMOVED <=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLike(String value) {
            addCriterion("REMOVED like", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotLike(String value) {
            addCriterion("REMOVED not like", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedIn(List<String> values) {
            addCriterion("REMOVED in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotIn(List<String> values) {
            addCriterion("REMOVED not in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedBetween(String value1, String value2) {
            addCriterion("REMOVED between", value1, value2, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotBetween(String value1, String value2) {
            addCriterion("REMOVED not between", value1, value2, "removed");
            return (Criteria) this;
        }
    }

    /**
     */
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