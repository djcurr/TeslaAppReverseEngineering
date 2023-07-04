package com.tesla.proto.energy.rate_tariff.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;
import okio.i;
import wz.e0;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBQ\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016JP\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012R\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriod;", "on_peak", "partial_peak", "off_peak", "super_off_peak", "Lokio/i;", "unknownFields", "copy", "Ljava/util/List;", "getOn_peak", "()Ljava/util/List;", "getPartial_peak", "getOff_peak", "getSuper_off_peak", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class TOUPeriods extends f {
    public static final ProtoAdapter<TOUPeriods> ADAPTER;
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "OFF_PEAK", label = q.a.REPEATED, tag = 3)
    private final List<TOUPeriod> off_peak;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "ON_PEAK", label = q.a.REPEATED, tag = 1)
    private final List<TOUPeriod> on_peak;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "PARTIAL_PEAK", label = q.a.REPEATED, tag = 2)
    private final List<TOUPeriod> partial_peak;
    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriod#ADAPTER", jsonName = "SUPER_OFF_PEAK", label = q.a.REPEATED, tag = 4)
    private final List<TOUPeriod> super_off_peak;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d b11 = m0.b(TOUPeriods.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<TOUPeriods>(bVar, b11, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.TOUPeriods$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TOUPeriods decode(k reader) {
                s.g(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long d11 = reader.d();
                while (true) {
                    int g11 = reader.g();
                    if (g11 == -1) {
                        return new TOUPeriods(arrayList, arrayList2, arrayList3, arrayList4, reader.e(d11));
                    }
                    if (g11 == 1) {
                        arrayList.add(TOUPeriod.ADAPTER.decode(reader));
                    } else if (g11 == 2) {
                        arrayList2.add(TOUPeriod.ADAPTER.decode(reader));
                    } else if (g11 == 3) {
                        arrayList3.add(TOUPeriod.ADAPTER.decode(reader));
                    } else if (g11 != 4) {
                        reader.m(g11);
                    } else {
                        arrayList4.add(TOUPeriod.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, TOUPeriods value) {
                s.g(writer, "writer");
                s.g(value, "value");
                ProtoAdapter<TOUPeriod> protoAdapter = TOUPeriod.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, value.getOn_peak());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, value.getPartial_peak());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, value.getOff_peak());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, value.getSuper_off_peak());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TOUPeriods value) {
                s.g(value, "value");
                int z11 = value.unknownFields().z();
                ProtoAdapter<TOUPeriod> protoAdapter = TOUPeriod.ADAPTER;
                return z11 + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getOn_peak()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getPartial_peak()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getOff_peak()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getSuper_off_peak());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TOUPeriods redact(TOUPeriods value) {
                s.g(value, "value");
                List<TOUPeriod> on_peak = value.getOn_peak();
                ProtoAdapter<TOUPeriod> protoAdapter = TOUPeriod.ADAPTER;
                return value.copy(mr.d.a(on_peak, protoAdapter), mr.d.a(value.getPartial_peak(), protoAdapter), mr.d.a(value.getOff_peak(), protoAdapter), mr.d.a(value.getSuper_off_peak(), protoAdapter), i.f42656d);
            }
        };
    }

    public TOUPeriods() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ TOUPeriods(List list, List list2, List list3, List list4, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w.i() : list, (i11 & 2) != 0 ? w.i() : list2, (i11 & 4) != 0 ? w.i() : list3, (i11 & 8) != 0 ? w.i() : list4, (i11 & 16) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ TOUPeriods copy$default(TOUPeriods tOUPeriods, List list, List list2, List list3, List list4, i iVar, int i11, Object obj) {
        List<TOUPeriod> list5 = list;
        if ((i11 & 1) != 0) {
            list5 = tOUPeriods.on_peak;
        }
        List<TOUPeriod> list6 = list2;
        if ((i11 & 2) != 0) {
            list6 = tOUPeriods.partial_peak;
        }
        List list7 = list6;
        List<TOUPeriod> list8 = list3;
        if ((i11 & 4) != 0) {
            list8 = tOUPeriods.off_peak;
        }
        List list9 = list8;
        List<TOUPeriod> list10 = list4;
        if ((i11 & 8) != 0) {
            list10 = tOUPeriods.super_off_peak;
        }
        List list11 = list10;
        if ((i11 & 16) != 0) {
            iVar = tOUPeriods.unknownFields();
        }
        return tOUPeriods.copy(list5, list7, list9, list11, iVar);
    }

    public final TOUPeriods copy(List<TOUPeriod> on_peak, List<TOUPeriod> partial_peak, List<TOUPeriod> off_peak, List<TOUPeriod> super_off_peak, i unknownFields) {
        s.g(on_peak, "on_peak");
        s.g(partial_peak, "partial_peak");
        s.g(off_peak, "off_peak");
        s.g(super_off_peak, "super_off_peak");
        s.g(unknownFields, "unknownFields");
        return new TOUPeriods(on_peak, partial_peak, off_peak, super_off_peak, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TOUPeriods) {
            TOUPeriods tOUPeriods = (TOUPeriods) obj;
            return s.c(unknownFields(), tOUPeriods.unknownFields()) && s.c(this.on_peak, tOUPeriods.on_peak) && s.c(this.partial_peak, tOUPeriods.partial_peak) && s.c(this.off_peak, tOUPeriods.off_peak) && s.c(this.super_off_peak, tOUPeriods.super_off_peak);
        }
        return false;
    }

    public final List<TOUPeriod> getOff_peak() {
        return this.off_peak;
    }

    public final List<TOUPeriod> getOn_peak() {
        return this.on_peak;
    }

    public final List<TOUPeriod> getPartial_peak() {
        return this.partial_peak;
    }

    public final List<TOUPeriod> getSuper_off_peak() {
        return this.super_off_peak;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((unknownFields().hashCode() * 37) + this.on_peak.hashCode()) * 37) + this.partial_peak.hashCode()) * 37) + this.off_peak.hashCode()) * 37) + this.super_off_peak.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m584newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        if (!this.on_peak.isEmpty()) {
            List<TOUPeriod> list = this.on_peak;
            arrayList.add("on_peak=" + list);
        }
        if (!this.partial_peak.isEmpty()) {
            List<TOUPeriod> list2 = this.partial_peak;
            arrayList.add("partial_peak=" + list2);
        }
        if (!this.off_peak.isEmpty()) {
            List<TOUPeriod> list3 = this.off_peak;
            arrayList.add("off_peak=" + list3);
        }
        if (!this.super_off_peak.isEmpty()) {
            List<TOUPeriod> list4 = this.super_off_peak;
            arrayList.add("super_off_peak=" + list4);
        }
        l02 = e0.l0(arrayList, ", ", "TOUPeriods{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder  reason: collision with other method in class */
    public /* synthetic */ Void m584newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TOUPeriods(List<TOUPeriod> on_peak, List<TOUPeriod> partial_peak, List<TOUPeriod> off_peak, List<TOUPeriod> super_off_peak, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(on_peak, "on_peak");
        s.g(partial_peak, "partial_peak");
        s.g(off_peak, "off_peak");
        s.g(super_off_peak, "super_off_peak");
        s.g(unknownFields, "unknownFields");
        this.on_peak = mr.d.g("on_peak", on_peak);
        this.partial_peak = mr.d.g("partial_peak", partial_peak);
        this.off_peak = mr.d.g("off_peak", off_peak);
        this.super_off_peak = mr.d.g("super_off_peak", super_off_peak);
    }
}