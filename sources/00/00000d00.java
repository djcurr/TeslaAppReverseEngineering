package bu;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class b0 extends com.squareup.wire.f {

    /* renamed from: b  reason: collision with root package name */
    public static final ProtoAdapter<b0> f7934b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final okio.i f7935a;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b0> {
        a(com.squareup.wire.b bVar, n00.d<b0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ChallengeCommand", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public b0 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            okio.i iVar = okio.i.f42656d;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new b0(iVar, reader.e(d11));
                } else if (g11 == 1) {
                    iVar = ProtoAdapter.BYTES.decode(reader);
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (!kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !kotlin.jvm.internal.s.c(value.c(), okio.i.f42656d) ? z11 + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public b0 redact(b0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return b0.b(value, null, okio.i.f42656d, 1, null);
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
        f7934b = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(b0.class), com.squareup.wire.o.PROTO_3);
    }

    public b0() {
        this(null, null, 3, null);
    }

    public /* synthetic */ b0(okio.i iVar, okio.i iVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.i.f42656d : iVar, (i11 & 2) != 0 ? okio.i.f42656d : iVar2);
    }

    public static /* synthetic */ b0 b(b0 b0Var, okio.i iVar, okio.i iVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = b0Var.f7935a;
        }
        if ((i11 & 2) != 0) {
            iVar2 = b0Var.unknownFields();
        }
        return b0Var.a(iVar, iVar2);
    }

    public final b0 a(okio.i challenge, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(challenge, "challenge");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new b0(challenge, unknownFields);
    }

    public final okio.i c() {
        return this.f7935a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), b0Var.unknownFields()) && kotlin.jvm.internal.s.c(this.f7935a, b0Var.f7935a);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + this.f7935a.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m13newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        okio.i iVar = this.f7935a;
        arrayList.add("challenge=" + iVar);
        l02 = wz.e0.l0(arrayList, ", ", "ChallengeCommand{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m13newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(okio.i challenge, okio.i unknownFields) {
        super(f7934b, unknownFields);
        kotlin.jvm.internal.s.g(challenge, "challenge");
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f7935a = challenge;
    }
}