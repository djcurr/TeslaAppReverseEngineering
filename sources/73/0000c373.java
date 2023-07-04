package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;
import java.util.Date;
import javax.xml.namespace.QName;

/* loaded from: classes5.dex */
public abstract class g1<T extends VCardProperty> {

    /* renamed from: a  reason: collision with root package name */
    protected final Class<T> f59905a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f59906b;

    /* renamed from: c  reason: collision with root package name */
    protected final QName f59907c;

    public g1(Class<T> cls, String str) {
        this(cls, str, new QName(VCardVersion.V4_0.getXmlNamespace(), str.toLowerCase()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Date c(String str) {
        return ezvcard.util.i.parse(str);
    }

    protected abstract VCardDataType a(VCardVersion vCardVersion);

    protected abstract T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar);

    public final VCardDataType d(VCardVersion vCardVersion) {
        return a(vCardVersion);
    }

    public Class<T> e() {
        return this.f59905a;
    }

    public String f() {
        return this.f59906b;
    }

    public QName g() {
        return this.f59907c;
    }

    public final T h(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        T b11 = b(str, vCardDataType, vCardParameters, aVar);
        b11.setParameters(vCardParameters);
        return b11;
    }

    public g1(Class<T> cls, String str, QName qName) {
        this.f59905a = cls;
        this.f59906b = str;
        this.f59907c = qName;
    }
}