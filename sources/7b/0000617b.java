package com.tesla.proto.energy.rate_tariff.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import okio.i;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eR\u001c\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "", "all", "Lokio/i;", "unknownFields", "copy", "D", "getAll", "()D", "<init>", "(DLokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class FixedCharge extends f {
    private static final long serialVersionUID = 0;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "ALL", label = q.a.OMIT_IDENTITY, tag = 1)
    private final double all;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<FixedCharge> ADAPTER = new ProtoAdapter<FixedCharge>(b.LENGTH_DELIMITED, m0.b(FixedCharge.class), o.PROTO_3) { // from class: com.tesla.proto.energy.rate_tariff.v1.FixedCharge$Companion$ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public FixedCharge decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            double d12 = 0.0d;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new FixedCharge(d12, reader.e(d11));
                }
                if (g11 == 1) {
                    d12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else {
                    reader.m(g11);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(l writer, FixedCharge value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!(value.getAll() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getAll()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(FixedCharge value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            return !((value.getAll() > 0.0d ? 1 : (value.getAll() == 0.0d ? 0 : -1)) == 0) ? z11 + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAll())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public FixedCharge redact(FixedCharge value) {
            s.g(value, "value");
            return FixedCharge.copy$default(value, 0.0d, i.f42656d, 1, null);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FixedCharge() {
        this(0.0d, null, 3, null);
    }

    public /* synthetic */ FixedCharge(double d11, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ FixedCharge copy$default(FixedCharge fixedCharge, double d11, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = fixedCharge.all;
        }
        if ((i11 & 2) != 0) {
            iVar = fixedCharge.unknownFields();
        }
        return fixedCharge.copy(d11, iVar);
    }

    public final FixedCharge copy(double d11, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new FixedCharge(d11, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FixedCharge) {
            FixedCharge fixedCharge = (FixedCharge) obj;
            if (s.c(unknownFields(), fixedCharge.unknownFields())) {
                return (this.all > fixedCharge.all ? 1 : (this.all == fixedCharge.all ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    public final double getAll() {
        return this.all;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (unknownFields().hashCode() * 37) + Double.hashCode(this.all);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m578newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        double d11 = this.all;
        arrayList.add("all=" + d11);
        l02 = e0.l0(arrayList, ", ", "FixedCharge{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m578newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedCharge(double d11, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.all = d11;
    }
}