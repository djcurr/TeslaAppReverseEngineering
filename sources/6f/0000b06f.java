package rc;

import org.spongycastle.i18n.TextBundle;
import tc.j;
import tc.m;
import tc.p;
import tc.s;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    public static Long f49341b;

    /* renamed from: c  reason: collision with root package name */
    public static Long f49342c;

    /* renamed from: d  reason: collision with root package name */
    public static Long f49343d;

    /* renamed from: e  reason: collision with root package name */
    public static Long f49344e;

    /* renamed from: a  reason: collision with root package name */
    private vb.a f49345a;

    public e(vb.a aVar) {
        this.f49345a = aVar;
    }

    public vb.a a(String str, cc.e eVar) {
        if (str.equals("mdir")) {
            return new uc.b(eVar);
        }
        if (str.equals("mdta")) {
            return new uc.a(eVar);
        }
        if (str.equals("soun")) {
            return new tc.g(eVar);
        }
        if (str.equals("vide")) {
            return new s(eVar);
        }
        if (str.equals("tmcd")) {
            return new p(eVar);
        }
        if (str.equals(TextBundle.TEXT_ENTRY)) {
            return new m(eVar);
        }
        if (str.equals("sbtl")) {
            return new j(eVar);
        }
        if (str.equals("musi")) {
            return new tc.d(eVar);
        }
        return this.f49345a;
    }
}