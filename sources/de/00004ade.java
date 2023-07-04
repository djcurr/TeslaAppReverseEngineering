package com.squareup.wire;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.l;
import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.text.w;
import okhttp3.internal.http2.Http2Connection;
import okio.g0;
import vz.b0;
import wz.r0;
import wz.x;

/* loaded from: classes2.dex */
public final class j {

    /* loaded from: classes2.dex */
    public static final class a extends ProtoAdapter<Boolean> {
        a(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Boolean decode(com.squareup.wire.k reader) {
            int a11;
            String m02;
            kotlin.jvm.internal.s.g(reader, "reader");
            int n11 = reader.n();
            boolean z11 = true;
            if (n11 == 0) {
                z11 = false;
            } else if (n11 != 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid boolean value 0x");
                a11 = kotlin.text.b.a(16);
                String num = Integer.toString(n11, a11);
                kotlin.jvm.internal.s.f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                m02 = w.m0(num, 2, '0');
                sb2.append(m02);
                throw new IOException(sb2.toString());
            }
            return Boolean.valueOf(z11);
        }

        public void b(com.squareup.wire.l writer, boolean z11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.g(z11 ? 1 : 0);
        }

        public int c(boolean z11) {
            return 1;
        }

        public Boolean d(boolean z11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Boolean bool) {
            b(lVar, bool.booleanValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
            return c(bool.booleanValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
            return d(bool.booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ProtoAdapter<okio.i> {
        b(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public okio.i decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return reader.i();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, okio.i value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            writer.a(value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(okio.i value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value.z();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public okio.i redact(okio.i value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends ProtoAdapter<Double> {
        c(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Double decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            kotlin.jvm.internal.k kVar = kotlin.jvm.internal.k.f34913a;
            return Double.valueOf(Double.longBitsToDouble(reader.k()));
        }

        public void b(com.squareup.wire.l writer, double d11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.c(Double.doubleToLongBits(d11));
        }

        public int c(double d11) {
            return 8;
        }

        public Double d(double d11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Double d11) {
            b(lVar, d11.doubleValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Double d11) {
            return c(d11.doubleValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Double redact(Double d11) {
            return d(d11.doubleValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends ProtoAdapter<Duration> {
        d(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, dVar, str, oVar);
        }

        private final int d(Duration duration) {
            return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }

        private final long e(Duration duration) {
            return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Duration decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            long j11 = 0;
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    reader.e(d11);
                    Duration ofSeconds = Duration.ofSeconds(j11, i11);
                    kotlin.jvm.internal.s.f(ofSeconds, "Duration.ofSeconds(seconds, nano)");
                    return ofSeconds;
                } else if (g11 == 1) {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, Duration value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            long e11 = e(value);
            if (e11 != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(e11));
            }
            int d11 = d(value);
            if (d11 != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(d11));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(Duration value) {
            kotlin.jvm.internal.s.g(value, "value");
            long e11 = e(value);
            int encodedSizeWithTag = e11 != 0 ? 0 + ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(e11)) : 0;
            int d11 = d(value);
            return d11 != 0 ? encodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(d11)) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: f */
        public Duration redact(Duration value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends ProtoAdapter<b0> {
        e(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, dVar, str, oVar);
        }

        public void a(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    reader.e(d11);
                    return;
                }
                reader.m(g11);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, b0 value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(b0 value) {
            kotlin.jvm.internal.s.g(value, "value");
            return 0;
        }

        public void d(b0 value) {
            kotlin.jvm.internal.s.g(value, "value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ b0 decode(com.squareup.wire.k kVar) {
            a(kVar);
            return b0.f54756a;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ b0 redact(b0 b0Var) {
            d(b0Var);
            return b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends ProtoAdapter<Integer> {
        f(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Integer decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Integer.valueOf(reader.j());
        }

        public void b(com.squareup.wire.l writer, int i11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.b(i11);
        }

        public int c(int i11) {
            return 4;
        }

        public Integer d(int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends ProtoAdapter<Long> {
        g(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Long decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Long.valueOf(reader.k());
        }

        public void b(com.squareup.wire.l writer, long j11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.c(j11);
        }

        public int c(long j11) {
            return 8;
        }

        public Long d(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends ProtoAdapter<Float> {
        h(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Float decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
            return Float.valueOf(Float.intBitsToFloat(reader.j()));
        }

        public void b(com.squareup.wire.l writer, float f11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.b(Float.floatToIntBits(f11));
        }

        public int c(float f11) {
            return 4;
        }

        public Float d(float f11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Float f11) {
            b(lVar, f11.floatValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Float f11) {
            return c(f11.floatValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Float redact(Float f11) {
            return d(f11.floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends ProtoAdapter<Instant> {
        i(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Instant decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            long j11 = 0;
            int i11 = 0;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    reader.e(d11);
                    Instant ofEpochSecond = Instant.ofEpochSecond(j11, i11);
                    kotlin.jvm.internal.s.f(ofEpochSecond, "Instant.ofEpochSecond(epochSecond, nano)");
                    return ofEpochSecond;
                } else if (g11 == 1) {
                    j11 = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (g11 != 2) {
                    reader.m(g11);
                } else {
                    i11 = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, Instant value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            long epochSecond = value.getEpochSecond();
            if (epochSecond != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
            }
            int nano = value.getNano();
            if (nano != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(Instant value) {
            kotlin.jvm.internal.s.g(value, "value");
            long epochSecond = value.getEpochSecond();
            int encodedSizeWithTag = epochSecond != 0 ? 0 + ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
            int nano = value.getNano();
            return nano != 0 ? encodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public Instant redact(Instant value) {
            kotlin.jvm.internal.s.g(value, "value");
            return value;
        }
    }

    /* renamed from: com.squareup.wire.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0366j extends ProtoAdapter<Integer> {
        C0366j(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Integer decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Integer.valueOf(reader.n());
        }

        public void b(com.squareup.wire.l writer, int i11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.d(i11);
        }

        public int c(int i11) {
            return com.squareup.wire.l.f20857b.f(i11);
        }

        public Integer d(int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends ProtoAdapter<Long> {
        k(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Long decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Long.valueOf(reader.o());
        }

        public void b(com.squareup.wire.l writer, long j11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.h(j11);
        }

        public int c(long j11) {
            return com.squareup.wire.l.f20857b.j(j11);
        }

        public Long d(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends ProtoAdapter<Integer> {
        l(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Integer decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Integer.valueOf(com.squareup.wire.l.f20857b.b(reader.n()));
        }

        public void b(com.squareup.wire.l writer, int i11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.g(com.squareup.wire.l.f20857b.d(i11));
        }

        public int c(int i11) {
            l.a aVar = com.squareup.wire.l.f20857b;
            return aVar.i(aVar.d(i11));
        }

        public Integer d(int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends ProtoAdapter<Long> {
        m(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Long decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Long.valueOf(com.squareup.wire.l.f20857b.c(reader.o()));
        }

        public void b(com.squareup.wire.l writer, long j11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.h(com.squareup.wire.l.f20857b.e(j11));
        }

        public int c(long j11) {
            l.a aVar = com.squareup.wire.l.f20857b;
            return aVar.j(aVar.e(j11));
        }

        public Long d(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends ProtoAdapter<String> {
        n(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public String decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return reader.l();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, String value) {
            kotlin.jvm.internal.s.g(writer, "writer");
            kotlin.jvm.internal.s.g(value, "value");
            writer.e(value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            return (int) g0.b(value, 0, 0, 3, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public String redact(String value) {
            kotlin.jvm.internal.s.g(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends ProtoAdapter<List<?>> {
        o(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public List<?> decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    reader.e(d11);
                    return arrayList;
                } else if (g11 != 1) {
                    reader.p();
                } else {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, List<?> list) {
            kotlin.jvm.internal.s.g(writer, "writer");
            if (list == null) {
                return;
            }
            Iterator<?> it2 = list.iterator();
            while (it2.hasNext()) {
                ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, it2.next());
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(List<?> list) {
            int i11 = 0;
            if (list == null) {
                return 0;
            }
            Iterator<?> it2 = list.iterator();
            while (it2.hasNext()) {
                i11 += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it2.next());
            }
            return i11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public List<Object> redact(List<?> list) {
            int t11;
            if (list != null) {
                t11 = x.t(list, 10);
                ArrayList arrayList = new ArrayList(t11);
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it2.next()));
                }
                return arrayList;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends ProtoAdapter<Map<String, ?>> {
        p(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Map<String, ?> decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long d11 = reader.d();
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    reader.e(d11);
                    return linkedHashMap;
                } else if (g11 != 1) {
                    reader.p();
                } else {
                    long d12 = reader.d();
                    String str = null;
                    Object obj = null;
                    while (true) {
                        int g12 = reader.g();
                        if (g12 == -1) {
                            break;
                        } else if (g12 == 1) {
                            str = ProtoAdapter.STRING.decode(reader);
                        } else if (g12 != 2) {
                            reader.m(g12);
                        } else {
                            obj = ProtoAdapter.STRUCT_VALUE.decode(reader);
                        }
                    }
                    reader.e(d12);
                    if (str != null) {
                        kotlin.jvm.internal.s.e(str);
                        linkedHashMap.put(str, obj);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, Map<String, ?> map) {
            kotlin.jvm.internal.s.g(writer, "writer");
            if (map == null) {
                return;
            }
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, value);
                writer.f(1, com.squareup.wire.b.LENGTH_DELIMITED);
                writer.g(encodedSizeWithTag2);
                protoAdapter.encodeWithTag(writer, 1, key);
                protoAdapter2.encodeWithTag(writer, 2, value);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public int encodedSize(Map<String, ?> map) {
            int i11 = 0;
            if (map == null) {
                return 0;
            }
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entry.getKey()) + ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, value);
                l.a aVar = com.squareup.wire.l.f20857b;
                i11 += aVar.h(1) + aVar.i(encodedSizeWithTag) + encodedSizeWithTag;
            }
            return i11;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public Map<String, Object> redact(Map<String, ?> map) {
            int e11;
            if (map != null) {
                e11 = r0.e(map.size());
                LinkedHashMap linkedHashMap = new LinkedHashMap(e11);
                Iterator<T> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
                }
                return linkedHashMap;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends ProtoAdapter {
        q(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Void decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            int n11 = reader.n();
            if (n11 == 0) {
                return null;
            }
            throw new IOException("expected 0 but was " + n11);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: b */
        public void encode(com.squareup.wire.l writer, Void r22) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.g(0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: c */
        public void encodeWithTag(com.squareup.wire.l writer, int i11, Void r42) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.f(i11, getFieldEncoding$wire_runtime());
            encode(writer, r42);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: d */
        public int encodedSize(Void r22) {
            return com.squareup.wire.l.f20857b.i(0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: e */
        public int encodedSizeWithTag(int i11, Void r32) {
            int encodedSize = encodedSize(r32);
            l.a aVar = com.squareup.wire.l.f20857b;
            return aVar.h(i11) + aVar.i(encodedSize);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: f */
        public Void redact(Void r12) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends ProtoAdapter<Object> {
        r(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Object decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            Object obj = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    reader.e(d11);
                    return obj;
                }
                switch (g11) {
                    case 1:
                        obj = ProtoAdapter.STRUCT_NULL.decode(reader);
                        break;
                    case 2:
                        obj = ProtoAdapter.DOUBLE.decode(reader);
                        break;
                    case 3:
                        obj = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        obj = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 5:
                        obj = ProtoAdapter.STRUCT_MAP.decode(reader);
                        break;
                    case 6:
                        obj = ProtoAdapter.STRUCT_LIST.decode(reader);
                        break;
                    default:
                        reader.p();
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(com.squareup.wire.l writer, Object obj) {
            kotlin.jvm.internal.s.g(writer, "writer");
            if (obj == null) {
                ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, obj);
            } else if (obj instanceof Number) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) obj).doubleValue()));
            } else if (obj instanceof String) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, obj);
            } else if (obj instanceof Boolean) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, obj);
            } else if (obj instanceof Map) {
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (Map) obj);
            } else if (obj instanceof List) {
                ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, obj);
            } else {
                throw new IllegalArgumentException("unexpected struct value: " + obj);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encodeWithTag(com.squareup.wire.l writer, int i11, Object obj) {
            kotlin.jvm.internal.s.g(writer, "writer");
            if (obj == null) {
                writer.f(i11, getFieldEncoding$wire_runtime());
                writer.g(encodedSize(obj));
                encode(writer, obj);
                return;
            }
            super.encodeWithTag(writer, i11, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Object obj) {
            if (obj == null) {
                return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, obj);
            }
            if (obj instanceof Number) {
                return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) obj).doubleValue()));
            }
            if (obj instanceof String) {
                return ProtoAdapter.STRING.encodedSizeWithTag(3, obj);
            }
            if (obj instanceof Boolean) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(4, obj);
            }
            if (obj instanceof Map) {
                return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) obj);
            }
            if (obj instanceof List) {
                return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, obj);
            }
            throw new IllegalArgumentException("unexpected struct value: " + obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSizeWithTag(int i11, Object obj) {
            if (obj == null) {
                int encodedSize = encodedSize(obj);
                l.a aVar = com.squareup.wire.l.f20857b;
                return aVar.h(i11) + aVar.i(encodedSize) + encodedSize;
            }
            return super.encodedSizeWithTag(i11, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Object redact(Object obj) {
            if (obj == null) {
                return ProtoAdapter.STRUCT_NULL.redact(obj);
            }
            if (obj instanceof Number) {
                return obj;
            }
            if (obj instanceof String) {
                return null;
            }
            if (obj instanceof Boolean) {
                return obj;
            }
            if (obj instanceof Map) {
                return ProtoAdapter.STRUCT_MAP.redact((Map) obj);
            }
            if (obj instanceof List) {
                return ProtoAdapter.STRUCT_LIST.redact(obj);
            }
            throw new IllegalArgumentException("unexpected struct value: " + obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends ProtoAdapter<Integer> {
        s(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Integer decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Integer.valueOf(reader.n());
        }

        public void b(com.squareup.wire.l writer, int i11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.g(i11);
        }

        public int c(int i11) {
            return com.squareup.wire.l.f20857b.i(i11);
        }

        public Integer d(int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends ProtoAdapter<Long> {
        t(com.squareup.wire.b bVar, n00.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: a */
        public Long decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            return Long.valueOf(reader.o());
        }

        public void b(com.squareup.wire.l writer, long j11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            writer.h(j11);
        }

        public int c(long j11) {
            return com.squareup.wire.l.f20857b.j(j11);
        }

        public Long d(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class u<T> extends ProtoAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProtoAdapter f20847a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(ProtoAdapter protoAdapter, String str, com.squareup.wire.b bVar, n00.d dVar, String str2, com.squareup.wire.o oVar, Object obj) {
            super(bVar, dVar, str2, oVar, obj);
            this.f20847a = protoAdapter;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public T decode(com.squareup.wire.k reader) {
            kotlin.jvm.internal.s.g(reader, "reader");
            long d11 = reader.d();
            T t11 = null;
            while (true) {
                int g11 = reader.g();
                if (g11 == -1) {
                    reader.e(d11);
                    return t11;
                } else if (g11 != 1) {
                    reader.m(g11);
                } else {
                    t11 = (T) this.f20847a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(com.squareup.wire.l writer, T t11) {
            kotlin.jvm.internal.s.g(writer, "writer");
            if (t11 != null) {
                this.f20847a.encodeWithTag(writer, 1, t11);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(T t11) {
            if (t11 == null) {
                return 0;
            }
            return this.f20847a.encodedSizeWithTag(1, t11);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public T redact(T t11) {
            if (t11 == null) {
                return null;
            }
            return (T) this.f20847a.redact(t11);
        }
    }

    public static final ProtoAdapter<Boolean> a() {
        return new a(com.squareup.wire.b.VARINT, m0.b(Boolean.TYPE), null, com.squareup.wire.o.PROTO_2, Boolean.FALSE);
    }

    public static final ProtoAdapter<okio.i> b() {
        return new b(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(okio.i.class), null, com.squareup.wire.o.PROTO_2, okio.i.f42656d);
    }

    public static final ProtoAdapter<Double> c() {
        return new c(com.squareup.wire.b.FIXED64, m0.b(Double.TYPE), null, com.squareup.wire.o.PROTO_2, Double.valueOf(0.0d));
    }

    public static final ProtoAdapter<Duration> d() {
        return new d(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(Duration.class), "type.googleapis.com/google.protobuf.Duration", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<b0> e() {
        return new e(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(b0.class), "type.googleapis.com/google.protobuf.Empty", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Integer> f() {
        return new f(com.squareup.wire.b.FIXED32, m0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> g() {
        return new g(com.squareup.wire.b.FIXED64, m0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final ProtoAdapter<Float> h() {
        return new h(com.squareup.wire.b.FIXED32, m0.b(Float.TYPE), null, com.squareup.wire.o.PROTO_2, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED));
    }

    public static final ProtoAdapter<Instant> i() {
        return new i(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(Instant.class), "type.googleapis.com/google.protobuf.Timestamp", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Integer> j() {
        return new C0366j(com.squareup.wire.b.VARINT, m0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> k() {
        return new k(com.squareup.wire.b.VARINT, m0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final ProtoAdapter<Integer> l() {
        return f();
    }

    public static final ProtoAdapter<Long> m() {
        return g();
    }

    public static final ProtoAdapter<Integer> n() {
        return new l(com.squareup.wire.b.VARINT, m0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> o() {
        return new m(com.squareup.wire.b.VARINT, m0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final ProtoAdapter<String> p() {
        return new n(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(String.class), null, com.squareup.wire.o.PROTO_2, "");
    }

    public static final ProtoAdapter<List<?>> q() {
        return new o(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(Map.class), "type.googleapis.com/google.protobuf.ListValue", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Map<String, ?>> r() {
        return new p(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(Map.class), "type.googleapis.com/google.protobuf.Struct", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter s() {
        return new q(com.squareup.wire.b.VARINT, m0.b(Void.class), "type.googleapis.com/google.protobuf.NullValue", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Object> t() {
        return new r(com.squareup.wire.b.LENGTH_DELIMITED, m0.b(Object.class), "type.googleapis.com/google.protobuf.Value", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Integer> u() {
        return new s(com.squareup.wire.b.VARINT, m0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> v() {
        return new t(com.squareup.wire.b.VARINT, m0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final <T> ProtoAdapter<T> w(ProtoAdapter<T> delegate, String typeUrl) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        kotlin.jvm.internal.s.g(typeUrl, "typeUrl");
        return new u(delegate, typeUrl, com.squareup.wire.b.LENGTH_DELIMITED, delegate.getType(), typeUrl, com.squareup.wire.o.PROTO_3, null);
    }
}