package com.xtgh.module.Core;

import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XposedHelpers;

public class TelegramHooks {
    public static void removeSponsoredMessages(ClassLoader classLoader, String className, String methodName) {
        try {
            XposedHelpers.findAndHookMethod(className, classLoader, methodName, boolean.class, new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return null;
                }
            });
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
