package io.grpc;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class r {

    /* renamed from: b  reason: collision with root package name */
    static final Logger f31574b = Logger.getLogger(r.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final r f31575c = new r();

    /* renamed from: a  reason: collision with root package name */
    final int f31576a = 0;

    /* loaded from: classes5.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final c f31577a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f31577a = a(atomicReference);
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                r.f31574b.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
            }
        }

        private static c a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e11) {
                atomicReference.set(e11);
                return new i1();
            } catch (Exception e12) {
                throw new RuntimeException("Storage override failed to initialize", e12);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c {
        @Deprecated
        public void a(r rVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract r b();

        public abstract void c(r rVar, r rVar2);

        public r d(r rVar) {
            r b11 = b();
            a(rVar);
            return b11;
        }
    }

    private r() {
        k(0);
    }

    static <T> T d(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static r e() {
        r b11 = j().b();
        return b11 == null ? f31575c : b11;
    }

    static c j() {
        return b.f31577a;
    }

    private static void k(int i11) {
        if (i11 == 1000) {
            f31574b.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public void a(a aVar, Executor executor) {
        d(aVar, "cancellationListener");
        d(executor, "executor");
    }

    public r b() {
        r d11 = j().d(this);
        return d11 == null ? f31575c : d11;
    }

    public Throwable c() {
        return null;
    }

    public void f(r rVar) {
        d(rVar, "toAttach");
        j().c(this, rVar);
    }

    public t g() {
        return null;
    }

    public boolean h() {
        return false;
    }

    public void i(a aVar) {
    }
}