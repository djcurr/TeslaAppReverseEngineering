package com.reactnativecommunity.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.CompoundButton;
import androidx.appcompat.widget.r0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;

/* loaded from: classes2.dex */
public class ReactCheckBoxManager extends SimpleViewManager<com.reactnativecommunity.checkbox.a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    private static final String REACT_CLASS = "AndroidCheckBox";

    /* loaded from: classes2.dex */
    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        private ReactContext a(CompoundButton compoundButton) {
            Context context = compoundButton.getContext();
            if (context instanceof r0) {
                return (ReactContext) ((r0) context).getBaseContext();
            }
            return (ReactContext) compoundButton.getContext();
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            ((UIManagerModule) a(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new b(compoundButton.getId(), z11));
        }
    }

    private static int getIdentifier(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    private static int getThemeColor(Context context, String str) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(getIdentifier(context, str), typedValue, true);
        return typedValue.data;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.reactnativecommunity.checkbox.a aVar, boolean z11) {
        aVar.setEnabled(z11);
    }

    @ng.a(name = "on")
    public void setOn(com.reactnativecommunity.checkbox.a aVar, boolean z11) {
        aVar.setOnCheckedChangeListener(null);
        aVar.b(z11);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @ng.a(name = "tintColors")
    public void setTintColors(com.reactnativecommunity.checkbox.a aVar, ReadableMap readableMap) {
        androidx.core.widget.c.c(aVar, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{(readableMap == null || !readableMap.hasKey("true")) ? getThemeColor(aVar.getContext(), "colorAccent") : readableMap.getInt("true"), (readableMap == null || !readableMap.hasKey("false")) ? getThemeColor(aVar.getContext(), "colorPrimaryDark") : readableMap.getInt("false")}));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.reactnativecommunity.checkbox.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativecommunity.checkbox.a createViewInstance(n0 n0Var) {
        return new com.reactnativecommunity.checkbox.a(n0Var);
    }
}