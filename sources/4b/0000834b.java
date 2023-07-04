package lq;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a<T> extends lq.f<T> {

    /* renamed from: c  reason: collision with root package name */
    public static lq.f<int[]> f37277c = new h(null);

    /* renamed from: d  reason: collision with root package name */
    public static lq.f<Integer[]> f37278d = new i(null);

    /* renamed from: e  reason: collision with root package name */
    public static lq.f<byte[]> f37279e;

    /* renamed from: f  reason: collision with root package name */
    public static lq.f<Byte[]> f37280f;

    /* renamed from: g  reason: collision with root package name */
    public static lq.f<char[]> f37281g;

    /* renamed from: h  reason: collision with root package name */
    public static lq.f<Character[]> f37282h;

    /* renamed from: i  reason: collision with root package name */
    public static lq.f<long[]> f37283i;

    /* renamed from: j  reason: collision with root package name */
    public static lq.f<Long[]> f37284j;

    /* renamed from: k  reason: collision with root package name */
    public static lq.f<float[]> f37285k;

    /* renamed from: l  reason: collision with root package name */
    public static lq.f<Float[]> f37286l;

    /* renamed from: m  reason: collision with root package name */
    public static lq.f<double[]> f37287m;

    /* renamed from: n  reason: collision with root package name */
    public static lq.f<Double[]> f37288n;

    /* renamed from: o  reason: collision with root package name */
    public static lq.f<boolean[]> f37289o;

    /* renamed from: p  reason: collision with root package name */
    public static lq.f<Boolean[]> f37290p;

    /* renamed from: lq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0706a extends a<Long[]> {
        C0706a(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Long[] b(Object obj) {
            List list = (List) obj;
            Long[] lArr = new Long[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        lArr[i11] = (Long) obj2;
                    } else {
                        lArr[i11] = Long.valueOf(((Number) obj2).longValue());
                    }
                    i11++;
                }
            }
            return lArr;
        }
    }

    /* loaded from: classes2.dex */
    class b extends a<float[]> {
        b(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public float[] b(Object obj) {
            List<Number> list = (List) obj;
            float[] fArr = new float[list.size()];
            int i11 = 0;
            for (Number number : list) {
                fArr[i11] = number.floatValue();
                i11++;
            }
            return fArr;
        }
    }

    /* loaded from: classes2.dex */
    class c extends a<Float[]> {
        c(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Float[] b(Object obj) {
            List list = (List) obj;
            Float[] fArr = new Float[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        fArr[i11] = (Float) obj2;
                    } else {
                        fArr[i11] = Float.valueOf(((Number) obj2).floatValue());
                    }
                    i11++;
                }
            }
            return fArr;
        }
    }

    /* loaded from: classes2.dex */
    class d extends a<double[]> {
        d(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public double[] b(Object obj) {
            List<Number> list = (List) obj;
            double[] dArr = new double[list.size()];
            int i11 = 0;
            for (Number number : list) {
                dArr[i11] = number.doubleValue();
                i11++;
            }
            return dArr;
        }
    }

    /* loaded from: classes2.dex */
    class e extends a<Double[]> {
        e(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Double[] b(Object obj) {
            List list = (List) obj;
            Double[] dArr = new Double[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Double) {
                        dArr[i11] = (Double) obj2;
                    } else {
                        dArr[i11] = Double.valueOf(((Number) obj2).doubleValue());
                    }
                    i11++;
                }
            }
            return dArr;
        }
    }

    /* loaded from: classes2.dex */
    class f extends a<boolean[]> {
        f(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public boolean[] b(Object obj) {
            List<Boolean> list = (List) obj;
            boolean[] zArr = new boolean[list.size()];
            int i11 = 0;
            for (Boolean bool : list) {
                zArr[i11] = bool.booleanValue();
                i11++;
            }
            return zArr;
        }
    }

    /* loaded from: classes2.dex */
    class g extends a<Boolean[]> {
        g(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Boolean[] b(Object obj) {
            List list = (List) obj;
            Boolean[] boolArr = new Boolean[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Boolean) {
                        boolArr[i11] = Boolean.valueOf(((Boolean) obj2).booleanValue());
                    } else if (!(obj2 instanceof Number)) {
                        throw new RuntimeException("can not convert " + obj2 + " toBoolean");
                    } else {
                        boolArr[i11] = Boolean.valueOf(((Number) obj2).intValue() != 0);
                    }
                    i11++;
                }
            }
            return boolArr;
        }
    }

    /* loaded from: classes2.dex */
    class h extends a<int[]> {
        h(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public int[] b(Object obj) {
            List<Number> list = (List) obj;
            int[] iArr = new int[list.size()];
            int i11 = 0;
            for (Number number : list) {
                iArr[i11] = number.intValue();
                i11++;
            }
            return iArr;
        }
    }

    /* loaded from: classes2.dex */
    class i extends a<Integer[]> {
        i(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Integer[] b(Object obj) {
            List list = (List) obj;
            Integer[] numArr = new Integer[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Integer) {
                        numArr[i11] = (Integer) obj2;
                    } else {
                        numArr[i11] = Integer.valueOf(((Number) obj2).intValue());
                    }
                    i11++;
                }
            }
            return numArr;
        }
    }

    /* loaded from: classes2.dex */
    class j extends a<short[]> {
        j(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public short[] b(Object obj) {
            List<Number> list = (List) obj;
            short[] sArr = new short[list.size()];
            int i11 = 0;
            for (Number number : list) {
                sArr[i11] = number.shortValue();
                i11++;
            }
            return sArr;
        }
    }

    /* loaded from: classes2.dex */
    class k extends a<Short[]> {
        k(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Short[] b(Object obj) {
            List list = (List) obj;
            Short[] shArr = new Short[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Short) {
                        shArr[i11] = (Short) obj2;
                    } else {
                        shArr[i11] = Short.valueOf(((Number) obj2).shortValue());
                    }
                    i11++;
                }
            }
            return shArr;
        }
    }

    /* loaded from: classes2.dex */
    class l extends a<byte[]> {
        l(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public byte[] b(Object obj) {
            List<Number> list = (List) obj;
            byte[] bArr = new byte[list.size()];
            int i11 = 0;
            for (Number number : list) {
                bArr[i11] = number.byteValue();
                i11++;
            }
            return bArr;
        }
    }

    /* loaded from: classes2.dex */
    class m extends a<Byte[]> {
        m(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Byte[] b(Object obj) {
            List list = (List) obj;
            Byte[] bArr = new Byte[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Byte) {
                        bArr[i11] = (Byte) obj2;
                    } else {
                        bArr[i11] = Byte.valueOf(((Number) obj2).byteValue());
                    }
                    i11++;
                }
            }
            return bArr;
        }
    }

    /* loaded from: classes2.dex */
    class n extends a<char[]> {
        n(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public char[] b(Object obj) {
            List<Object> list = (List) obj;
            char[] cArr = new char[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                cArr[i11] = obj2.toString().charAt(0);
                i11++;
            }
            return cArr;
        }
    }

    /* loaded from: classes2.dex */
    class o extends a<Character[]> {
        o(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public Character[] b(Object obj) {
            List list = (List) obj;
            Character[] chArr = new Character[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    chArr[i11] = Character.valueOf(obj2.toString().charAt(0));
                    i11++;
                }
            }
            return chArr;
        }
    }

    /* loaded from: classes2.dex */
    class p extends a<long[]> {
        p(lq.e eVar) {
            super(eVar);
        }

        @Override // lq.f
        /* renamed from: h */
        public long[] b(Object obj) {
            List<Number> list = (List) obj;
            long[] jArr = new long[list.size()];
            int i11 = 0;
            for (Number number : list) {
                jArr[i11] = number.intValue();
                i11++;
            }
            return jArr;
        }
    }

    static {
        new j(null);
        new k(null);
        f37279e = new l(null);
        f37280f = new m(null);
        f37281g = new n(null);
        f37282h = new o(null);
        f37283i = new p(null);
        f37284j = new C0706a(null);
        f37285k = new b(null);
        f37286l = new c(null);
        f37287m = new d(null);
        f37288n = new e(null);
        f37289o = new f(null);
        f37290p = new g(null);
    }

    public a(lq.e eVar) {
        super(eVar);
    }

    @Override // lq.f
    public void a(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // lq.f
    public Object c() {
        return new ArrayList();
    }
}