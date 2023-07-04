package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class j2 extends com.squareup.wire.f {

    /* renamed from: k  reason: collision with root package name */
    public static final ProtoAdapter<j2> f8061k;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f8062a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8063b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f8064c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f8065d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f8066e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final int f8067f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final int f8068g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 8)

    /* renamed from: h  reason: collision with root package name */
    private final int f8069h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 9)

    /* renamed from: i  reason: collision with root package name */
    private final int f8070i;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 10)

    /* renamed from: j  reason: collision with root package name */
    private final int f8071j;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j2> {
        a(com.squareup.wire.b bVar, n00.d<j2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ResetTrackerStats", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j2(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 2:
                        i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 3:
                        i13 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 4:
                        i14 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 5:
                        i15 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        i16 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 7:
                        i17 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 8:
                        i18 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 9:
                        i19 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 10:
                        i21 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.e()));
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.d()));
            }
            if (value.i() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.i()));
            }
            if (value.g() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.g()));
            }
            if (value.h() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.h()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.c()));
            }
            if (value.f() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.f()));
            }
            if (value.l() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 8, Integer.valueOf(value.l()));
            }
            if (value.j() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 9, Integer.valueOf(value.j()));
            }
            if (value.k() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 10, Integer.valueOf(value.k()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.e()));
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.d()));
            }
            if (value.i() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.i()));
            }
            if (value.g() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.g()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.h()));
            }
            if (value.c() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.c()));
            }
            if (value.f() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(7, Integer.valueOf(value.f()));
            }
            if (value.l() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(8, Integer.valueOf(value.l()));
            }
            if (value.j() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(9, Integer.valueOf(value.j()));
            }
            return value.k() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(10, Integer.valueOf(value.k())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j2 redact(j2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return j2.b(value, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, okio.i.f42656d, 1023, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        f8061k = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(j2.class), com.squareup.wire.o.PROTO_3);
    }

    public j2() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 2047, null);
    }

    public /* synthetic */ j2(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i iVar, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? 0 : i11, (i22 & 2) != 0 ? 0 : i12, (i22 & 4) != 0 ? 0 : i13, (i22 & 8) != 0 ? 0 : i14, (i22 & 16) != 0 ? 0 : i15, (i22 & 32) != 0 ? 0 : i16, (i22 & 64) != 0 ? 0 : i17, (i22 & 128) != 0 ? 0 : i18, (i22 & 256) != 0 ? 0 : i19, (i22 & 512) == 0 ? i21 : 0, (i22 & 1024) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ j2 b(j2 j2Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i iVar, int i22, Object obj) {
        return j2Var.a((i22 & 1) != 0 ? j2Var.f8062a : i11, (i22 & 2) != 0 ? j2Var.f8063b : i12, (i22 & 4) != 0 ? j2Var.f8064c : i13, (i22 & 8) != 0 ? j2Var.f8065d : i14, (i22 & 16) != 0 ? j2Var.f8066e : i15, (i22 & 32) != 0 ? j2Var.f8067f : i16, (i22 & 64) != 0 ? j2Var.f8068g : i17, (i22 & 128) != 0 ? j2Var.f8069h : i18, (i22 & 256) != 0 ? j2Var.f8070i : i19, (i22 & 512) != 0 ? j2Var.f8071j : i21, (i22 & 1024) != 0 ? j2Var.unknownFields() : iVar);
    }

    public final j2 a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new j2(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, unknownFields);
    }

    public final int c() {
        return this.f8067f;
    }

    public final int d() {
        return this.f8063b;
    }

    public final int e() {
        return this.f8062a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            j2 j2Var = (j2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), j2Var.unknownFields()) && this.f8062a == j2Var.f8062a && this.f8063b == j2Var.f8063b && this.f8064c == j2Var.f8064c && this.f8065d == j2Var.f8065d && this.f8066e == j2Var.f8066e && this.f8067f == j2Var.f8067f && this.f8068g == j2Var.f8068g && this.f8069h == j2Var.f8069h && this.f8070i == j2Var.f8070i && this.f8071j == j2Var.f8071j;
        }
        return false;
    }

    public final int f() {
        return this.f8068g;
    }

    public final int g() {
        return this.f8065d;
    }

    public final int h() {
        return this.f8066e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f8062a)) * 37) + Integer.hashCode(this.f8063b)) * 37) + Integer.hashCode(this.f8064c)) * 37) + Integer.hashCode(this.f8065d)) * 37) + Integer.hashCode(this.f8066e)) * 37) + Integer.hashCode(this.f8067f)) * 37) + Integer.hashCode(this.f8068g)) * 37) + Integer.hashCode(this.f8069h)) * 37) + Integer.hashCode(this.f8070i)) * 37) + Integer.hashCode(this.f8071j);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final int i() {
        return this.f8064c;
    }

    public final int j() {
        return this.f8070i;
    }

    public final int k() {
        return this.f8071j;
    }

    public final int l() {
        return this.f8069h;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m42newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f8062a;
        arrayList.add("totalResetsDueToPowerOn=" + i11);
        int i12 = this.f8063b;
        arrayList.add("totalResetsDueToPinReset=" + i12);
        int i13 = this.f8064c;
        arrayList.add("totalResetsDueToVDDSLoss=" + i13);
        int i14 = this.f8065d;
        arrayList.add("totalResetsDueToVDDLoss=" + i14);
        int i15 = this.f8066e;
        arrayList.add("totalResetsDueToVDDRLoss=" + i15);
        int i16 = this.f8067f;
        arrayList.add("totalResetsDueToClockLoss=" + i16);
        int i17 = this.f8068g;
        arrayList.add("totalResetsDueToSystemReset=" + i17);
        int i18 = this.f8069h;
        arrayList.add("totalResetsDueToWarmReset=" + i18);
        int i19 = this.f8070i;
        arrayList.add("totalResetsDueToWakeupFromShutdown=" + i19);
        int i21 = this.f8071j;
        arrayList.add("totalResetsDueToWakeupFromTCKNoise=" + i21);
        l02 = wz.e0.l0(arrayList, ", ", "ResetTrackerStats{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m42newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, okio.i unknownFields) {
        super(f8061k, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8062a = i11;
        this.f8063b = i12;
        this.f8064c = i13;
        this.f8065d = i14;
        this.f8066e = i15;
        this.f8067f = i16;
        this.f8068g = i17;
        this.f8069h = i18;
        this.f8070i = i19;
        this.f8071j = i21;
    }
}