package vc;

import org.spongycastle.i18n.TextBundle;
import xc.g;
import xc.j;
import xc.m;
import xc.p;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    public static Long f54470b;

    /* renamed from: c  reason: collision with root package name */
    public static Long f54471c;

    /* renamed from: d  reason: collision with root package name */
    public static Long f54472d;

    /* renamed from: e  reason: collision with root package name */
    public static Long f54473e;

    /* renamed from: f  reason: collision with root package name */
    public static String f54474f;

    /* renamed from: a  reason: collision with root package name */
    private rb.a f54475a;

    public e(rb.a aVar) {
        this.f54475a = aVar;
    }

    public rb.a a(wc.e eVar, cc.e eVar2) {
        String a11 = eVar.a();
        if (a11.equals("soun")) {
            return new j(eVar2);
        }
        if (a11.equals("vide")) {
            return new p(eVar2);
        }
        if (a11.equals("hint")) {
            return new xc.c(eVar2);
        }
        if (a11.equals(TextBundle.TEXT_ENTRY)) {
            return new m(eVar2);
        }
        if (a11.equals("meta")) {
            return new g(eVar2);
        }
        return this.f54475a;
    }
}