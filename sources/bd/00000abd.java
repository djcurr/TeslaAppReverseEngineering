package atd.l0;

import android.content.Context;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.internal.j;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final List<Warning> f6901a;

    private g(Context context, ConfigParameters configParameters) {
        this.f6901a = a(context, AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.SECURITY_APP_SIGNATURE), AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.SECURITY_TRUSTED_APP_STORES), AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.SECURITY_MALICIOUS_APPS));
    }

    public static g a(Context context, ConfigParameters configParameters) {
        return new g(context.getApplicationContext(), configParameters);
    }

    public List<Warning> a() {
        return this.f6901a;
    }

    private List<Warning> a(Context context, String str, Collection<String> collection, Collection<String> collection2) {
        ArrayList arrayList = new ArrayList();
        for (f fVar : a(str, collection, collection2)) {
            j a11 = fVar.a(context);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    private List<f> a(String str, Collection<String> collection, Collection<String> collection2) {
        ArrayList arrayList = new ArrayList();
        atd.m0.g gVar = new atd.m0.g();
        arrayList.add(new b(gVar));
        arrayList.add(new e(str, collection, collection2, gVar));
        arrayList.add(new c(gVar));
        arrayList.add(new a(gVar));
        arrayList.add(new d(gVar));
        return arrayList;
    }
}