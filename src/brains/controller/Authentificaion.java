
/*
package brains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import brains.accounts.api.AccountData;
import brains.accounts.dao.AccountsOrm;
import brains.accounts.entities.Account;

@Configuration
public class Authentificaion implements UserDetailsService {
	
	@Autowired
	AccountsOrm accounts;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accounts.getAccount(username);
		if (account == null) {
			throw new UsernameNotFoundException("User is not found");
		}
		return new User(username, account.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
	}

	
}

*/