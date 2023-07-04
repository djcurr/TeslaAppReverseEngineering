package w2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n2.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f55408b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final e f55409c = new e(0);

    /* renamed from: d  reason: collision with root package name */
    private static final e f55410d = new e(1);

    /* renamed from: e  reason: collision with root package name */
    private static final e f55411e = new e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f55412a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(List<e> decorations) {
            s.g(decorations, "decorations");
            Integer num = 0;
            int size = decorations.size();
            for (int i11 = 0; i11 < size; i11++) {
                num = Integer.valueOf(decorations.get(i11).e() | num.intValue());
            }
            return new e(num.intValue());
        }

        public final e b() {
            return e.f55411e;
        }

        public final e c() {
            return e.f55409c;
        }

        public final e d() {
            return e.f55410d;
        }
    }

    public e(int i11) {
        this.f55412a = i11;
    }

    public final boolean d(e other) {
        s.g(other, "other");
        int i11 = this.f55412a;
        return (other.f55412a | i11) == i11;
    }

    public final int e() {
        return this.f55412a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f55412a == ((e) obj).f55412a;
    }

    public int hashCode() {
        return this.f55412a;
    }

    public String toString() {
        if (this.f55412a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f55412a & f55410d.f55412a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f55412a & f55411e.f55412a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return s.p("TextDecoration.", arrayList.get(0));
        }
        return "TextDecoration[" + u.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}