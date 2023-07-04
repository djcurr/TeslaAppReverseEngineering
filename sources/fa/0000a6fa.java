package ot;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes6.dex */
public final class k extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<k> f44038b;
    @q(adapter = "com.tesla.generated.universalmessage.Domain#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final yt.b f44039a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<k> {
        a(com.squareup.wire.b bVar, n00.d<k> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.SessionInfoRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public k decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            yt.b bVar = yt.b.DOMAIN_BROADCAST;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new k(bVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        bVar = yt.b.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, k value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != yt.b.DOMAIN_BROADCAST) {
                yt.b.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(k value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return value.c() != yt.b.DOMAIN_BROADCAST ? z11 + yt.b.ADAPTER.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public k redact(k value) {
            s.g(value, "value");
            return k.b(value, null, okio.i.f42656d, 1, null);
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
        f44038b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(k.class), o.PROTO_3);
    }

    public k() {
        this(null, null, 3, null);
    }

    public /* synthetic */ k(yt.b bVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? yt.b.DOMAIN_BROADCAST : bVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ k b(k kVar, yt.b bVar, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = kVar.f44039a;
        }
        if ((i11 & 2) != 0) {
            iVar = kVar.unknownFields();
        }
        return kVar.a(bVar, iVar);
    }

    public final k a(yt.b domain, okio.i unknownFields) {
        s.g(domain, "domain");
        s.g(unknownFields, "unknownFields");
        return new k(domain, unknownFields);
    }

    public final yt.b c() {
        return this.f44039a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return s.c(unknownFields(), kVar.unknownFields()) && this.f44039a == kVar.f44039a;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f44039a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m963newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        yt.b bVar = this.f44039a;
        arrayList.add("domain=" + bVar);
        l02 = e0.l0(arrayList, ", ", "SessionInfoRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m963newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yt.b domain, okio.i unknownFields) {
        super(f44038b, unknownFields);
        s.g(domain, "domain");
        s.g(unknownFields, "unknownFields");
        this.f44039a = domain;
    }
}