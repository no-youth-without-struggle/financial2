package com.group8.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;

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

        String username = (String)token.getPrincipal();
        Session session = SecurityUtils.getSubject().getSession();
        Map map = new HashMap();
        map.put("username",username);

        return null;
    }
    /**
     * 为用户授权
     * @param principals
     * @return
     */
}
