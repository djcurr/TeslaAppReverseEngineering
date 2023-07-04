package kotlinx.serialization.json;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35638a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35639b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f35640c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f35641d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f35642e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35643f;

    /* renamed from: g  reason: collision with root package name */
    private final String f35644g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f35645h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f35646i;

    /* renamed from: j  reason: collision with root package name */
    private final String f35647j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f35648k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f35649l;

    public e(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String prettyPrintIndent, boolean z17, boolean z18, String classDiscriminator, boolean z19, boolean z21) {
        kotlin.jvm.internal.s.g(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.s.g(classDiscriminator, "classDiscriminator");
        this.f35638a = z11;
        this.f35639b = z12;
        this.f35640c = z13;
        this.f35641d = z14;
        this.f35642e = z15;
        this.f35643f = z16;
        this.f35644g = prettyPrintIndent;
        this.f35645h = z17;
        this.f35646i = z18;
        this.f35647j = classDiscriminator;
        this.f35648k = z19;
        this.f35649l = z21;
    }

    public final boolean a() {
        return this.f35648k;
    }

    public final boolean b() {
        return this.f35641d;
    }

    public final String c() {
        return this.f35647j;
    }

    public final boolean d() {
        return this.f35645h;
    }

    public final boolean e() {
        return this.f35638a;
    }

    public final boolean f() {
        return this.f35643f;
    }

    public final boolean g() {
        return this.f35639b;
    }

    public final boolean h() {
        return this.f35642e;
    }

    public final String i() {
        return this.f35644g;
    }

    public final boolean j() {
        return this.f35649l;
    }

    public final boolean k() {
        return this.f35646i;
    }

    public final boolean l() {
        return this.f35640c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f35638a + ", ignoreUnknownKeys=" + this.f35639b + ", isLenient=" + this.f35640c + ", allowStructuredMapKeys=" + this.f35641d + ", prettyPrint=" + this.f35642e + ", explicitNulls=" + this.f35643f + ", prettyPrintIndent='" + this.f35644g + "', coerceInputValues=" + this.f35645h + ", useArrayPolymorphism=" + this.f35646i + ", classDiscriminator='" + this.f35647j + "', allowSpecialFloatingPointValues=" + this.f35648k + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ e(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, boolean z17, boolean z18, String str2, boolean z19, boolean z21, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? true : z16, (i11 & 64) != 0 ? "    " : str, (i11 & 128) != 0 ? false : z17, (i11 & 256) != 0 ? false : z18, (i11 & 512) != 0 ? "type" : str2, (i11 & 1024) == 0 ? z19 : false, (i11 & 2048) == 0 ? z21 : true);
    }
}