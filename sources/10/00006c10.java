package ezvcard.parameter;

import ezvcard.VCardVersion;

/* loaded from: classes5.dex */
public class EmailType extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final d<EmailType> f25390b = new d<>(EmailType.class);
    @vw.b({VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: c  reason: collision with root package name */
    public static final EmailType f25391c;

    static {
        new EmailType("internet");
        new EmailType("x400");
        f25391c = new EmailType("pref");
        new EmailType("aol");
        new EmailType("applelink");
        new EmailType("attmail");
        new EmailType("cis");
        new EmailType("eworld");
        new EmailType("ibmmail");
        new EmailType("mcimail");
        new EmailType("powershare");
        new EmailType("prodigy");
        new EmailType("tlx");
        new EmailType("home");
        new EmailType("work");
    }

    private EmailType(String str) {
        super(str);
    }

    public static EmailType d(String str) {
        return (EmailType) f25390b.e(str);
    }
}