package l30;

import net.time4j.engine.p;
import net.time4j.format.d;

/* loaded from: classes5.dex */
public class c extends d<Integer> {

    /* renamed from: e  reason: collision with root package name */
    public static final p<Integer> f36571e = new c("YEAR_OF_DISPLAY", 0, 1, 9999);
    private static final long serialVersionUID = 1;

    /* renamed from: b  reason: collision with root package name */
    private final transient char f36572b;

    /* renamed from: c  reason: collision with root package name */
    private final transient Integer f36573c;

    /* renamed from: d  reason: collision with root package name */
    private final transient Integer f36574d;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str, char c11, int i11, int i12) {
        super(str);
        this.f36572b = c11;
        this.f36573c = Integer.valueOf(i11);
        this.f36574d = Integer.valueOf(i12);
    }

    private Object readResolve() {
        return f36571e;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f36572b;
    }

    @Override // net.time4j.engine.p
    public final Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean m() {
        return true;
    }

    @Override // net.time4j.engine.p
    /* renamed from: o */
    public Integer getDefaultMaximum() {
        return this.f36574d;
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public Integer getDefaultMinimum() {
        return this.f36573c;
    }
}