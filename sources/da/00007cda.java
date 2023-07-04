package k20;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b1 f34222a;

    /* loaded from: classes5.dex */
    public static final class a extends b1 {
        a() {
        }

        @Override // k20.b1
        public /* bridge */ /* synthetic */ y0 e(d0 d0Var) {
            return (y0) i(d0Var);
        }

        @Override // k20.b1
        public boolean f() {
            return true;
        }

        public Void i(d0 key) {
            kotlin.jvm.internal.s.g(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends b1 {
        c() {
        }

        @Override // k20.b1
        public boolean a() {
            return false;
        }

        @Override // k20.b1
        public boolean b() {
            return false;
        }

        @Override // k20.b1
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
            kotlin.jvm.internal.s.g(annotations, "annotations");
            return b1.this.d(annotations);
        }

        @Override // k20.b1
        public y0 e(d0 key) {
            kotlin.jvm.internal.s.g(key, "key");
            return b1.this.e(key);
        }

        @Override // k20.b1
        public boolean f() {
            return b1.this.f();
        }

        @Override // k20.b1
        public d0 g(d0 topLevelType, k1 position) {
            kotlin.jvm.internal.s.g(topLevelType, "topLevelType");
            kotlin.jvm.internal.s.g(position, "position");
            return b1.this.g(topLevelType, position);
        }
    }

    static {
        new b(null);
        f34222a = new a();
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final d1 c() {
        d1 g11 = d1.g(this);
        kotlin.jvm.internal.s.f(g11, "create(this)");
        return g11;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        kotlin.jvm.internal.s.g(annotations, "annotations");
        return annotations;
    }

    public abstract y0 e(d0 d0Var);

    public boolean f() {
        return false;
    }

    public d0 g(d0 topLevelType, k1 position) {
        kotlin.jvm.internal.s.g(topLevelType, "topLevelType");
        kotlin.jvm.internal.s.g(position, "position");
        return topLevelType;
    }

    public final b1 h() {
        return new c();
    }
}