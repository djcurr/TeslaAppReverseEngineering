package g6;

import java.io.IOException;
import kotlin.jvm.internal.s;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import v20.o;
import vz.b0;
import vz.q;
import vz.r;

/* loaded from: classes.dex */
public final class j implements Callback, h00.l<Throwable, b0> {

    /* renamed from: a  reason: collision with root package name */
    private final Call f27797a;

    /* renamed from: b  reason: collision with root package name */
    private final o<Response> f27798b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Call call, o<? super Response> continuation) {
        s.g(call, "call");
        s.g(continuation, "continuation");
        this.f27797a = call;
        this.f27798b = continuation;
    }

    public void a(Throwable th2) {
        try {
            this.f27797a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
        a(th2);
        return b0.f54756a;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e11) {
        s.g(call, "call");
        s.g(e11, "e");
        if (call.isCanceled()) {
            return;
        }
        o<Response> oVar = this.f27798b;
        q.a aVar = q.f54772b;
        oVar.resumeWith(q.b(r.a(e11)));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        s.g(call, "call");
        s.g(response, "response");
        o<Response> oVar = this.f27798b;
        q.a aVar = q.f54772b;
        oVar.resumeWith(q.b(response));
    }
}