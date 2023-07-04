package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f6541b = q.f("Data");

    /* renamed from: c  reason: collision with root package name */
    public static final e f6542c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    Map<String, Object> f6543a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Map<String, Object> f6544a = new HashMap();

        public e a() {
            e eVar = new e(this.f6544a);
            e.m(eVar);
            return eVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f6544a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    if (cls == boolean[].class) {
                        this.f6544a.put(str, e.a((boolean[]) obj));
                    } else if (cls == byte[].class) {
                        this.f6544a.put(str, e.b((byte[]) obj));
                    } else if (cls == int[].class) {
                        this.f6544a.put(str, e.e((int[]) obj));
                    } else if (cls == long[].class) {
                        this.f6544a.put(str, e.f((long[]) obj));
                    } else if (cls == float[].class) {
                        this.f6544a.put(str, e.d((float[]) obj));
                    } else if (cls == double[].class) {
                        this.f6544a.put(str, e.c((double[]) obj));
                    } else {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                } else {
                    this.f6544a.put(str, obj);
                }
            }
            return this;
        }

        public a c(e eVar) {
            d(eVar.f6543a);
            return this;
        }

        public a d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, boolean z11) {
            this.f6544a.put(str, Boolean.valueOf(z11));
            return this;
        }

        public a f(String str, int i11) {
            this.f6544a.put(str, Integer.valueOf(i11));
            return this;
        }

        public a g(String str, String str2) {
            this.f6544a.put(str, str2);
            return this;
        }
    }

    e() {
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i11 = 0; i11 < zArr.length; i11++) {
            boolArr[i11] = Boolean.valueOf(zArr[i11]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = Byte.valueOf(bArr[i11]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr2[i11] = Double.valueOf(dArr[i11]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr2[i11] = Float.valueOf(fArr[i11]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i11] = Long.valueOf(jArr[i11]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x005d -> B:36:0x0062). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.e g(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.e.f6541b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.e.f6541b     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.e.f6541b
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.e.f6541b
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.e r7 = new androidx.work.e
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.e.f6541b
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.e.f6541b
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.e.g(byte[]):androidx.work.e");
    }

    public static byte[] m(e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(eVar.l());
                    for (Map.Entry<String, Object> entry : eVar.f6543a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e11) {
                        Log.e(f6541b, "Error in Data#toByteArray: ", e11);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        Log.e(f6541b, "Error in Data#toByteArray: ", e12);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e13) {
                    e = e13;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f6541b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e14) {
                            Log.e(f6541b, "Error in Data#toByteArray: ", e14);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e15) {
                        Log.e(f6541b, "Error in Data#toByteArray: ", e15);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e16) {
                            Log.e(f6541b, "Error in Data#toByteArray: ", e16);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e17) {
                        Log.e(f6541b, "Error in Data#toByteArray: ", e17);
                    }
                    throw th;
                }
            } catch (IOException e18) {
                e = e18;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set<String> keySet = this.f6543a.keySet();
        if (keySet.equals(eVar.f6543a.keySet())) {
            for (String str : keySet) {
                Object obj2 = this.f6543a.get(str);
                Object obj3 = eVar.f6543a.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z11 = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z11 = obj2.equals(obj3);
                    continue;
                }
                if (!z11) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(String str, boolean z11) {
        Object obj = this.f6543a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z11;
    }

    public int hashCode() {
        return this.f6543a.hashCode() * 31;
    }

    public int i(String str, int i11) {
        Object obj = this.f6543a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i11;
    }

    public Map<String, Object> j() {
        return Collections.unmodifiableMap(this.f6543a);
    }

    public String k(String str) {
        Object obj = this.f6543a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int l() {
        return this.f6543a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f6543a.isEmpty()) {
            for (String str : this.f6543a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f6543a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public e(e eVar) {
        this.f6543a = new HashMap(eVar.f6543a);
    }

    public e(Map<String, ?> map) {
        this.f6543a = new HashMap(map);
    }
}