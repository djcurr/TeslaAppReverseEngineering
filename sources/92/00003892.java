package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import ql.b;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f16436a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Context f16437b;

    /* renamed from: c  reason: collision with root package name */
    private final sm.b<sl.a> f16438c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, sm.b<sl.a> bVar) {
        this.f16437b = context;
        this.f16438c = bVar;
    }

    protected b a(String str) {
        return new b(this.f16437b, this.f16438c, str);
    }

    public synchronized b b(String str) {
        if (!this.f16436a.containsKey(str)) {
            this.f16436a.put(str, a(str));
        }
        return this.f16436a.get(str);
    }
}