package com.xtgh.module.Core;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

import de.robv.android.xposed.XC_MethodReplacement;

public class Hooks {
    private final ClassLoader classLoader;

    public Hooks(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }
    public void T965_P109() {
        String className = "org.telegram.tgnet.ConnectionsManager";
        universalNativeHook(className);
        // Unlock Premium
        TelegramHooks.setFalse(classLoader, "org.telegram.messenger.cw0", "B");
        // Anti Forward Restriction
        TelegramHooks.setFalse(classLoader, "org.telegram.messenger.ha0", "P9");
    }

    public void T843_P97() {
        String className = "org.telegram.tgnet.ConnectionsManager";
        String chatActivity = "org.telegram.ui.wh";
        String addSponsoredMessages = "Re";
        universalNativeHook(className);
        TelegramHooks.setNull(classLoader, chatActivity, addSponsoredMessages);
    }

    public void T842_P96() {
        String className = "org.telegram.tgnet.ConnectionsManager";
        String chatActivity = "org.telegram.ui.k02";
        String addSponsoredMessages = "Da";
        universalNativeHook(className);
        TelegramHooks.setNull(classLoader, chatActivity, addSponsoredMessages);
    }

    public void T831_P95() {
        String className = "org.telegram.tgnet.ConnectionsManager";
        String chatActivity = "org.telegram.ui.ChatActivity";
        String addSponsoredMessages = "ya";
        universalNativeHook(className);
        TelegramHooks.setNull(classLoader, chatActivity, addSponsoredMessages);
    }

    public void T827_P94() {
        String className = "org.telegram.tgnet.ConnectionsManager";
        String chatActivity = "org.telegram.ui.rw1";
        String addSponsoredMessages = "ra";
        universalNativeHook(className);
        TelegramHooks.setNull(classLoader, chatActivity, addSponsoredMessages);
    }

    public void T812_P93() {
        String className = "org.telegram.messenger.eh0";
        String chatActivity = "org.telegram.ui.jw1";
        String addSponsoredMessages = "la";
        universalHook(className);
        TelegramHooks.setNull(classLoader, chatActivity, addSponsoredMessages);
    }

    public void T800_P921_T800_P92() {
        String className = "org.telegram.messenger.og0";
        String chatActivity = "org.telegram.ui.wv1";
        String addSponsoredMessages = "M9";
        universalHook(className);
        TelegramHooks.setNull(classLoader, chatActivity, addSponsoredMessages);
    }

    public void T793_P912_T793_P911_T791_P91() {
        String className = "org.telegram.messenger.ig0";
        universalHook(className);
    }

    public void T782_P903_T781_P902() {
        String className = "org.telegram.messenger.hg0";
        universalHook(className);
    }

    public void T780_P90_T780_P901() {
        String className = "org.telegram.messenger.bg0";
        universalHook(className);
    }

    public void T772_P89() {
        String className = "org.telegram.messenger.jf0";
        universalHook(className);
    }

    public void T772_P891_T772_P892_T772_P893() {
        String className = "org.telegram.messenger.mf0";
        universalHook(className);
    }

    public void T760_P88_T760_P881_T760_P882_T760_P883() {
        String className = "org.telegram.messenger.kf0";
        universalHook(className);
    }

    private void universalHook(String className) {
        try {
            findAndHookMethod(className, classLoader, "a", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return false;
                }
            });
            findAndHookMethod(className, classLoader, "f", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return 999;
                }
            });
            findAndHookMethod(className, classLoader, "i", int.class, new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return true;
                }
            });
            findAndHookMethod(className, classLoader, "j", int.class, new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return true;
                }
            });
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private void universalNativeHook(String className) {
        try {
            findAndHookMethod(className, classLoader, "native_expireFile", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return false;
                }
            });
            findAndHookMethod(className, classLoader, "native_daysFile", new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return 999;
                }
            });
            findAndHookMethod(className, classLoader, "native_removeInstance", long.class, new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return true;
                }
            });
            findAndHookMethod(className, classLoader, "native_checkLicense", long.class, new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return true;
                }
            });
            findAndHookMethod(className, classLoader, "native_checkNewFile", long.class, new XC_MethodReplacement() {
                @Override
                protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                    return true;
                }
            });
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
