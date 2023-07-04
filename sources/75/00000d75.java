package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class i1 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<i1> f8049d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f8050a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "batteryVoltageMV", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8051b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "temperatureDegreesC", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f8052c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<i1> {
        a(com.squareup.wire.b bVar, n00.d<i1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.KeyfobInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public i1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new i1(iVar, i11, i12, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    i12 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, i1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.d()));
            }
            if (value.e() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.e()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(i1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c());
            }
            if (value.d() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.d()));
            }
            return value.e() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.e())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public i1 redact(i1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return i1.b(value, null, 0, 0, okio.i.f42656d, 7, null);
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
        f8049d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(i1.class), com.squareup.wire.o.PROTO_3);
    }

    public i1() {
        this(null, 0, 0, null, 15, null);
    }

    public /* synthetic */ i1(okio.i iVar, int i11, int i12, okio.i iVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? okio.i.f42656d : iVar, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ i1 b(i1 i1Var, okio.i iVar, int i11, int i12, okio.i iVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iVar = i1Var.f8050a;
        }
        if ((i13 & 2) != 0) {
            i11 = i1Var.f8051b;
        }
        if ((i13 & 4) != 0) {
            i12 = i1Var.f8052c;
        }
        if ((i13 & 8) != 0) {
            iVar2 = i1Var.unknownFields();
        }
        return i1Var.a(iVar, i11, i12, iVar2);
    }

    public final i1 a(okio.i appCRC, int i11, int i12, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(appCRC, "appCRC");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new i1(appCRC, i11, i12, unknownFields);
    }

    public final okio.i c() {
        return this.f8050a;
    }

    public final int d() {
        return this.f8051b;
    }

    public final int e() {
        return this.f8052c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), i1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f8050a, i1Var.f8050a) && this.f8051b == i1Var.f8051b && this.f8052c == i1Var.f8052c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8050a.hashCode()) * 37) + Integer.hashCode(this.f8051b)) * 37) + Integer.hashCode(this.f8052c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m39newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f8050a;
        arrayList.add("appCRC=" + iVar);
        int i11 = this.f8051b;
        arrayList.add("batteryVoltage_mV=" + i11);
        int i12 = this.f8052c;
        arrayList.add("temperature_degreesC=" + i12);
        l02 = wz.e0.l0(arrayList, ", ", "KeyfobInfo{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m39newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(okio.i appCRC, int i11, int i12, okio.i unknownFields) {
        super(f8049d, unknownFields);
        kotlin.jvm.internal.s.g(appCRC, "appCRC");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8050a = appCRC;
        this.f8051b = i11;
        this.f8052c = i12;
    }
}