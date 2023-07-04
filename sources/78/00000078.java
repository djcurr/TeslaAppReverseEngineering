package a8;

import c8.o;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<o> f337a;

    /* renamed from: b  reason: collision with root package name */
    private final char f338b;

    /* renamed from: c  reason: collision with root package name */
    private final double f339c;

    /* renamed from: d  reason: collision with root package name */
    private final String f340d;

    /* renamed from: e  reason: collision with root package name */
    private final String f341e;

    public d(List<o> list, char c11, double d11, double d12, String str, String str2) {
        this.f337a = list;
        this.f338b = c11;
        this.f339c = d12;
        this.f340d = str;
        this.f341e = str2;
    }

    public static int c(char c11, String str, String str2) {
        return ((((0 + c11) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<o> a() {
        return this.f337a;
    }

    public double b() {
        return this.f339c;
    }

    public int hashCode() {
        return c(this.f338b, this.f341e, this.f340d);
    }
}