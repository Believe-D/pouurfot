package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PotGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PotGradeExample() {
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

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Long value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Long value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Long value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Long value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Long value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Long> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Long> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Long value1, Long value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Long value1, Long value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNull() {
            addCriterion("student_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNotNull() {
            addCriterion("student_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumEqualTo(Integer value) {
            addCriterion("student_num =", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotEqualTo(Integer value) {
            addCriterion("student_num <>", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThan(Integer value) {
            addCriterion("student_num >", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_num >=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThan(Integer value) {
            addCriterion("student_num <", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("student_num <=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumIn(List<Integer> values) {
            addCriterion("student_num in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotIn(List<Integer> values) {
            addCriterion("student_num not in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("student_num between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("student_num not between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andUsualGradeIsNull() {
            addCriterion("usual_grade is null");
            return (Criteria) this;
        }

        public Criteria andUsualGradeIsNotNull() {
            addCriterion("usual_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUsualGradeEqualTo(Integer value) {
            addCriterion("usual_grade =", value, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeNotEqualTo(Integer value) {
            addCriterion("usual_grade <>", value, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeGreaterThan(Integer value) {
            addCriterion("usual_grade >", value, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usual_grade >=", value, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeLessThan(Integer value) {
            addCriterion("usual_grade <", value, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeLessThanOrEqualTo(Integer value) {
            addCriterion("usual_grade <=", value, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeIn(List<Integer> values) {
            addCriterion("usual_grade in", values, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeNotIn(List<Integer> values) {
            addCriterion("usual_grade not in", values, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeBetween(Integer value1, Integer value2) {
            addCriterion("usual_grade between", value1, value2, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("usual_grade not between", value1, value2, "usualGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeIsNull() {
            addCriterion("term_grade is null");
            return (Criteria) this;
        }

        public Criteria andTermGradeIsNotNull() {
            addCriterion("term_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTermGradeEqualTo(Integer value) {
            addCriterion("term_grade =", value, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeNotEqualTo(Integer value) {
            addCriterion("term_grade <>", value, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeGreaterThan(Integer value) {
            addCriterion("term_grade >", value, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_grade >=", value, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeLessThan(Integer value) {
            addCriterion("term_grade <", value, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeLessThanOrEqualTo(Integer value) {
            addCriterion("term_grade <=", value, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeIn(List<Integer> values) {
            addCriterion("term_grade in", values, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeNotIn(List<Integer> values) {
            addCriterion("term_grade not in", values, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeBetween(Integer value1, Integer value2) {
            addCriterion("term_grade between", value1, value2, "termGrade");
            return (Criteria) this;
        }

        public Criteria andTermGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("term_grade not between", value1, value2, "termGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIsNull() {
            addCriterion("final_grade is null");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIsNotNull() {
            addCriterion("final_grade is not null");
            return (Criteria) this;
        }

        public Criteria andFinalGradeEqualTo(Integer value) {
            addCriterion("final_grade =", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotEqualTo(Integer value) {
            addCriterion("final_grade <>", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeGreaterThan(Integer value) {
            addCriterion("final_grade >", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_grade >=", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeLessThan(Integer value) {
            addCriterion("final_grade <", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeLessThanOrEqualTo(Integer value) {
            addCriterion("final_grade <=", value, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeIn(List<Integer> values) {
            addCriterion("final_grade in", values, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotIn(List<Integer> values) {
            addCriterion("final_grade not in", values, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeBetween(Integer value1, Integer value2) {
            addCriterion("final_grade between", value1, value2, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andFinalGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("final_grade not between", value1, value2, "finalGrade");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentIsNull() {
            addCriterion("usual_grade_percent is null");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentIsNotNull() {
            addCriterion("usual_grade_percent is not null");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentEqualTo(Integer value) {
            addCriterion("usual_grade_percent =", value, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentNotEqualTo(Integer value) {
            addCriterion("usual_grade_percent <>", value, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentGreaterThan(Integer value) {
            addCriterion("usual_grade_percent >", value, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("usual_grade_percent >=", value, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentLessThan(Integer value) {
            addCriterion("usual_grade_percent <", value, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentLessThanOrEqualTo(Integer value) {
            addCriterion("usual_grade_percent <=", value, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentIn(List<Integer> values) {
            addCriterion("usual_grade_percent in", values, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentNotIn(List<Integer> values) {
            addCriterion("usual_grade_percent not in", values, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentBetween(Integer value1, Integer value2) {
            addCriterion("usual_grade_percent between", value1, value2, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andUsualGradePercentNotBetween(Integer value1, Integer value2) {
            addCriterion("usual_grade_percent not between", value1, value2, "usualGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentIsNull() {
            addCriterion("term_grade_percent is null");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentIsNotNull() {
            addCriterion("term_grade_percent is not null");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentEqualTo(Integer value) {
            addCriterion("term_grade_percent =", value, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentNotEqualTo(Integer value) {
            addCriterion("term_grade_percent <>", value, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentGreaterThan(Integer value) {
            addCriterion("term_grade_percent >", value, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("term_grade_percent >=", value, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentLessThan(Integer value) {
            addCriterion("term_grade_percent <", value, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentLessThanOrEqualTo(Integer value) {
            addCriterion("term_grade_percent <=", value, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentIn(List<Integer> values) {
            addCriterion("term_grade_percent in", values, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentNotIn(List<Integer> values) {
            addCriterion("term_grade_percent not in", values, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentBetween(Integer value1, Integer value2) {
            addCriterion("term_grade_percent between", value1, value2, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andTermGradePercentNotBetween(Integer value1, Integer value2) {
            addCriterion("term_grade_percent not between", value1, value2, "termGradePercent");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterion("input_date =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterion("input_date <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterion("input_date >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("input_date >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterion("input_date <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterion("input_date <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterion("input_date in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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