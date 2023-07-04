package nz;

import io.sentry.b4;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class g {
    public static f a() {
        Properties a11;
        Properties a12;
        b4 b4Var = new b4();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i());
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (a12 = new e(property, b4Var).a()) != null) {
            arrayList.add(new h(a12));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (a11 = new e(str, b4Var).a()) != null) {
            arrayList.add(new h(a11));
        }
        Properties a13 = new b(b4Var).a();
        if (a13 != null) {
            arrayList.add(new h(a13));
        }
        Properties a14 = new e("sentry.properties", b4Var).a();
        if (a14 != null) {
            arrayList.add(new h(a14));
        }
        return new c(arrayList);
    }
}