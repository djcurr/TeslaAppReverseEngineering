package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class n1 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<n1> f37534d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "encryptedPiiKey", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f37535a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "piiKeyExpiration", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: b  reason: collision with root package name */
    private final Instant f37536b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "subscriberPublicKeyExpiration", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: c  reason: collision with root package name */
    private final Instant f37537c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<n1> {
        a(com.squareup.wire.b bVar, n00.d<n1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PiiKeyResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public n1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            Instant instant = null;
            Instant instant2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new n1(iVar, instant, instant2, reader.e(d11));
                } else if (g11 == 2) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else if (g11 == 3) {
                    instant = ProtoAdapter.INSTANT.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    instant2 = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, n1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.c());
            }
            if (value.d() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.d());
            }
            if (value.e() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.e());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(n1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                z11 += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.c());
            }
            if (value.d() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.d());
            }
            return value.e() != null ? z11 + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.e()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public n1 redact(n1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            Instant d11 = value.d();
            Instant redact = d11 == null ? null : ProtoAdapter.INSTANT.redact(d11);
            Instant e11 = value.e();
            return n1.b(value, null, redact, e11 != null ? ProtoAdapter.INSTANT.redact(e11) : null, okio.i.f42656d, 1, null);
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
        f37534d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(n1.class), com.squareup.wire.o.PROTO_3);
    }

    public n1() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ n1(okio.i iVar, Instant instant, Instant instant2, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? null : instant2, (i11 & 8) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ n1 b(n1 n1Var, okio.i iVar, Instant instant, Instant instant2, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = n1Var.f37535a;
        }
        if ((i11 & 2) != 0) {
            instant = n1Var.f37536b;
        }
        if ((i11 & 4) != 0) {
            instant2 = n1Var.f37537c;
        }
        if ((i11 & 8) != 0) {
            iVar2 = n1Var.unknownFields();
        }
        return n1Var.a(iVar, instant, instant2, iVar2);
    }

    public final n1 a(okio.i encrypted_pii_key, Instant instant, Instant instant2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(encrypted_pii_key, "encrypted_pii_key");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new n1(encrypted_pii_key, instant, instant2, unknownFields);
    }

    public final okio.i c() {
        return this.f37535a;
    }

    public final Instant d() {
        return this.f37536b;
    }

    public final Instant e() {
        return this.f37537c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            n1 n1Var = (n1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), n1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37535a, n1Var.f37535a) && kotlin.jvm.internal.s.c(this.f37536b, n1Var.f37536b) && kotlin.jvm.internal.s.c(this.f37537c, n1Var.f37537c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f37535a.hashCode()) * 37;
            Instant instant = this.f37536b;
            int hashCode2 = (hashCode + (instant != null ? instant.hashCode() : 0)) * 37;
            Instant instant2 = this.f37537c;
            int hashCode3 = hashCode2 + (instant2 != null ? instant2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m709newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f37535a;
        arrayList.add("encrypted_pii_key=" + iVar);
        Instant instant = this.f37536b;
        if (instant != null) {
            arrayList.add("pii_key_expiration=" + instant);
        }
        Instant instant2 = this.f37537c;
        if (instant2 != null) {
            arrayList.add("subscriber_public_key_expiration=" + instant2);
        }
        l02 = wz.e0.l0(arrayList, ", ", "PiiKeyResponse{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m709newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(okio.i encrypted_pii_key, Instant instant, Instant instant2, okio.i unknownFields) {
        super(f37534d, unknownFields);
        kotlin.jvm.internal.s.g(encrypted_pii_key, "encrypted_pii_key");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37535a = encrypted_pii_key;
        this.f37536b = instant;
        this.f37537c = instant2;
    }
}