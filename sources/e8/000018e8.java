package com.facebook.react.modules.i18nmanager;

import android.os.Build;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import fg.a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import yf.c;

@a(name = I18nManagerModule.NAME)
/* loaded from: classes3.dex */
public class I18nManagerModule extends NativeI18nManagerSpec {
    public static final String NAME = "I18nManager";
    private final jg.a sharedI18nUtilInstance;

    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.sharedI18nUtilInstance = jg.a.d();
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean z11) {
        this.sharedI18nUtilInstance.a(getReactApplicationContext(), z11);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean z11) {
        this.sharedI18nUtilInstance.c(getReactApplicationContext(), z11);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public Map<String, Object> getTypedExportedConstants() {
        Locale locale;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = reactApplicationContext.getResources().getConfiguration().locale;
        }
        HashMap b11 = c.b();
        b11.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.g(reactApplicationContext)));
        b11.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.b(reactApplicationContext)));
        b11.put("localeIdentifier", locale.toString());
        return b11;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean z11) {
        this.sharedI18nUtilInstance.k(getReactApplicationContext(), z11);
    }
}