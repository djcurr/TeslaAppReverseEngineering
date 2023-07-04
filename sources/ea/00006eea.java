package freemarker.ext.beans;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
final class z extends m {

    /* renamed from: a  reason: collision with root package name */
    private final Member f27009a;

    /* renamed from: b  reason: collision with root package name */
    final Class[] f27010b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Method method, Class[] clsArr) {
        this.f27009a = method;
        this.f27010b = clsArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // freemarker.ext.beans.m
    public Class[] a() {
        return this.f27010b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return ex.a.f(this.f27009a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Constructor constructor, Class[] clsArr) {
        this.f27009a = constructor;
        this.f27010b = clsArr;
    }
}