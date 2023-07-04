package io.grpc;

import com.google.common.base.o;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.grpc.r0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class f1 {

    /* renamed from: d */
    private static final boolean f30560d = Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));

    /* renamed from: e */
    private static final List<f1> f30561e = g();

    /* renamed from: f */
    public static final f1 f30562f = b.OK.toStatus();

    /* renamed from: g */
    public static final f1 f30563g = b.CANCELLED.toStatus();

    /* renamed from: h */
    public static final f1 f30564h = b.UNKNOWN.toStatus();

    /* renamed from: i */
    public static final f1 f30565i;

    /* renamed from: j */
    public static final f1 f30566j;

    /* renamed from: k */
    public static final f1 f30567k;

    /* renamed from: l */
    public static final f1 f30568l;

    /* renamed from: m */
    public static final f1 f30569m;

    /* renamed from: n */
    public static final f1 f30570n;

    /* renamed from: o */
    public static final f1 f30571o;

    /* renamed from: p */
    static final r0.f<f1> f30572p;

    /* renamed from: q */
    private static final r0.i<String> f30573q;

    /* renamed from: r */
    static final r0.f<String> f30574r;

    /* renamed from: a */
    private final b f30575a;

    /* renamed from: b */
    private final String f30576b;

    /* renamed from: c */
    private final Throwable f30577c;

    /* loaded from: classes5.dex */
    public enum b {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        private final int value;
        private final byte[] valueAscii;

        b(int i11) {
            this.value = i11;
            this.valueAscii = Integer.toString(i11).getBytes(com.google.common.base.f.f15918a);
        }

        public byte[] valueAscii() {
            return this.valueAscii;
        }

        public f1 toStatus() {
            return (f1) f1.f30561e.get(this.value);
        }

        public int value() {
            return this.value;
        }
    }

    /* loaded from: classes5.dex */
    private static final class c implements r0.i<f1> {
        private c() {
        }

        @Override // io.grpc.r0.i
        /* renamed from: c */
        public f1 b(byte[] bArr) {
            return f1.j(bArr);
        }

        @Override // io.grpc.r0.i
        /* renamed from: d */
        public byte[] a(f1 f1Var) {
            return f1Var.n().valueAscii();
        }
    }

    /* loaded from: classes5.dex */
    private static final class d implements r0.i<String> {

        /* renamed from: a */
        private static final byte[] f30578a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        private d() {
        }

        private static boolean c(byte b11) {
            return b11 < 32 || b11 >= 126 || b11 == 37;
        }

        private static String e(byte[] bArr) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
            int i11 = 0;
            while (i11 < bArr.length) {
                if (bArr[i11] == 37 && i11 + 2 < bArr.length) {
                    try {
                        allocate.put((byte) Integer.parseInt(new String(bArr, i11 + 1, 2, com.google.common.base.f.f15918a), 16));
                        i11 += 3;
                    } catch (NumberFormatException unused) {
                    }
                }
                allocate.put(bArr[i11]);
                i11++;
            }
            return new String(allocate.array(), 0, allocate.position(), com.google.common.base.f.f15920c);
        }

        private static byte[] g(byte[] bArr, int i11) {
            byte[] bArr2 = new byte[((bArr.length - i11) * 3) + i11];
            if (i11 != 0) {
                System.arraycopy(bArr, 0, bArr2, 0, i11);
            }
            int i12 = i11;
            while (i11 < bArr.length) {
                byte b11 = bArr[i11];
                if (c(b11)) {
                    bArr2[i12] = 37;
                    byte[] bArr3 = f30578a;
                    bArr2[i12 + 1] = bArr3[(b11 >> 4) & 15];
                    bArr2[i12 + 2] = bArr3[b11 & 15];
                    i12 += 3;
                } else {
                    bArr2[i12] = b11;
                    i12++;
                }
                i11++;
            }
            return Arrays.copyOf(bArr2, i12);
        }

        @Override // io.grpc.r0.i
        /* renamed from: d */
        public String b(byte[] bArr) {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                byte b11 = bArr[i11];
                if (b11 < 32 || b11 >= 126 || (b11 == 37 && i11 + 2 < bArr.length)) {
                    return e(bArr);
                }
            }
            return new String(bArr, 0);
        }

        @Override // io.grpc.r0.i
        /* renamed from: f */
        public byte[] a(String str) {
            byte[] bytes = str.getBytes(com.google.common.base.f.f15920c);
            for (int i11 = 0; i11 < bytes.length; i11++) {
                if (c(bytes[i11])) {
                    return g(bytes, i11);
                }
            }
            return bytes;
        }
    }

    static {
        b.INVALID_ARGUMENT.toStatus();
        f30565i = b.DEADLINE_EXCEEDED.toStatus();
        b.NOT_FOUND.toStatus();
        b.ALREADY_EXISTS.toStatus();
        f30566j = b.PERMISSION_DENIED.toStatus();
        f30567k = b.UNAUTHENTICATED.toStatus();
        f30568l = b.RESOURCE_EXHAUSTED.toStatus();
        b.FAILED_PRECONDITION.toStatus();
        b.ABORTED.toStatus();
        b.OUT_OF_RANGE.toStatus();
        f30569m = b.UNIMPLEMENTED.toStatus();
        f30570n = b.INTERNAL.toStatus();
        f30571o = b.UNAVAILABLE.toStatus();
        b.DATA_LOSS.toStatus();
        f30572p = r0.f.g("grpc-status", false, new c());
        d dVar = new d();
        f30573q = dVar;
        f30574r = r0.f.g("grpc-message", false, dVar);
    }

    private f1(b bVar) {
        this(bVar, null, null);
    }

    private static List<f1> g() {
        b[] values;
        f1 f1Var;
        TreeMap treeMap = new TreeMap();
        for (b bVar : b.values()) {
            if (((f1) treeMap.put(Integer.valueOf(bVar.value()), new f1(bVar))) != null) {
                throw new IllegalStateException("Code value duplication between " + f1Var.n().name() + " & " + bVar.name());
            }
        }
        return Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public static String h(f1 f1Var) {
        if (f1Var.f30576b == null) {
            return f1Var.f30575a.toString();
        }
        return f1Var.f30575a + ": " + f1Var.f30576b;
    }

    public static f1 i(int i11) {
        if (i11 >= 0) {
            List<f1> list = f30561e;
            if (i11 <= list.size()) {
                return list.get(i11);
            }
        }
        f1 f1Var = f30564h;
        return f1Var.r("Unknown code " + i11);
    }

    public static f1 j(byte[] bArr) {
        if (bArr.length == 1 && bArr[0] == 48) {
            return f30562f;
        }
        return k(bArr);
    }

    private static f1 k(byte[] bArr) {
        int i11;
        int length = bArr.length;
        char c11 = 1;
        if (length != 1) {
            i11 = (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) ? 0 + ((bArr[0] - 48) * 10) : 0;
            return f30564h.r("Unknown code " + new String(bArr, com.google.common.base.f.f15918a));
        }
        c11 = 0;
        if (bArr[c11] >= 48 && bArr[c11] <= 57) {
            int i12 = i11 + (bArr[c11] - 48);
            List<f1> list = f30561e;
            if (i12 < list.size()) {
                return list.get(i12);
            }
        }
        return f30564h.r("Unknown code " + new String(bArr, com.google.common.base.f.f15918a));
    }

    public static f1 l(Throwable th2) {
        for (Throwable th3 = (Throwable) com.google.common.base.u.p(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof StatusException) {
                return ((StatusException) th3).a();
            }
            if (th3 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th3).a();
            }
        }
        return f30564h.q(th2);
    }

    public StatusException c() {
        return new StatusException(this);
    }

    public StatusRuntimeException d() {
        return new StatusRuntimeException(this);
    }

    public StatusRuntimeException e(r0 r0Var) {
        return new StatusRuntimeException(this, r0Var);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public f1 f(String str) {
        if (str == null) {
            return this;
        }
        if (this.f30576b == null) {
            return new f1(this.f30575a, str, this.f30577c);
        }
        b bVar = this.f30575a;
        return new f1(bVar, this.f30576b + "\n" + str, this.f30577c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Throwable m() {
        return this.f30577c;
    }

    public b n() {
        return this.f30575a;
    }

    public String o() {
        return this.f30576b;
    }

    public boolean p() {
        return b.OK == this.f30575a;
    }

    public f1 q(Throwable th2) {
        return com.google.common.base.q.a(this.f30577c, th2) ? this : new f1(this.f30575a, this.f30576b, th2);
    }

    public f1 r(String str) {
        return com.google.common.base.q.a(this.f30576b, str) ? this : new f1(this.f30575a, str, this.f30577c);
    }

    public String toString() {
        o.b d11 = com.google.common.base.o.c(this).d(PaymentMethodOptionsParams.Blik.PARAM_CODE, this.f30575a.name()).d("description", this.f30576b);
        Throwable th2 = this.f30577c;
        String str = th2;
        if (th2 != null) {
            str = com.google.common.base.b0.e(th2);
        }
        return d11.d("cause", str).toString();
    }

    private f1(b bVar, String str, Throwable th2) {
        this.f30575a = (b) com.google.common.base.u.p(bVar, PaymentMethodOptionsParams.Blik.PARAM_CODE);
        this.f30576b = str;
        this.f30577c = th2;
    }
}