package yw;

import ch.qos.logback.core.CoreConstants;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Impp;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public class w extends g1<Impp> {

    /* renamed from: d  reason: collision with root package name */
    private static final List<a> f59915d;

    /* loaded from: classes5.dex */
    private static class a {
        public a(String str) {
            this(str, "(.*)", 1, "%s");
        }

        public a(String str, String str2, int i11, String str3) {
            Pattern.compile('^' + str + CoreConstants.COLON_CHAR + str2, 2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(CoreConstants.COLON_CHAR);
            sb2.append(str3);
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("aim", "(goim|addbuddy)\\?.*?\\bscreenname=(.*?)(&|$)", 2, "goim?screenname=%s"));
        arrayList.add(new a("ymsgr", "(sendim|addfriend|sendfile|call)\\?(.*)", 2, "sendim?%s"));
        arrayList.add(new a("skype", "(.*?)(\\?|$)", 1, "%s"));
        arrayList.add(new a("msnim", "(chat|add|voice|video)\\?contact=(.*?)(&|$)", 2, "chat?contact=%s"));
        arrayList.add(new a("xmpp", "(.*?)(\\?|$)", 1, "%s?message"));
        arrayList.add(new a("icq", "message\\?uin=(\\d+)", 1, "message?uin=%s"));
        arrayList.add(new a("sip"));
        arrayList.add(new a("irc"));
        f59915d = Collections.unmodifiableList(arrayList);
    }

    public w() {
        super(Impp.class, "IMPP");
    }

    private Impp j(String str) {
        if (str != null && str.length() != 0) {
            try {
                return new Impp(str);
            } catch (IllegalArgumentException e11) {
                throw new CannotParseException(15, str, e11.getMessage());
            }
        }
        return new Impp((URI) null);
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25377d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Impp b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        return j(ih.e.f(str));
    }
}