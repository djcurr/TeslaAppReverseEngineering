package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class f extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<f> f7987g;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "timeSinceAlertSetMs", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f7988a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.HandlePulled_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final y0 f7989b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f7990c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7991d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 5)

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7992e;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.HandlePulledWithoutAuthDeviceSpecificPayload#ADAPTER", label = q.a.REPEATED, tag = 6)

    /* renamed from: f  reason: collision with root package name */
    private final List<x0> f7993f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<f> {
        a(com.squareup.wire.b bVar, n00.d<f> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AlertHandlePulledWithoutAuth", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public f decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            y0 y0Var = y0.HANDLE_PULLED_FRONT_DRIVER_DOOR;
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new f(i11, y0Var, i12, z11, z12, arrayList, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 2:
                        try {
                            y0Var = y0.ADAPTER.decode(reader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                            break;
                        }
                    case 3:
                        i12 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 4:
                        z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 5:
                        z12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 6:
                        arrayList.add(x0.E.decode(reader));
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, f value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.g() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.g()));
            }
            if (value.f() != y0.HANDLE_PULLED_FRONT_DRIVER_DOOR) {
                y0.ADAPTER.encodeWithTag(writer, 2, value.f());
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.d()));
            }
            if (value.h()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.h()));
            }
            if (value.c()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.c()));
            }
            x0.E.asRepeated().encodeWithTag(writer, 6, value.e());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(f value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.g() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.g()));
            }
            if (value.f() != y0.HANDLE_PULLED_FRONT_DRIVER_DOOR) {
                z11 += y0.ADAPTER.encodedSizeWithTag(2, value.f());
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.d()));
            }
            if (value.h()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.h()));
            }
            if (value.c()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.c()));
            }
            return z11 + x0.E.asRepeated().encodedSizeWithTag(6, value.e());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public f redact(f value) {
            kotlin.jvm.internal.s.g(value, "value");
            return f.b(value, 0, null, 0, false, false, mr.d.a(value.e(), x0.E), okio.i.f42656d, 31, null);
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
        f7987g = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(f.class), com.squareup.wire.o.PROTO_3);
    }

    public f() {
        this(0, null, 0, false, false, null, null, 127, null);
    }

    public /* synthetic */ f(int i11, y0 y0Var, int i12, boolean z11, boolean z12, List list, okio.i iVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? y0.HANDLE_PULLED_FRONT_DRIVER_DOOR : y0Var, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? false : z11, (i13 & 16) == 0 ? z12 : false, (i13 & 32) != 0 ? wz.w.i() : list, (i13 & 64) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ f b(f fVar, int i11, y0 y0Var, int i12, boolean z11, boolean z12, List list, okio.i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = fVar.f7988a;
        }
        if ((i13 & 2) != 0) {
            y0Var = fVar.f7989b;
        }
        y0 y0Var2 = y0Var;
        if ((i13 & 4) != 0) {
            i12 = fVar.f7990c;
        }
        int i14 = i12;
        if ((i13 & 8) != 0) {
            z11 = fVar.f7991d;
        }
        boolean z13 = z11;
        if ((i13 & 16) != 0) {
            z12 = fVar.f7992e;
        }
        boolean z14 = z12;
        List<x0> list2 = list;
        if ((i13 & 32) != 0) {
            list2 = fVar.f7993f;
        }
        List list3 = list2;
        if ((i13 & 64) != 0) {
            iVar = fVar.unknownFields();
        }
        return fVar.a(i11, y0Var2, i14, z13, z14, list3, iVar);
    }

    public final f a(int i11, y0 handlePulled, int i12, boolean z11, boolean z12, List<x0> deviceSpecificPayload, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(handlePulled, "handlePulled");
        kotlin.jvm.internal.s.g(deviceSpecificPayload, "deviceSpecificPayload");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new f(i11, handlePulled, i12, z11, z12, deviceSpecificPayload, unknownFields);
    }

    public final boolean c() {
        return this.f7992e;
    }

    public final int d() {
        return this.f7990c;
    }

    public final List<x0> e() {
        return this.f7993f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), fVar.unknownFields()) && this.f7988a == fVar.f7988a && this.f7989b == fVar.f7989b && this.f7990c == fVar.f7990c && this.f7991d == fVar.f7991d && this.f7992e == fVar.f7992e && kotlin.jvm.internal.s.c(this.f7993f, fVar.f7993f);
        }
        return false;
    }

    public final y0 f() {
        return this.f7989b;
    }

    public final int g() {
        return this.f7988a;
    }

    public final boolean h() {
        return this.f7991d;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.f7988a)) * 37) + this.f7989b.hashCode()) * 37) + Integer.hashCode(this.f7990c)) * 37) + Boolean.hashCode(this.f7991d)) * 37) + Boolean.hashCode(this.f7992e)) * 37) + this.f7993f.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m27newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f7988a;
        arrayList.add("timeSinceAlertSet_ms=" + i11);
        y0 y0Var = this.f7989b;
        arrayList.add("handlePulled=" + y0Var);
        int i12 = this.f7990c;
        arrayList.add("connectionCount=" + i12);
        boolean z11 = this.f7991d;
        arrayList.add("unknownDevicePresent=" + z11);
        boolean z12 = this.f7992e;
        arrayList.add("authRequested=" + z12);
        if (!this.f7993f.isEmpty()) {
            List<x0> list = this.f7993f;
            arrayList.add("deviceSpecificPayload=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "AlertHandlePulledWithoutAuth{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m27newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i11, y0 handlePulled, int i12, boolean z11, boolean z12, List<x0> deviceSpecificPayload, okio.i unknownFields) {
        super(f7987g, unknownFields);
        kotlin.jvm.internal.s.g(handlePulled, "handlePulled");
        kotlin.jvm.internal.s.g(deviceSpecificPayload, "deviceSpecificPayload");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7988a = i11;
        this.f7989b = handlePulled;
        this.f7990c = i12;
        this.f7991d = z11;
        this.f7992e = z12;
        this.f7993f = mr.d.g("deviceSpecificPayload", deviceSpecificPayload);
    }
}