package xt;

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
public final class d extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<d> f57704b;
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f57705a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.HMAC_Signature_Data", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d(iVar, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, d value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            s.g(value, "value");
            return d.b(value, null, okio.i.f42656d, 1, null);
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
        f57704b = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), o.PROTO_3);
    }

    public d() {
        this(null, null, 3, null);
    }

    public /* synthetic */ d(okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ d b(d dVar, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = dVar.f57705a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = dVar.unknownFields();
        }
        return dVar.a(iVar, iVar2);
    }

    public final d a(okio.i tag, okio.i unknownFields) {
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        return new d(tag, unknownFields);
    }

    public final okio.i c() {
        return this.f57705a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return s.c(unknownFields(), dVar.unknownFields()) && s.c(this.f57705a, dVar.f57705a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f57705a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1128newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f57705a;
        arrayList.add("tag=" + iVar);
        l02 = e0.l0(arrayList, ", ", "HMAC_Signature_Data{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1128newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(okio.i tag, okio.i unknownFields) {
        super(f57704b, unknownFields);
        s.g(tag, "tag");
        s.g(unknownFields, "unknownFields");
        this.f57705a = tag;
    }
}