package h30;

import e30.k;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f28857a = new Object[8];

    /* renamed from: b  reason: collision with root package name */
    private int[] f28858b;

    /* renamed from: c  reason: collision with root package name */
    private int f28859c;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28860a = new a();

        private a() {
        }
    }

    public q() {
        int[] iArr = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            iArr[i11] = -1;
        }
        this.f28858b = iArr;
        this.f28859c = -1;
    }

    private final void e() {
        int i11 = this.f28859c * 2;
        Object[] copyOf = Arrays.copyOf(this.f28857a, i11);
        kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
        this.f28857a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f28858b, i11);
        kotlin.jvm.internal.s.f(copyOf2, "copyOf(this, newSize)");
        this.f28858b = copyOf2;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i11 = this.f28859c + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = this.f28857a[i12];
            if (obj instanceof e30.f) {
                e30.f fVar = (e30.f) obj;
                if (kotlin.jvm.internal.s.c(fVar.getKind(), k.b.f24591a)) {
                    if (this.f28858b[i12] != -1) {
                        sb2.append("[");
                        sb2.append(this.f28858b[i12]);
                        sb2.append("]");
                    }
                } else {
                    int i13 = this.f28858b[i12];
                    if (i13 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.e(i13));
                    }
                }
            } else if (obj != a.f28860a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void b() {
        int i11 = this.f28859c;
        int[] iArr = this.f28858b;
        if (iArr[i11] == -2) {
            iArr[i11] = -1;
            this.f28859c = i11 - 1;
        }
        int i12 = this.f28859c;
        if (i12 != -1) {
            this.f28859c = i12 - 1;
        }
    }

    public final void c(e30.f sd2) {
        kotlin.jvm.internal.s.g(sd2, "sd");
        int i11 = this.f28859c + 1;
        this.f28859c = i11;
        if (i11 == this.f28857a.length) {
            e();
        }
        this.f28857a[i11] = sd2;
    }

    public final void d() {
        int[] iArr = this.f28858b;
        int i11 = this.f28859c;
        if (iArr[i11] == -2) {
            this.f28857a[i11] = a.f28860a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f28858b;
        int i11 = this.f28859c;
        if (iArr[i11] != -2) {
            int i12 = i11 + 1;
            this.f28859c = i12;
            if (i12 == this.f28857a.length) {
                e();
            }
        }
        Object[] objArr = this.f28857a;
        int i13 = this.f28859c;
        objArr[i13] = obj;
        this.f28858b[i13] = -2;
    }

    public final void g(int i11) {
        this.f28858b[this.f28859c] = i11;
    }

    public String toString() {
        return a();
    }
}