package ivs.thai.domain.user;

import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import ivs.thai.Util.MyBatisUtil;
import ivs.thai.myBatis.Mapper.AppRoleMapper;


public class UserGrant implements GrantedAuthority {

	

	//trả về role admin hay user
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth ==null) return null;
		UserPrincipal userPrincipal =  (UserPrincipal)auth.getPrincipal();
		System.out.println(userPrincipal.getUsername());
		
//		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		String username = userPrincipal.getUsername();
	
		AppRoleMapper approlemapper =  session.getMapper(AppRoleMapper.class);
		try {
			
			
			Set<Integer> roles = approlemapper.findRoleByUsername(username);
			
			for (int i = 0; i < roles.size(); i++) {
				if(roles.contains(1))
					return "ROLE_ADMIN";
			}
			return "ROLE_USER";	
		}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
			
				
		return null;
		
		
		 
		
	}

}
