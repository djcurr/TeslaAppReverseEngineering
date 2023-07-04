package ig;

import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import com.facebook.systrace.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b extends pf.a {

    /* renamed from: a  reason: collision with root package name */
    int f30395a = 0;

    /* renamed from: b  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f30396b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<String, Pair<Integer, String>> f30397c = new HashMap();

    @Override // pf.a, pf.e
    public void a(com.facebook.imagepipeline.request.a aVar, Object obj, String str, boolean z11) {
        if (com.facebook.systrace.a.h(0L)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f30395a), "FRESCO_REQUEST_" + aVar.s().toString().replace(CoreConstants.COLON_CHAR, '_'));
            com.facebook.systrace.a.a(0L, (String) create.second, this.f30395a);
            this.f30397c.put(str, create);
            this.f30395a = this.f30395a + 1;
        }
    }

    @Override // pf.a, com.facebook.imagepipeline.producers.s0
    public void b(String str, String str2) {
        if (com.facebook.systrace.a.h(0L)) {
            Pair<Integer, String> create = Pair.create(Integer.valueOf(this.f30395a), "FRESCO_PRODUCER_" + str2.replace(CoreConstants.COLON_CHAR, '_'));
            com.facebook.systrace.a.a(0L, (String) create.second, this.f30395a);
            this.f30396b.put(str, create);
            this.f30395a = this.f30395a + 1;
        }
    }

    @Override // pf.a, pf.e
    public void c(com.facebook.imagepipeline.request.a aVar, String str, boolean z11) {
        if (com.facebook.systrace.a.h(0L) && this.f30397c.containsKey(str)) {
            Pair<Integer, String> pair = this.f30397c.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f30397c.remove(str);
        }
    }

    @Override // pf.a, com.facebook.imagepipeline.producers.s0
    public boolean d(String str) {
        return false;
    }

    @Override // pf.a, com.facebook.imagepipeline.producers.s0
    public void e(String str, String str2, Map<String, String> map) {
        if (com.facebook.systrace.a.h(0L) && this.f30396b.containsKey(str)) {
            Pair<Integer, String> pair = this.f30396b.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f30396b.remove(str);
        }
    }

    @Override // pf.a, com.facebook.imagepipeline.producers.s0
    public void f(String str, String str2, Throwable th2, Map<String, String> map) {
        if (com.facebook.systrace.a.h(0L) && this.f30396b.containsKey(str)) {
            Pair<Integer, String> pair = this.f30396b.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f30396b.remove(str);
        }
    }

    @Override // pf.a, com.facebook.imagepipeline.producers.s0
    public void g(String str, String str2, Map<String, String> map) {
        if (com.facebook.systrace.a.h(0L) && this.f30396b.containsKey(str)) {
            Pair<Integer, String> pair = this.f30396b.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f30396b.remove(str);
        }
    }

    @Override // pf.a, pf.e
    public void i(com.facebook.imagepipeline.request.a aVar, String str, Throwable th2, boolean z11) {
        if (com.facebook.systrace.a.h(0L) && this.f30397c.containsKey(str)) {
            Pair<Integer, String> pair = this.f30397c.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f30397c.remove(str);
        }
    }

    @Override // pf.a, com.facebook.imagepipeline.producers.s0
    public void j(String str, String str2, String str3) {
        if (com.facebook.systrace.a.h(0L)) {
            com.facebook.systrace.a.l(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(CoreConstants.COLON_CHAR, '_') + "_" + str2.replace(CoreConstants.COLON_CHAR, '_') + "_" + str3.replace(CoreConstants.COLON_CHAR, '_'), a.EnumC0241a.THREAD);
        }
    }

    @Override // pf.a, pf.e
    public void k(String str) {
        if (com.facebook.systrace.a.h(0L) && this.f30397c.containsKey(str)) {
            Pair<Integer, String> pair = this.f30397c.get(str);
            com.facebook.systrace.a.e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.f30397c.remove(str);
        }
    }
}