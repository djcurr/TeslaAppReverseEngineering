package qb;

import bc.n;
import hc.i;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import qc.e;
import qc.h;
import qc.j;
import qc.k;
import zc.f;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Iterable<c> f48042a = Arrays.asList(new k(), new e(), new oc.c(), new pc.c(), new i(), new ed.c(), new lc.c(), new f(), new zc.b(), new nc.c(), new dc.c(), new h(), new j());

    public static void a(cc.e eVar, InputStream inputStream, Iterable<c> iterable) {
        if (iterable == null) {
            iterable = f48042a;
        }
        HashSet hashSet = new HashSet();
        for (c cVar : iterable) {
            for (com.drew.imaging.jpeg.a aVar : cVar.b()) {
                hashSet.add(aVar);
            }
        }
        b(eVar, iterable, d.a(new n(inputStream), hashSet));
    }

    public static void b(cc.e eVar, Iterable<c> iterable, b bVar) {
        for (c cVar : iterable) {
            for (com.drew.imaging.jpeg.a aVar : cVar.b()) {
                cVar.a(bVar.e(aVar), eVar, aVar);
            }
        }
    }

    public static cc.e c(InputStream inputStream) {
        return d(inputStream, null);
    }

    public static cc.e d(InputStream inputStream, Iterable<c> iterable) {
        cc.e eVar = new cc.e();
        a(eVar, inputStream, iterable);
        return eVar;
    }
}