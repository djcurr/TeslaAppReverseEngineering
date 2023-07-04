package freemarker.core;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class e extends k {

    /* renamed from: f  reason: collision with root package name */
    private final String f26877f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f26878g;

    /* renamed from: h  reason: collision with root package name */
    private final Map f26879h;

    /* renamed from: i  reason: collision with root package name */
    private final String f26880i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f26881j;

    static {
        new e(".pass", Collections.EMPTY_LIST, Collections.EMPTY_MAP, null, false, m.f26889i);
    }

    e(String str, List list, Map map, String str2, boolean z11, k kVar) {
        this.f26877f = str;
        this.f26878g = (String[]) list.toArray(new String[list.size()]);
        this.f26879h = map;
        this.f26881j = z11;
        this.f26880i = str2;
        i(kVar);
    }

    @Override // freemarker.core.k
    protected String d(boolean z11) {
        StringBuffer stringBuffer = new StringBuffer();
        if (z11) {
            stringBuffer.append('<');
        }
        stringBuffer.append(k());
        stringBuffer.append(' ');
        stringBuffer.append(p.c(this.f26877f));
        if (this.f26881j) {
            stringBuffer.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        }
        int length = this.f26878g.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!this.f26881j) {
                stringBuffer.append(' ');
            } else if (i11 != 0) {
                stringBuffer.append(", ");
            }
            String str = this.f26878g[i11];
            stringBuffer.append(p.b(str));
            Map map = this.f26879h;
            if (map != null && map.get(str) != null) {
                stringBuffer.append('=');
                d dVar = (d) this.f26879h.get(str);
                if (this.f26881j) {
                    stringBuffer.append(dVar.a());
                } else {
                    f.a(stringBuffer, dVar);
                }
            }
        }
        if (this.f26880i != null) {
            if (!this.f26881j) {
                stringBuffer.append(' ');
            } else if (length != 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.f26880i);
            stringBuffer.append("...");
        }
        if (this.f26881j) {
            stringBuffer.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        if (z11) {
            stringBuffer.append('>');
            if (f() != null) {
                stringBuffer.append(f().a());
            }
            stringBuffer.append("</");
            stringBuffer.append(k());
            stringBuffer.append('>');
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // freemarker.core.k
    public boolean h() {
        return false;
    }

    public String j() {
        return this.f26877f;
    }

    String k() {
        return this.f26881j ? "#function" : "#macro";
    }

    public boolean l() {
        return this.f26881j;
    }
}