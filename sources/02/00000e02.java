package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class r3 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<r3> f8193d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterStatusCode#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final s3 f8194a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UpdaterLocation#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final p3 f8195b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final int f8196c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<r3> {
        a(com.squareup.wire.b bVar, n00.d<r3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UpdaterStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public r3 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            s3 s3Var = s3.UPDATER_STATUS_CODE_ERROR;
            p3 p3Var = p3.UPDATER_LOCATION_NONE;
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new r3(s3Var, p3Var, i11, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        s3Var = s3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 2) {
                    try {
                        p3Var = p3.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, r3 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != s3.UPDATER_STATUS_CODE_ERROR) {
                s3.ADAPTER.encodeWithTag(writer, 1, value.e());
            }
            if (value.c() != p3.UPDATER_LOCATION_NONE) {
                p3.ADAPTER.encodeWithTag(writer, 2, value.c());
            }
            if (value.d() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.d()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(r3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != s3.UPDATER_STATUS_CODE_ERROR) {
                z11 += s3.ADAPTER.encodedSizeWithTag(1, value.e());
            }
            if (value.c() != p3.UPDATER_LOCATION_NONE) {
                z11 += p3.ADAPTER.encodedSizeWithTag(2, value.c());
            }
            return value.d() != 0 ? z11 + ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.d())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public r3 redact(r3 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return r3.b(value, null, null, 0, okio.i.f42656d, 7, null);
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
        f8193d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(r3.class), com.squareup.wire.o.PROTO_3);
    }

    public r3() {
        this(null, null, 0, null, 15, null);
    }

    public /* synthetic */ r3(s3 s3Var, p3 p3Var, int i11, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? s3.UPDATER_STATUS_CODE_ERROR : s3Var, (i12 & 2) != 0 ? p3.UPDATER_LOCATION_NONE : p3Var, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ r3 b(r3 r3Var, s3 s3Var, p3 p3Var, int i11, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            s3Var = r3Var.f8194a;
        }
        if ((i12 & 2) != 0) {
            p3Var = r3Var.f8195b;
        }
        if ((i12 & 4) != 0) {
            i11 = r3Var.f8196c;
        }
        if ((i12 & 8) != 0) {
            iVar = r3Var.unknownFields();
        }
        return r3Var.a(s3Var, p3Var, i11, iVar);
    }

    public final r3 a(s3 statusCode, p3 location, int i11, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(statusCode, "statusCode");
        kotlin.jvm.internal.s.g(location, "location");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new r3(statusCode, location, i11, unknownFields);
    }

    public final p3 c() {
        return this.f8195b;
    }

    public final int d() {
        return this.f8196c;
    }

    public final s3 e() {
        return this.f8194a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r3) {
            r3 r3Var = (r3) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), r3Var.unknownFields()) && this.f8194a == r3Var.f8194a && this.f8195b == r3Var.f8195b && this.f8196c == r3Var.f8196c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8194a.hashCode()) * 37) + this.f8195b.hashCode()) * 37) + Integer.hashCode(this.f8196c);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m69newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        s3 s3Var = this.f8194a;
        arrayList.add("statusCode=" + s3Var);
        p3 p3Var = this.f8195b;
        arrayList.add("location=" + p3Var);
        int i11 = this.f8196c;
        arrayList.add("nextAddressNumber=" + i11);
        l02 = wz.e0.l0(arrayList, ", ", "UpdaterStatus{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m69newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(s3 statusCode, p3 location, int i11, okio.i unknownFields) {
        super(f8193d, unknownFields);
        kotlin.jvm.internal.s.g(statusCode, "statusCode");
        kotlin.jvm.internal.s.g(location, "location");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8194a = statusCode;
        this.f8195b = location;
        this.f8196c = i11;
    }
}