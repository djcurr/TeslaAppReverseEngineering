package v4;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final String f54033a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f54034b;

    public a(String str, Object[] objArr) {
        this.f54033a = str;
        this.f54034b = objArr;
    }

    private static void b(i iVar, int i11, Object obj) {
        if (obj == null) {
            iVar.o1(i11);
        } else if (obj instanceof byte[]) {
            iVar.V0(i11, (byte[]) obj);
        } else if (obj instanceof Float) {
            iVar.A(i11, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            iVar.A(i11, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            iVar.U0(i11, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            iVar.U0(i11, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            iVar.U0(i11, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            iVar.U0(i11, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            iVar.A0(i11, (String) obj);
        } else if (obj instanceof Boolean) {
            iVar.U0(i11, ((Boolean) obj).booleanValue() ? 1L : 0L);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void c(i iVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i11 = 0;
        while (i11 < length) {
            Object obj = objArr[i11];
            i11++;
            b(iVar, i11, obj);
        }
    }

    @Override // v4.j
    public String a() {
        return this.f54033a;
    }

    @Override // v4.j
    public void g(i iVar) {
        c(iVar, this.f54034b);
    }

    public a(String str) {
        this(str, null);
    }
}