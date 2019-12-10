package ivs.thai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ThanhtichKiluatExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public ThanhtichKiluatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
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

        public Criteria andManvIsNull() {
            addCriterion("manv is null");
            return (Criteria) this;
        }

        public Criteria andManvIsNotNull() {
            addCriterion("manv is not null");
            return (Criteria) this;
        }

        public Criteria andManvEqualTo(String value) {
            addCriterion("manv =", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvNotEqualTo(String value) {
            addCriterion("manv <>", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvGreaterThan(String value) {
            addCriterion("manv >", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvGreaterThanOrEqualTo(String value) {
            addCriterion("manv >=", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvLessThan(String value) {
            addCriterion("manv <", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvLessThanOrEqualTo(String value) {
            addCriterion("manv <=", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvLike(String value) {
            addCriterion("manv like", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvNotLike(String value) {
            addCriterion("manv not like", value, "manv");
            return (Criteria) this;
        }

        public Criteria andManvIn(List<String> values) {
            addCriterion("manv in", values, "manv");
            return (Criteria) this;
        }

        public Criteria andManvNotIn(List<String> values) {
            addCriterion("manv not in", values, "manv");
            return (Criteria) this;
        }

        public Criteria andManvBetween(String value1, String value2) {
            addCriterion("manv between", value1, value2, "manv");
            return (Criteria) this;
        }

        public Criteria andManvNotBetween(String value1, String value2) {
            addCriterion("manv not between", value1, value2, "manv");
            return (Criteria) this;
        }

        public Criteria andLoaiIsNull() {
            addCriterion("loai is null");
            return (Criteria) this;
        }

        public Criteria andLoaiIsNotNull() {
            addCriterion("loai is not null");
            return (Criteria) this;
        }

        public Criteria andLoaiEqualTo(Boolean value) {
            addCriterion("loai =", value, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiNotEqualTo(Boolean value) {
            addCriterion("loai <>", value, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiGreaterThan(Boolean value) {
            addCriterion("loai >", value, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("loai >=", value, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiLessThan(Boolean value) {
            addCriterion("loai <", value, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiLessThanOrEqualTo(Boolean value) {
            addCriterion("loai <=", value, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiIn(List<Boolean> values) {
            addCriterion("loai in", values, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiNotIn(List<Boolean> values) {
            addCriterion("loai not in", values, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiBetween(Boolean value1, Boolean value2) {
            addCriterion("loai between", value1, value2, "loai");
            return (Criteria) this;
        }

        public Criteria andLoaiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("loai not between", value1, value2, "loai");
            return (Criteria) this;
        }

        public Criteria andLydoIsNull() {
            addCriterion("lydo is null");
            return (Criteria) this;
        }

        public Criteria andLydoIsNotNull() {
            addCriterion("lydo is not null");
            return (Criteria) this;
        }

        public Criteria andLydoEqualTo(String value) {
            addCriterion("lydo =", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoNotEqualTo(String value) {
            addCriterion("lydo <>", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoGreaterThan(String value) {
            addCriterion("lydo >", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoGreaterThanOrEqualTo(String value) {
            addCriterion("lydo >=", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoLessThan(String value) {
            addCriterion("lydo <", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoLessThanOrEqualTo(String value) {
            addCriterion("lydo <=", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoLike(String value) {
            addCriterion("lydo like", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoNotLike(String value) {
            addCriterion("lydo not like", value, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoIn(List<String> values) {
            addCriterion("lydo in", values, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoNotIn(List<String> values) {
            addCriterion("lydo not in", values, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoBetween(String value1, String value2) {
            addCriterion("lydo between", value1, value2, "lydo");
            return (Criteria) this;
        }

        public Criteria andLydoNotBetween(String value1, String value2) {
            addCriterion("lydo not between", value1, value2, "lydo");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanIsNull() {
            addCriterion("ngayghinhan is null");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanIsNotNull() {
            addCriterion("ngayghinhan is not null");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanEqualTo(Date value) {
            addCriterionForJDBCDate("ngayghinhan =", value, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanNotEqualTo(Date value) {
            addCriterionForJDBCDate("ngayghinhan <>", value, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanGreaterThan(Date value) {
            addCriterionForJDBCDate("ngayghinhan >", value, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngayghinhan >=", value, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanLessThan(Date value) {
            addCriterionForJDBCDate("ngayghinhan <", value, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngayghinhan <=", value, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanIn(List<Date> values) {
            addCriterionForJDBCDate("ngayghinhan in", values, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanNotIn(List<Date> values) {
            addCriterionForJDBCDate("ngayghinhan not in", values, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngayghinhan between", value1, value2, "ngayghinhan");
            return (Criteria) this;
        }

        public Criteria andNgayghinhanNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngayghinhan not between", value1, value2, "ngayghinhan");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 21 20:05:14 ICT 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table thanhtich_kiluat
     *
     * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
     */
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