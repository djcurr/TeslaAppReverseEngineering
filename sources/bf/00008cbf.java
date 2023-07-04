package nr;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.r0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final a f41814c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final vz.k f41815a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.k f41816b;

    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: nr.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0815a extends kotlin.jvm.internal.u implements h00.a<Map<or.k, ? extends m>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ okio.h f41817a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0815a(okio.h hVar) {
                super(0);
                this.f41817a = hVar;
            }

            @Override // h00.a
            public final Map<or.k, ? extends m> invoke() {
                Map d11;
                Map<or.k, ? extends m> b11;
                int readInt = this.f41817a.readInt();
                okio.h hVar = this.f41817a;
                d11 = r0.d(readInt);
                if (readInt > 0) {
                    int i11 = 0;
                    do {
                        i11++;
                        d11.put(or.k.f42991c.a(j.a(hVar)), m.f41814c.a(j.a(hVar)));
                    } while (i11 < readInt);
                    b11 = r0.b(d11);
                    return b11;
                }
                b11 = r0.b(d11);
                return b11;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(okio.i bytes) {
            kotlin.jvm.internal.s.g(bytes, "bytes");
            okio.f w12 = new okio.f().w1(bytes);
            return new m(i.f41802c.b(j.a(w12)), new C0815a(w12));
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f41818a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.f41818a = iVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final i invoke() {
            i iVar = this.f41818a;
            if (iVar != null) {
                if (!(iVar.b().z() == 0)) {
                    return iVar;
                }
            }
            return null;
        }
    }

    public m(i iVar, h00.a<? extends Map<or.k, m>> childTreeSnapshots) {
        vz.k b11;
        vz.k b12;
        kotlin.jvm.internal.s.g(childTreeSnapshots, "childTreeSnapshots");
        kotlin.b bVar = kotlin.b.NONE;
        b11 = vz.m.b(bVar, new b(iVar));
        this.f41815a = b11;
        b12 = vz.m.b(bVar, childTreeSnapshots);
        this.f41816b = b12;
    }

    public final Map<or.k, m> a() {
        return (Map) this.f41816b.getValue();
    }

    public final i b() {
        return (i) this.f41815a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okio.i c() {
        /*
            r7 = this;
            okio.f r0 = new okio.f
            r0.<init>()
            nr.i r1 = r7.b()
            r2 = 0
            if (r1 != 0) goto Le
            r1 = r2
            goto L12
        Le:
            okio.i r1 = r1.b()
        L12:
            if (r1 != 0) goto L16
            okio.i r1 = okio.i.f42656d
        L16:
            nr.j.c(r0, r1)
            java.util.Map r1 = r7.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            or.k r5 = (or.k) r5
            java.lang.Object r4 = r4.getValue()
            nr.m r4 = (nr.m) r4
            okio.i r5 = r5.d()
            if (r5 != 0) goto L4a
        L48:
            r6 = r2
            goto L63
        L4a:
            okio.i r4 = r4.c()
            int r6 = r4.z()
            if (r6 != 0) goto L56
            r6 = 1
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 != 0) goto L5a
            goto L5b
        L5a:
            r4 = r2
        L5b:
            if (r4 != 0) goto L5e
            goto L48
        L5e:
            vz.p r6 = new vz.p
            r6.<init>(r5, r4)
        L63:
            if (r6 == 0) goto L2a
            r3.add(r6)
            goto L2a
        L69:
            int r1 = r3.size()
            r0.x(r1)
            java.util.Iterator r1 = r3.iterator()
        L74:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.next()
            vz.p r2 = (vz.p) r2
            java.lang.Object r3 = r2.a()
            okio.i r3 = (okio.i) r3
            java.lang.Object r2 = r2.b()
            okio.i r2 = (okio.i) r2
            nr.j.c(r0, r3)
            nr.j.c(r0, r2)
            goto L74
        L93:
            okio.i r0 = r0.j1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.m.c():okio.i");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (!kotlin.jvm.internal.s.c(mVar.b(), b()) || !kotlin.jvm.internal.s.c(mVar.a(), a())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        i b11 = b();
        return ((b11 != null ? b11.hashCode() : 0) * 31) + a().hashCode();
    }
}