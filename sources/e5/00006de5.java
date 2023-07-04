package f8;

import android.graphics.Color;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import d8.e;
import g8.c;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26111a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26112b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f26113c = c.a.a("ty", "nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26114a;

        static {
            int[] iArr = new int[e.b.values().length];
            f26114a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26114a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static d8.e a(g8.c cVar, v7.d dVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f11;
        e.b bVar = e.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.j();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        e.b bVar2 = bVar;
        float f12 = 1.0f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        e.a aVar = null;
        String str = null;
        b8.l lVar = null;
        b8.j jVar = null;
        b8.k kVar = null;
        b8.b bVar3 = null;
        c8.a aVar2 = null;
        j jVar2 = null;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        long j11 = -1;
        long j12 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (cVar.p()) {
            switch (cVar.p0(f26111a)) {
                case 0:
                    str3 = cVar.R();
                    break;
                case 1:
                    j12 = cVar.J();
                    break;
                case 2:
                    str = cVar.R();
                    break;
                case 3:
                    int J = cVar.J();
                    aVar = e.a.UNKNOWN;
                    if (J >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[J];
                        break;
                    }
                case 4:
                    j11 = cVar.J();
                    break;
                case 5:
                    i11 = (int) (cVar.J() * h8.h.e());
                    break;
                case 6:
                    i12 = (int) (cVar.J() * h8.h.e());
                    break;
                case 7:
                    i13 = Color.parseColor(cVar.R());
                    break;
                case 8:
                    lVar = c.g(cVar, dVar);
                    break;
                case 9:
                    int J2 = cVar.J();
                    if (J2 >= e.b.values().length) {
                        dVar.a("Unsupported matte type: " + J2);
                        break;
                    } else {
                        bVar2 = e.b.values()[J2];
                        int i16 = a.f26114a[bVar2.ordinal()];
                        if (i16 == 1) {
                            dVar.a("Unsupported matte type: Luma");
                        } else if (i16 == 2) {
                            dVar.a("Unsupported matte type: Luma Inverted");
                        }
                        dVar.r(1);
                        break;
                    }
                case 10:
                    cVar.g();
                    while (cVar.p()) {
                        arrayList3.add(x.a(cVar, dVar));
                    }
                    dVar.r(arrayList3.size());
                    cVar.l();
                    break;
                case 11:
                    cVar.g();
                    while (cVar.p()) {
                        c8.c a11 = h.a(cVar, dVar);
                        if (a11 != null) {
                            arrayList4.add(a11);
                        }
                    }
                    cVar.l();
                    break;
                case 12:
                    cVar.j();
                    while (cVar.p()) {
                        int p02 = cVar.p0(f26112b);
                        if (p02 == 0) {
                            jVar = d.d(cVar, dVar);
                        } else if (p02 != 1) {
                            cVar.t0();
                            cVar.u0();
                        } else {
                            cVar.g();
                            if (cVar.p()) {
                                kVar = b.a(cVar, dVar);
                            }
                            while (cVar.p()) {
                                cVar.u0();
                            }
                            cVar.l();
                        }
                    }
                    cVar.m();
                    break;
                case 13:
                    cVar.g();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.p()) {
                        cVar.j();
                        while (cVar.p()) {
                            int p03 = cVar.p0(f26113c);
                            if (p03 == 0) {
                                int J3 = cVar.J();
                                if (J3 == 29) {
                                    aVar2 = e.b(cVar, dVar);
                                } else if (J3 == 25) {
                                    jVar2 = new k().b(cVar, dVar);
                                }
                            } else if (p03 != 1) {
                                cVar.t0();
                                cVar.u0();
                            } else {
                                arrayList5.add(cVar.R());
                            }
                        }
                        cVar.m();
                    }
                    cVar.l();
                    dVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f12 = (float) cVar.D();
                    break;
                case 15:
                    f14 = (float) cVar.D();
                    break;
                case 16:
                    i14 = (int) (cVar.J() * h8.h.e());
                    break;
                case 17:
                    i15 = (int) (cVar.J() * h8.h.e());
                    break;
                case 18:
                    f13 = (float) cVar.D();
                    break;
                case 19:
                    f15 = (float) cVar.D();
                    break;
                case 20:
                    bVar3 = d.f(cVar, dVar, false);
                    break;
                case 21:
                    str2 = cVar.R();
                    break;
                case 22:
                    z11 = cVar.C();
                    break;
                default:
                    cVar.t0();
                    cVar.u0();
                    break;
            }
        }
        cVar.m();
        ArrayList arrayList6 = new ArrayList();
        if (f13 > BitmapDescriptorFactory.HUE_RED) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new i8.a(dVar, valueOf2, valueOf2, null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(f13)));
            f11 = BitmapDescriptorFactory.HUE_RED;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f11 = 0.0f;
        }
        if (f15 <= f11) {
            f15 = dVar.f();
        }
        arrayList2.add(new i8.a(dVar, valueOf, valueOf, null, f13, Float.valueOf(f15)));
        arrayList2.add(new i8.a(dVar, valueOf2, valueOf2, null, f15, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            dVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new d8.e(arrayList4, dVar, str3, j12, aVar, j11, str, arrayList, lVar, i11, i12, i13, f12, f14, i14, i15, jVar, kVar, arrayList2, bVar2, bVar3, z11, aVar2, jVar2);
    }

    public static d8.e b(v7.d dVar) {
        Rect b11 = dVar.b();
        return new d8.e(Collections.emptyList(), dVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new b8.l(), 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, b11.width(), b11.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null);
    }
}