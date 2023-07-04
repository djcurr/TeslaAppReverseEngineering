package com.ijzerenhein.sharedelement;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a */
    private final Map<Integer, f> f17779a = new HashMap();

    /* renamed from: b */
    private com.facebook.react.uimanager.m f17780b;

    /* renamed from: c */
    private final Context f17781c;

    public g(Context context) {
        this.f17781c = context;
    }

    public f a(int i11, View view, boolean z11, View view2, ReadableMap readableMap) {
        synchronized (this.f17779a) {
            f fVar = this.f17779a.get(Integer.valueOf(i11));
            if (fVar != null) {
                fVar.h();
                return fVar;
            }
            f fVar2 = new f(this.f17781c, i11, view, z11, view2, readableMap);
            this.f17779a.put(Integer.valueOf(i11), fVar2);
            return fVar2;
        }
    }

    public com.facebook.react.uimanager.m b() {
        return this.f17780b;
    }

    public int c(f fVar) {
        int o11;
        synchronized (this.f17779a) {
            o11 = fVar.o();
            if (o11 == 0) {
                this.f17779a.remove(Integer.valueOf(fVar.l()));
            }
        }
        return o11;
    }

    public void d(com.facebook.react.uimanager.m mVar) {
        this.f17780b = mVar;
    }
}