package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class f3 extends com.squareup.wire.f {

    /* renamed from: h  reason: collision with root package name */
    public static final ProtoAdapter<f3> f7996h;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f7997a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f7998b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f7999c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final int f8000d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final int f8001e;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final int f8002f;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 7)

    /* renamed from: g  reason: collision with root package name */
    private final int f8003g;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f3> {
        a(com.squareup.wire.b bVar, n00.d<f3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.TPNotifyTrackerStats", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f3(i11, i12, i13, i14, i15, i16, i17, reader.e(d11));
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
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.g() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.g()));
            }
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (value.f() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.f()));
            }
            if (value.h() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.h()));
            }
            if (value.i() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.i()));
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.d()));
            }
            if (value.c() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.c()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.g() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.g()));
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            if (value.f() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.f()));
            }
            if (value.h() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.h()));
            }
            if (value.i() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.i()));
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.d()));
            }
            return value.c() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(7, Integer.valueOf(value.c())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f3 redact(f3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return f3.b(value, 0, 0, 0, 0, 0, 0, 0, okio.i.f42656d, 127, null);
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
        f7996h = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(f3.class), com.squareup.wire.o.PROTO_3);
    }

    public f3() {
        this(0, 0, 0, 0, 0, 0, 0, null, 255, null);
    }

    public /* synthetic */ f3(int i11, int i12, int i13, int i14, int i15, int i16, int i17, okio.i iVar, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i18 & 1) != 0 ? 0 : i11, (i18 & 2) != 0 ? 0 : i12, (i18 & 4) != 0 ? 0 : i13, (i18 & 8) != 0 ? 0 : i14, (i18 & 16) != 0 ? 0 : i15, (i18 & 32) != 0 ? 0 : i16, (i18 & 64) == 0 ? i17 : 0, (i18 & 128) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f3 b(f3 f3Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, okio.i iVar, int i18, Object obj) {
        return f3Var.a((i18 & 1) != 0 ? f3Var.f7997a : i11, (i18 & 2) != 0 ? f3Var.f7998b : i12, (i18 & 4) != 0 ? f3Var.f7999c : i13, (i18 & 8) != 0 ? f3Var.f8000d : i14, (i18 & 16) != 0 ? f3Var.f8001e : i15, (i18 & 32) != 0 ? f3Var.f8002f : i16, (i18 & 64) != 0 ? f3Var.f8003g : i17, (i18 & 128) != 0 ? f3Var.unknownFields() : iVar);
    }

    public final f3 a(int i11, int i12, int i13, int i14, int i15, int i16, int i17, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f3(i11, i12, i13, i14, i15, i16, i17, unknownFields);
    }

    public final int c() {
        return this.f8003g;
    }

    public final int d() {
        return this.f8002f;
    }

    public final int e() {
        return this.f7998b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), f3Var.unknownFields()) && this.f7997a == f3Var.f7997a && this.f7998b == f3Var.f7998b && this.f7999c == f3Var.f7999c && this.f8000d == f3Var.f8000d && this.f8001e == f3Var.f8001e && this.f8002f == f3Var.f8002f && this.f8003g == f3Var.f8003g;
        }
        return false;
    }

    public final int f() {
        return this.f7999c;
    }

    public final int g() {
        return this.f7997a;
    }

    public final int h() {
        return this.f8000d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f7997a)) * 37) + Integer.hashCode(this.f7998b)) * 37) + Integer.hashCode(this.f7999c)) * 37) + Integer.hashCode(this.f8000d)) * 37) + Integer.hashCode(this.f8001e)) * 37) + Integer.hashCode(this.f8002f)) * 37) + Integer.hashCode(this.f8003g);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    public final int i() {
        return this.f8001e;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m29newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f7997a;
        arrayList.add("notifyReasonUnknownCount=" + i11);
        int i12 = this.f7998b;
        arrayList.add("notifyReasonLowPressureCount=" + i12);
        int i13 = this.f7999c;
        arrayList.add("notifyReasonPTValueUpdateCount=" + i13);
        int i14 = this.f8000d;
        arrayList.add("notifyReasonWheelMovingCount=" + i14);
        int i15 = this.f8001e;
        arrayList.add("notifyReasonWheelRotationDirectionReadyCount=" + i15);
        int i16 = this.f8002f;
        arrayList.add("notifyReasonLFCount=" + i16);
        int i17 = this.f8003g;
        arrayList.add("notifyReasonFaultCount=" + i17);
        l02 = wz.e0.l0(arrayList, ", ", "TPNotifyTrackerStats{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m29newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(int i11, int i12, int i13, int i14, int i15, int i16, int i17, okio.i unknownFields) {
        super(f7996h, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7997a = i11;
        this.f7998b = i12;
        this.f7999c = i13;
        this.f8000d = i14;
        this.f8001e = i15;
        this.f8002f = i16;
        this.f8003g = i17;
    }
}