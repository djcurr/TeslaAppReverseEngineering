package r10;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import p10.n;
import p10.r;
import p10.v;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f49063f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final b f49064a;

    /* renamed from: b  reason: collision with root package name */
    private final v.d f49065b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlin.a f49066c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f49067d;

    /* renamed from: e  reason: collision with root package name */
    private final String f49068e;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: r10.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public /* synthetic */ class C1070a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f49069a;

            static {
                int[] iArr = new int[v.c.values().length];
                iArr[v.c.WARNING.ordinal()] = 1;
                iArr[v.c.ERROR.ordinal()] = 2;
                iArr[v.c.HIDDEN.ordinal()] = 3;
                f49069a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<h> a(o proto, c nameResolver, i table) {
            List<Integer> ids;
            s.g(proto, "proto");
            s.g(nameResolver, "nameResolver");
            s.g(table, "table");
            if (proto instanceof p10.c) {
                ids = ((p10.c) proto).I0();
            } else if (proto instanceof p10.d) {
                ids = ((p10.d) proto).I();
            } else if (proto instanceof p10.i) {
                ids = ((p10.i) proto).d0();
            } else if (proto instanceof n) {
                ids = ((n) proto).a0();
            } else if (!(proto instanceof r)) {
                throw new IllegalStateException(s.p("Unexpected declaration: ", proto.getClass()));
            } else {
                ids = ((r) proto).X();
            }
            s.f(ids, "ids");
            ArrayList arrayList = new ArrayList();
            for (Integer id2 : ids) {
                a aVar = h.f49063f;
                s.f(id2, "id");
                h b11 = aVar.b(id2.intValue(), nameResolver, table);
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            return arrayList;
        }

        public final h b(int i11, c nameResolver, i table) {
            kotlin.a aVar;
            s.g(nameResolver, "nameResolver");
            s.g(table, "table");
            v b11 = table.b(i11);
            if (b11 == null) {
                return null;
            }
            b a11 = b.f49070d.a(b11.E() ? Integer.valueOf(b11.x()) : null, b11.F() ? Integer.valueOf(b11.y()) : null);
            v.c v11 = b11.v();
            s.e(v11);
            int i12 = C1070a.f49069a[v11.ordinal()];
            if (i12 == 1) {
                aVar = kotlin.a.WARNING;
            } else if (i12 == 2) {
                aVar = kotlin.a.ERROR;
            } else if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                aVar = kotlin.a.HIDDEN;
            }
            kotlin.a aVar2 = aVar;
            Integer valueOf = b11.A() ? Integer.valueOf(b11.u()) : null;
            String string = b11.C() ? nameResolver.getString(b11.w()) : null;
            v.d z11 = b11.z();
            s.f(z11, "info.versionKind");
            return new h(a11, z11, aVar2, valueOf, string);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        public static final a f49070d = new a(null);

        /* renamed from: e  reason: collision with root package name */
        public static final b f49071e = new b(256, 256, 256);

        /* renamed from: a  reason: collision with root package name */
        private final int f49072a;

        /* renamed from: b  reason: collision with root package name */
        private final int f49073b;

        /* renamed from: c  reason: collision with root package name */
        private final int f49074c;

        /* loaded from: classes5.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(Integer num, Integer num2) {
                if (num2 != null) {
                    return new b(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                if (num != null) {
                    return new b(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
                }
                return b.f49071e;
            }
        }

        public b(int i11, int i12, int i13) {
            this.f49072a = i11;
            this.f49073b = i12;
            this.f49074c = i13;
        }

        public final String a() {
            StringBuilder sb2;
            int i11;
            if (this.f49074c == 0) {
                sb2 = new StringBuilder();
                sb2.append(this.f49072a);
                sb2.append(CoreConstants.DOT);
                i11 = this.f49073b;
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.f49072a);
                sb2.append(CoreConstants.DOT);
                sb2.append(this.f49073b);
                sb2.append(CoreConstants.DOT);
                i11 = this.f49074c;
            }
            sb2.append(i11);
            return sb2.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f49072a == bVar.f49072a && this.f49073b == bVar.f49073b && this.f49074c == bVar.f49074c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f49072a * 31) + this.f49073b) * 31) + this.f49074c;
        }

        public String toString() {
            return a();
        }

        public /* synthetic */ b(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, i12, (i14 & 4) != 0 ? 0 : i13);
        }
    }

    public h(b version, v.d kind, kotlin.a level, Integer num, String str) {
        s.g(version, "version");
        s.g(kind, "kind");
        s.g(level, "level");
        this.f49064a = version;
        this.f49065b = kind;
        this.f49066c = level;
        this.f49067d = num;
        this.f49068e = str;
    }

    public final v.d a() {
        return this.f49065b;
    }

    public final b b() {
        return this.f49064a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("since ");
        sb2.append(this.f49064a);
        sb2.append(' ');
        sb2.append(this.f49066c);
        Integer num = this.f49067d;
        sb2.append(num != null ? s.p(" error ", num) : "");
        String str = this.f49068e;
        sb2.append(str != null ? s.p(": ", str) : "");
        return sb2.toString();
    }
}