package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class w0 implements v4.j, v4.i {

    /* renamed from: i  reason: collision with root package name */
    static final TreeMap<Integer, w0> f5867i = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    private volatile String f5868a;

    /* renamed from: b  reason: collision with root package name */
    final long[] f5869b;

    /* renamed from: c  reason: collision with root package name */
    final double[] f5870c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f5871d;

    /* renamed from: e  reason: collision with root package name */
    final byte[][] f5872e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f5873f;

    /* renamed from: g  reason: collision with root package name */
    final int f5874g;

    /* renamed from: h  reason: collision with root package name */
    int f5875h;

    private w0(int i11) {
        this.f5874g = i11;
        int i12 = i11 + 1;
        this.f5873f = new int[i12];
        this.f5869b = new long[i12];
        this.f5870c = new double[i12];
        this.f5871d = new String[i12];
        this.f5872e = new byte[i12];
    }

    public static w0 j(String str, int i11) {
        TreeMap<Integer, w0> treeMap = f5867i;
        synchronized (treeMap) {
            Map.Entry<Integer, w0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i11));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                w0 value = ceilingEntry.getValue();
                value.l(str, i11);
                return value;
            }
            w0 w0Var = new w0(i11);
            w0Var.l(str, i11);
            return w0Var;
        }
    }

    private static void m() {
        TreeMap<Integer, w0> treeMap = f5867i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it2 = treeMap.descendingKeySet().iterator();
        while (true) {
            int i11 = size - 1;
            if (size <= 0) {
                return;
            }
            it2.next();
            it2.remove();
            size = i11;
        }
    }

    @Override // v4.i
    public void A(int i11, double d11) {
        this.f5873f[i11] = 3;
        this.f5870c[i11] = d11;
    }

    @Override // v4.i
    public void A0(int i11, String str) {
        this.f5873f[i11] = 4;
        this.f5871d[i11] = str;
    }

    @Override // v4.i
    public void U0(int i11, long j11) {
        this.f5873f[i11] = 2;
        this.f5869b[i11] = j11;
    }

    @Override // v4.i
    public void V0(int i11, byte[] bArr) {
        this.f5873f[i11] = 5;
        this.f5872e[i11] = bArr;
    }

    @Override // v4.j
    public String a() {
        return this.f5868a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // v4.j
    public void g(v4.i iVar) {
        for (int i11 = 1; i11 <= this.f5875h; i11++) {
            int i12 = this.f5873f[i11];
            if (i12 == 1) {
                iVar.o1(i11);
            } else if (i12 == 2) {
                iVar.U0(i11, this.f5869b[i11]);
            } else if (i12 == 3) {
                iVar.A(i11, this.f5870c[i11]);
            } else if (i12 == 4) {
                iVar.A0(i11, this.f5871d[i11]);
            } else if (i12 == 5) {
                iVar.V0(i11, this.f5872e[i11]);
            }
        }
    }

    void l(String str, int i11) {
        this.f5868a = str;
        this.f5875h = i11;
    }

    @Override // v4.i
    public void o1(int i11) {
        this.f5873f[i11] = 1;
    }

    public void release() {
        TreeMap<Integer, w0> treeMap = f5867i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5874g), this);
            m();
        }
    }
}