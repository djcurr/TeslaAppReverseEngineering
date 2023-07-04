package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public class a implements b {
    @Override // com.facebook.react.devsupport.b
    public bg.d a(Context context, g gVar, String str, boolean z11, h hVar, bg.a aVar, int i11, Map<String, Object> map, yf.h hVar2) {
        if (!z11) {
            return new c();
        }
        try {
            return (bg.d) Class.forName("com.facebook.react.devsupport.BridgeDevSupportManager").getConstructor(Context.class, g.class, String.class, Boolean.TYPE, h.class, bg.a.class, Integer.TYPE, Map.class, yf.h.class).newInstance(context, gVar, str, Boolean.TRUE, hVar, aVar, Integer.valueOf(i11), map, hVar2);
        } catch (Exception e11) {
            throw new RuntimeException("Requested enabled DevSupportManager, but BridgeDevSupportManager class was not found or could not be created", e11);
        }
    }
}