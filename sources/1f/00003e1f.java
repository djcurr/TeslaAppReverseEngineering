package com.henninghall.date_picker;

import android.widget.LinearLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
public class DatePickerManager extends SimpleViewManager<g> {
    private static final String REACT_CLASS = "DatePickerManager";
    private static final int SCROLL = 1;

    private ng.b getMethodAnnotation(String str) {
        Method[] methods;
        Method method = null;
        for (Method method2 : getClass().getMethods()) {
            if (method2.getName().equals(str)) {
                method = method2;
            }
        }
        return (ng.b) method.getAnnotation(ng.b.class);
    }

    private void updateProp(String str, g gVar, int i11, Dynamic dynamic) {
        gVar.d(getMethodAnnotation(str).names()[i11], dynamic);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.d("scroll", 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        return yf.c.a().b("dateChange", yf.c.d("phasedRegistrationNames", yf.c.d("bubbled", "onChange"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.b(names = {"date", "mode", "locale", "maximumDate", "minimumDate", "fadeToColor", "textColor", "timezoneOffsetInMinutes", "minuteInterval", "androidVariant", "dividerHeight", "is24hourSource"})
    public void setProps(g gVar, int i11, Dynamic dynamic) {
        updateProp("setProps", gVar, i11, dynamic);
    }

    @ng.b(customType = "Style", names = {Snapshot.HEIGHT})
    public void setStyle(g gVar, int i11, Dynamic dynamic) {
        updateProp("setStyle", gVar, i11, dynamic);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(n0 n0Var) {
        return new g(new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(g gVar) {
        super.onAfterUpdateTransaction((DatePickerManager) gVar);
        try {
            gVar.c();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            gVar.b(readableArray.getInt(0), readableArray.getInt(1));
        }
    }
}