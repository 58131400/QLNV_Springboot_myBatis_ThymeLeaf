package ivs.thai.service;



import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ivs.thai.domain.user.UserPrincipal;
import ivs.thai.model.AppRole;
import ivs.thai.model.User;
import ivs.thai.model.UserRole;
import ivs.thai.myBatis.Mapper.AppRoleMapper;
import ivs.thai.myBatis.Mapper.UserMapper;
import ivs.thai.myBatis.Mapper.UserRoleMapper;

@Service
public class UserService implements UserDetailsService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private AppRoleMapper roleMapper;
	@Autowired
	private UserRoleMapper userRoleMapper;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public User findUserByUsername(String username) throws IOException  {

			User user= userMapper.findUserByUsername(username);
			
		return user;
		
	}
	public void saveUser(User user){
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setEnable(true);
		
		
		
			userMapper.setUserInfo(user);
	
		
		AppRole role= roleMapper.getRoleInfo("ROLE_USER");
		
		UserRole userRole = new UserRole(); 
		userRole.setRoleId(role.getRoleId()); 
		userRole.setUserId(user.getUserId()); 

		userRoleMapper.setUserRoleInfo(userRole);	
		}
		
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
			
			
			User user = userMapper.findUserByUsername(username);
			
			if (user == null) {
	            throw new UsernameNotFoundException(username);
	        }
		return new UserPrincipal(user);
		
		
		
		
	}

}
