package yt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import okio.i;
import wz.e0;

/* loaded from: classes6.dex */
public final class g extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<g> f59765c;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "publicKey", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final i f59766a;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final i f59767b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, n00.d<g> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.SessionInfoRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public g decode(k reader) {
            s.g(reader, "reader");
            i iVar = i.f42656d;
            long d11 = reader.d();
            i iVar2 = iVar;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new g(iVar, iVar2, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    iVar2 = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, g value) {
            s.g(writer, "writer");
            s.g(value, "value");
            i d11 = value.d();
            i iVar = i.f42656d;
            if (!s.c(d11, iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.d());
            }
            if (!s.c(value.c(), iVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(g value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            i d11 = value.d();
            i iVar = i.f42656d;
            if (!s.c(d11, iVar)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.d());
            }
            return !s.c(value.c(), iVar) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public g redact(g value) {
            s.g(value, "value");
            return g.b(value, null, null, i.f42656d, 3, null);
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
        f59765c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(g.class), o.PROTO_3);
    }

    public g() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ g(i iVar, i iVar2, i iVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? i.f42656d : iVar, (i11 & 2) != 0 ? i.f42656d : iVar2, (i11 & 4) != 0 ? i.f42656d : iVar3);
    }

    public static /* synthetic */ g b(g gVar, i iVar, i iVar2, i iVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = gVar.f59766a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = gVar.f59767b;
        }
        if ((i11 & 4) != 0) {
            iVar3 = gVar.unknownFields();
        }
        return gVar.a(iVar, iVar2, iVar3);
    }

    public final g a(i public_key, i challenge, i unknownFields) {
        s.g(public_key, "public_key");
        s.g(challenge, "challenge");
        s.g(unknownFields, "unknownFields");
        return new g(public_key, challenge, unknownFields);
    }

    public final i c() {
        return this.f59767b;
    }

    public final i d() {
        return this.f59766a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return s.c(unknownFields(), gVar.unknownFields()) && s.c(this.f59766a, gVar.f59766a) && s.c(this.f59767b, gVar.f59767b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f59766a.hashCode()) * 37) + this.f59767b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1138newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        i iVar = this.f59766a;
        arrayList.add("public_key=" + iVar);
        i iVar2 = this.f59767b;
        arrayList.add("challenge=" + iVar2);
        l02 = e0.l0(arrayList, ", ", "SessionInfoRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1138newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i public_key, i challenge, i unknownFields) {
        super(f59765c, unknownFields);
        s.g(public_key, "public_key");
        s.g(challenge, "challenge");
        s.g(unknownFields, "unknownFields");
        this.f59766a = public_key;
        this.f59767b = challenge;
    }
}