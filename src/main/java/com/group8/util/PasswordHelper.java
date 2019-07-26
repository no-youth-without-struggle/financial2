package com.group8.util;

import com.group8.vo.UserLogin;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper {
    private String hashAlgorithmName="MD5";
    private Integer  hashIterations=1024;

    public void encryptPassword(UserLogin use){
        //原始密码
        String source= use.getPassword();
        //盐
        ByteSource credentialsSalt= ByteSource.Util.bytes(use.getUsername());
        String credentials= new SimpleHash(hashAlgorithmName, source, credentialsSalt,hashIterations ).toHex();
        //设置加密后的密码
        use.setPassword(credentials);
    }
}
