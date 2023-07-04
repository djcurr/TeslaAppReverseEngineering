package freemarker.ext.beans;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private final x f26987a;

    /* renamed from: b  reason: collision with root package name */
    private x f26988b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f26989c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(boolean z11) {
        this.f26989c = z11;
        this.f26987a = new v(z11);
    }

    private void a(z zVar) {
        this.f26987a.a(zVar);
        if (zVar.b()) {
            if (this.f26988b == null) {
                this.f26988b = new y(this.f26989c);
            }
            this.f26988b.a(zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Constructor constructor) {
        a(new z(constructor, constructor.getParameterTypes()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Method method) {
        a(new z(method, method.getParameterTypes()));
    }
}