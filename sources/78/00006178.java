package com.tesla.proto.energy.rate_tariff.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import mr.d;
import okio.i;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000fR\u001c\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000e\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/DailyCharge;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "", BaseSheetViewModel.SAVE_AMOUNT, "name", "Lokio/i;", "unknownFields", "copy", "D", "getAmount", "()D", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(DLjava/lang/String;Lokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DailyCharge extends f {
    private static final long serialVersionUID = 0;
    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 1)
    private final double amount;
    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<DailyCharge> ADAPTER = new ProtoAdapter<DailyCharge>(b.LENGTH_DELIMITED, m0.b(DailyCharge.class), o.PROTO_3) { // from class: com.tesla.proto.energy.rate_tariff.v1.DailyCharge$Companion$ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public DailyCharge decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            double d12 = 0.0d;
            String str = "";
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new DailyCharge(d12, str, reader.e(d11));
                } else if (g11 == 1) {
                    d12 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    str = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(l writer, DailyCharge value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (!(value.getAmount() == 0.0d)) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getAmount()));
            }
            if (!s.c(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(DailyCharge value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (!(value.getAmount() == 0.0d)) {
                z11 += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAmount()));
            }
            return !s.c(value.getName(), "") ? z11 + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName()) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public DailyCharge redact(DailyCharge value) {
            s.g(value, "value");
            return DailyCharge.copy$default(value, 0.0d, null, i.f42656d, 3, null);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/DailyCharge$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/DailyCharge;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DailyCharge() {
        this(0.0d, null, null, 7, null);
    }

    public /* synthetic */ DailyCharge(double d11, String str, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ DailyCharge copy$default(DailyCharge dailyCharge, double d11, String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = dailyCharge.amount;
        }
        if ((i11 & 2) != 0) {
            str = dailyCharge.name;
        }
        if ((i11 & 4) != 0) {
            iVar = dailyCharge.unknownFields();
        }
        return dailyCharge.copy(d11, str, iVar);
    }

    public final DailyCharge copy(double d11, String name, i unknownFields) {
        s.g(name, "name");
        s.g(unknownFields, "unknownFields");
        return new DailyCharge(d11, name, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DailyCharge) {
            DailyCharge dailyCharge = (DailyCharge) obj;
            if (s.c(unknownFields(), dailyCharge.unknownFields())) {
                return ((this.amount > dailyCharge.amount ? 1 : (this.amount == dailyCharge.amount ? 0 : -1)) == 0) && s.c(this.name, dailyCharge.name);
            }
            return false;
        }
        return false;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((unknownFields().hashCode() * 37) + Double.hashCode(this.amount)) * 37) + this.name.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m577newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        double d11 = this.amount;
        arrayList.add("amount=" + d11);
        String i11 = d.i(this.name);
        arrayList.add("name=" + i11);
        l02 = e0.l0(arrayList, ", ", "DailyCharge{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m577newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyCharge(double d11, String name, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(name, "name");
        s.g(unknownFields, "unknownFields");
        this.amount = d11;
        this.name = name;
    }
}