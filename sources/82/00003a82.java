package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@KeepForSdk
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f17333a = new HashMap();

    @KeepForSdk
    /* renamed from: com.google.mlkit.vision.common.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0313a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f17334a;

        /* renamed from: b  reason: collision with root package name */
        private final sm.b f17335b;

        /* renamed from: c  reason: collision with root package name */
        private final int f17336c;

        final int a() {
            return this.f17336c;
        }

        final sm.b b() {
            return this.f17335b;
        }

        final Class c() {
            return this.f17334a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C0313a c0313a = (C0313a) it2.next();
            Class c11 = c0313a.c();
            if (!this.f17333a.containsKey(c11) || c0313a.a() >= ((Integer) Preconditions.checkNotNull((Integer) hashMap.get(c11))).intValue()) {
                this.f17333a.put(c11, c0313a.b());
                hashMap.put(c11, Integer.valueOf(c0313a.a()));
            }
        }
    }
}