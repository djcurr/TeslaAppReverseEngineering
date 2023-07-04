package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f10483a;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, Object> f10484a = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        public f b() {
            return new f(this);
        }
    }

    f(a aVar) {
        this.f10483a = Collections.unmodifiableMap(new HashMap(aVar.f10484a));
    }

    public boolean a(Class<Object> cls) {
        return this.f10483a.containsKey(cls);
    }
}