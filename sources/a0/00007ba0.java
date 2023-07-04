package jf;

import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import qd.a;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final a.c f33466a;

    /* renamed from: jf.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0614a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kf.a f33467a;

        C0614a(a aVar, kf.a aVar2) {
            this.f33467a = aVar2;
        }

        @Override // qd.a.c
        public void a(SharedReference<Object> sharedReference, Throwable th2) {
            this.f33467a.a(sharedReference, th2);
            Object f11 = sharedReference.f();
            nd.a.I("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), f11 != null ? f11.getClass().getName() : "<value is null>", a.d(th2));
        }

        @Override // qd.a.c
        public boolean b() {
            return this.f33467a.b();
        }
    }

    public a(kf.a aVar) {
        this.f33466a = new C0614a(this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public <U extends Closeable> qd.a<U> b(U u11) {
        return qd.a.t0(u11, this.f33466a);
    }

    public <T> qd.a<T> c(T t11, qd.h<T> hVar) {
        return qd.a.D0(t11, hVar, this.f33466a);
    }
}