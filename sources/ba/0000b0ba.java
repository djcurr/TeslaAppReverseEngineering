package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.c;
import retrofit2.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class p {

    /* renamed from: c  reason: collision with root package name */
    private static final p f49477c = e();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f49478a;

    /* renamed from: b  reason: collision with root package name */
    private final Constructor<MethodHandles.Lookup> f49479b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends p {

        /* renamed from: retrofit2.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class ExecutorC1081a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            private final Handler f49480a = new Handler(Looper.getMainLooper());

            ExecutorC1081a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f49480a.post(runnable);
            }
        }

        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.p
        public Executor b() {
            return new ExecutorC1081a();
        }

        @Override // retrofit2.p
        Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    p(boolean z11) {
        this.f49478a = z11;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z11) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f49479b = constructor;
    }

    private static p e() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new a();
        }
        return new p(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p f() {
        return f49477c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends c.a> a(Executor executor) {
        g gVar = new g(executor);
        return this.f49478a ? Arrays.asList(e.f49375a, gVar) : Collections.singletonList(gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Executor b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<? extends f.a> c() {
        return this.f49478a ? Collections.singletonList(n.f49430a) : Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f49478a ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object g(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f49479b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(Method method) {
        return this.f49478a && method.isDefault();
    }
}