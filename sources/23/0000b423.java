package t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class m0 {

    /* loaded from: classes.dex */
    public static final class a extends m0 {

        /* renamed from: a  reason: collision with root package name */
        private final q0 f51465a;

        public final q0 a() {
            return this.f51465a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f51465a, ((a) obj).f51465a);
        }

        public int hashCode() {
            return this.f51465a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends m0 {

        /* renamed from: a  reason: collision with root package name */
        private final s1.h f51466a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s1.h rect) {
            super(null);
            kotlin.jvm.internal.s.g(rect, "rect");
            this.f51466a = rect;
        }

        public final s1.h a() {
            return this.f51466a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.s.c(this.f51466a, ((b) obj).f51466a);
        }

        public int hashCode() {
            return this.f51466a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends m0 {

        /* renamed from: a  reason: collision with root package name */
        private final s1.j f51467a;

        /* renamed from: b  reason: collision with root package name */
        private final q0 f51468b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s1.j roundRect) {
            super(null);
            kotlin.jvm.internal.s.g(roundRect, "roundRect");
            q0 q0Var = null;
            this.f51467a = roundRect;
            if (!n0.a(roundRect)) {
                q0Var = n.a();
                q0Var.j(a());
            }
            this.f51468b = q0Var;
        }

        public final s1.j a() {
            return this.f51467a;
        }

        public final q0 b() {
            return this.f51468b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f51467a, ((c) obj).f51467a);
        }

        public int hashCode() {
            return this.f51467a.hashCode();
        }
    }

    private m0() {
    }

    public /* synthetic */ m0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}