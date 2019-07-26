package com.group8.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AuthRealm extends AuthorizingRealm implements Serializable {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = (String) token.getPrincipal();

        String password = getPasswordByusername(username);
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);

        if (password == "" || password == null) {
            return null;
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password, credentialsSalt, getName());
        return info;
    }

    private String getPasswordByusername(String username) {
        return null;
    }
}
/**
 * 为用户授权
 *
 * @param principals
 * @return
 */

