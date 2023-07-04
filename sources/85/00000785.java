package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f5215a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5216b;

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: d  reason: collision with root package name */
        public static final C0088a f5217d = new C0088a(null);

        /* renamed from: e  reason: collision with root package name */
        private static a f5218e;

        /* renamed from: c  reason: collision with root package name */
        private final Application f5219c;

        /* renamed from: androidx.lifecycle.s0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0088a {
            private C0088a() {
            }

            public /* synthetic */ C0088a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(u0 owner) {
                kotlin.jvm.internal.s.g(owner, "owner");
                if (owner instanceof o) {
                    b defaultViewModelProviderFactory = ((o) owner).getDefaultViewModelProviderFactory();
                    kotlin.jvm.internal.s.f(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
                return d.f5220a.a();
            }

            public final a b(Application application) {
                kotlin.jvm.internal.s.g(application, "application");
                if (a.f5218e == null) {
                    a.f5218e = new a(application);
                }
                a aVar = a.f5218e;
                kotlin.jvm.internal.s.e(aVar);
                return aVar;
            }
        }

        public a(Application application) {
            kotlin.jvm.internal.s.g(application, "application");
            this.f5219c = application;
        }

        public static final a f(Application application) {
            return f5217d.b(application);
        }

        @Override // androidx.lifecycle.s0.d, androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            if (androidx.lifecycle.b.class.isAssignableFrom(modelClass)) {
                try {
                    T newInstance = modelClass.getConstructor(Application.class).newInstance(this.f5219c);
                    kotlin.jvm.internal.s.f(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException(kotlin.jvm.internal.s.p("Cannot create an instance of ", modelClass), e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException(kotlin.jvm.internal.s.p("Cannot create an instance of ", modelClass), e12);
                } catch (NoSuchMethodException e13) {
                    throw new RuntimeException(kotlin.jvm.internal.s.p("Cannot create an instance of ", modelClass), e13);
                } catch (InvocationTargetException e14) {
                    throw new RuntimeException(kotlin.jvm.internal.s.p("Cannot create an instance of ", modelClass), e14);
                }
            }
            return (T) super.create(modelClass);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        <T extends p0> T create(Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static abstract class c extends e implements b {
        public <T extends p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementations of KeyedFactory");
        }

        public abstract <T extends p0> T create(String str, Class<T> cls);
    }

    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5220a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        private static d f5221b;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f5221b == null) {
                    d.f5221b = new d();
                }
                d dVar = d.f5221b;
                kotlin.jvm.internal.s.e(dVar);
                return dVar;
            }
        }

        public static final d c() {
            return f5220a.a();
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            kotlin.jvm.internal.s.g(modelClass, "modelClass");
            try {
                T newInstance = modelClass.newInstance();
                kotlin.jvm.internal.s.f(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(kotlin.jvm.internal.s.p("Cannot create an instance of ", modelClass), e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(kotlin.jvm.internal.s.p("Cannot create an instance of ", modelClass), e12);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public void onRequery(p0 viewModel) {
            kotlin.jvm.internal.s.g(viewModel, "viewModel");
        }
    }

    public s0(t0 store, b factory) {
        kotlin.jvm.internal.s.g(store, "store");
        kotlin.jvm.internal.s.g(factory, "factory");
        this.f5215a = store;
        this.f5216b = factory;
    }

    public <T extends p0> T a(Class<T> modelClass) {
        kotlin.jvm.internal.s.g(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(kotlin.jvm.internal.s.p("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName), modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends p0> T b(String key, Class<T> modelClass) {
        T viewModel;
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(modelClass, "modelClass");
        T viewModel2 = (T) this.f5215a.b(key);
        if (modelClass.isInstance(viewModel2)) {
            b bVar = this.f5216b;
            e eVar = bVar instanceof e ? (e) bVar : null;
            if (eVar != null) {
                kotlin.jvm.internal.s.f(viewModel2, "viewModel");
                eVar.onRequery(viewModel2);
            }
            Objects.requireNonNull(viewModel2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return viewModel2;
        }
        b bVar2 = this.f5216b;
        if (bVar2 instanceof c) {
            viewModel = (T) ((c) bVar2).create(key, modelClass);
        } else {
            viewModel = (T) bVar2.create(modelClass);
        }
        this.f5215a.d(key, viewModel);
        kotlin.jvm.internal.s.f(viewModel, "viewModel");
        return viewModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s0(androidx.lifecycle.u0 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.s.g(r3, r0)
            androidx.lifecycle.t0 r0 = r3.getViewModelStore()
            java.lang.String r1 = "owner.viewModelStore"
            kotlin.jvm.internal.s.f(r0, r1)
            androidx.lifecycle.s0$a$a r1 = androidx.lifecycle.s0.a.f5217d
            androidx.lifecycle.s0$b r3 = r1.a(r3)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.s0.<init>(androidx.lifecycle.u0):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s0(androidx.lifecycle.u0 r2, androidx.lifecycle.s0.b r3) {
        /*
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.s.g(r3, r0)
            androidx.lifecycle.t0 r2 = r2.getViewModelStore()
            java.lang.String r0 = "owner.viewModelStore"
            kotlin.jvm.internal.s.f(r2, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.s0.<init>(androidx.lifecycle.u0, androidx.lifecycle.s0$b):void");
    }
}