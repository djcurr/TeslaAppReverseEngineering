package qi;

import ak.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f48167a;

    /* renamed from: qi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C1029a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f48168b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f48169c;

        /* renamed from: d  reason: collision with root package name */
        public final List<C1029a> f48170d;

        public C1029a(int i11, long j11) {
            super(i11);
            this.f48168b = j11;
            this.f48169c = new ArrayList();
            this.f48170d = new ArrayList();
        }

        public void d(C1029a c1029a) {
            this.f48170d.add(c1029a);
        }

        public void e(b bVar) {
            this.f48169c.add(bVar);
        }

        public C1029a f(int i11) {
            int size = this.f48170d.size();
            for (int i12 = 0; i12 < size; i12++) {
                C1029a c1029a = this.f48170d.get(i12);
                if (c1029a.f48167a == i11) {
                    return c1029a;
                }
            }
            return null;
        }

        public b g(int i11) {
            int size = this.f48169c.size();
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = this.f48169c.get(i12);
                if (bVar.f48167a == i11) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // qi.a
        public String toString() {
            String a11 = a.a(this.f48167a);
            String arrays = Arrays.toString(this.f48169c.toArray());
            String arrays2 = Arrays.toString(this.f48170d.toArray());
            StringBuilder sb2 = new StringBuilder(String.valueOf(a11).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb2.append(a11);
            sb2.append(" leaves: ");
            sb2.append(arrays);
            sb2.append(" containers: ");
            sb2.append(arrays2);
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final v f48171b;

        public b(int i11, v vVar) {
            super(i11);
            this.f48171b = vVar;
        }
    }

    public a(int i11) {
        this.f48167a = i11;
    }

    public static String a(int i11) {
        StringBuilder sb2 = new StringBuilder(4);
        sb2.append((char) ((i11 >> 24) & 255));
        sb2.append((char) ((i11 >> 16) & 255));
        sb2.append((char) ((i11 >> 8) & 255));
        sb2.append((char) (i11 & 255));
        return sb2.toString();
    }

    public static int b(int i11) {
        return i11 & 16777215;
    }

    public static int c(int i11) {
        return (i11 >> 24) & 255;
    }

    public String toString() {
        return a(this.f48167a);
    }
}