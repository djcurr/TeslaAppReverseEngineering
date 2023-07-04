package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.u.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class u<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final u f16402d = new u(true);

    /* renamed from: a  reason: collision with root package name */
    private final i1<T, Object> f16403a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f16404b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16405c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16406a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f16407b;

        static {
            int[] iArr = new int[r1.b.values().length];
            f16407b = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16407b[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16407b[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16407b[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16407b[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16407b[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16407b[r1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16407b[r1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16407b[r1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16407b[r1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16407b[r1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16407b[r1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16407b[r1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16407b[r1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16407b[r1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16407b[r1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16407b[r1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16407b[r1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r1.c.values().length];
            f16406a = iArr2;
            try {
                iArr2[r1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f16406a[r1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f16406a[r1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f16406a[r1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f16406a[r1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f16406a[r1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f16406a[r1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f16406a[r1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f16406a[r1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        q0.a R(q0.a aVar, q0 q0Var);

        r1.c getLiteJavaType();

        r1.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private u() {
        this.f16403a = i1.s(16);
    }

    private static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    static int d(r1.b bVar, int i11, Object obj) {
        int U = CodedOutputStream.U(i11);
        if (bVar == r1.b.GROUP) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(r1.b bVar, Object obj) {
        switch (a.f16407b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((q0) obj);
            case 10:
                if (obj instanceof c0) {
                    return CodedOutputStream.B((c0) obj);
                }
                return CodedOutputStream.G((q0) obj);
            case 11:
                if (obj instanceof i) {
                    return CodedOutputStream.h((i) obj);
                }
                return CodedOutputStream.T((String) obj);
            case 12:
                if (obj instanceof i) {
                    return CodedOutputStream.h((i) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                if (obj instanceof a0.c) {
                    return CodedOutputStream.l(((a0.c) obj).getNumber());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        r1.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (bVar.isRepeated()) {
            int i11 = 0;
            if (bVar.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i11 += e(liteType, obj2);
                }
                return CodedOutputStream.U(number) + i11 + CodedOutputStream.J(i11);
            }
            for (Object obj3 : (List) obj) {
                i11 += d(liteType, number, obj3);
            }
            return i11;
        }
        return d(liteType, number, obj);
    }

    public static <T extends b<T>> u<T> h() {
        return f16402d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == r1.c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof c0) {
                return CodedOutputStream.z(entry.getKey().getNumber(), (c0) value);
            }
            return CodedOutputStream.D(entry.getKey().getNumber(), (q0) value);
        }
        return f(key, value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == r1.c.MESSAGE) {
            if (key.isRepeated()) {
                for (q0 q0Var : (List) entry.getValue()) {
                    if (!q0Var.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof q0) {
                    if (!((q0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof c0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static boolean q(r1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.f16406a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof i) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof q0) || (obj instanceof c0);
            default:
                return false;
        }
    }

    private void u(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c0) {
            value = ((c0) value).f();
        }
        if (key.isRepeated()) {
            Object i11 = i(key);
            if (i11 == null) {
                i11 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) i11).add(c(obj));
            }
            this.f16403a.put(key, i11);
        } else if (key.getLiteJavaType() == r1.c.MESSAGE) {
            Object i12 = i(key);
            if (i12 == null) {
                this.f16403a.put(key, c(value));
                return;
            }
            this.f16403a.put(key, key.R(((q0) i12).toBuilder(), (q0) value).build());
        } else {
            this.f16403a.put(key, c(value));
        }
    }

    public static <T extends b<T>> u<T> v() {
        return new u<>();
    }

    private void x(r1.b bVar, Object obj) {
        if (!q(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public void a(T t11, Object obj) {
        List list;
        if (t11.isRepeated()) {
            x(t11.getLiteType(), obj);
            Object i11 = i(t11);
            if (i11 == null) {
                list = new ArrayList();
                this.f16403a.put(t11, list);
            } else {
                list = (List) i11;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public u<T> clone() {
        u<T> v11 = v();
        for (int i11 = 0; i11 < this.f16403a.m(); i11++) {
            Map.Entry<T, Object> l11 = this.f16403a.l(i11);
            v11.w(l11.getKey(), l11.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f16403a.o()) {
            v11.w(entry.getKey(), entry.getValue());
        }
        v11.f16405c = this.f16405c;
        return v11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f16403a.equals(((u) obj).f16403a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        if (this.f16405c) {
            return new c0.c(this.f16403a.j().iterator());
        }
        return this.f16403a.j().iterator();
    }

    public int hashCode() {
        return this.f16403a.hashCode();
    }

    public Object i(T t11) {
        Object obj = this.f16403a.get(t11);
        return obj instanceof c0 ? ((c0) obj).f() : obj;
    }

    public int j() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16403a.m(); i12++) {
            i11 += k(this.f16403a.l(i12));
        }
        for (Map.Entry<T, Object> entry : this.f16403a.o()) {
            i11 += k(entry);
        }
        return i11;
    }

    public int l() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f16403a.m(); i12++) {
            Map.Entry<T, Object> l11 = this.f16403a.l(i12);
            i11 += f(l11.getKey(), l11.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f16403a.o()) {
            i11 += f(entry.getKey(), entry.getValue());
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f16403a.isEmpty();
    }

    public boolean n() {
        return this.f16404b;
    }

    public boolean o() {
        for (int i11 = 0; i11 < this.f16403a.m(); i11++) {
            if (!p(this.f16403a.l(i11))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f16403a.o()) {
            if (!p(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> r() {
        if (this.f16405c) {
            return new c0.c(this.f16403a.entrySet().iterator());
        }
        return this.f16403a.entrySet().iterator();
    }

    public void s() {
        if (this.f16404b) {
            return;
        }
        this.f16403a.r();
        this.f16404b = true;
    }

    public void t(u<T> uVar) {
        for (int i11 = 0; i11 < uVar.f16403a.m(); i11++) {
            u(uVar.f16403a.l(i11));
        }
        for (Map.Entry<T, Object> entry : uVar.f16403a.o()) {
            u(entry);
        }
    }

    public void w(T t11, Object obj) {
        if (t11.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    x(t11.getLiteType(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            x(t11.getLiteType(), obj);
        }
        if (obj instanceof c0) {
            this.f16405c = true;
        }
        this.f16403a.put(t11, obj);
    }

    private u(boolean z11) {
        this(i1.s(0));
        s();
    }

    private u(i1<T, Object> i1Var) {
        this.f16403a = i1Var;
        s();
    }
}