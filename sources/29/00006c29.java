package ezvcard.property;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.util.e;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import vw.c;

/* loaded from: classes5.dex */
public abstract class BinaryProperty<T extends MediaTypeParameter> extends VCardProperty implements HasAltId {
    protected T contentType;
    protected byte[] data;
    protected String url;

    public BinaryProperty() {
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.url == null && this.data == null) {
            list.add(new c(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            BinaryProperty binaryProperty = (BinaryProperty) obj;
            T t11 = this.contentType;
            if (t11 == null) {
                if (binaryProperty.contentType != null) {
                    return false;
                }
            } else if (!t11.equals(binaryProperty.contentType)) {
                return false;
            }
            if (Arrays.equals(this.data, binaryProperty.data)) {
                String str = this.url;
                if (str == null) {
                    if (binaryProperty.url != null) {
                        return false;
                    }
                } else if (!str.equals(binaryProperty.url)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ezvcard.property.HasAltId
    public String getAltId() {
        return this.parameters.n();
    }

    public T getContentType() {
        return this.contentType;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // ezvcard.property.VCardProperty
    public List<ezvcard.parameter.c> getPids() {
        return super.getPids();
    }

    @Override // ezvcard.property.VCardProperty
    public Integer getPref() {
        return super.getPref();
    }

    public String getType() {
        return this.parameters.B();
    }

    public String getUrl() {
        return this.url;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        T t11 = this.contentType;
        int hashCode2 = (((hashCode + (t11 == null ? 0 : t11.hashCode())) * 31) + Arrays.hashCode(this.data)) * 31;
        String str = this.url;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // ezvcard.property.HasAltId
    public void setAltId(String str) {
        this.parameters.G(str);
    }

    public void setContentType(T t11) {
        this.contentType = t11;
    }

    public void setData(byte[] bArr, T t11) {
        this.url = null;
        this.data = bArr;
        setContentType(t11);
    }

    @Override // ezvcard.property.VCardProperty
    public void setPref(Integer num) {
        super.setPref(num);
    }

    public void setType(String str) {
        this.parameters.S(str);
    }

    public void setUrl(String str, T t11) {
        this.url = str;
        this.data = null;
        setContentType(t11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ezvcard.property.VCardProperty
    public Map<String, Object> toStringValues() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.data == null) {
            str = com.adyen.checkout.components.model.payments.request.Address.ADDRESS_NULL_PLACEHOLDER;
        } else {
            str = "length: " + this.data.length;
        }
        linkedHashMap.put(MessageExtension.FIELD_DATA, str);
        linkedHashMap.put("url", this.url);
        linkedHashMap.put(CMSAttributeTableGenerator.CONTENT_TYPE, this.contentType);
        return linkedHashMap;
    }

    public BinaryProperty(String str, T t11) {
        setUrl(str, t11);
    }

    public BinaryProperty(byte[] bArr, T t11) {
        setData(bArr, t11);
    }

    public BinaryProperty(InputStream inputStream, T t11) {
        this(new e(inputStream).a(), t11);
    }

    public BinaryProperty(File file, T t11) {
        this(new BufferedInputStream(new FileInputStream(file)), t11);
    }

    public BinaryProperty(BinaryProperty<T> binaryProperty) {
        super(binaryProperty);
        byte[] bArr = binaryProperty.data;
        this.data = bArr == null ? null : (byte[]) bArr.clone();
        this.url = binaryProperty.url;
        this.contentType = binaryProperty.contentType;
    }
}