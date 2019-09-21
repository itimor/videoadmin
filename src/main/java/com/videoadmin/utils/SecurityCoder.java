/**
 * 2011-01-11
 */
package com.videoadmin.utils;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * 加密基类
 * 
 * @author ShenHuaJie
 * @version 1.0
 * @since 1.0
 */
public abstract class SecurityCoder {
    private static Byte ADDFLAG = 0;
    static {
        if (ADDFLAG == 0) {
            // 加入BouncyCastleProvider支持
            Security.addProvider(new BouncyCastleProvider());
            ADDFLAG = 1;
        }
    }
}
