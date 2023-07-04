package mt;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import wz.e0;

/* loaded from: classes6.dex */
public final class r extends com.squareup.wire.f {

    /* renamed from: c */
    public static final ProtoAdapter<r> f39247c;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteControlEnabledOBSOLETE", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a */
    private final boolean f39248a;
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteControlEnabled", tag = 101)

    /* renamed from: b */
    private final Boolean f39249b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<r> {
        a(com.squareup.wire.b bVar, n00.d<r> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.MediaState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public r decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            boolean z11 = false;
            Boolean bool = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new r(z11, bool, reader.e(d11));
                } else if (g11 == 1) {
                    z11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (g11 != 101) {
                    reader.m(g11);
                } else {
                    bool = ProtoAdapter.BOOL.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, r value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            if (value.d()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.d()));
            }
            ProtoAdapter.BOOL.encodeWithTag(writer, 101, value.c());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(r value) {
            kotlin.jvm.internal.s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.d()) {
                z11 += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.d()));
            }
            return z11 + ProtoAdapter.BOOL.encodedSizeWithTag(101, value.c());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public r redact(r value) {
            kotlin.jvm.internal.s.g(value, "value");
            return r.b(value, false, null, okio.i.f42656d, 3, null);
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
        f39247c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(r.class), com.squareup.wire.o.PROTO_3);
    }

    public r() {
        this(false, null, null, 7, null);
    }

    public /* synthetic */ r(boolean z11, Boolean bool, okio.i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? okio.i.f42656d : iVar);
    }

    public static /* synthetic */ r b(r rVar, boolean z11, Boolean bool, okio.i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = rVar.f39248a;
        }
        if ((i11 & 2) != 0) {
            bool = rVar.f39249b;
        }
        if ((i11 & 4) != 0) {
            iVar = rVar.unknownFields();
        }
        return rVar.a(z11, bool, iVar);
    }

    public final r a(boolean z11, Boolean bool, okio.i unknownFields) {
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        return new r(z11, bool, unknownFields);
    }

    public final Boolean c() {
        return this.f39249b;
    }

    public final boolean d() {
        return this.f39248a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return kotlin.jvm.internal.s.c(unknownFields(), rVar.unknownFields()) && this.f39248a == rVar.f39248a && kotlin.jvm.internal.s.c(this.f39249b, rVar.f39249b);
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = ((unknownFields().hashCode() * 37) + Boolean.hashCode(this.f39248a)) * 37;
            Boolean bool = this.f39249b;
            int hashCode2 = hashCode + (bool != null ? bool.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m795newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        boolean z11 = this.f39248a;
        arrayList.add("remote_control_enabled_OBSOLETE=" + z11);
        Boolean bool = this.f39249b;
        if (bool != null) {
            arrayList.add("remote_control_enabled=" + bool);
        }
        l02 = e0.l0(arrayList, ", ", "MediaState{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m795newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z11, Boolean bool, okio.i unknownFields) {
        super(f39247c, unknownFields);
        kotlin.jvm.internal.s.g(unknownFields, "unknownFields");
        this.f39248a = z11;
        this.f39249b = bool;
    }
}