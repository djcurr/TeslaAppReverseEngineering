package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import ph.g;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String f12986c;

    /* renamed from: d  reason: collision with root package name */
    static final String f12987d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f12988e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<nh.b> f12989f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f12990g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f12991h;

    /* renamed from: a  reason: collision with root package name */
    private final String f12992a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12993b;

    static {
        String a11 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f12986c = a11;
        String a12 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f12987d = a12;
        String a13 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f12988e = a13;
        f12989f = Collections.unmodifiableSet(new HashSet(Arrays.asList(nh.b.b("proto"), nh.b.b("json"))));
        f12990g = new a(a11, null);
        f12991h = new a(a12, a13);
    }

    public a(String str, String str2) {
        this.f12992a = str;
        this.f12993b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // ph.g
    public Set<nh.b> a() {
        return f12989f;
    }

    public byte[] b() {
        String str = this.f12993b;
        if (str == null && this.f12992a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f12992a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f12993b;
    }

    public String e() {
        return this.f12992a;
    }

    @Override // ph.f
    public byte[] getExtras() {
        return b();
    }

    @Override // ph.f
    public String getName() {
        return "cct";
    }
}