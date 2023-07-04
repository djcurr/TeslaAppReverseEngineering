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
public final class d extends com.squareup.wire.f {

    /* renamed from: c  reason: collision with root package name */
    public static final ProtoAdapter<d> f59751c;
    @q(adapter = "com.tesla.generated.universalmessage.OperationStatus_E#ADAPTER", jsonName = "operationStatus", label = q.a.OMIT_IDENTITY, tag = 1)

    /* renamed from: a  reason: collision with root package name */
    private final e f59752a;
    @q(adapter = "com.tesla.generated.universalmessage.MessageFault_E#ADAPTER", jsonName = "signedMessageFault", label = q.a.OMIT_IDENTITY, tag = 2)

    /* renamed from: b  reason: collision with root package name */
    private final c f59753b;

    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, n00.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.MessageStatus", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public d decode(k reader) {
            s.g(reader, "reader");
            e eVar = e.OPERATIONSTATUS_OK;
            c cVar = c.MESSAGEFAULT_ERROR_NONE;
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new d(eVar, cVar, reader.e(d11));
                } else if (g11 == 1) {
                    try {
                        eVar = e.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e11.f20831a));
                    }
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    try {
                        cVar = c.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                        reader.a(g11, com.squareup.wire.b.VARINT, Long.valueOf(e12.f20831a));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(l writer, d value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.c() != e.OPERATIONSTATUS_OK) {
                e.ADAPTER.encodeWithTag(writer, 1, value.c());
            }
            if (value.d() != c.MESSAGEFAULT_ERROR_NONE) {
                c.ADAPTER.encodeWithTag(writer, 2, value.d());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(d value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.c() != e.OPERATIONSTATUS_OK) {
                z11 += e.ADAPTER.encodedSizeWithTag(1, value.c());
            }
            return value.d() != c.MESSAGEFAULT_ERROR_NONE ? z11 + c.ADAPTER.encodedSizeWithTag(2, value.d()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public d redact(d value) {
            s.g(value, "value");
            return d.b(value, null, null, i.f42656d, 3, null);
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
        f59751c = new a(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(d.class), o.PROTO_3);
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ d(e eVar, c cVar, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? e.OPERATIONSTATUS_OK : eVar, (i11 & 2) != 0 ? c.MESSAGEFAULT_ERROR_NONE : cVar, (i11 & 4) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ d b(d dVar, e eVar, c cVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = dVar.f59752a;
        }
        if ((i11 & 2) != 0) {
            cVar = dVar.f59753b;
        }
        if ((i11 & 4) != 0) {
            iVar = dVar.unknownFields();
        }
        return dVar.a(eVar, cVar, iVar);
    }

    public final d a(e operation_status, c signed_message_fault, i unknownFields) {
        s.g(operation_status, "operation_status");
        s.g(signed_message_fault, "signed_message_fault");
        s.g(unknownFields, "unknownFields");
        return new d(operation_status, signed_message_fault, unknownFields);
    }

    public final e c() {
        return this.f59752a;
    }

    public final c d() {
        return this.f59753b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return s.c(unknownFields(), dVar.unknownFields()) && this.f59752a == dVar.f59752a && this.f59753b == dVar.f59753b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + this.f59752a.hashCode()) * 37) + this.f59753b.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m1136newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        e eVar = this.f59752a;
        arrayList.add("operation_status=" + eVar);
        c cVar = this.f59753b;
        arrayList.add("signed_message_fault=" + cVar);
        l02 = e0.l0(arrayList, ", ", "MessageStatus{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m1136newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e operation_status, c signed_message_fault, i unknownFields) {
        super(f59751c, unknownFields);
        s.g(operation_status, "operation_status");
        s.g(signed_message_fault, "signed_message_fault");
        s.g(unknownFields, "unknownFields");
        this.f59752a = operation_status;
        this.f59753b = signed_message_fault;
    }
}