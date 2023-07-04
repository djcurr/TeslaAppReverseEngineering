package ezvcard.parameter;

/* loaded from: classes5.dex */
public class MediaTypeParameter extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    protected final String f25398b;

    /* renamed from: c  reason: collision with root package name */
    protected final String f25399c;

    public MediaTypeParameter(String str, String str2, String str3) {
        super(str);
        this.f25398b = str2;
        this.f25399c = str3;
    }

    public String d() {
        return this.f25399c;
    }

    public String e() {
        return this.f25398b;
    }

    @Override // ezvcard.parameter.VCardParameter
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            MediaTypeParameter mediaTypeParameter = (MediaTypeParameter) obj;
            String str = this.f25399c;
            if (str == null) {
                if (mediaTypeParameter.f25399c != null) {
                    return false;
                }
            } else if (!str.equals(mediaTypeParameter.f25399c)) {
                return false;
            }
            String str2 = this.f25398b;
            if (str2 == null) {
                if (mediaTypeParameter.f25398b != null) {
                    return false;
                }
            } else if (!str2.equals(mediaTypeParameter.f25398b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // ezvcard.parameter.VCardParameter
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f25399c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25398b;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}