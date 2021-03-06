package ivs.thai.myBatis.Mapper;

import ivs.thai.model.ThanhtichKiluat;
import ivs.thai.model.ThanhtichKiluatExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;



public interface ThanhtichKiluatMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table thanhtich_kiluat
	 *
	 * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
	 */
	long countByExample(ThanhtichKiluatExample example);

	
	int deleteByExample(ThanhtichKiluatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table thanhtich_kiluat
	 *
	 * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table thanhtich_kiluat
	 *
	 * @mbg.generated Wed Aug 21 20:05:14 ICT 2019
	 */
	int insert(ThanhtichKiluat record);

	
	int insertSelective(ThanhtichKiluat record);

	
	
	List<ThanhtichKiluat> selectByExample(ThanhtichKiluatExample example);

	
	
	ThanhtichKiluat selectByPrimaryKey(Integer id);

	
	int updateByExampleSelective(@Param("record") ThanhtichKiluat record,
			@Param("example") ThanhtichKiluatExample example);

	int updateByExample(@Param("record") ThanhtichKiluat record, @Param("example") ThanhtichKiluatExample example);

	
	int updateByPrimaryKeySelective(ThanhtichKiluat record);

	
	int updateByPrimaryKey(ThanhtichKiluat record);
	ThanhtichKiluat selectByMaNV(String manv);
	
	public List<Map<String, Object>> getThanhTichNV(@Param("manv") String manv);
	
	
}