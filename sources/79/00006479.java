package cw;

import android.net.Uri;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class d {
    public static /* synthetic */ void a(Boolean bool) {
        f(bool);
    }

    public static /* synthetic */ void b(Uri uri) {
        d(uri);
    }

    public static final androidx.activity.result.d<String[]> c(androidx.activity.result.c cVar) {
        s.g(cVar, "<this>");
        androidx.activity.result.d<String[]> permissionsModuleOpenDocumentLauncher = cVar.registerForActivityResult(new f.c(), new androidx.activity.result.b() { // from class: cw.b
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                d.b((Uri) obj);
            }
        });
        s.f(permissionsModuleOpenDocumentLauncher, "permissionsModuleOpenDocumentLauncher");
        return permissionsModuleOpenDocumentLauncher;
    }

    public static final void d(Uri uri) {
        new g().h(uri);
    }

    public static final androidx.activity.result.d<Uri> e(androidx.activity.result.c cVar) {
        s.g(cVar, "<this>");
        androidx.activity.result.d<Uri> registerForActivityResult = cVar.registerForActivityResult(new f.g(), new androidx.activity.result.b() { // from class: cw.c
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                d.a((Boolean) obj);
            }
        });
        s.f(registerForActivityResult, "this.registerForActivity…).sendStatus(success)\n  }");
        return registerForActivityResult;
    }

    public static final void f(Boolean success) {
        l lVar = new l();
        s.f(success, "success");
        lVar.h(success.booleanValue());
    }
}