package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5058a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a f5059b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f5058a = obj;
        this.f5059b = d.f5120c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.s
    public void g(v vVar, p.b bVar) {
        this.f5059b.a(vVar, bVar, this.f5058a);
    }
}