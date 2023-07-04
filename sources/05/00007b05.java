package j20;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.w;
import vz.b0;

/* loaded from: classes5.dex */
public class f implements j20.n {

    /* renamed from: d  reason: collision with root package name */
    private static final String f33123d;

    /* renamed from: e  reason: collision with root package name */
    public static final j20.n f33124e;

    /* renamed from: a  reason: collision with root package name */
    protected final j20.k f33125a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0609f f33126b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33127c;

    /* loaded from: classes5.dex */
    static class a extends f {
        a(String str, InterfaceC0609f interfaceC0609f, j20.k kVar) {
            super(str, interfaceC0609f, kVar, null);
        }

        private static /* synthetic */ void j(int i11) {
            String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 1 ? 3 : 2];
            if (i11 != 1) {
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i11 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i11 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i11 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // j20.f
        protected <K, V> o<V> p(String str, K k11) {
            if (str == null) {
                j(0);
            }
            o<V> a11 = o.a();
            if (a11 == null) {
                j(1);
            }
            return a11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    class b<T> extends j<T> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f33128d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, f fVar2, h00.a aVar, Object obj) {
            super(fVar2, aVar);
            this.f33128d = obj;
        }

        private static /* synthetic */ void a(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // j20.f.h
        protected o<T> c(boolean z11) {
            o<T> d11 = o.d(this.f33128d);
            if (d11 == null) {
                a(0);
            }
            return d11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    class c<T> extends k<T> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h00.l f33129e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h00.l f33130f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, f fVar2, h00.a aVar, h00.l lVar, h00.l lVar2) {
            super(fVar2, aVar);
            this.f33129e = lVar;
            this.f33130f = lVar2;
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i11 != 2 ? 2 : 3];
            if (i11 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i11 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i11 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // j20.f.h
        protected o<T> c(boolean z11) {
            h00.l lVar = this.f33129e;
            if (lVar == null) {
                o<T> c11 = super.c(z11);
                if (c11 == null) {
                    a(0);
                }
                return c11;
            }
            o<T> d11 = o.d(lVar.invoke(Boolean.valueOf(z11)));
            if (d11 == null) {
                a(1);
            }
            return d11;
        }

        @Override // j20.f.i
        protected void d(T t11) {
            if (t11 == null) {
                a(2);
            }
            this.f33130f.invoke(t11);
        }
    }

    /* loaded from: classes5.dex */
    private static class d<K, V> extends e<K, V> implements j20.a<K, V> {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "computation";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i11 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // j20.f.e, j20.a
        public V a(K k11, h00.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            V v11 = (V) super.a(k11, aVar);
            if (v11 == null) {
                b(3);
            }
            return v11;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class e<K, V> extends l<g<K, V>, V> implements j20.b<K, V> {

        /* loaded from: classes5.dex */
        class a implements h00.l<g<K, V>, V> {
            a() {
            }

            @Override // h00.l
            /* renamed from: a */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f33133b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void b(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i11 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V a(K k11, h00.a<? extends V> aVar) {
            if (aVar == null) {
                b(2);
            }
            return invoke(new g(k11, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
        }
    }

    /* renamed from: j20.f$f  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0609f {

        /* renamed from: a  reason: collision with root package name */
        public static final InterfaceC0609f f33131a = new a();

        /* renamed from: j20.f$f$a */
        /* loaded from: classes5.dex */
        static class a implements InterfaceC0609f {
            a() {
            }

            private static /* synthetic */ void b(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // j20.f.InterfaceC0609f
            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw s20.c.b(th2);
            }
        }

        RuntimeException a(Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class g<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final K f33132a;

        /* renamed from: b  reason: collision with root package name */
        private final h00.a<? extends V> f33133b;

        public g(K k11, h00.a<? extends V> aVar) {
            this.f33132a = k11;
            this.f33133b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && g.class == obj.getClass() && this.f33132a.equals(((g) obj).f33132a);
        }

        public int hashCode() {
            return this.f33132a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class h<T> implements j20.j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final f f33134a;

        /* renamed from: b  reason: collision with root package name */
        private final h00.a<? extends T> f33135b;

        /* renamed from: c  reason: collision with root package name */
        private volatile Object f33136c;

        public h(f fVar, h00.a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f33136c = n.NOT_COMPUTED;
            this.f33134a = fVar;
            this.f33135b = aVar;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 2 || i11 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 2 || i11 == 3) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 == 2 || i11 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i11 != 2 && i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public boolean a0() {
            return (this.f33136c == n.NOT_COMPUTED || this.f33136c == n.COMPUTING) ? false : true;
        }

        protected void b(T t11) {
        }

        protected o<T> c(boolean z11) {
            o<T> p11 = this.f33134a.p("in a lazy value", null);
            if (p11 == null) {
                a(2);
            }
            return p11;
        }

        @Override // h00.a
        public T invoke() {
            T invoke;
            Object obj = this.f33136c;
            if (obj instanceof n) {
                this.f33134a.f33125a.lock();
                try {
                    Object obj2 = this.f33136c;
                    if (obj2 instanceof n) {
                        n nVar = n.COMPUTING;
                        if (obj2 == nVar) {
                            this.f33136c = n.RECURSION_WAS_DETECTED;
                            o<T> c11 = c(true);
                            if (!c11.c()) {
                                invoke = c11.b();
                            }
                        }
                        if (obj2 == n.RECURSION_WAS_DETECTED) {
                            o<T> c12 = c(false);
                            if (!c12.c()) {
                                invoke = c12.b();
                            }
                        }
                        this.f33136c = nVar;
                        invoke = this.f33135b.invoke();
                        b(invoke);
                        this.f33136c = invoke;
                    } else {
                        invoke = (T) WrappedValues.f(obj2);
                    }
                    return invoke;
                } finally {
                    this.f33134a.f33125a.unlock();
                }
            }
            return (T) WrappedValues.f(obj);
        }
    }

    /* loaded from: classes5.dex */
    private static abstract class i<T> extends h<T> {

        /* renamed from: d  reason: collision with root package name */
        private volatile j20.l<T> f33137d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, h00.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
            this.f33137d = null;
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // j20.f.h
        protected final void b(T t11) {
            this.f33137d = new j20.l<>(t11);
            try {
                d(t11);
            } finally {
                this.f33137d = null;
            }
        }

        protected abstract void d(T t11);

        @Override // j20.f.h, h00.a
        public T invoke() {
            j20.l<T> lVar = this.f33137d;
            if (lVar != null && lVar.b()) {
                return lVar.a();
            }
            return (T) super.invoke();
        }
    }

    /* loaded from: classes5.dex */
    private static class j<T> extends h<T> implements j20.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, h00.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // j20.f.h, h00.a
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                a(2);
            }
            return t11;
        }
    }

    /* loaded from: classes5.dex */
    private static abstract class k<T> extends i<T> implements j20.i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, h00.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
            }
            if (aVar == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // j20.f.i, j20.f.h, h00.a
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                a(2);
            }
            return t11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class l<K, V> implements j20.h<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final f f33138a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<K, Object> f33139b;

        /* renamed from: c  reason: collision with root package name */
        private final h00.l<? super K, ? extends V> f33140c;

        public l(f fVar, ConcurrentMap<K, Object> concurrentMap, h00.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
            this.f33138a = fVar;
            this.f33139b = concurrentMap;
            this.f33140c = lVar;
        }

        private static /* synthetic */ void b(int i11) {
            String str = (i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 3 || i11 == 4) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 == 3 || i11 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        private AssertionError c(K k11, Object obj) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + k11 + ". Old value is " + obj + " under " + this.f33138a));
            if (assertionError == null) {
                b(4);
            }
            return assertionError;
        }

        protected o<V> d(K k11, boolean z11) {
            o<V> p11 = this.f33138a.p("", k11);
            if (p11 == null) {
                b(3);
            }
            return p11;
        }

        @Override // j20.h
        public boolean e0(K k11) {
            Object obj = this.f33139b.get(k11);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        @Override // h00.l
        public V invoke(K k11) {
            V v11;
            Object obj = this.f33139b.get(k11);
            if (obj == null || obj == n.COMPUTING) {
                this.f33138a.f33125a.lock();
                try {
                    Object obj2 = this.f33139b.get(k11);
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        obj2 = n.RECURSION_WAS_DETECTED;
                        o<V> d11 = d(k11, true);
                        if (!d11.c()) {
                            v11 = d11.b();
                            return v11;
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o<V> d12 = d(k11, false);
                        if (!d12.c()) {
                            v11 = d12.b();
                            return v11;
                        }
                    }
                    if (obj2 != null) {
                        v11 = (V) WrappedValues.d(obj2);
                        return v11;
                    }
                    this.f33139b.put(k11, nVar);
                    V invoke = this.f33140c.invoke(k11);
                    Object put = this.f33139b.put(k11, WrappedValues.b(invoke));
                    if (put == nVar) {
                        return invoke;
                    }
                    throw c(k11, put);
                } finally {
                    this.f33138a.f33125a.unlock();
                }
            }
            return (V) WrappedValues.d(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class m<K, V> extends l<K, V> implements j20.g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap<K, Object> concurrentMap, h00.l<? super K, ? extends V> lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                b(0);
            }
            if (concurrentMap == null) {
                b(1);
            }
            if (lVar == null) {
                b(2);
            }
        }

        private static /* synthetic */ void b(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // j20.f.l, h00.l
        public V invoke(K k11) {
            V v11 = (V) super.invoke(k11);
            if (v11 == null) {
                b(3);
            }
            return v11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class o<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f33141a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f33142b;

        private o(T t11, boolean z11) {
            this.f33141a = t11;
            this.f33142b = z11;
        }

        public static <T> o<T> a() {
            return new o<>(null, true);
        }

        public static <T> o<T> d(T t11) {
            return new o<>(t11, false);
        }

        public T b() {
            return this.f33141a;
        }

        public boolean c() {
            return this.f33142b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f33141a);
        }
    }

    static {
        String Z0;
        Z0 = w.Z0(f.class.getCanonicalName(), ".", "");
        f33123d = Z0;
        f33124e = new a("NO_LOCKS", InterfaceC0609f.f33131a, j20.e.f33122b);
    }

    /* synthetic */ f(String str, InterfaceC0609f interfaceC0609f, j20.k kVar, a aVar) {
        this(str, interfaceC0609f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j20.f.j(int):void");
    }

    static /* synthetic */ InterfaceC0609f k(f fVar) {
        return fVar.f33126b;
    }

    private static <K> ConcurrentMap<K, Object> m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Throwable> T q(T t11) {
        if (t11 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            } else if (!stackTrace[i12].getClassName().startsWith(f33123d)) {
                i11 = i12;
                break;
            } else {
                i12++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i11, length);
        t11.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t11;
    }

    @Override // j20.n
    public <T> T a(h00.a<? extends T> aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f33125a.lock();
        try {
            return aVar.invoke();
        } finally {
        }
    }

    @Override // j20.n
    public <T> j20.i<T> b(h00.a<? extends T> aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // j20.n
    public <K, V> j20.a<K, V> c() {
        return new d(this, m(), null);
    }

    @Override // j20.n
    public <T> j20.i<T> d(h00.a<? extends T> aVar, h00.l<? super Boolean, ? extends T> lVar, h00.l<? super T, b0> lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, this, aVar, lVar, lVar2);
    }

    @Override // j20.n
    public <K, V> j20.g<K, V> e(h00.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(9);
        }
        j20.g<K, V> n11 = n(lVar, m());
        if (n11 == null) {
            j(10);
        }
        return n11;
    }

    @Override // j20.n
    public <T> j20.i<T> f(h00.a<? extends T> aVar, T t11) {
        if (aVar == null) {
            j(26);
        }
        if (t11 == null) {
            j(27);
        }
        return new b(this, this, aVar, t11);
    }

    @Override // j20.n
    public <K, V> j20.b<K, V> g() {
        return new e(this, m(), null);
    }

    @Override // j20.n
    public <K, V> j20.h<K, V> h(h00.l<? super K, ? extends V> lVar) {
        if (lVar == null) {
            j(19);
        }
        j20.h<K, V> o11 = o(lVar, m());
        if (o11 == null) {
            j(20);
        }
        return o11;
    }

    @Override // j20.n
    public <T> j20.j<T> i(h00.a<? extends T> aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    public <K, V> j20.g<K, V> n(h00.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public <K, V> j20.h<K, V> o(h00.l<? super K, ? extends V> lVar, ConcurrentMap<K, Object> concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    protected <K, V> o<V> p(String str, K k11) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k11 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k11;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f33127c + ")";
    }

    private f(String str, InterfaceC0609f interfaceC0609f, j20.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0609f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f33125a = kVar;
        this.f33126b = interfaceC0609f;
        this.f33127c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (h00.l<InterruptedException, b0>) null);
    }

    public f(String str, Runnable runnable, h00.l<InterruptedException, b0> lVar) {
        this(str, InterfaceC0609f.f33131a, j20.k.f33143a.a(runnable, lVar));
    }
}