package cw;

import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class j {
    public static /* synthetic */ void a(Boolean bool) {
        c(bool);
    }

    public static final androidx.activity.result.d<String> b(androidx.activity.result.c cVar) {
        s.g(cVar, "<this>");
        androidx.activity.result.d<String> permissionsModuleRequestPermission = cVar.registerForActivityResult(new f.e(), new androidx.activity.result.b() { // from class: cw.i
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                j.a((Boolean) obj);
            }
        });
        s.f(permissionsModuleRequestPermission, "permissionsModuleRequestPermission");
        return permissionsModuleRequestPermission;
    }

    public static final void c(Boolean isGranted) {
        m mVar = new m();
        s.f(isGranted, "isGranted");
        mVar.h(isGranted.booleanValue());
    }
}