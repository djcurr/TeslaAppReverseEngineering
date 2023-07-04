package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class g extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<g> f8004d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "hardwareModelSha256", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8005a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppOperatingSystem#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final i f8006b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UWBAvailability#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final k3 f8007c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, n00.d<g> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AppDeviceInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            i iVar2 = i.UNKNOWN;
            k3 k3Var = k3.UWB_AVAILABILITY_UNKNOWN;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g(iVar, iVar2, k3Var, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    try {
                        iVar2 = i.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        k3Var = k3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, g value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != i.UNKNOWN) {
                i.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            if (value.e() != k3.UWB_AVAILABILITY_UNKNOWN) {
                k3.ADAPTER.encodeWithTag(writer, 3, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c());
            }
            if (value.d() != i.UNKNOWN) {
                z11 += i.ADAPTER.encodedSizeWithTag(2, value.d());
            }
            return value.e() != k3.UWB_AVAILABILITY_UNKNOWN ? z11 + k3.ADAPTER.encodedSizeWithTag(3, value.e()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g redact(g value) {
            kotlin.jvm.internal.s.g(value, "value");
            return g.b(value, null, null, null, okio.i.f42656d, 7, null);
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
        f8004d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(g.class), com.squareup.wire.o.PROTO_3);
    }

    public g() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ g(okio.i iVar, i iVar2, k3 k3Var, okio.i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? i.UNKNOWN : iVar2, (i11 & 4) != 0 ? k3.UWB_AVAILABILITY_UNKNOWN : k3Var, (i11 & 8) != 0 ? okio.i.f42656d : iVar3);
    }

    public static /* synthetic */ g b(g gVar, okio.i iVar, i iVar2, k3 k3Var, okio.i iVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = gVar.f8005a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = gVar.f8006b;
        }
        if ((i11 & 4) != 0) {
            k3Var = gVar.f8007c;
        }
        if ((i11 & 8) != 0) {
            iVar3 = gVar.unknownFields();
        }
        return gVar.a(iVar, iVar2, k3Var, iVar3);
    }

    public final g a(okio.i hardware_model_sha256, i os2, k3 UWBAvailable, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(hardware_model_sha256, "hardware_model_sha256");
        kotlin.jvm.internal.s.g(os2, "os");
        kotlin.jvm.internal.s.g(UWBAvailable, "UWBAvailable");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new g(hardware_model_sha256, os2, UWBAvailable, unknownFields);
    }

    public final okio.i c() {
        return this.f8005a;
    }

    public final i d() {
        return this.f8006b;
    }

    public final k3 e() {
        return this.f8007c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), gVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f8005a, gVar.f8005a) && this.f8006b == gVar.f8006b && this.f8007c == gVar.f8007c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8005a.hashCode()) * 37) + this.f8006b.hashCode()) * 37) + this.f8007c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m30newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8005a;
        arrayList.add("hardware_model_sha256=" + iVar);
        i iVar2 = this.f8006b;
        arrayList.add("os=" + iVar2);
        k3 k3Var = this.f8007c;
        arrayList.add("UWBAvailable=" + k3Var);
        l02 = wz.e0.l0(arrayList, ", ", "AppDeviceInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m30newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(okio.i hardware_model_sha256, i os2, k3 UWBAvailable, okio.i unknownFields) {
        super(f8004d, unknownFields);
        kotlin.jvm.internal.s.g(hardware_model_sha256, "hardware_model_sha256");
        kotlin.jvm.internal.s.g(os2, "os");
        kotlin.jvm.internal.s.g(UWBAvailable, "UWBAvailable");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8005a = hardware_model_sha256;
        this.f8006b = os2;
        this.f8007c = UWBAvailable;
    }
}