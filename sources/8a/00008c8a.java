package nm;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import lm.f;

/* loaded from: classes3.dex */
final class e implements lm.d, f {

    /* renamed from: a  reason: collision with root package name */
    private e f41760a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f41761b = true;

    /* renamed from: c  reason: collision with root package name */
    private final JsonWriter f41762c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<?>, lm.c<?>> f41763d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<?>, lm.e<?>> f41764e;

    /* renamed from: f  reason: collision with root package name */
    private final lm.c<Object> f41765f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f41766g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, lm.c<?>> map, Map<Class<?>, lm.e<?>> map2, lm.c<Object> cVar, boolean z11) {
        this.f41762c = new JsonWriter(writer);
        this.f41763d = map;
        this.f41764e = map2;
        this.f41765f = cVar;
        this.f41766g = z11;
    }

    private boolean k(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e n(String str, Object obj) {
        p();
        this.f41762c.name(str);
        if (obj == null) {
            this.f41762c.nullValue();
            return this;
        }
        return c(obj, false);
    }

    private e o(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        p();
        this.f41762c.name(str);
        return c(obj, false);
    }

    private void p() {
        if (this.f41761b) {
            e eVar = this.f41760a;
            if (eVar != null) {
                eVar.p();
                this.f41760a.f41761b = false;
                this.f41760a = null;
                this.f41762c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    public e a(int i11) {
        p();
        this.f41762c.value(i11);
        return this;
    }

    public e b(long j11) {
        p();
        this.f41762c.value(j11);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e c(Object obj, boolean z11) {
        int[] iArr;
        int i11 = 0;
        if (z11 && k(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f41762c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f41762c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return j((byte[]) obj);
            }
            this.f41762c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i11 < length) {
                    this.f41762c.value(iArr[i11]);
                    i11++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i11 < length2) {
                    b(jArr[i11]);
                    i11++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i11 < length3) {
                    this.f41762c.value(dArr[i11]);
                    i11++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i11 < length4) {
                    this.f41762c.value(zArr[i11]);
                    i11++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    c(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    c(obj2, false);
                }
            }
            this.f41762c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f41762c.beginArray();
            for (Object obj3 : (Collection) obj) {
                c(obj3, false);
            }
            this.f41762c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f41762c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    g((String) key, entry.getValue());
                } catch (ClassCastException e11) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e11);
                }
            }
            this.f41762c.endObject();
            return this;
        } else {
            lm.c<?> cVar = this.f41763d.get(obj.getClass());
            if (cVar != null) {
                return m(cVar, obj, z11);
            }
            lm.e<?> eVar = this.f41764e.get(obj.getClass());
            if (eVar != null) {
                eVar.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                add(((Enum) obj).name());
                return this;
            } else {
                return m(this.f41765f, obj, z11);
            }
        }
    }

    @Override // lm.f
    /* renamed from: d */
    public e add(String str) {
        p();
        this.f41762c.value(str);
        return this;
    }

    public e e(String str, int i11) {
        p();
        this.f41762c.name(str);
        return a(i11);
    }

    public e f(String str, long j11) {
        p();
        this.f41762c.name(str);
        return b(j11);
    }

    public e g(String str, Object obj) {
        if (this.f41766g) {
            return o(str, obj);
        }
        return n(str, obj);
    }

    public e h(String str, boolean z11) {
        p();
        this.f41762c.name(str);
        return add(z11);
    }

    @Override // lm.f
    /* renamed from: i */
    public e add(boolean z11) {
        p();
        this.f41762c.value(z11);
        return this;
    }

    public e j(byte[] bArr) {
        p();
        if (bArr == null) {
            this.f41762c.nullValue();
        } else {
            this.f41762c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        p();
        this.f41762c.flush();
    }

    e m(lm.c<Object> cVar, Object obj, boolean z11) {
        if (!z11) {
            this.f41762c.beginObject();
        }
        cVar.encode(obj, this);
        if (!z11) {
            this.f41762c.endObject();
        }
        return this;
    }

    @Override // lm.d
    public lm.d add(lm.b bVar, Object obj) {
        return g(bVar.b(), obj);
    }

    @Override // lm.d
    public lm.d add(lm.b bVar, int i11) {
        return e(bVar.b(), i11);
    }

    @Override // lm.d
    public lm.d add(lm.b bVar, long j11) {
        return f(bVar.b(), j11);
    }

    @Override // lm.d
    public lm.d add(lm.b bVar, boolean z11) {
        return h(bVar.b(), z11);
    }
}