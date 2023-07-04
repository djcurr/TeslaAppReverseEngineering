package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class m1 extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<m1> f37525c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subscriberPublicKey", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: a  reason: collision with root package name */
    private final String f37526a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "piiKeyExpiration", label = q.a.OMIT_IDENTITY, tag = 4)

    /* renamed from: b  reason: collision with root package name */
    private final Instant f37527b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<m1> {
        a(com.squareup.wire.b bVar, n00.d<m1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PiiKeyRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public m1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            String str = "";
            Instant instant = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new m1(str, instant, reader.e(d11));
                } else if (g11 == 2) {
                    str = ProtoAdapter.STRING.decode(reader);
                } else if (g11 != 4) {
                    reader.m(g11);
                } else {
                    instant = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, m1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.d());
            }
            if (value.c() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(m1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!kotlin.jvm.internal.s.c(value.d(), "")) {
                z11 += ProtoAdapter.STRING.encodedSizeWithTag(2, value.d());
            }
            return value.c() != null ? z11 + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public m1 redact(m1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            Instant c11 = value.c();
            return m1.b(value, null, c11 == null ? null : ProtoAdapter.INSTANT.redact(c11), okio.i.f42656d, 1, null);
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
        f37525c = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(m1.class), com.squareup.wire.o.PROTO_3);
    }

    public m1() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ m1(String str, Instant instant, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ m1 b(m1 m1Var, String str, Instant instant, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = m1Var.f37526a;
        }
        if ((i11 & 2) != 0) {
            instant = m1Var.f37527b;
        }
        if ((i11 & 4) != 0) {
            iVar = m1Var.unknownFields();
        }
        return m1Var.a(str, instant, iVar);
    }

    public final m1 a(String subscriber_public_key, Instant instant, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(subscriber_public_key, "subscriber_public_key");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new m1(subscriber_public_key, instant, unknownFields);
    }

    public final Instant c() {
        return this.f37527b;
    }

    public final String d() {
        return this.f37526a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), m1Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f37526a, m1Var.f37526a) && kotlin.jvm.internal.s.c(this.f37527b, m1Var.f37527b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + this.f37526a.hashCode()) * 37;
            Instant instant = this.f37527b;
            int hashCode2 = hashCode + (instant != null ? instant.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m705newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        String i11 = mr.d.i(this.f37526a);
        arrayList.add("subscriber_public_key=" + i11);
        Instant instant = this.f37527b;
        if (instant != null) {
            arrayList.add("pii_key_expiration=" + instant);
        }
        l02 = wz.e0.l0(arrayList, ", ", "PiiKeyRequest{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m705newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(String subscriber_public_key, Instant instant, okio.i unknownFields) {
        super(f37525c, unknownFields);
        kotlin.jvm.internal.s.g(subscriber_public_key, "subscriber_public_key");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37526a = subscriber_public_key;
        this.f37527b = instant;
    }
}