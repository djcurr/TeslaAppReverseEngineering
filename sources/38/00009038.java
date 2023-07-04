package om;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import om.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f implements lm.d {

    /* renamed from: f */
    private static final Charset f42753f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final lm.b f42754g = lm.b.a(Action.KEY_ATTRIBUTE).b(om.a.b().c(1).a()).a();

    /* renamed from: h */
    private static final lm.b f42755h = lm.b.a("value").b(om.a.b().c(2).a()).a();

    /* renamed from: i */
    private static final lm.c<Map.Entry<Object, Object>> f42756i = new lm.c() { // from class: om.e
        @Override // lm.c
        public final void encode(Object obj, Object obj2) {
            f.a((Map.Entry) obj, (lm.d) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f42757a;

    /* renamed from: b */
    private final Map<Class<?>, lm.c<?>> f42758b;

    /* renamed from: c */
    private final Map<Class<?>, lm.e<?>> f42759c;

    /* renamed from: d */
    private final lm.c<Object> f42760d;

    /* renamed from: e */
    private final i f42761e = new i(this);

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f42762a;

        static {
            int[] iArr = new int[d.a.values().length];
            f42762a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42762a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42762a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map<Class<?>, lm.c<?>> map, Map<Class<?>, lm.e<?>> map2, lm.c<Object> cVar) {
        this.f42757a = outputStream;
        this.f42758b = map;
        this.f42759c = map2;
        this.f42760d = cVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, lm.d dVar) {
        r(entry, dVar);
    }

    private static ByteBuffer k(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long l(lm.c<T> cVar, T t11) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f42757a;
            this.f42757a = bVar;
            cVar.encode(t11, this);
            this.f42757a = outputStream;
            long a11 = bVar.a();
            bVar.close();
            return a11;
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f m(lm.c<T> cVar, lm.b bVar, T t11, boolean z11) {
        long l11 = l(cVar, t11);
        if (z11 && l11 == 0) {
            return this;
        }
        s((q(bVar) << 3) | 2);
        t(l11);
        cVar.encode(t11, this);
        return this;
    }

    private <T> f n(lm.e<T> eVar, lm.b bVar, T t11, boolean z11) {
        this.f42761e.b(bVar, z11);
        eVar.encode(t11, this.f42761e);
        return this;
    }

    private static d p(lm.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int q(lm.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static /* synthetic */ void r(Map.Entry entry, lm.d dVar) {
        dVar.add(f42754g, entry.getKey());
        dVar.add(f42755h, entry.getValue());
    }

    private void s(int i11) {
        while ((i11 & (-128)) != 0) {
            this.f42757a.write((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.f42757a.write(i11 & 127);
    }

    private void t(long j11) {
        while (((-128) & j11) != 0) {
            this.f42757a.write((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.f42757a.write(((int) j11) & 127);
    }

    lm.d b(lm.b bVar, double d11, boolean z11) {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        s((q(bVar) << 3) | 1);
        this.f42757a.write(k(8).putDouble(d11).array());
        return this;
    }

    lm.d c(lm.b bVar, float f11, boolean z11) {
        if (z11 && f11 == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        s((q(bVar) << 3) | 5);
        this.f42757a.write(k(4).putFloat(f11).array());
        return this;
    }

    public lm.d d(lm.b bVar, Object obj, boolean z11) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z11 && charSequence.length() == 0) {
                return this;
            }
            s((q(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f42753f);
            s(bytes.length);
            this.f42757a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                d(bVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m(f42756i, bVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return b(bVar, ((Double) obj).doubleValue(), z11);
        } else {
            if (obj instanceof Float) {
                return c(bVar, ((Float) obj).floatValue(), z11);
            }
            if (obj instanceof Number) {
                return h(bVar, ((Number) obj).longValue(), z11);
            }
            if (obj instanceof Boolean) {
                return j(bVar, ((Boolean) obj).booleanValue(), z11);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z11 && bArr.length == 0) {
                    return this;
                }
                s((q(bVar) << 3) | 2);
                s(bArr.length);
                this.f42757a.write(bArr);
                return this;
            }
            lm.c<?> cVar = this.f42758b.get(obj.getClass());
            if (cVar != null) {
                return m(cVar, bVar, obj, z11);
            }
            lm.e<?> eVar = this.f42759c.get(obj.getClass());
            if (eVar != null) {
                return n(eVar, bVar, obj, z11);
            }
            if (obj instanceof c) {
                return add(bVar, ((c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return add(bVar, ((Enum) obj).ordinal());
            }
            return m(this.f42760d, bVar, obj, z11);
        }
    }

    @Override // lm.d
    /* renamed from: e */
    public f add(lm.b bVar, int i11) {
        return f(bVar, i11, true);
    }

    f f(lm.b bVar, int i11, boolean z11) {
        if (z11 && i11 == 0) {
            return this;
        }
        d p11 = p(bVar);
        int i12 = a.f42762a[p11.intEncoding().ordinal()];
        if (i12 == 1) {
            s(p11.tag() << 3);
            s(i11);
        } else if (i12 == 2) {
            s(p11.tag() << 3);
            s((i11 << 1) ^ (i11 >> 31));
        } else if (i12 == 3) {
            s((p11.tag() << 3) | 5);
            this.f42757a.write(k(4).putInt(i11).array());
        }
        return this;
    }

    @Override // lm.d
    /* renamed from: g */
    public f add(lm.b bVar, long j11) {
        return h(bVar, j11, true);
    }

    f h(lm.b bVar, long j11, boolean z11) {
        if (z11 && j11 == 0) {
            return this;
        }
        d p11 = p(bVar);
        int i11 = a.f42762a[p11.intEncoding().ordinal()];
        if (i11 == 1) {
            s(p11.tag() << 3);
            t(j11);
        } else if (i11 == 2) {
            s(p11.tag() << 3);
            t((j11 >> 63) ^ (j11 << 1));
        } else if (i11 == 3) {
            s((p11.tag() << 3) | 1);
            this.f42757a.write(k(8).putLong(j11).array());
        }
        return this;
    }

    @Override // lm.d
    /* renamed from: i */
    public f add(lm.b bVar, boolean z11) {
        return j(bVar, z11, true);
    }

    public f j(lm.b bVar, boolean z11, boolean z12) {
        return f(bVar, z11 ? 1 : 0, z12);
    }

    public f o(Object obj) {
        if (obj == null) {
            return this;
        }
        lm.c<?> cVar = this.f42758b.get(obj.getClass());
        if (cVar != null) {
            cVar.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // lm.d
    public lm.d add(lm.b bVar, Object obj) {
        return d(bVar, obj, true);
    }
}