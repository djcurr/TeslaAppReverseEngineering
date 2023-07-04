package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class m extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<m> f8093d;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationRequestToken#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final n f8094a;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationLevel_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final j f8095b;
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationReason_E#ADAPTER", label = q.a.REPEATED, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final List<k> f8096c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m> {
        a(com.squareup.wire.b bVar, n00.d<m> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AuthenticationRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            j jVar = j.AUTHENTICATION_LEVEL_NONE;
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            n nVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m(nVar, jVar, arrayList, reader.e(d11));
                } else if (g11 == 2) {
                    nVar = n.f8105b.decode(reader);
                } else if (g11 == 3) {
                    try {
                        jVar = j.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    try {
                        arrayList.add(k.ADAPTER.decode(reader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                        vz.b0 b0Var = vz.b0.f54756a;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, m value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != null) {
                n.f8105b.encodeWithTag(writer, 2, value.e());
            }
            if (value.d() != j.AUTHENTICATION_LEVEL_NONE) {
                j.ADAPTER.encodeWithTag(writer, 3, value.d());
            }
            k.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != null) {
                z11 += n.f8105b.encodedSizeWithTag(2, value.e());
            }
            if (value.d() != j.AUTHENTICATION_LEVEL_NONE) {
                z11 += j.ADAPTER.encodedSizeWithTag(3, value.d());
            }
            return z11 + k.ADAPTER.asRepeated().encodedSizeWithTag(4, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m redact(m value) {
            kotlin.jvm.internal.s.g(value, "value");
            n e11 = value.e();
            return m.b(value, e11 == null ? null : n.f8105b.redact(e11), null, null, okio.i.f42656d, 6, null);
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
        f8093d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(m.class), com.squareup.wire.o.PROTO_3);
    }

    public m() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ m(n nVar, j jVar, List list, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : nVar, (i11 & 2) != 0 ? j.AUTHENTICATION_LEVEL_NONE : jVar, (i11 & 4) != 0 ? wz.w.i() : list, (i11 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ m b(m mVar, n nVar, j jVar, List list, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nVar = mVar.f8094a;
        }
        if ((i11 & 2) != 0) {
            jVar = mVar.f8095b;
        }
        if ((i11 & 4) != 0) {
            list = mVar.f8096c;
        }
        if ((i11 & 8) != 0) {
            iVar = mVar.unknownFields();
        }
        return mVar.a(nVar, jVar, list, iVar);
    }

    public final m a(n nVar, j requestedLevel, List<? extends k> reasonsForAuth, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(requestedLevel, "requestedLevel");
        kotlin.jvm.internal.s.g(reasonsForAuth, "reasonsForAuth");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m(nVar, requestedLevel, reasonsForAuth, unknownFields);
    }

    public final List<k> c() {
        return this.f8096c;
    }

    public final j d() {
        return this.f8095b;
    }

    public final n e() {
        return this.f8094a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), mVar.unknownFields()) && kotlin.jvm.internal.s.c(this.f8094a, mVar.f8094a) && this.f8095b == mVar.f8095b && kotlin.jvm.internal.s.c(this.f8096c, mVar.f8096c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            n nVar = this.f8094a;
            int hashCode2 = ((((hashCode + (nVar != null ? nVar.hashCode() : 0)) * 37) + this.f8095b.hashCode()) * 37) + this.f8096c.hashCode();
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m50newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        n nVar = this.f8094a;
        if (nVar != null) {
            arrayList.add("sessionInfo=" + nVar);
        }
        j jVar = this.f8095b;
        arrayList.add("requestedLevel=" + jVar);
        if (!this.f8096c.isEmpty()) {
            List<k> list = this.f8096c;
            arrayList.add("reasonsForAuth=" + list);
        }
        l02 = wz.e0.l0(arrayList, ", ", "AuthenticationRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m50newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, j requestedLevel, List<? extends k> reasonsForAuth, okio.i unknownFields) {
        super(f8093d, unknownFields);
        kotlin.jvm.internal.s.g(requestedLevel, "requestedLevel");
        kotlin.jvm.internal.s.g(reasonsForAuth, "reasonsForAuth");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f8094a = nVar;
        this.f8095b = requestedLevel;
        this.f8096c = mr.d.g("reasonsForAuth", reasonsForAuth);
    }
}