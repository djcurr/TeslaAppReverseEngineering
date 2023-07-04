package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.s1;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final CodedOutputStream f16338a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16339a;

        static {
            int[] iArr = new int[r1.b.values().length];
            f16339a = iArr;
            try {
                iArr[r1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16339a[r1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16339a[r1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16339a[r1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16339a[r1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16339a[r1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16339a[r1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16339a[r1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16339a[r1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16339a[r1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16339a[r1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16339a[r1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private l(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) a0.b(codedOutputStream, "output");
        this.f16338a = codedOutputStream2;
        codedOutputStream2.f16224a = this;
    }

    public static l g(CodedOutputStream codedOutputStream) {
        l lVar = codedOutputStream.f16224a;
        return lVar != null ? lVar : new l(codedOutputStream);
    }

    private <K, V> void h(int i11, j0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f16339a;
        throw null;
    }

    private void i(int i11, Object obj) {
        if (obj instanceof String) {
            this.f16338a.L0(i11, (String) obj);
        } else {
            this.f16338a.j0(i11, (i) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public <K, V> void a(int i11, j0.a<K, V> aVar, Map<K, V> map) {
        if (this.f16338a.c0()) {
            h(i11, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f16338a.M0(i11, 2);
            this.f16338a.O0(j0.b(aVar, entry.getKey(), entry.getValue()));
            j0.d(this.f16338a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void b(int i11, Object obj, f1 f1Var) {
        this.f16338a.u0(i11, (q0) obj, f1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void c(int i11, List<?> list, f1 f1Var) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            e(i11, list.get(i12), f1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void d(int i11, i iVar) {
        this.f16338a.j0(i11, iVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void e(int i11, Object obj, f1 f1Var) {
        this.f16338a.A0(i11, (q0) obj, f1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void f(int i11, List<?> list, f1 f1Var) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            b(i11, list.get(i12), f1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public s1.a fieldOrder() {
        return s1.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeBool(int i11, boolean z11) {
        this.f16338a.h0(i11, z11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeBoolList(int i11, List<Boolean> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.e(list.get(i14).booleanValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.i0(list.get(i12).booleanValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.h0(i11, list.get(i12).booleanValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeBytesList(int i11, List<i> list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f16338a.j0(i11, list.get(i12));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeDouble(int i11, double d11) {
        this.f16338a.k0(i11, d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeDoubleList(int i11, List<Double> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.j(list.get(i14).doubleValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.l0(list.get(i12).doubleValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.k0(i11, list.get(i12).doubleValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeEndGroup(int i11) {
        this.f16338a.M0(i11, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeEnum(int i11, int i12) {
        this.f16338a.m0(i11, i12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeEnumList(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.l(list.get(i14).intValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.n0(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.m0(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeFixed32(int i11, int i12) {
        this.f16338a.o0(i11, i12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeFixed32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.n(list.get(i14).intValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.p0(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.o0(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeFixed64(int i11, long j11) {
        this.f16338a.q0(i11, j11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeFixed64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.p(list.get(i14).longValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.r0(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.q0(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeFloat(int i11, float f11) {
        this.f16338a.s0(i11, f11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeFloatList(int i11, List<Float> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.r(list.get(i14).floatValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.t0(list.get(i12).floatValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.s0(i11, list.get(i12).floatValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeInt32(int i11, int i12) {
        this.f16338a.w0(i11, i12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeInt32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.w(list.get(i14).intValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.x0(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.w0(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeInt64(int i11, long j11) {
        this.f16338a.y0(i11, j11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeInt64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.y(list.get(i14).longValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.z0(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.y0(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public final void writeMessageSetItem(int i11, Object obj) {
        if (obj instanceof i) {
            this.f16338a.C0(i11, (i) obj);
        } else {
            this.f16338a.B0(i11, (q0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSFixed32(int i11, int i12) {
        this.f16338a.D0(i11, i12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSFixed32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.L(list.get(i14).intValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.E0(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.D0(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSFixed64(int i11, long j11) {
        this.f16338a.F0(i11, j11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSFixed64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.N(list.get(i14).longValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.G0(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.F0(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSInt32(int i11, int i12) {
        this.f16338a.H0(i11, i12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSInt32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.P(list.get(i14).intValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.I0(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.H0(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSInt64(int i11, long j11) {
        this.f16338a.J0(i11, j11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeSInt64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.R(list.get(i14).longValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.K0(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.J0(i11, list.get(i12).longValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeStartGroup(int i11) {
        this.f16338a.M0(i11, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeString(int i11, String str) {
        this.f16338a.L0(i11, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeStringList(int i11, List<String> list) {
        int i12 = 0;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i12 < list.size()) {
                i(i11, f0Var.getRaw(i12));
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.L0(i11, list.get(i12));
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeUInt32(int i11, int i12) {
        this.f16338a.N0(i11, i12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeUInt32List(int i11, List<Integer> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.W(list.get(i14).intValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.O0(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.N0(i11, list.get(i12).intValue());
            i12++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeUInt64(int i11, long j11) {
        this.f16338a.P0(i11, j11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s1
    public void writeUInt64List(int i11, List<Long> list, boolean z11) {
        int i12 = 0;
        if (z11) {
            this.f16338a.M0(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += CodedOutputStream.Y(list.get(i14).longValue());
            }
            this.f16338a.O0(i13);
            while (i12 < list.size()) {
                this.f16338a.Q0(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        while (i12 < list.size()) {
            this.f16338a.P0(i11, list.get(i12).longValue());
            i12++;
        }
    }
}