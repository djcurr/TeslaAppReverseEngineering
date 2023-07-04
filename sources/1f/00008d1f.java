package nx;

import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.e0;
import okio.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final okio.i f41939a = okio.i.f(":");

    /* renamed from: b  reason: collision with root package name */
    private static final d[] f41940b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<okio.i, Integer> f41941c;

    /* loaded from: classes5.dex */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f41942a;

        /* renamed from: b  reason: collision with root package name */
        private final okio.h f41943b;

        /* renamed from: c  reason: collision with root package name */
        private int f41944c;

        /* renamed from: d  reason: collision with root package name */
        private int f41945d;

        /* renamed from: e  reason: collision with root package name */
        d[] f41946e;

        /* renamed from: f  reason: collision with root package name */
        int f41947f;

        /* renamed from: g  reason: collision with root package name */
        int f41948g;

        /* renamed from: h  reason: collision with root package name */
        int f41949h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i11, e0 e0Var) {
            this(i11, i11, e0Var);
        }

        private void a() {
            int i11 = this.f41945d;
            int i12 = this.f41949h;
            if (i11 < i12) {
                if (i11 == 0) {
                    b();
                } else {
                    d(i12 - i11);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f41946e, (Object) null);
            this.f41947f = this.f41946e.length - 1;
            this.f41948g = 0;
            this.f41949h = 0;
        }

        private int c(int i11) {
            return this.f41947f + 1 + i11;
        }

        private int d(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.f41946e.length;
                while (true) {
                    length--;
                    i12 = this.f41947f;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    d[] dVarArr = this.f41946e;
                    i11 -= dVarArr[length].f41938c;
                    this.f41949h -= dVarArr[length].f41938c;
                    this.f41948g--;
                    i13++;
                }
                d[] dVarArr2 = this.f41946e;
                System.arraycopy(dVarArr2, i12 + 1, dVarArr2, i12 + 1 + i13, this.f41948g);
                this.f41947f += i13;
            }
            return i13;
        }

        private okio.i f(int i11) {
            if (i(i11)) {
                return f.f41940b[i11].f41936a;
            }
            int c11 = c(i11 - f.f41940b.length);
            if (c11 >= 0) {
                d[] dVarArr = this.f41946e;
                if (c11 < dVarArr.length) {
                    return dVarArr[c11].f41936a;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        private void h(int i11, d dVar) {
            this.f41942a.add(dVar);
            int i12 = dVar.f41938c;
            if (i11 != -1) {
                i12 -= this.f41946e[c(i11)].f41938c;
            }
            int i13 = this.f41945d;
            if (i12 > i13) {
                b();
                return;
            }
            int d11 = d((this.f41949h + i12) - i13);
            if (i11 == -1) {
                int i14 = this.f41948g + 1;
                d[] dVarArr = this.f41946e;
                if (i14 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f41947f = this.f41946e.length - 1;
                    this.f41946e = dVarArr2;
                }
                int i15 = this.f41947f;
                this.f41947f = i15 - 1;
                this.f41946e[i15] = dVar;
                this.f41948g++;
            } else {
                this.f41946e[i11 + c(i11) + d11] = dVar;
            }
            this.f41949h += i12;
        }

        private boolean i(int i11) {
            return i11 >= 0 && i11 <= f.f41940b.length - 1;
        }

        private int j() {
            return this.f41943b.readByte() & 255;
        }

        private void m(int i11) {
            if (i(i11)) {
                this.f41942a.add(f.f41940b[i11]);
                return;
            }
            int c11 = c(i11 - f.f41940b.length);
            if (c11 >= 0) {
                d[] dVarArr = this.f41946e;
                if (c11 <= dVarArr.length - 1) {
                    this.f41942a.add(dVarArr[c11]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        private void o(int i11) {
            h(-1, new d(f(i11), k()));
        }

        private void p() {
            h(-1, new d(f.e(k()), k()));
        }

        private void q(int i11) {
            this.f41942a.add(new d(f(i11), k()));
        }

        private void r() {
            this.f41942a.add(new d(f.e(k()), k()));
        }

        public List<d> e() {
            ArrayList arrayList = new ArrayList(this.f41942a);
            this.f41942a.clear();
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void g(int i11) {
            this.f41944c = i11;
            this.f41945d = i11;
            a();
        }

        okio.i k() {
            int j11 = j();
            boolean z11 = (j11 & 128) == 128;
            int n11 = n(j11, 127);
            if (z11) {
                return okio.i.s(h.f().c(this.f41943b.i0(n11)));
            }
            return this.f41943b.z0(n11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void l() {
            while (!this.f41943b.N0()) {
                int readByte = this.f41943b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m(n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    p();
                } else if ((readByte & 64) == 64) {
                    o(n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n11 = n(readByte, 31);
                    this.f41945d = n11;
                    if (n11 >= 0 && n11 <= this.f41944c) {
                        a();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f41945d);
                    }
                } else if (readByte != 16 && readByte != 0) {
                    q(n(readByte, 15) - 1);
                } else {
                    r();
                }
            }
        }

        int n(int i11, int i12) {
            int i13 = i11 & i12;
            if (i13 < i12) {
                return i13;
            }
            int i14 = 0;
            while (true) {
                int j11 = j();
                if ((j11 & 128) == 0) {
                    return i12 + (j11 << i14);
                }
                i12 += (j11 & 127) << i14;
                i14 += 7;
            }
        }

        a(int i11, int i12, e0 e0Var) {
            this.f41942a = new ArrayList();
            d[] dVarArr = new d[8];
            this.f41946e = dVarArr;
            this.f41947f = dVarArr.length - 1;
            this.f41948g = 0;
            this.f41949h = 0;
            this.f41944c = i11;
            this.f41945d = i12;
            this.f41943b = r.d(e0Var);
        }
    }

    /* loaded from: classes5.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final okio.f f41950a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f41951b;

        /* renamed from: c  reason: collision with root package name */
        private int f41952c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f41953d;

        /* renamed from: e  reason: collision with root package name */
        private int f41954e;

        /* renamed from: f  reason: collision with root package name */
        d[] f41955f;

        /* renamed from: g  reason: collision with root package name */
        int f41956g;

        /* renamed from: h  reason: collision with root package name */
        private int f41957h;

        /* renamed from: i  reason: collision with root package name */
        private int f41958i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(okio.f fVar) {
            this(4096, false, fVar);
        }

        private void a() {
            Arrays.fill(this.f41955f, (Object) null);
            this.f41957h = this.f41955f.length - 1;
            this.f41956g = 0;
            this.f41958i = 0;
        }

        private int b(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.f41955f.length;
                while (true) {
                    length--;
                    i12 = this.f41957h;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    d[] dVarArr = this.f41955f;
                    i11 -= dVarArr[length].f41938c;
                    this.f41958i -= dVarArr[length].f41938c;
                    this.f41956g--;
                    i13++;
                }
                d[] dVarArr2 = this.f41955f;
                System.arraycopy(dVarArr2, i12 + 1, dVarArr2, i12 + 1 + i13, this.f41956g);
                this.f41957h += i13;
            }
            return i13;
        }

        private void c(d dVar) {
            int i11 = dVar.f41938c;
            int i12 = this.f41954e;
            if (i11 > i12) {
                a();
                return;
            }
            b((this.f41958i + i11) - i12);
            int i13 = this.f41956g + 1;
            d[] dVarArr = this.f41955f;
            if (i13 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f41957h = this.f41955f.length - 1;
                this.f41955f = dVarArr2;
            }
            int i14 = this.f41957h;
            this.f41957h = i14 - 1;
            this.f41955f[i14] = dVar;
            this.f41956g++;
            this.f41958i += i11;
        }

        void d(okio.i iVar) {
            if (this.f41951b && h.f().e(iVar.E()) < iVar.z()) {
                okio.f fVar = new okio.f();
                h.f().d(iVar.E(), fVar.G1());
                okio.i j12 = fVar.j1();
                f(j12.z(), 127, 128);
                this.f41950a.w1(j12);
                return;
            }
            f(iVar.z(), 127, 0);
            this.f41950a.w1(iVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(java.util.List<nx.d> r14) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: nx.f.b.e(java.util.List):void");
        }

        void f(int i11, int i12, int i13) {
            if (i11 < i12) {
                this.f41950a.O0(i11 | i13);
                return;
            }
            this.f41950a.O0(i13 | i12);
            int i14 = i11 - i12;
            while (i14 >= 128) {
                this.f41950a.O0(128 | (i14 & 127));
                i14 >>>= 7;
            }
            this.f41950a.O0(i14);
        }

        b(int i11, boolean z11, okio.f fVar) {
            this.f41952c = Integer.MAX_VALUE;
            d[] dVarArr = new d[8];
            this.f41955f = dVarArr;
            this.f41957h = dVarArr.length - 1;
            this.f41954e = i11;
            this.f41951b = z11;
            this.f41950a = fVar;
        }
    }

    static {
        okio.i iVar = d.f41932e;
        okio.i iVar2 = d.f41933f;
        okio.i iVar3 = d.f41934g;
        okio.i iVar4 = d.f41931d;
        f41940b = new d[]{new d(d.f41935h, ""), new d(iVar, "GET"), new d(iVar, "POST"), new d(iVar2, "/"), new d(iVar2, "/index.html"), new d(iVar3, "http"), new d(iVar3, "https"), new d(iVar4, "200"), new d(iVar4, "204"), new d(iVar4, "206"), new d(iVar4, "304"), new d(iVar4, "400"), new d(iVar4, "404"), new d(iVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d(PermissionsResponse.EXPIRES_KEY, ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d(Kind.LOCATION, ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f41941c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static okio.i e(okio.i iVar) {
        int z11 = iVar.z();
        for (int i11 = 0; i11 < z11; i11++) {
            byte g11 = iVar.g(i11);
            if (g11 >= 65 && g11 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.F());
            }
        }
        return iVar;
    }

    private static Map<okio.i, Integer> f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f41940b.length);
        int i11 = 0;
        while (true) {
            d[] dVarArr = f41940b;
            if (i11 < dVarArr.length) {
                if (!linkedHashMap.containsKey(dVarArr[i11].f41936a)) {
                    linkedHashMap.put(dVarArr[i11].f41936a, Integer.valueOf(i11));
                }
                i11++;
            } else {
                return Collections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}