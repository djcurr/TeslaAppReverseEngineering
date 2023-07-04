package lu;

import kotlin.jvm.internal.s;
import tt.e;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37743a = new a();

    private a() {
    }

    public final e a(String value) {
        s.g(value, "value");
        e eVar = e.GET;
        if (s.c(value, eVar.name())) {
            return eVar;
        }
        e eVar2 = e.PUT;
        if (s.c(value, eVar2.name())) {
            return eVar2;
        }
        e eVar3 = e.POST;
        if (s.c(value, eVar3.name())) {
            return eVar3;
        }
        e eVar4 = e.DELETE;
        if (s.c(value, eVar4.name())) {
            return eVar4;
        }
        e eVar5 = e.HEAD;
        if (s.c(value, eVar5.name())) {
            return eVar5;
        }
        e eVar6 = e.PATCH;
        if (s.c(value, eVar6.name())) {
            return eVar6;
        }
        e eVar7 = e.OPTIONS;
        if (s.c(value, eVar7.name())) {
            return eVar7;
        }
        e eVar8 = e.TRACE;
        if (s.c(value, eVar8.name())) {
            return eVar8;
        }
        e eVar9 = e.CONNECT;
        if (s.c(value, eVar9.name())) {
            return eVar9;
        }
        return null;
    }
}