package lt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import j$.time.Instant;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class o1 extends com.squareup.wire.f {

    /* renamed from: d  reason: collision with root package name */
    public static final ProtoAdapter<o1> f37543d;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pingId", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final int f37544a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "localTimestamp", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final Instant f37545b;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastRemoteTimestamp", label = q.a.OMIT_IDENTITY, tag = 3)

    /* renamed from: c  reason: collision with root package name */
    private final Instant f37546c;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<o1> {
        a(com.squareup.wire.b bVar, n00.d<o1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Ping", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public o1 decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            Instant instant = null;
            int i11 = 0;
            Instant instant2 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new o1(i11, instant, instant2, reader.e(d11));
                } else if (g11 == 1) {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (g11 == 2) {
                    instant = ProtoAdapter.INSTANT.decode(reader);
                } else if (g11 != 3) {
                    reader.m(g11);
                } else {
                    instant2 = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, o1 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.e() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.e()));
            }
            if (value.d() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, value.d());
            }
            if (value.c() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.c());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(o1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.e() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.e()));
            }
            if (value.d() != null) {
                z11 += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.d());
            }
            return value.c() != null ? z11 + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.c()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public o1 redact(o1 value) {
            kotlin.jvm.internal.s.g(value, "value");
            Instant d11 = value.d();
            Instant redact = d11 == null ? null : ProtoAdapter.INSTANT.redact(d11);
            Instant c11 = value.c();
            return o1.b(value, 0, redact, c11 != null ? ProtoAdapter.INSTANT.redact(c11) : null, okio.i.f42656d, 1, null);
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
        f37543d = new a(com.squareup.wire.b.LENGTH_DELIMITED, kotlin.jvm.internal.m0.b(o1.class), com.squareup.wire.o.PROTO_3);
    }

    public o1() {
        this(0, null, null, null, 15, null);
    }

    public /* synthetic */ o1(int i11, Instant instant, Instant instant2, okio.i iVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : instant, (i12 & 4) != 0 ? null : instant2, (i12 & 8) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ o1 b(o1 o1Var, int i11, Instant instant, Instant instant2, okio.i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = o1Var.f37544a;
        }
        if ((i12 & 2) != 0) {
            instant = o1Var.f37545b;
        }
        if ((i12 & 4) != 0) {
            instant2 = o1Var.f37546c;
        }
        if ((i12 & 8) != 0) {
            iVar = o1Var.unknownFields();
        }
        return o1Var.a(i11, instant, instant2, iVar);
    }

    public final o1 a(int i11, Instant instant, Instant instant2, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new o1(i11, instant, instant2, unknownFields);
    }

    public final Instant c() {
        return this.f37546c;
    }

    public final Instant d() {
        return this.f37545b;
    }

    public final int e() {
        return this.f37544a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            o1 o1Var = (o1) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), o1Var.unknownFields()) && this.f37544a == o1Var.f37544a && kotlin.jvm.internal.s.c(this.f37545b, o1Var.f37545b) && kotlin.jvm.internal.s.c(this.f37546c, o1Var.f37546c);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.f37544a)) * 37;
            Instant instant = this.f37545b;
            int hashCode2 = (hashCode + (instant != null ? instant.hashCode() : 0)) * 37;
            Instant instant2 = this.f37546c;
            int hashCode3 = hashCode2 + (instant2 != null ? instant2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m713newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.f37544a;
        arrayList.add("ping_id=" + i11);
        Instant instant = this.f37545b;
        if (instant != null) {
            arrayList.add("local_timestamp=" + instant);
        }
        Instant instant2 = this.f37546c;
        if (instant2 != null) {
            arrayList.add("last_remote_timestamp=" + instant2);
        }
        l02 = wz.e0.l0(arrayList, ", ", "Ping{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m713newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(int i11, Instant instant, Instant instant2, okio.i unknownFields) {
        super(f37543d, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f37544a = i11;
        this.f37545b = instant;
        this.f37546c = instant2;
    }
}