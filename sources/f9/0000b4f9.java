package tb;

import bc.h;
import bc.j;
import bc.l;
import bc.n;
import bc.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static Set<d> f51898a;

    /* renamed from: b  reason: collision with root package name */
    private static Charset f51899b = bc.e.f7597b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(d.f51874d);
        hashSet.add(d.f51875e);
        hashSet.add(d.f51883m);
        hashSet.add(d.f51877g);
        hashSet.add(d.f51881k);
        hashSet.add(d.f51878h);
        hashSet.add(d.f51879i);
        hashSet.add(d.f51882l);
        hashSet.add(d.f51887q);
        hashSet.add(d.f51888r);
        hashSet.add(d.f51886p);
        hashSet.add(d.f51885o);
        hashSet.add(d.f51884n);
        hashSet.add(d.f51880j);
        f51898a = Collections.unmodifiableSet(hashSet);
    }

    private static void a(cc.e eVar, b bVar) {
        d b11 = bVar.b();
        byte[] a11 = bVar.a();
        d dVar = d.f51874d;
        if (b11.equals(dVar)) {
            e eVar2 = new e(a11);
            ad.c cVar = new ad.c(dVar);
            cVar.J(1, eVar2.f());
            cVar.J(2, eVar2.e());
            cVar.J(3, eVar2.a());
            cVar.J(4, eVar2.b().getNumericValue());
            cVar.J(5, eVar2.c() & 255);
            cVar.J(6, eVar2.d());
            cVar.J(7, eVar2.g());
            eVar.a(cVar);
            return;
        }
        d dVar2 = d.f51875e;
        if (b11.equals(dVar2)) {
            ad.c cVar2 = new ad.c(dVar2);
            cVar2.J(8, a11.length / 3);
            eVar.a(cVar2);
            return;
        }
        d dVar3 = d.f51883m;
        if (b11.equals(dVar3)) {
            ad.c cVar3 = new ad.c(dVar3);
            cVar3.J(9, 1);
            eVar.a(cVar3);
            return;
        }
        d dVar4 = d.f51881k;
        if (b11.equals(dVar4)) {
            byte b12 = a11[0];
            ad.c cVar4 = new ad.c(dVar4);
            cVar4.J(10, b12);
            eVar.a(cVar4);
        } else if (b11.equals(d.f51877g)) {
            a aVar = new a(a11);
            ad.a aVar2 = new ad.a();
            aVar2.J(1, aVar.g());
            aVar2.J(2, aVar.h());
            aVar2.J(3, aVar.e());
            aVar2.J(4, aVar.f());
            aVar2.J(5, aVar.c());
            aVar2.J(6, aVar.d());
            aVar2.J(7, aVar.a());
            aVar2.J(8, aVar.b());
            eVar.a(aVar2);
        } else {
            d dVar5 = d.f51878h;
            if (b11.equals(dVar5)) {
                int a12 = bc.b.a(a11);
                new l(a11).f();
                ad.c cVar5 = new ad.c(dVar5);
                cVar5.F(11, a12 / 100000.0d);
                eVar.a(cVar5);
                return;
            }
            d dVar6 = d.f51879i;
            if (b11.equals(dVar6)) {
                l lVar = new l(a11);
                byte[] i11 = lVar.i(80);
                ad.c cVar6 = new ad.c(dVar6);
                cVar6.T(12, new cc.f(i11, f51899b));
                if (lVar.h() == 0) {
                    try {
                        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(lVar.d(a11.length - ((i11.length + 1) + 1))));
                        new lc.c().d(new j(inflaterInputStream), eVar, cVar6);
                        inflaterInputStream.close();
                    } catch (ZipException e11) {
                        cVar6.a(String.format("Exception decompressing PNG iCCP chunk : %s", e11.getMessage()));
                        eVar.a(cVar6);
                    }
                } else {
                    cVar6.a("Invalid compression method value");
                }
                eVar.a(cVar6);
                return;
            }
            d dVar7 = d.f51882l;
            if (b11.equals(dVar7)) {
                ad.c cVar7 = new ad.c(dVar7);
                cVar7.C(15, a11);
                eVar.a(cVar7);
                return;
            }
            d dVar8 = d.f51887q;
            if (b11.equals(dVar8)) {
                l lVar2 = new l(a11);
                cc.f k11 = lVar2.k(80, f51899b);
                String fVar = k11.toString();
                cc.f k12 = lVar2.k(a11.length - (k11.a().length + 1), f51899b);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new h(fVar, k12));
                ad.c cVar8 = new ad.c(dVar8);
                cVar8.M(13, arrayList);
                eVar.a(cVar8);
                return;
            }
            d dVar9 = d.f51888r;
            byte[] bArr = null;
            if (b11.equals(dVar9)) {
                l lVar3 = new l(a11);
                cc.f k13 = lVar3.k(80, f51899b);
                String fVar2 = k13.toString();
                byte h11 = lVar3.h();
                int length = a11.length - ((k13.a().length + 1) + 1);
                if (h11 == 0) {
                    try {
                        bArr = o.a(new InflaterInputStream(new ByteArrayInputStream(a11, a11.length - length, length)));
                    } catch (ZipException e12) {
                        ad.c cVar9 = new ad.c(d.f51888r);
                        cVar9.a(String.format("Exception decompressing PNG zTXt chunk with keyword \"%s\": %s", fVar2, e12.getMessage()));
                        eVar.a(cVar9);
                    }
                } else {
                    ad.c cVar10 = new ad.c(dVar9);
                    cVar10.a("Invalid compression method value");
                    eVar.a(cVar10);
                }
                byte[] bArr2 = bArr;
                if (bArr2 != null) {
                    if (fVar2.equals("XML:com.adobe.xmp")) {
                        new ed.c().f(bArr2, eVar);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new h(fVar2, new cc.f(bArr2, f51899b)));
                    ad.c cVar11 = new ad.c(d.f51888r);
                    cVar11.M(13, arrayList2);
                    eVar.a(cVar11);
                    return;
                }
                return;
            }
            d dVar10 = d.f51886p;
            if (b11.equals(dVar10)) {
                l lVar4 = new l(a11);
                cc.f k14 = lVar4.k(80, f51899b);
                String fVar3 = k14.toString();
                byte h12 = lVar4.h();
                byte h13 = lVar4.h();
                int length2 = a11.length - (((((((k14.a().length + 1) + 1) + 1) + lVar4.i(a11.length).length) + 1) + lVar4.i(a11.length).length) + 1);
                if (h12 == 0) {
                    bArr = lVar4.i(length2);
                } else if (h12 != 1) {
                    ad.c cVar12 = new ad.c(dVar10);
                    cVar12.a("Invalid compression flag value");
                    eVar.a(cVar12);
                } else if (h13 == 0) {
                    try {
                        bArr = o.a(new InflaterInputStream(new ByteArrayInputStream(a11, a11.length - length2, length2)));
                    } catch (ZipException e13) {
                        ad.c cVar13 = new ad.c(d.f51886p);
                        cVar13.a(String.format("Exception decompressing PNG iTXt chunk with keyword \"%s\": %s", fVar3, e13.getMessage()));
                        eVar.a(cVar13);
                    }
                } else {
                    ad.c cVar14 = new ad.c(dVar10);
                    cVar14.a("Invalid compression method value");
                    eVar.a(cVar14);
                }
                byte[] bArr3 = bArr;
                if (bArr3 != null) {
                    if (fVar3.equals("XML:com.adobe.xmp")) {
                        new ed.c().f(bArr3, eVar);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new h(fVar3, new cc.f(bArr3, f51899b)));
                    ad.c cVar15 = new ad.c(d.f51886p);
                    cVar15.M(13, arrayList3);
                    eVar.a(cVar15);
                    return;
                }
                return;
            }
            d dVar11 = d.f51885o;
            if (b11.equals(dVar11)) {
                l lVar5 = new l(a11);
                int p11 = lVar5.p();
                short r11 = lVar5.r();
                short r12 = lVar5.r();
                short r13 = lVar5.r();
                short r14 = lVar5.r();
                short r15 = lVar5.r();
                ad.c cVar16 = new ad.c(dVar11);
                if (bc.f.a(p11, r11 - 1, r12) && bc.f.b(r13, r14, r15)) {
                    cVar16.R(14, String.format("%04d:%02d:%02d %02d:%02d:%02d", Integer.valueOf(p11), Integer.valueOf(r11), Integer.valueOf(r12), Integer.valueOf(r13), Integer.valueOf(r14), Integer.valueOf(r15)));
                } else {
                    cVar16.a(String.format("PNG tIME data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", Integer.valueOf(p11), Integer.valueOf(r11), Integer.valueOf(r12), Integer.valueOf(r13), Integer.valueOf(r14), Integer.valueOf(r15)));
                }
                eVar.a(cVar16);
                return;
            }
            d dVar12 = d.f51884n;
            if (b11.equals(dVar12)) {
                l lVar6 = new l(a11);
                int f11 = lVar6.f();
                int f12 = lVar6.f();
                byte h14 = lVar6.h();
                ad.c cVar17 = new ad.c(dVar12);
                cVar17.J(16, f11);
                cVar17.J(17, f12);
                cVar17.J(18, h14);
                eVar.a(cVar17);
                return;
            }
            d dVar13 = d.f51880j;
            if (b11.equals(dVar13)) {
                ad.c cVar18 = new ad.c(dVar13);
                cVar18.C(19, a11);
                eVar.a(cVar18);
            }
        }
    }

    public static cc.e b(InputStream inputStream) {
        Iterable<b> a11 = new c().a(new n(inputStream), f51898a);
        cc.e eVar = new cc.e();
        for (b bVar : a11) {
            try {
                a(eVar, bVar);
            } catch (Exception e11) {
                e11.printStackTrace(System.err);
            }
        }
        return eVar;
    }
}