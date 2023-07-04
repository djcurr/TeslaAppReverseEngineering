package ti;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public interface i0 {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f52089a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f52090b;

        public a(String str, int i11, byte[] bArr) {
            this.f52089a = str;
            this.f52090b = bArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f52091a;

        /* renamed from: b  reason: collision with root package name */
        public final String f52092b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f52093c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f52094d;

        public b(int i11, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.f52091a = i11;
            this.f52092b = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f52093c = unmodifiableList;
            this.f52094d = bArr;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        i0 a(int i11, b bVar);

        SparseArray<i0> b();
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f52095a;

        /* renamed from: b  reason: collision with root package name */
        private final int f52096b;

        /* renamed from: c  reason: collision with root package name */
        private final int f52097c;

        /* renamed from: d  reason: collision with root package name */
        private int f52098d;

        /* renamed from: e  reason: collision with root package name */
        private String f52099e;

        public d(int i11, int i12) {
            this(Integer.MIN_VALUE, i11, i12);
        }

        private void d() {
            if (this.f52098d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i11 = this.f52098d;
            int i12 = i11 == Integer.MIN_VALUE ? this.f52096b : i11 + this.f52097c;
            this.f52098d = i12;
            String str = this.f52095a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11);
            sb2.append(str);
            sb2.append(i12);
            this.f52099e = sb2.toString();
        }

        public String b() {
            d();
            return this.f52099e;
        }

        public int c() {
            d();
            return this.f52098d;
        }

        public d(int i11, int i12, int i13) {
            String str;
            if (i11 != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(i11);
                sb2.append("/");
                str = sb2.toString();
            } else {
                str = "";
            }
            this.f52095a = str;
            this.f52096b = i12;
            this.f52097c = i13;
            this.f52098d = Integer.MIN_VALUE;
            this.f52099e = "";
        }
    }

    void a();

    void b(ak.g0 g0Var, ji.j jVar, d dVar);

    void c(ak.v vVar, int i11);
}