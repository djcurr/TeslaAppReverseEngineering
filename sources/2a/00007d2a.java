package k20;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class r extends b1 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f34313d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final b1 f34314b;

    /* renamed from: c  reason: collision with root package name */
    private final b1 f34315c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b1 a(b1 first, b1 second) {
            kotlin.jvm.internal.s.g(first, "first");
            kotlin.jvm.internal.s.g(second, "second");
            return first.f() ? second : second.f() ? first : new r(first, second, null);
        }
    }

    private r(b1 b1Var, b1 b1Var2) {
        this.f34314b = b1Var;
        this.f34315c = b1Var2;
    }

    public /* synthetic */ r(b1 b1Var, b1 b1Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(b1Var, b1Var2);
    }

    public static final b1 i(b1 b1Var, b1 b1Var2) {
        return f34313d.a(b1Var, b1Var2);
    }

    @Override // k20.b1
    public boolean a() {
        return this.f34314b.a() || this.f34315c.a();
    }

    @Override // k20.b1
    public boolean b() {
        return this.f34314b.b() || this.f34315c.b();
    }

    @Override // k20.b1
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations) {
        kotlin.jvm.internal.s.g(annotations, "annotations");
        return this.f34315c.d(this.f34314b.d(annotations));
    }

    @Override // k20.b1
    public y0 e(d0 key) {
        kotlin.jvm.internal.s.g(key, "key");
        y0 e11 = this.f34314b.e(key);
        return e11 == null ? this.f34315c.e(key) : e11;
    }

    @Override // k20.b1
    public boolean f() {
        return false;
    }

    @Override // k20.b1
    public d0 g(d0 topLevelType, k1 position) {
        kotlin.jvm.internal.s.g(topLevelType, "topLevelType");
        kotlin.jvm.internal.s.g(position, "position");
        return this.f34315c.g(this.f34314b.g(topLevelType, position), position);
    }
}