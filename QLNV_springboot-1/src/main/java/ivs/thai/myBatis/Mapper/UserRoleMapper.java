package ivs.thai.myBatis.Mapper;

import ivs.thai.model.UserRole;
import ivs.thai.model.UserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	long countByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int deleteByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int insert(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int insertSelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	List<UserRole> selectByExample(UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	UserRole selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByPrimaryKeySelective(UserRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByPrimaryKey(UserRole record);

	void setUserRoleInfo(@Param("param") UserRole userRole);
}