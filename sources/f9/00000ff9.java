package cc;

import bc.k;
import com.drew.metadata.MetadataException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final Map<Integer, Object> f9045a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    protected final Collection<g> f9046b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Collection<String> f9047c = new ArrayList(4);

    /* renamed from: d  reason: collision with root package name */
    protected h f9048d;

    public boolean A() {
        return this.f9047c.isEmpty() && this.f9046b.isEmpty();
    }

    public void B(int i11, boolean z11) {
        M(i11, Boolean.valueOf(z11));
    }

    public void C(int i11, byte[] bArr) {
        N(i11, bArr);
    }

    public void D(int i11, Date date) {
        M(i11, date);
    }

    public void E(h hVar) {
        Objects.requireNonNull(hVar, "cannot set a null descriptor");
        this.f9048d = hVar;
    }

    public void F(int i11, double d11) {
        M(i11, Double.valueOf(d11));
    }

    public void G(int i11, double[] dArr) {
        N(i11, dArr);
    }

    public void H(int i11, float f11) {
        M(i11, Float.valueOf(f11));
    }

    public void I(int i11, float[] fArr) {
        N(i11, fArr);
    }

    public void J(int i11, int i12) {
        M(i11, Integer.valueOf(i12));
    }

    public void K(int i11, int[] iArr) {
        N(i11, iArr);
    }

    public void L(int i11, long j11) {
        M(i11, Long.valueOf(j11));
    }

    public void M(int i11, Object obj) {
        Objects.requireNonNull(obj, "cannot set a null object");
        if (!this.f9045a.containsKey(Integer.valueOf(i11))) {
            this.f9046b.add(new g(i11, this));
        }
        this.f9045a.put(Integer.valueOf(i11), obj);
    }

    public void N(int i11, Object obj) {
        M(i11, obj);
    }

    public void O(b bVar) {
    }

    public void P(int i11, k kVar) {
        M(i11, kVar);
    }

    public void Q(int i11, k[] kVarArr) {
        N(i11, kVarArr);
    }

    public void R(int i11, String str) {
        Objects.requireNonNull(str, "cannot set a null String");
        M(i11, str);
    }

    public void S(int i11, String[] strArr) {
        N(i11, strArr);
    }

    public void T(int i11, f fVar) {
        Objects.requireNonNull(fVar, "cannot set a null StringValue");
        M(i11, fVar);
    }

    public void U(int i11, f[] fVarArr) {
        N(i11, fVarArr);
    }

    public void a(String str) {
        this.f9047c.add(str);
    }

    public boolean b(int i11) {
        return this.f9045a.containsKey(Integer.valueOf(i11));
    }

    public boolean c(int i11) {
        Boolean d11 = d(i11);
        if (d11 != null) {
            return d11.booleanValue();
        }
        Object o11 = o(i11);
        if (o11 == null) {
            throw new MetadataException("Tag '" + v(i11) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i11 + "' cannot be converted to a boolean.  It is of type '" + o11.getClass() + "'.");
    }

    public Boolean d(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof Boolean) {
            return (Boolean) o11;
        }
        if (!(o11 instanceof String) && !(o11 instanceof f)) {
            if (o11 instanceof Number) {
                return Boolean.valueOf(((Number) o11).doubleValue() != 0.0d);
            }
            return null;
        }
        try {
            return Boolean.valueOf(Boolean.getBoolean(o11.toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public byte[] e(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof f) {
            return ((f) o11).a();
        }
        int i12 = 0;
        if (o11 instanceof k[]) {
            k[] kVarArr = (k[]) o11;
            int length = kVarArr.length;
            byte[] bArr = new byte[length];
            while (i12 < length) {
                bArr[i12] = kVarArr[i12].byteValue();
                i12++;
            }
            return bArr;
        } else if (o11 instanceof byte[]) {
            return (byte[]) o11;
        } else {
            if (o11 instanceof int[]) {
                int[] iArr = (int[]) o11;
                byte[] bArr2 = new byte[iArr.length];
                while (i12 < iArr.length) {
                    bArr2[i12] = (byte) iArr[i12];
                    i12++;
                }
                return bArr2;
            } else if (o11 instanceof short[]) {
                short[] sArr = (short[]) o11;
                byte[] bArr3 = new byte[sArr.length];
                while (i12 < sArr.length) {
                    bArr3[i12] = (byte) sArr[i12];
                    i12++;
                }
                return bArr3;
            } else if (o11 instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) o11;
                byte[] bArr4 = new byte[charSequence.length()];
                while (i12 < charSequence.length()) {
                    bArr4[i12] = (byte) charSequence.charAt(i12);
                    i12++;
                }
                return bArr4;
            } else if (o11 instanceof Integer) {
                return new byte[]{((Integer) o11).byteValue()};
            } else {
                return null;
            }
        }
    }

    public String f(int i11) {
        return this.f9048d.f(i11);
    }

    public double g(int i11) {
        Double h11 = h(i11);
        if (h11 != null) {
            return h11.doubleValue();
        }
        Object o11 = o(i11);
        if (o11 == null) {
            throw new MetadataException("Tag '" + v(i11) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i11 + "' cannot be converted to a double.  It is of type '" + o11.getClass() + "'.");
    }

    public Double h(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (!(o11 instanceof String) && !(o11 instanceof f)) {
            if (o11 instanceof Number) {
                return Double.valueOf(((Number) o11).doubleValue());
            }
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(o11.toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public Float i(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (!(o11 instanceof String) && !(o11 instanceof f)) {
            if (o11 instanceof Number) {
                return Float.valueOf(((Number) o11).floatValue());
            }
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(o11.toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int j(int i11) {
        Integer l11 = l(i11);
        if (l11 != null) {
            return l11.intValue();
        }
        Object o11 = o(i11);
        if (o11 == null) {
            throw new MetadataException("Tag '" + v(i11) + "' has not been set -- check using containsTag() first");
        }
        throw new MetadataException("Tag '" + i11 + "' cannot be converted to int.  It is of type '" + o11.getClass() + "'.");
    }

    public int[] k(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof int[]) {
            return (int[]) o11;
        }
        int i12 = 0;
        if (o11 instanceof k[]) {
            k[] kVarArr = (k[]) o11;
            int length = kVarArr.length;
            int[] iArr = new int[length];
            while (i12 < length) {
                iArr[i12] = kVarArr[i12].intValue();
                i12++;
            }
            return iArr;
        } else if (o11 instanceof short[]) {
            short[] sArr = (short[]) o11;
            int[] iArr2 = new int[sArr.length];
            while (i12 < sArr.length) {
                iArr2[i12] = sArr[i12];
                i12++;
            }
            return iArr2;
        } else if (o11 instanceof byte[]) {
            byte[] bArr = (byte[]) o11;
            int[] iArr3 = new int[bArr.length];
            while (i12 < bArr.length) {
                iArr3[i12] = bArr[i12];
                i12++;
            }
            return iArr3;
        } else if (o11 instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) o11;
            int[] iArr4 = new int[charSequence.length()];
            while (i12 < charSequence.length()) {
                iArr4[i12] = charSequence.charAt(i12);
                i12++;
            }
            return iArr4;
        } else if (o11 instanceof Integer) {
            return new int[]{((Integer) o11).intValue()};
        } else {
            return null;
        }
    }

    public Integer l(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof Number) {
            return Integer.valueOf(((Number) o11).intValue());
        }
        if (!(o11 instanceof String) && !(o11 instanceof f)) {
            if (o11 instanceof k[]) {
                k[] kVarArr = (k[]) o11;
                if (kVarArr.length == 1) {
                    return Integer.valueOf(kVarArr[0].intValue());
                }
            } else if (o11 instanceof byte[]) {
                byte[] bArr = (byte[]) o11;
                if (bArr.length == 1) {
                    return Integer.valueOf(bArr[0]);
                }
            } else if (o11 instanceof int[]) {
                int[] iArr = (int[]) o11;
                if (iArr.length == 1) {
                    return Integer.valueOf(iArr[0]);
                }
            } else if (o11 instanceof short[]) {
                short[] sArr = (short[]) o11;
                if (sArr.length == 1) {
                    return Integer.valueOf(sArr[0]);
                }
            }
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(o11.toString()));
        } catch (NumberFormatException unused) {
            long j11 = 0;
            for (byte b11 : o11.toString().getBytes()) {
                j11 = (j11 << 8) + (b11 & 255);
            }
            return Integer.valueOf((int) j11);
        }
    }

    public Long m(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof Number) {
            return Long.valueOf(((Number) o11).longValue());
        }
        if (!(o11 instanceof String) && !(o11 instanceof f)) {
            if (o11 instanceof k[]) {
                k[] kVarArr = (k[]) o11;
                if (kVarArr.length == 1) {
                    return Long.valueOf(kVarArr[0].longValue());
                }
            } else if (o11 instanceof byte[]) {
                byte[] bArr = (byte[]) o11;
                if (bArr.length == 1) {
                    return Long.valueOf(bArr[0]);
                }
            } else if (o11 instanceof int[]) {
                int[] iArr = (int[]) o11;
                if (iArr.length == 1) {
                    return Long.valueOf(iArr[0]);
                }
            } else if (o11 instanceof short[]) {
                short[] sArr = (short[]) o11;
                if (sArr.length == 1) {
                    return Long.valueOf(sArr[0]);
                }
            }
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(o11.toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public abstract String n();

    public Object o(int i11) {
        return this.f9045a.get(Integer.valueOf(i11));
    }

    public k p(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof k) {
            return (k) o11;
        }
        if (o11 instanceof Integer) {
            return new k(((Integer) o11).intValue(), 1L);
        }
        if (o11 instanceof Long) {
            return new k(((Long) o11).longValue(), 1L);
        }
        return null;
    }

    public k[] q(int i11) {
        Object o11 = o(i11);
        if (o11 != null && (o11 instanceof k[])) {
            return (k[]) o11;
        }
        return null;
    }

    public String r(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof k) {
            return ((k) o11).k(true);
        }
        if (o11.getClass().isArray()) {
            int length = Array.getLength(o11);
            Class<?> componentType = o11.getClass().getComponentType();
            StringBuilder sb2 = new StringBuilder();
            int i12 = 0;
            if (Object.class.isAssignableFrom(componentType)) {
                while (i12 < length) {
                    if (i12 != 0) {
                        sb2.append(' ');
                    }
                    sb2.append(Array.get(o11, i12).toString());
                    i12++;
                }
            } else if (componentType.getName().equals("int")) {
                while (i12 < length) {
                    if (i12 != 0) {
                        sb2.append(' ');
                    }
                    sb2.append(Array.getInt(o11, i12));
                    i12++;
                }
            } else if (componentType.getName().equals("short")) {
                while (i12 < length) {
                    if (i12 != 0) {
                        sb2.append(' ');
                    }
                    sb2.append((int) Array.getShort(o11, i12));
                    i12++;
                }
            } else if (componentType.getName().equals("long")) {
                while (i12 < length) {
                    if (i12 != 0) {
                        sb2.append(' ');
                    }
                    sb2.append(Array.getLong(o11, i12));
                    i12++;
                }
            } else if (componentType.getName().equals("float")) {
                DecimalFormat decimalFormat = new DecimalFormat("0.###");
                while (i12 < length) {
                    if (i12 != 0) {
                        sb2.append(' ');
                    }
                    String format = decimalFormat.format(Array.getFloat(o11, i12));
                    if (format.equals("-0")) {
                        format = "0";
                    }
                    sb2.append(format);
                    i12++;
                }
            } else if (componentType.getName().equals("double")) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0.###");
                while (i12 < length) {
                    if (i12 != 0) {
                        sb2.append(' ');
                    }
                    String format2 = decimalFormat2.format(Array.getDouble(o11, i12));
                    if (format2.equals("-0")) {
                        format2 = "0";
                    }
                    sb2.append(format2);
                    i12++;
                }
            } else if (componentType.getName().equals("byte")) {
                while (i12 < length) {
                    if (i12 != 0) {
                        sb2.append(' ');
                    }
                    sb2.append(Array.getByte(o11, i12) & 255);
                    i12++;
                }
            } else {
                a("Unexpected array component type: " + componentType.getName());
            }
            return sb2.toString();
        } else if (o11 instanceof Double) {
            return new DecimalFormat("0.###").format(((Double) o11).doubleValue());
        } else {
            if (o11 instanceof Float) {
                return new DecimalFormat("0.###").format(((Float) o11).floatValue());
            }
            return o11.toString();
        }
    }

    public String[] s(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof String[]) {
            return (String[]) o11;
        }
        int i12 = 0;
        if (o11 instanceof String) {
            return new String[]{(String) o11};
        }
        if (o11 instanceof f) {
            return new String[]{o11.toString()};
        }
        if (o11 instanceof f[]) {
            f[] fVarArr = (f[]) o11;
            int length = fVarArr.length;
            String[] strArr = new String[length];
            while (i12 < length) {
                strArr[i12] = fVarArr[i12].toString();
                i12++;
            }
            return strArr;
        } else if (o11 instanceof int[]) {
            int[] iArr = (int[]) o11;
            int length2 = iArr.length;
            String[] strArr2 = new String[length2];
            while (i12 < length2) {
                strArr2[i12] = Integer.toString(iArr[i12]);
                i12++;
            }
            return strArr2;
        } else if (o11 instanceof byte[]) {
            byte[] bArr = (byte[]) o11;
            int length3 = bArr.length;
            String[] strArr3 = new String[length3];
            while (i12 < length3) {
                strArr3[i12] = Byte.toString(bArr[i12]);
                i12++;
            }
            return strArr3;
        } else if (o11 instanceof k[]) {
            k[] kVarArr = (k[]) o11;
            int length4 = kVarArr.length;
            String[] strArr4 = new String[length4];
            for (int i13 = 0; i13 < length4; i13++) {
                strArr4[i13] = kVarArr[i13].k(false);
            }
            return strArr4;
        } else {
            return null;
        }
    }

    public f t(int i11) {
        Object o11 = o(i11);
        if (o11 instanceof f) {
            return (f) o11;
        }
        return null;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = n();
        objArr[1] = Integer.valueOf(this.f9045a.size());
        objArr[2] = this.f9045a.size() == 1 ? "tag" : "tags";
        return String.format("%s Directory (%d %s)", objArr);
    }

    public f[] u(int i11) {
        Object o11 = o(i11);
        if (o11 == null) {
            return null;
        }
        if (o11 instanceof f[]) {
            return (f[]) o11;
        }
        if (o11 instanceof f) {
            return new f[]{(f) o11};
        }
        return null;
    }

    public String v(int i11) {
        HashMap<Integer, String> w11 = w();
        if (!w11.containsKey(Integer.valueOf(i11))) {
            String hexString = Integer.toHexString(i11);
            while (hexString.length() < 4) {
                hexString = "0" + hexString;
            }
            return "Unknown tag (0x" + hexString + ")";
        }
        return w11.get(Integer.valueOf(i11));
    }

    protected abstract HashMap<Integer, String> w();

    public Collection<g> x() {
        return Collections.unmodifiableCollection(this.f9046b);
    }

    public boolean y() {
        return this.f9047c.size() > 0;
    }

    public boolean z(int i11) {
        return w().containsKey(Integer.valueOf(i11));
    }
}