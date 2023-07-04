package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;
import vw.b;
import vw.c;

@b({VCardVersion.V4_0})
/* loaded from: classes5.dex */
public class Gender extends VCardProperty {
    public static final String FEMALE = "F";
    public static final String MALE = "M";
    public static final String NONE = "N";
    public static final String OTHER = "O";
    public static final String UNKNOWN = "U";
    private String gender;
    private String text;

    public Gender(String str) {
        this.gender = str;
    }

    public static Gender female() {
        return new Gender(FEMALE);
    }

    public static Gender male() {
        return new Gender(MALE);
    }

    public static Gender none() {
        return new Gender(NONE);
    }

    public static Gender other() {
        return new Gender(OTHER);
    }

    public static Gender unknown() {
        return new Gender(UNKNOWN);
    }

    @Override // ezvcard.property.VCardProperty
    protected void _validate(List<c> list, VCardVersion vCardVersion, VCard vCard) {
        if (this.gender == null) {
            list.add(new c(8, new Object[0]));
        }
    }

    @Override // ezvcard.property.VCardProperty
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            Gender gender = (Gender) obj;
            String str = this.gender;
            if (str == null) {
                if (gender.gender != null) {
                    return false;
                }
            } else if (!str.equals(gender.gender)) {
                return false;
            }
            String str2 = this.text;
            if (str2 == null) {
                if (gender.text != null) {
                    return false;
                }
            } else if (!str2.equals(gender.text)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String getGender() {
        return this.gender;
    }

    public String getText() {
        return this.text;
    }

    @Override // ezvcard.property.VCardProperty
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.gender;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean isFemale() {
        return FEMALE.equals(this.gender);
    }

    public boolean isMale() {
        return MALE.equals(this.gender);
    }

    public boolean isNone() {
        return NONE.equals(this.gender);
    }

    public boolean isOther() {
        return OTHER.equals(this.gender);
    }

    public boolean isUnknown() {
        return UNKNOWN.equals(this.gender);
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    @Override // ezvcard.property.VCardProperty
    protected Map<String, Object> toStringValues() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("gender", this.gender);
        linkedHashMap.put(TextBundle.TEXT_ENTRY, this.text);
        return linkedHashMap;
    }

    @Override // ezvcard.property.VCardProperty
    public Gender copy() {
        return new Gender(this);
    }

    public Gender(Gender gender) {
        super(gender);
        this.gender = gender.gender;
        this.text = gender.text;
    }
}