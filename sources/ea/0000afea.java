package r10;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import p10.v;
import p10.w;
import wz.u;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49075b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final i f49076c;

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f49077a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(w table) {
            s.g(table, "table");
            if (table.p() == 0) {
                return b();
            }
            List<v> q11 = table.q();
            s.f(q11, "table.requirementList");
            return new i(q11, null);
        }

        public final i b() {
            return i.f49076c;
        }
    }

    static {
        List i11;
        i11 = wz.w.i();
        f49076c = new i(i11);
    }

    private i(List<v> list) {
        this.f49077a = list;
    }

    public /* synthetic */ i(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public final v b(int i11) {
        return (v) u.e0(this.f49077a, i11);
    }
}