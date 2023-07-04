package p0;

import f2.m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.a;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final b f45346a = new b(null);

    /* loaded from: classes.dex */
    private static final class a extends k {

        /* renamed from: b  reason: collision with root package name */
        public static final a f45347b = new a();

        private a() {
            super(null);
        }

        @Override // p0.k
        public int a(int i11, x2.q layoutDirection, m0 placeable, int i12) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(placeable, "placeable");
            return i11 / 2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(a.b horizontal) {
            kotlin.jvm.internal.s.g(horizontal, "horizontal");
            return new d(horizontal);
        }

        public final k b(a.c vertical) {
            kotlin.jvm.internal.s.g(vertical, "vertical");
            return new f(vertical);
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends k {

        /* renamed from: b  reason: collision with root package name */
        public static final c f45348b = new c();

        private c() {
            super(null);
        }

        @Override // p0.k
        public int a(int i11, x2.q layoutDirection, m0 placeable, int i12) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(placeable, "placeable");
            if (layoutDirection == x2.q.Ltr) {
                return i11;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends k {

        /* renamed from: b  reason: collision with root package name */
        private final a.b f45349b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a.b horizontal) {
            super(null);
            kotlin.jvm.internal.s.g(horizontal, "horizontal");
            this.f45349b = horizontal;
        }

        @Override // p0.k
        public int a(int i11, x2.q layoutDirection, m0 placeable, int i12) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(placeable, "placeable");
            return this.f45349b.a(0, i11, layoutDirection);
        }
    }

    /* loaded from: classes.dex */
    private static final class e extends k {

        /* renamed from: b  reason: collision with root package name */
        public static final e f45350b = new e();

        private e() {
            super(null);
        }

        @Override // p0.k
        public int a(int i11, x2.q layoutDirection, m0 placeable, int i12) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(placeable, "placeable");
            if (layoutDirection == x2.q.Ltr) {
                return 0;
            }
            return i11;
        }
    }

    /* loaded from: classes.dex */
    private static final class f extends k {

        /* renamed from: b  reason: collision with root package name */
        private final a.c f45351b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a.c vertical) {
            super(null);
            kotlin.jvm.internal.s.g(vertical, "vertical");
            this.f45351b = vertical;
        }

        @Override // p0.k
        public int a(int i11, x2.q layoutDirection, m0 placeable, int i12) {
            kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.s.g(placeable, "placeable");
            return this.f45351b.a(0, i11);
        }
    }

    static {
        a aVar = a.f45347b;
        e eVar = e.f45350b;
        c cVar = c.f45348b;
    }

    private k() {
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int i11, x2.q qVar, m0 m0Var, int i12);

    public Integer b(m0 placeable) {
        kotlin.jvm.internal.s.g(placeable, "placeable");
        return null;
    }

    public boolean c() {
        return false;
    }
}