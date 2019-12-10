package ivs.thai.myBatis.Mapper;

import ivs.thai.model.AppRole;
import ivs.thai.model.AppRoleExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface AppRoleMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	long countByExample(AppRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int deleteByExample(AppRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int deleteByPrimaryKey(Integer roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int insert(AppRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int insertSelective(AppRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	List<AppRole> selectByExample(AppRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	AppRole selectByPrimaryKey(Integer roleId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByExampleSelective(@Param("record") AppRole record, @Param("example") AppRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByExample(@Param("record") AppRole record, @Param("example") AppRoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByPrimaryKeySelective(AppRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_role
	 * @mbg.generated  Wed Aug 21 20:05:14 ICT 2019
	 */
	int updateByPrimaryKey(AppRole record);

	AppRole getRoleInfo(@Param("role_name")String role);
	Set<Integer> findRoleByUsername(@Param("username") String username);
}