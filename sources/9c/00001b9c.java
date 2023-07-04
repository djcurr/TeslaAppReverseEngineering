package com.google.android.exoplayer2.extractor.flv;

import ak.v;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ji.g;

/* loaded from: classes3.dex */
final class c extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    private long f13400b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f13401c;

    /* renamed from: d  reason: collision with root package name */
    private long[] f13402d;

    public c() {
        super(new g());
        this.f13400b = -9223372036854775807L;
        this.f13401c = new long[0];
        this.f13402d = new long[0];
    }

    private static Boolean g(v vVar) {
        return Boolean.valueOf(vVar.C() == 1);
    }

    private static Object h(v vVar, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 8) {
                            if (i11 != 10) {
                                if (i11 != 11) {
                                    return null;
                                }
                                return i(vVar);
                            }
                            return m(vVar);
                        }
                        return k(vVar);
                    }
                    return l(vVar);
                }
                return n(vVar);
            }
            return g(vVar);
        }
        return j(vVar);
    }

    private static Date i(v vVar) {
        Date date = new Date((long) j(vVar).doubleValue());
        vVar.P(2);
        return date;
    }

    private static Double j(v vVar) {
        return Double.valueOf(Double.longBitsToDouble(vVar.v()));
    }

    private static HashMap<String, Object> k(v vVar) {
        int G = vVar.G();
        HashMap<String, Object> hashMap = new HashMap<>(G);
        for (int i11 = 0; i11 < G; i11++) {
            String n11 = n(vVar);
            Object h11 = h(vVar, o(vVar));
            if (h11 != null) {
                hashMap.put(n11, h11);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(v vVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n11 = n(vVar);
            int o11 = o(vVar);
            if (o11 == 9) {
                return hashMap;
            }
            Object h11 = h(vVar, o11);
            if (h11 != null) {
                hashMap.put(n11, h11);
            }
        }
    }

    private static ArrayList<Object> m(v vVar) {
        int G = vVar.G();
        ArrayList<Object> arrayList = new ArrayList<>(G);
        for (int i11 = 0; i11 < G; i11++) {
            Object h11 = h(vVar, o(vVar));
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
        return arrayList;
    }

    private static String n(v vVar) {
        int I = vVar.I();
        int e11 = vVar.e();
        vVar.P(I);
        return new String(vVar.d(), e11, I);
    }

    private static int o(v vVar) {
        return vVar.C();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean b(v vVar) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    protected boolean c(v vVar, long j11) {
        if (o(vVar) == 2 && "onMetaData".equals(n(vVar)) && o(vVar) == 8) {
            HashMap<String, Object> k11 = k(vVar);
            Object obj = k11.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f13400b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = k11.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f13401c = new long[size];
                    this.f13402d = new long[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        Object obj5 = list.get(i11);
                        Object obj6 = list2.get(i11);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.f13401c[i11] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.f13402d[i11] = ((Double) obj5).longValue();
                        } else {
                            this.f13401c = new long[0];
                            this.f13402d = new long[0];
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public long d() {
        return this.f13400b;
    }

    public long[] e() {
        return this.f13402d;
    }

    public long[] f() {
        return this.f13401c;
    }
}