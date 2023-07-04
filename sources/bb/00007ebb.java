package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.g.b;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.j;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    private static final g f34995d = new g(true);

    /* renamed from: b  reason: collision with root package name */
    private boolean f34997b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f34998c = false;

    /* renamed from: a  reason: collision with root package name */
    private final t<FieldDescriptorType, Object> f34996a = t.p(16);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34999a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f35000b;

        static {
            int[] iArr = new int[w.b.values().length];
            f35000b = iArr;
            try {
                iArr[w.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35000b[w.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35000b[w.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35000b[w.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35000b[w.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35000b[w.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35000b[w.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35000b[w.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35000b[w.b.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35000b[w.b.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35000b[w.b.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35000b[w.b.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35000b[w.b.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35000b[w.b.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35000b[w.b.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35000b[w.b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35000b[w.b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35000b[w.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[w.c.values().length];
            f34999a = iArr2;
            try {
                iArr2[w.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34999a[w.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34999a[w.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f34999a[w.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f34999a[w.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f34999a[w.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f34999a[w.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f34999a[w.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f34999a[w.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        w.c getLiteJavaType();

        w.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        o.a u0(o.a aVar, o oVar);
    }

    private g() {
    }

    private Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    private static int d(w.b bVar, int i11, Object obj) {
        int D = CodedOutputStream.D(i11);
        if (bVar == w.b.GROUP) {
            D *= 2;
        }
        return D + e(bVar, obj);
    }

    private static int e(w.b bVar, Object obj) {
        switch (a.f35000b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.g(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.q(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.p(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.k(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.j(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.C((String) obj);
            case 10:
                if (obj instanceof d) {
                    return CodedOutputStream.e((d) obj);
                }
                return CodedOutputStream.c((byte[]) obj);
            case 11:
                return CodedOutputStream.E(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.x(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.z(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.B(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.n((o) obj);
            case 17:
                if (obj instanceof j) {
                    return CodedOutputStream.r((j) obj);
                }
                return CodedOutputStream.t((o) obj);
            case 18:
                if (obj instanceof i.a) {
                    return CodedOutputStream.i(((i.a) obj).getNumber());
                }
                return CodedOutputStream.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        w.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (bVar.isRepeated()) {
            int i11 = 0;
            if (bVar.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i11 += e(liteType, obj2);
                }
                return CodedOutputStream.D(number) + i11 + CodedOutputStream.v(i11);
            }
            for (Object obj3 : (List) obj) {
                i11 += d(liteType, number, obj3);
            }
            return i11;
        }
        return d(liteType, number, obj);
    }

    public static <T extends b<T>> g<T> g() {
        return f34995d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(w.b bVar, boolean z11) {
        if (z11) {
            return 2;
        }
        return bVar.getWireType();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.getLiteJavaType() == w.c.MESSAGE) {
            if (key.isRepeated()) {
                for (o oVar : (List) entry.getValue()) {
                    if (!oVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof o) {
                    if (!((o) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof j) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof j) {
            value = ((j) value).e();
        }
        if (key.isRepeated()) {
            Object h11 = h(key);
            if (h11 == null) {
                h11 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) h11).add(c(obj));
            }
            this.f34996a.q(key, h11);
        } else if (key.getLiteJavaType() == w.c.MESSAGE) {
            Object h12 = h(key);
            if (h12 == null) {
                this.f34996a.q(key, c(value));
                return;
            }
            this.f34996a.q(key, key.u0(((o) h12).toBuilder(), (o) value).build());
        } else {
            this.f34996a.q(key, c(value));
        }
    }

    public static <T extends b<T>> g<T> t() {
        return new g<>();
    }

    public static Object u(e eVar, w.b bVar, boolean z11) {
        switch (a.f35000b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                if (z11) {
                    return eVar.J();
                }
                return eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.L());
            case 12:
                return Integer.valueOf(eVar.E());
            case 13:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(kotlin.reflect.jvm.internal.impl.protobuf.w.b r2, java.lang.Object r3) {
        /*
            java.util.Objects.requireNonNull(r3)
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.g.a.f34999a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.getJavaType()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.o
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j
            if (r2 == 0) goto L30
            goto L31
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a
            if (r2 == 0) goto L30
            goto L31
        L27:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L30
            goto L31
        L30:
            r0 = r1
        L31:
            r1 = r0
            goto L44
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.w(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    private static void x(CodedOutputStream codedOutputStream, w.b bVar, int i11, Object obj) {
        if (bVar == w.b.GROUP) {
            codedOutputStream.Y(i11, (o) obj);
            return;
        }
        codedOutputStream.w0(i11, l(bVar, false));
        y(codedOutputStream, bVar, obj);
    }

    private static void y(CodedOutputStream codedOutputStream, w.b bVar, Object obj) {
        switch (a.f35000b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.R(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.X(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.c0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.z0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.b0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.V(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.U(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.M(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.v0((String) obj);
                return;
            case 10:
                if (obj instanceof d) {
                    codedOutputStream.P((d) obj);
                    return;
                } else {
                    codedOutputStream.N((byte[]) obj);
                    return;
                }
            case 11:
                codedOutputStream.y0(((Integer) obj).intValue());
                return;
            case 12:
                codedOutputStream.q0(((Integer) obj).intValue());
                return;
            case 13:
                codedOutputStream.r0(((Long) obj).longValue());
                return;
            case 14:
                codedOutputStream.s0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.u0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.Z((o) obj);
                return;
            case 17:
                codedOutputStream.e0((o) obj);
                return;
            case 18:
                if (obj instanceof i.a) {
                    codedOutputStream.T(((i.a) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.T(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void z(b<?> bVar, Object obj, CodedOutputStream codedOutputStream) {
        w.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (bVar.isRepeated()) {
            List<Object> list = (List) obj;
            if (bVar.isPacked()) {
                codedOutputStream.w0(number, 2);
                int i11 = 0;
                for (Object obj2 : list) {
                    i11 += e(liteType, obj2);
                }
                codedOutputStream.o0(i11);
                for (Object obj3 : list) {
                    y(codedOutputStream, liteType, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                x(codedOutputStream, liteType, number, obj4);
            }
        } else if (obj instanceof j) {
            x(codedOutputStream, liteType, number, ((j) obj).e());
        } else {
            x(codedOutputStream, liteType, number, obj);
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.isRepeated()) {
            w(fielddescriptortype.getLiteType(), obj);
            Object h11 = h(fielddescriptortype);
            if (h11 == null) {
                list = new ArrayList();
                this.f34996a.q(fielddescriptortype, list);
            } else {
                list = (List) h11;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public g<FieldDescriptorType> clone() {
        g<FieldDescriptorType> t11 = t();
        for (int i11 = 0; i11 < this.f34996a.k(); i11++) {
            Map.Entry<FieldDescriptorType, Object> j11 = this.f34996a.j(i11);
            t11.v(j11.getKey(), j11.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f34996a.l()) {
            t11.v(entry.getKey(), entry.getValue());
        }
        t11.f34998c = this.f34998c;
        return t11;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f34996a.get(fielddescriptortype);
        return obj instanceof j ? ((j) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i11) {
        if (fielddescriptortype.isRepeated()) {
            Object h11 = h(fielddescriptortype);
            if (h11 != null) {
                return ((List) h11).get(i11);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            Object h11 = h(fielddescriptortype);
            if (h11 == null) {
                return 0;
            }
            return ((List) h11).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int k() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f34996a.k(); i12++) {
            Map.Entry<FieldDescriptorType, Object> j11 = this.f34996a.j(i12);
            i11 += f(j11.getKey(), j11.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f34996a.l()) {
            i11 += f(entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f34996a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i11 = 0; i11 < this.f34996a.k(); i11++) {
            if (!o(this.f34996a.j(i11))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f34996a.l()) {
            if (!o(entry)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        if (this.f34998c) {
            return new j.c(this.f34996a.entrySet().iterator());
        }
        return this.f34996a.entrySet().iterator();
    }

    public void q() {
        if (this.f34997b) {
            return;
        }
        this.f34996a.o();
        this.f34997b = true;
    }

    public void r(g<FieldDescriptorType> gVar) {
        for (int i11 = 0; i11 < gVar.f34996a.k(); i11++) {
            s(gVar.f34996a.j(i11));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : gVar.f34996a.l()) {
            s(entry);
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.isRepeated()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    w(fielddescriptortype.getLiteType(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            w(fielddescriptortype.getLiteType(), obj);
        }
        if (obj instanceof j) {
            this.f34998c = true;
        }
        this.f34996a.q(fielddescriptortype, obj);
    }

    private g(boolean z11) {
        q();
    }
}