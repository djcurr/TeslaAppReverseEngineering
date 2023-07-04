package qu;

import ch.qos.logback.core.joran.action.Action;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f48481a = new c();

    private c() {
    }

    public final void a(List<jt.f> parameters) {
        s.g(parameters, "parameters");
        es.b.a().a(jt.d.PREPARED_REPORT, parameters);
    }

    public final void b(List<jt.f> parameters) {
        s.g(parameters, "parameters");
        es.b.a().a(jt.d.REPORT_UPLOAD_ATTEMPTED, parameters);
    }

    public final jt.f c() {
        return new jt.f(jt.g.REPORT_TYPE, null, null, null, new jt.h(Action.FILE_ATTRIBUTE, null, 2, null), null, 46, null);
    }

    public final jt.f d() {
        return new jt.f(jt.g.REPORT_TYPE, null, null, null, new jt.h("log", null, 2, null), null, 46, null);
    }

    public final jt.f e(int i11) {
        return new jt.f(jt.g.RETRY_COUNT, null, new jt.e(i11, null, 2, null), null, null, null, 58, null);
    }
}