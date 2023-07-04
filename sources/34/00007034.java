package g8;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.f;
import okio.h;
import okio.i;
import okio.u;

/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f27822g = new String[128];

    /* renamed from: a  reason: collision with root package name */
    int f27823a;

    /* renamed from: b  reason: collision with root package name */
    int[] f27824b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    String[] f27825c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    int[] f27826d = new int[32];

    /* renamed from: e  reason: collision with root package name */
    boolean f27827e;

    /* renamed from: f  reason: collision with root package name */
    boolean f27828f;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f27829a;

        /* renamed from: b  reason: collision with root package name */
        final u f27830b;

        private a(String[] strArr, u uVar) {
            this.f27829a = strArr;
            this.f27830b = uVar;
        }

        public static a a(String... strArr) {
            try {
                i[] iVarArr = new i[strArr.length];
                f fVar = new f();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    c.C0(fVar, strArr[i11]);
                    fVar.readByte();
                    iVarArr[i11] = fVar.j1();
                }
                return new a((String[]) strArr.clone(), u.k(iVarArr));
            } catch (IOException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            f27822g[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = f27822g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C0(okio.g r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = g8.c.f27822g
            r1 = 34
            r7.O0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.Z(r8, r4, r3)
        L2e:
            r7.T(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.Z(r8, r4, r2)
        L3b:
            r7.O0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.c.C0(okio.g, java.lang.String):void");
    }

    public static c a0(h hVar) {
        return new e(hVar);
    }

    public abstract boolean C();

    public abstract double D();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g8.b D0(String str) {
        throw new g8.b(str + " at path " + getPath());
    }

    public abstract int J();

    public abstract String L();

    public abstract String R();

    public abstract b e0();

    public abstract void g();

    public final String getPath() {
        return d.a(this.f27823a, this.f27824b, this.f27825c, this.f27826d);
    }

    public abstract void j();

    public abstract void l();

    public abstract void m();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n0(int i11) {
        int i12 = this.f27823a;
        int[] iArr = this.f27824b;
        if (i12 == iArr.length) {
            if (i12 != 256) {
                this.f27824b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f27825c;
                this.f27825c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f27826d;
                this.f27826d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new g8.a("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f27824b;
        int i13 = this.f27823a;
        this.f27823a = i13 + 1;
        iArr3[i13] = i11;
    }

    public abstract boolean p();

    public abstract int p0(a aVar);

    public abstract void t0();

    public abstract void u0();
}