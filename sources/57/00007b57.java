package j7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        private final int f33275a;

        public a(int i11, boolean z11) {
            super(null);
            this.f33275a = i11;
        }

        public final int b() {
            return this.f33275a;
        }

        public a(int i11) {
            this(i11, false);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33276a = new b();

        private b() {
            super(null);
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return this instanceof b;
    }
}