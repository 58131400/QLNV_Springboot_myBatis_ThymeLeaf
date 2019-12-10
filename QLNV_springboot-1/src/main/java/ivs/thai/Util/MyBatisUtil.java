package ivs.thai.Util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		Reader reader;
		try {
			reader = Resources.getResourceAsReader("SqlMapConfig2.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}catch (IOException e) {
            e.printStackTrace();
        }
	}
	 public static SqlSessionFactory getSqlSessionFactory() {
	        return sqlSessionFactory;
	    }
}
