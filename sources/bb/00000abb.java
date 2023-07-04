package atd.l0;

import android.content.Context;
import com.adyen.threeds2.Warning;
import java.util.Collection;

/* loaded from: classes.dex */
final class e extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f6897a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection<String> f6898b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<String> f6899c;

    /* renamed from: d  reason: collision with root package name */
    private final atd.m0.d f6900d;

    static {
        atd.s0.a.a(-785170225228352L);
        atd.s0.a.a(-785500937710144L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, Collection<String> collection, Collection<String> collection2, atd.m0.d dVar) {
        this.f6897a = str;
        this.f6898b = collection;
        this.f6899c = collection2;
        this.f6900d = dVar;
    }

    @Override // atd.l0.f
    boolean b(Context context) {
        String str;
        return this.f6900d.a(context) || this.f6900d.b(context) || this.f6900d.a() || this.f6900d.b(context, this.f6899c) || !this.f6900d.a(context, this.f6898b) || !((str = this.f6897a) == null || this.f6900d.a(context, str));
    }

    @Override // atd.l0.f
    String c() {
        return atd.s0.a.a(-785788700518976L);
    }

    @Override // atd.l0.f
    String d() {
        return atd.s0.a.a(-785844535093824L);
    }

    @Override // atd.l0.f
    Warning.Severity e() {
        return Warning.Severity.HIGH;
    }
}