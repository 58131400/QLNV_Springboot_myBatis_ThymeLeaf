package ivs.thai.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
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

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNull() {
			addCriterion("username is null");
			return (Criteria) this;
		}

		public Criteria andUsernameIsNotNull() {
			addCriterion("username is not null");
			return (Criteria) this;
		}

		public Criteria andUsernameEqualTo(String value) {
			addCriterion("username =", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotEqualTo(String value) {
			addCriterion("username <>", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThan(String value) {
			addCriterion("username >", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameGreaterThanOrEqualTo(String value) {
			addCriterion("username >=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThan(String value) {
			addCriterion("username <", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLessThanOrEqualTo(String value) {
			addCriterion("username <=", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameLike(String value) {
			addCriterion("username like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotLike(String value) {
			addCriterion("username not like", value, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameIn(List<String> values) {
			addCriterion("username in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotIn(List<String> values) {
			addCriterion("username not in", values, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameBetween(String value1, String value2) {
			addCriterion("username between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andUsernameNotBetween(String value1, String value2) {
			addCriterion("username not between", value1, value2, "username");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
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

		public Criteria andEnableIsNull() {
			addCriterion("enable is null");
			return (Criteria) this;
		}

		public Criteria andEnableIsNotNull() {
			addCriterion("enable is not null");
			return (Criteria) this;
		}

		public Criteria andEnableEqualTo(Boolean value) {
			addCriterion("enable =", value, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableNotEqualTo(Boolean value) {
			addCriterion("enable <>", value, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableGreaterThan(Boolean value) {
			addCriterion("enable >", value, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableGreaterThanOrEqualTo(Boolean value) {
			addCriterion("enable >=", value, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableLessThan(Boolean value) {
			addCriterion("enable <", value, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableLessThanOrEqualTo(Boolean value) {
			addCriterion("enable <=", value, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableIn(List<Boolean> values) {
			addCriterion("enable in", values, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableNotIn(List<Boolean> values) {
			addCriterion("enable not in", values, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableBetween(Boolean value1, Boolean value2) {
			addCriterion("enable between", value1, value2, "enable");
			return (Criteria) this;
		}

		public Criteria andEnableNotBetween(Boolean value1, Boolean value2) {
			addCriterion("enable not between", value1, value2, "enable");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbg.generated do_not_delete_during_merge Mon Aug 19 19:15:34 ICT 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}