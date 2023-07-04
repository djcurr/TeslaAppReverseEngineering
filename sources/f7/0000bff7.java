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
public final class j extends com.squareup.wire.f {

    /* renamed from: g  reason: collision with root package name */
    public static final ProtoAdapter<j> f57720g;
    @q(adapter = "com.tesla.generated.signatures.KeyIdentity#ADAPTER", jsonName = "signerIdentity", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e f57721a;
    @q(adapter = "com.tesla.generated.signatures.Present_Key_Signature_Data#ADAPTER", jsonName = "PresentKeyData", tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final f f57722b;
    @q(adapter = "com.tesla.generated.signatures.AES_GCM_Personalized_Signature_Data#ADAPTER", jsonName = "AESGCMPersonalizedData", tag = 5)

    /* renamed from: c  reason: collision with root package name */
    private final xt.a f57723c;
    @q(adapter = "com.tesla.generated.signatures.HMAC_Signature_Data#ADAPTER", jsonName = "sessionInfoTag", tag = 6)

    /* renamed from: d  reason: collision with root package name */
    private final d f57724d;
    @q(adapter = "com.tesla.generated.signatures.RSA_Signature_Data#ADAPTER", jsonName = "RSAData", tag = 7)

    /* renamed from: e  reason: collision with root package name */
    private final g f57725e;
    @q(adapter = "com.tesla.generated.signatures.HMAC_Personalized_Signature_Data#ADAPTER", jsonName = "HMACPersonalizedData", tag = 8)

    /* renamed from: f  reason: collision with root package name */
    private final c f57726f;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, n00.d<j> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.SignatureData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public j mo28decode(com.squareup.wire.k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            e eVar = null;
            f fVar = null;
            xt.a aVar = null;
            d dVar = null;
            g gVar = null;
            c cVar = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new j(eVar, fVar, aVar, dVar, gVar, cVar, reader.e(d11));
                } else if (g11 == 1) {
                    eVar = e.f57706c.mo28decode(reader);
                } else if (g11 == 2) {
                    fVar = f.f57709b.mo28decode(reader);
                } else if (g11 == 5) {
                    aVar = xt.a.f57691f.mo28decode(reader);
                } else if (g11 == 6) {
                    dVar = d.f57704b.mo28decode(reader);
                } else if (g11 == 7) {
                    gVar = g.f57711c.mo28decode(reader);
                } else if (g11 != 8) {
                    reader.m(g11);
                } else {
                    cVar = c.f57699e.mo28decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, j value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.g() != null) {
                e.f57706c.encodeWithTag(writer, 1, value.g());
            }
            f.f57709b.encodeWithTag(writer, 2, value.d());
            xt.a.f57691f.encodeWithTag(writer, 5, value.b());
            d.f57704b.encodeWithTag(writer, 6, value.f());
            g.f57711c.encodeWithTag(writer, 7, value.e());
            c.f57699e.encodeWithTag(writer, 8, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(j value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.g() != null) {
                z11 += e.f57706c.encodedSizeWithTag(1, value.g());
            }
            return z11 + f.f57709b.encodedSizeWithTag(2, value.d()) + xt.a.f57691f.encodedSizeWithTag(5, value.b()) + d.f57704b.encodedSizeWithTag(6, value.f()) + g.f57711c.encodedSizeWithTag(7, value.e()) + c.f57699e.encodedSizeWithTag(8, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public j redact(j value) {
            s.g(value, "value");
            e g11 = value.g();
            e redact = g11 == null ? null : e.f57706c.redact(g11);
            f d11 = value.d();
            f redact2 = d11 == null ? null : f.f57709b.redact(d11);
            xt.a b11 = value.b();
            xt.a redact3 = b11 == null ? null : xt.a.f57691f.redact(b11);
            d f11 = value.f();
            d redact4 = f11 == null ? null : d.f57704b.redact(f11);
            g e11 = value.e();
            g redact5 = e11 == null ? null : g.f57711c.redact(e11);
            c c11 = value.c();
            return value.a(redact, redact2, redact3, redact4, redact5, c11 != null ? c.f57699e.redact(c11) : null, okio.i.f42656d);
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
        f57720g = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(j.class), o.PROTO_3);
    }

    public j() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public /* synthetic */ j(e eVar, f fVar, xt.a aVar, d dVar, g gVar, c cVar, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : eVar, (i11 & 2) != 0 ? null : fVar, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? null : dVar, (i11 & 16) != 0 ? null : gVar, (i11 & 32) == 0 ? cVar : null, (i11 & 64) != 0 ? okio.i.f42656d : iVar);
    }

    public final j a(e eVar, f fVar, xt.a aVar, d dVar, g gVar, c cVar, okio.i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new j(eVar, fVar, aVar, dVar, gVar, cVar, unknownFields);
    }

    public final xt.a b() {
        return this.f57723c;
    }

    public final c c() {
        return this.f57726f;
    }

    public final f d() {
        return this.f57722b;
    }

    public final g e() {
        return this.f57725e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return s.c(unknownFields(), jVar.unknownFields()) && s.c(this.f57721a, jVar.f57721a) && s.c(this.f57722b, jVar.f57722b) && s.c(this.f57723c, jVar.f57723c) && s.c(this.f57724d, jVar.f57724d) && s.c(this.f57725e, jVar.f57725e) && s.c(this.f57726f, jVar.f57726f);
        }
        return false;
    }

    public final d f() {
        return this.f57724d;
    }

    public final e g() {
        return this.f57721a;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            e eVar = this.f57721a;
            int hashCode2 = (hashCode + (eVar != null ? eVar.hashCode() : 0)) * 37;
            f fVar = this.f57722b;
            int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 37;
            xt.a aVar = this.f57723c;
            int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 37;
            d dVar = this.f57724d;
            int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 37;
            g gVar = this.f57725e;
            int hashCode6 = (hashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 37;
            c cVar = this.f57726f;
            int hashCode7 = hashCode6 + (cVar != null ? cVar.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1133newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e eVar = this.f57721a;
        if (eVar != null) {
            arrayList.add("signer_identity=" + eVar);
        }
        f fVar = this.f57722b;
        if (fVar != null) {
            arrayList.add("Present_Key_data=" + fVar);
        }
        xt.a aVar = this.f57723c;
        if (aVar != null) {
            arrayList.add("AES_GCM_Personalized_data=" + aVar);
        }
        d dVar = this.f57724d;
        if (dVar != null) {
            arrayList.add("session_info_tag=" + dVar);
        }
        g gVar = this.f57725e;
        if (gVar != null) {
            arrayList.add("RSA_data=" + gVar);
        }
        c cVar = this.f57726f;
        if (cVar != null) {
            arrayList.add("HMAC_Personalized_data=" + cVar);
        }
        l02 = e0.l0(arrayList, ", ", "SignatureData{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1133newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, f fVar, xt.a aVar, d dVar, g gVar, c cVar, okio.i unknownFields) {
        super(f57720g, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.f57721a = eVar;
        this.f57722b = fVar;
        this.f57723c = aVar;
        this.f57724d = dVar;
        this.f57725e = gVar;
        this.f57726f = cVar;
        if (!(mr.d.e(fVar, aVar, dVar, gVar, cVar) <= 1)) {
            throw new IllegalArgumentException("At most one of Present_Key_data, AES_GCM_Personalized_data, session_info_tag, RSA_data, HMAC_Personalized_data may be non-null".toString());
        }
    }
}