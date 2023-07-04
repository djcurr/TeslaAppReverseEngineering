package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class o extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<o> f8133d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationLevel_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final j f8134a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final int f8135b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationRejection_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final l f8136c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<o> {
        a(com.squareup.wire.b bVar, n00.d<o> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AuthenticationResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public o decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            j jVar = j.AUTHENTICATION_LEVEL_NONE;
            l lVar = l.AUTHENTICATIONREJECTION_NONE;
            long d11 = reader.d();
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new o(jVar, i11, lVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        jVar = j.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 == 2) {
                    i11 = ProtoAdapter.UINT32.decode(reader).intValue();
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    try {
                        lVar = l.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, o value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.c() != j.AUTHENTICATION_LEVEL_NONE) {
                j.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.e() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.e()));
            }
            if (value.d() != l.AUTHENTICATIONREJECTION_NONE) {
                l.ADAPTER.encodeWithTag(writer, 3, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(o value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != j.AUTHENTICATION_LEVEL_NONE) {
                z11 += j.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            if (value.e() != 0) {
                z11 += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.e()));
            }
            return value.d() != l.AUTHENTICATIONREJECTION_NONE ? z11 + l.ADAPTER.encodedSizeWithTag(3, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public o redact(o value) {
            kotlin.jvm.internal.s.g(value, "value");
            return o.b(value, null, 0, null, okio.i.f42656d, 7, null);
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
        f8133d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(o.class), com.squareup.wire.o.PROTO_3);
    }

    public o() {
        this(null, 0, null, null, 15, null);
    }

    public /* synthetic */ o(j jVar, int i11, l lVar, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? j.AUTHENTICATION_LEVEL_NONE : jVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? l.AUTHENTICATIONREJECTION_NONE : lVar, (i12 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ o b(o oVar, j jVar, int i11, l lVar, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            jVar = oVar.f8134a;
        }
        if ((i12 & 2) != 0) {
            i11 = oVar.f8135b;
        }
        if ((i12 & 4) != 0) {
            lVar = oVar.f8136c;
        }
        if ((i12 & 8) != 0) {
            iVar = oVar.unknownFields();
        }
        return oVar.a(jVar, i11, lVar, iVar);
    }

    public final o a(j authenticationLevel, int i11, l authenticationRejection, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(authenticationLevel, "authenticationLevel");
        kotlin.jvm.internal.s.g(authenticationRejection, "authenticationRejection");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new o(authenticationLevel, i11, authenticationRejection, unknownFields);
    }

    public final j c() {
        return this.f8134a;
    }

    public final l d() {
        return this.f8136c;
    }

    public final int e() {
        return this.f8135b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), oVar.unknownFields()) && this.f8134a == oVar.f8134a && this.f8135b == oVar.f8135b && this.f8136c == oVar.f8136c;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((unknownFields().hashCode() * 37) + this.f8134a.hashCode()) * 37) + Integer.hashCode(this.f8135b)) * 37) + this.f8136c.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m57newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        j jVar = this.f8134a;
        arrayList.add("authenticationLevel=" + jVar);
        int i11 = this.f8135b;
        arrayList.add("estimatedDistance=" + i11);
        l lVar = this.f8136c;
        arrayList.add("authenticationRejection=" + lVar);
        l02 = wz.e0.l0(arrayList, ", ", "AuthenticationResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m57newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j authenticationLevel, int i11, l authenticationRejection, okio.i unknownFields) {
        super(f8133d, unknownFields);
        kotlin.jvm.internal.s.g(authenticationLevel, "authenticationLevel");
        kotlin.jvm.internal.s.g(authenticationRejection, "authenticationRejection");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8134a = authenticationLevel;
        this.f8135b = i11;
        this.f8136c = authenticationRejection;
    }
}