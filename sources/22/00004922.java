package com.reactcommunity.rndatetimepicker;

import com.facebook.react.bridge.Promise;

/* loaded from: classes2.dex */
public class a {
    public static void a(androidx.fragment.app.h hVar, String str, Promise promise) {
        if (hVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) hVar.getSupportFragmentManager().h0(str);
            boolean z11 = eVar != null;
            if (z11) {
                eVar.dismiss();
            }
            promise.resolve(Boolean.valueOf(z11));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }
}