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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012R\u001c\u0010\f\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\r\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u000e\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000f\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u0010\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0011\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006 "}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriod;", "Lcom/squareup/wire/f;", "", "newBuilder", "", "other", "", "equals", "", "hashCode", "", "toString", "from_day_of_week", "to_day_of_week", "from_hour", "from_minute", "to_hour", "to_minute", "Lokio/i;", "unknownFields", "copy", "I", "getFrom_day_of_week", "()I", "getTo_day_of_week", "getFrom_hour", "getFrom_minute", "getTo_hour", "getTo_minute", "<init>", "(IIIIIILokio/i;)V", "Companion", "generated_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class TOUPeriod extends f {
    private static final long serialVersionUID = 0;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromDayOfWeek", label = q.a.OMIT_IDENTITY, tag = 1)
    private final int from_day_of_week;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromHour", label = q.a.OMIT_IDENTITY, tag = 3)
    private final int from_hour;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromMinute", label = q.a.OMIT_IDENTITY, tag = 4)
    private final int from_minute;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toDayOfWeek", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int to_day_of_week;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toHour", label = q.a.OMIT_IDENTITY, tag = 5)
    private final int to_hour;
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toMinute", label = q.a.OMIT_IDENTITY, tag = 6)
    private final int to_minute;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<TOUPeriod> ADAPTER = new ProtoAdapter<TOUPeriod>(b.LENGTH_DELIMITED, m0.b(TOUPeriod.class), o.PROTO_3) { // from class: com.tesla.proto.energy.rate_tariff.v1.TOUPeriod$Companion$ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public TOUPeriod decode(k reader) {
            s.g(reader, "reader");
            long d11 = reader.d();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    return new TOUPeriod(i11, i12, i13, i14, i15, i16, reader.e(d11));
                }
                switch (g11) {
                    case 1:
                        i11 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 2:
                        i12 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 3:
                        i13 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 4:
                        i14 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 5:
                        i15 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 6:
                        i16 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(g11);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(l writer, TOUPeriod value) {
            s.g(writer, "writer");
            s.g(value, "value");
            if (value.getFrom_day_of_week() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFrom_day_of_week()));
            }
            if (value.getTo_day_of_week() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getTo_day_of_week()));
            }
            if (value.getFrom_hour() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getFrom_hour()));
            }
            if (value.getFrom_minute() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getFrom_minute()));
            }
            if (value.getTo_hour() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getTo_hour()));
            }
            if (value.getTo_minute() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getTo_minute()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(TOUPeriod value) {
            s.g(value, "value");
            int z11 = value.unknownFields().z();
            if (value.getFrom_day_of_week() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getFrom_day_of_week()));
            }
            if (value.getTo_day_of_week() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTo_day_of_week()));
            }
            if (value.getFrom_hour() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getFrom_hour()));
            }
            if (value.getFrom_minute() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getFrom_minute()));
            }
            if (value.getTo_hour() != 0) {
                z11 += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTo_hour()));
            }
            return value.getTo_minute() != 0 ? z11 + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTo_minute())) : z11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public TOUPeriod redact(TOUPeriod value) {
            s.g(value, "value");
            return TOUPeriod.copy$default(value, 0, 0, 0, 0, 0, 0, i.f42656d, 63, null);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriod$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriod;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "", "serialVersionUID", "J", "<init>", "()V", "generated_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TOUPeriod() {
        this(0, 0, 0, 0, 0, 0, null, 127, null);
    }

    public /* synthetic */ TOUPeriod(int i11, int i12, int i13, int i14, int i15, int i16, i iVar, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) == 0 ? i16 : 0, (i17 & 64) != 0 ? i.f42656d : iVar);
    }

    public static /* synthetic */ TOUPeriod copy$default(TOUPeriod tOUPeriod, int i11, int i12, int i13, int i14, int i15, int i16, i iVar, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = tOUPeriod.from_day_of_week;
        }
        if ((i17 & 2) != 0) {
            i12 = tOUPeriod.to_day_of_week;
        }
        int i18 = i12;
        if ((i17 & 4) != 0) {
            i13 = tOUPeriod.from_hour;
        }
        int i19 = i13;
        if ((i17 & 8) != 0) {
            i14 = tOUPeriod.from_minute;
        }
        int i21 = i14;
        if ((i17 & 16) != 0) {
            i15 = tOUPeriod.to_hour;
        }
        int i22 = i15;
        if ((i17 & 32) != 0) {
            i16 = tOUPeriod.to_minute;
        }
        int i23 = i16;
        if ((i17 & 64) != 0) {
            iVar = tOUPeriod.unknownFields();
        }
        return tOUPeriod.copy(i11, i18, i19, i21, i22, i23, iVar);
    }

    public final TOUPeriod copy(int i11, int i12, int i13, int i14, int i15, int i16, i unknownFields) {
        s.g(unknownFields, "unknownFields");
        return new TOUPeriod(i11, i12, i13, i14, i15, i16, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TOUPeriod) {
            TOUPeriod tOUPeriod = (TOUPeriod) obj;
            return s.c(unknownFields(), tOUPeriod.unknownFields()) && this.from_day_of_week == tOUPeriod.from_day_of_week && this.to_day_of_week == tOUPeriod.to_day_of_week && this.from_hour == tOUPeriod.from_hour && this.from_minute == tOUPeriod.from_minute && this.to_hour == tOUPeriod.to_hour && this.to_minute == tOUPeriod.to_minute;
        }
        return false;
    }

    public final int getFrom_day_of_week() {
        return this.from_day_of_week;
    }

    public final int getFrom_hour() {
        return this.from_hour;
    }

    public final int getFrom_minute() {
        return this.from_minute;
    }

    public final int getTo_day_of_week() {
        return this.to_day_of_week;
    }

    public final int getTo_hour() {
        return this.to_hour;
    }

    public final int getTo_minute() {
        return this.to_minute;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 == 0) {
            int hashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.from_day_of_week)) * 37) + Integer.hashCode(this.to_day_of_week)) * 37) + Integer.hashCode(this.from_hour)) * 37) + Integer.hashCode(this.from_minute)) * 37) + Integer.hashCode(this.to_hour)) * 37) + Integer.hashCode(this.to_minute);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m583newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        String l02;
        ArrayList arrayList = new ArrayList();
        int i11 = this.from_day_of_week;
        arrayList.add("from_day_of_week=" + i11);
        int i12 = this.to_day_of_week;
        arrayList.add("to_day_of_week=" + i12);
        int i13 = this.from_hour;
        arrayList.add("from_hour=" + i13);
        int i14 = this.from_minute;
        arrayList.add("from_minute=" + i14);
        int i15 = this.to_hour;
        arrayList.add("to_hour=" + i15);
        int i16 = this.to_minute;
        arrayList.add("to_minute=" + i16);
        l02 = e0.l0(arrayList, ", ", "TOUPeriod{", "}", 0, null, null, 56, null);
        return l02;
    }

    /* renamed from: newBuilder */
    public /* synthetic */ Void m583newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TOUPeriod(int i11, int i12, int i13, int i14, int i15, int i16, i unknownFields) {
        super(ADAPTER, unknownFields);
        s.g(unknownFields, "unknownFields");
        this.from_day_of_week = i11;
        this.to_day_of_week = i12;
        this.from_hour = i13;
        this.from_minute = i14;
        this.to_hour = i15;
        this.to_minute = i16;
    }
}