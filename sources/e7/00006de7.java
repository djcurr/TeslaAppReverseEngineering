package f8;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d8.e;
import g8.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26115a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    static c.a f26116b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f26117c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    private static final c.a f26118d = c.a.a("cm", "tm", "dr");

    public static v7.d a(g8.c cVar) {
        HashMap hashMap;
        ArrayList arrayList;
        g8.c cVar2 = cVar;
        float e11 = h8.h.e();
        androidx.collection.d<d8.e> dVar = new androidx.collection.d<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        androidx.collection.h<a8.d> hVar = new androidx.collection.h<>();
        v7.d dVar2 = new v7.d();
        cVar.j();
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        while (cVar.p()) {
            switch (cVar2.p0(f26115a)) {
                case 0:
                    i11 = cVar.J();
                    continue;
                    cVar2 = cVar;
                case 1:
                    i12 = cVar.J();
                    continue;
                    cVar2 = cVar;
                case 2:
                    f11 = (float) cVar.D();
                    continue;
                    cVar2 = cVar;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f12 = ((float) cVar.D()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f13 = (float) cVar.D();
                    break;
                case 5:
                    String[] split = cVar.R().split("\\.");
                    if (!h8.h.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar2.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    e(cVar2, dVar2, arrayList2, dVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    b(cVar2, dVar2, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    d(cVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    c(cVar2, dVar2, hVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    f(cVar2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.t0();
                    cVar.u0();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        dVar2.s(new Rect(0, 0, (int) (i11 * e11), (int) (i12 * e11)), f11, f12, f13, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return dVar2;
    }

    private static void b(g8.c cVar, v7.d dVar, Map<String, List<d8.e>> map, Map<String, v7.f> map2) {
        cVar.g();
        while (cVar.p()) {
            ArrayList arrayList = new ArrayList();
            androidx.collection.d dVar2 = new androidx.collection.d();
            cVar.j();
            int i11 = 0;
            int i12 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.p()) {
                int p02 = cVar.p0(f26116b);
                if (p02 == 0) {
                    str = cVar.R();
                } else if (p02 == 1) {
                    cVar.g();
                    while (cVar.p()) {
                        d8.e a11 = v.a(cVar, dVar);
                        dVar2.j(a11.d(), a11);
                        arrayList.add(a11);
                    }
                    cVar.l();
                } else if (p02 == 2) {
                    i11 = cVar.J();
                } else if (p02 == 3) {
                    i12 = cVar.J();
                } else if (p02 == 4) {
                    str2 = cVar.R();
                } else if (p02 != 5) {
                    cVar.t0();
                    cVar.u0();
                } else {
                    str3 = cVar.R();
                }
            }
            cVar.m();
            if (str2 != null) {
                v7.f fVar = new v7.f(i11, i12, str, str2, str3);
                map2.put(fVar.d(), fVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.l();
    }

    private static void c(g8.c cVar, v7.d dVar, androidx.collection.h<a8.d> hVar) {
        cVar.g();
        while (cVar.p()) {
            a8.d a11 = m.a(cVar, dVar);
            hVar.l(a11.hashCode(), a11);
        }
        cVar.l();
    }

    private static void d(g8.c cVar, Map<String, a8.c> map) {
        cVar.j();
        while (cVar.p()) {
            if (cVar.p0(f26117c) != 0) {
                cVar.t0();
                cVar.u0();
            } else {
                cVar.g();
                while (cVar.p()) {
                    a8.c a11 = n.a(cVar);
                    map.put(a11.b(), a11);
                }
                cVar.l();
            }
        }
        cVar.m();
    }

    private static void e(g8.c cVar, v7.d dVar, List<d8.e> list, androidx.collection.d<d8.e> dVar2) {
        cVar.g();
        int i11 = 0;
        while (cVar.p()) {
            d8.e a11 = v.a(cVar, dVar);
            if (a11.f() == e.a.IMAGE) {
                i11++;
            }
            list.add(a11);
            dVar2.j(a11.d(), a11);
            if (i11 > 4) {
                h8.d.c("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.l();
    }

    private static void f(g8.c cVar, List<a8.h> list) {
        cVar.g();
        while (cVar.p()) {
            String str = null;
            cVar.j();
            float f11 = BitmapDescriptorFactory.HUE_RED;
            float f12 = 0.0f;
            while (cVar.p()) {
                int p02 = cVar.p0(f26118d);
                if (p02 == 0) {
                    str = cVar.R();
                } else if (p02 == 1) {
                    f11 = (float) cVar.D();
                } else if (p02 != 2) {
                    cVar.t0();
                    cVar.u0();
                } else {
                    f12 = (float) cVar.D();
                }
            }
            cVar.m();
            list.add(new a8.h(str, f11, f12));
        }
        cVar.l();
    }
}