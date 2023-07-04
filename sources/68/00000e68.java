package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class y2 extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<y2> f8277g;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.LRDetectionResult_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final j1 f8278a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "totalPeriodMs", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8279b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f8280c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f8281d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "zAccelerationDg", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f8282e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final int f8283f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<y2> {
        a(com.squareup.wire.b bVar, n00.d<y2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPLRDetection", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public y2 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            j1 j1Var = j1.LRDETECTIONRESULT_ERROR_MAXCNT;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new y2(j1Var, i11, i12, i13, i14, i15, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        try {
                            j1Var = j1.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 2:
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 3:
                        i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 4:
                        i13 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 5:
                        i14 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 6:
                        i15 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, y2 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != j1.LRDETECTIONRESULT_ERROR_MAXCNT) {
                j1.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.d()));
            }
            if (value.f() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.f()));
            }
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.e()));
            }
            if (value.h() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 5, Integer.valueOf(value.h()));
            }
            if (value.g() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.g()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(y2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != j1.LRDETECTIONRESULT_ERROR_MAXCNT) {
                z11 += j1.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.d()));
            }
            if (value.f() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.f()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.e()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.SINT32.encodedSizeWithTag(5, Integer.valueOf(value.h()));
            }
            return value.g() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.g())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public y2 redact(y2 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return y2.b(value, null, 0, 0, 0, 0, 0, okio.i.f42656d, 63, null);
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
        f8277g = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(y2.class), com.squareup.wire.o.PROTO_3);
    }

    public y2() {
        this(null, 0, 0, 0, 0, 0, null, 127, null);
    }

    public /* synthetic */ y2(j1 j1Var, int i11, int i12, int i13, int i14, int i15, okio.i iVar, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? j1.LRDETECTIONRESULT_ERROR_MAXCNT : j1Var, (i16 & 2) != 0 ? 0 : i11, (i16 & 4) != 0 ? 0 : i12, (i16 & 8) != 0 ? 0 : i13, (i16 & 16) != 0 ? 0 : i14, (i16 & 32) == 0 ? i15 : 0, (i16 & 64) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ y2 b(y2 y2Var, j1 j1Var, int i11, int i12, int i13, int i14, int i15, okio.i iVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            j1Var = y2Var.f8278a;
        }
        if ((i16 & 2) != 0) {
            i11 = y2Var.f8279b;
        }
        int i17 = i11;
        if ((i16 & 4) != 0) {
            i12 = y2Var.f8280c;
        }
        int i18 = i12;
        if ((i16 & 8) != 0) {
            i13 = y2Var.f8281d;
        }
        int i19 = i13;
        if ((i16 & 16) != 0) {
            i14 = y2Var.f8282e;
        }
        int i21 = i14;
        if ((i16 & 32) != 0) {
            i15 = y2Var.f8283f;
        }
        int i22 = i15;
        if ((i16 & 64) != 0) {
            iVar = y2Var.unknownFields();
        }
        return y2Var.a(j1Var, i17, i18, i19, i21, i22, iVar);
    }

    public final y2 a(j1 LRDetectionResult, int i11, int i12, int i13, int i14, int i15, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(LRDetectionResult, "LRDetectionResult");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new y2(LRDetectionResult, i11, i12, i13, i14, i15, unknownFields);
    }

    public final j1 c() {
        return this.f8278a;
    }

    public final int d() {
        return this.f8279b;
    }

    public final int e() {
        return this.f8281d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y2) {
            y2 y2Var = (y2) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), y2Var.unknownFields()) && this.f8278a == y2Var.f8278a && this.f8279b == y2Var.f8279b && this.f8280c == y2Var.f8280c && this.f8281d == y2Var.f8281d && this.f8282e == y2Var.f8282e && this.f8283f == y2Var.f8283f;
        }
        return false;
    }

    public final int f() {
        return this.f8280c;
    }

    public final int g() {
        return this.f8283f;
    }

    public final int h() {
        return this.f8282e;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((unknownFields().hashCode() * 37) + this.f8278a.hashCode()) * 37) + Integer.hashCode(this.f8279b)) * 37) + Integer.hashCode(this.f8280c)) * 37) + Integer.hashCode(this.f8281d)) * 37) + Integer.hashCode(this.f8282e)) * 37) + Integer.hashCode(this.f8283f);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m88newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        j1 j1Var = this.f8278a;
        arrayList.add("LRDetectionResult=" + j1Var);
        int i11 = this.f8279b;
        arrayList.add("totalPeriod_ms=" + i11);
        int i12 = this.f8280c;
        arrayList.add("x90degCnt=" + i12);
        int i13 = this.f8281d;
        arrayList.add("x270degCnt=" + i13);
        int i14 = this.f8282e;
        arrayList.add("zAcceleration_dg=" + i14);
        int i15 = this.f8283f;
        arrayList.add("zAccelDiffCnt=" + i15);
        l02 = wz.e0.l0(arrayList, ", ", "TPLRDetection{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m88newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(j1 LRDetectionResult, int i11, int i12, int i13, int i14, int i15, okio.i unknownFields) {
        super(f8277g, unknownFields);
        kotlin.jvm.internal.s.g(LRDetectionResult, "LRDetectionResult");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8278a = LRDetectionResult;
        this.f8279b = i11;
        this.f8280c = i12;
        this.f8281d = i13;
        this.f8282e = i14;
        this.f8283f = i15;
    }
}